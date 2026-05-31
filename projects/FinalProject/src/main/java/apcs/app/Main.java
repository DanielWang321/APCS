//Written completely by me unless specificied
package apcs.app;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Properties;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.google.genai.Client;
import com.google.genai.types.GenerateContentResponse;

@SpringBootApplication
public class Main {

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }

    public static String notesToQuestions(int numQuestions, int numChoices, String notes) throws FileNotFoundException {
        System.out.println("running");
        String apiKey = getApiKey();
        String inputFileName = saveStringToFile(notes, true);
        String MODEL = "gemini-3.1-flash-lite";
        Client client = Client.builder().apiKey(apiKey).build();
        String format = """
                {
                    "questions": [
                        {
                        "question": "Question text here",
                        "choices": ["Choice A", "Choice B", "Choice C", "Choice D"],
                        "answerIndex": 0,
                        "explanation": "Short explanation here"
                    }
                  ]
                }


                EXAMPLE:
                {
                    "questions": [
                        {
                        "question": "What is the main function of mitochondria?",
                        "choices": [
                            "Store genetic information",
                            "Produce energy",
                            "Control what enters and leaves the cell",
                            "Make proteins"
                        ],
                        "answerIndex": 1,
                        "explanation": "Mitochondria produce energy for the cell."
                        }
                    ]
                }
                """;
        String prompt = "turn these notes into " + numQuestions + " multiple choice questions with " + numChoices
                + " choices per question. \n Return ONLY JSON, Do not use markdown, Do not use ''' json, do not include any explanation outside of JSON \nFollow this exact format:\n"
                + format + "\n\nNotes: \n"
                + fileToString(inputFileName);
        GenerateContentResponse response = client.models.generateContent(MODEL, prompt, null);
        System.out.println(response.text());
        return saveStringToFile(response.text(), false);
    }

    public static String fileToString(String fileName) throws FileNotFoundException {
        String strOutput = "";
        Scanner fScan = new Scanner(new File(fileName));
        while (fScan.hasNextLine()) {
            strOutput += fScan.nextLine() + "\n";
        }
        return strOutput;
    }

    // HELPED BY GOOGLE AI OVERVIEW: https://share.google/aimode/F4j392uGTxxAnUFyp
    public static String getApiKey() throws FileNotFoundException {
        Properties prop = new Properties();
        InputStream input = new FileInputStream(
                "C:\\Users\\techadmin\\Documents\\GithubProj\\APCS\\projects\\FinalProject\\config.properties");
        try {
            prop.load(input);
        } catch (IOException e) {
        }
        return prop.getProperty("api.key");
    }

    public static void writeResponseToFile(String response, String fileName) {
        try {
            Files.writeString(Paths.get(fileName), response);
            System.out.println("response saved");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void parseOutput(String output) {

    }

    // https://share.google/aimode/ek8I5OZM6Yr3Ifnpg
    // type true: user input
    // type false: gemini output
    public static String saveStringToFile(String userInput, boolean type) {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd_HH-mm-ss-SSS");
        String formatted = now.format(formatter);
        if (type) {
            try {
                Files.writeString(Paths.get(
                        "C:\\Users\\techadmin\\Documents\\GithubProj\\APCS\\projects\\FinalProject\\data\\userInput"
                                + formatted + ".txt"),
                        userInput);
                System.out.println("wrote to input file");
            } catch (IOException e) {
                e.printStackTrace();
            }
            return "C:\\Users\\techadmin\\Documents\\GithubProj\\APCS\\projects\\FinalProject\\data\\userInput"
                    + formatted + ".txt";
        } else {
            try {
                Files.writeString(Paths.get(
                        "C:\\Users\\techadmin\\Documents\\GithubProj\\APCS\\projects\\FinalProject\\data\\geminiOutput"
                                + formatted + ".txt"),
                        userInput);
                System.out.println("wrote output file");
            } catch (IOException e) {
                e.printStackTrace();
            }
            return "C:\\Users\\techadmin\\Documents\\GithubProj\\APCS\\projects\\FinalProject\\data\\geminiOutput"
                    + formatted + ".txt";
        }
    }

}
