package apcs.app;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.*;
import java.util.Properties;
import java.util.Scanner;

import com.google.genai.Client;
import com.google.genai.types.GenerateContentResponse;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        SpringApplication.run(Main.class, args);
        String apiKey = getApiKey();
        String inputFileName = "projects\\FinalProject\\data\\inputFile.txt";
        String outputFileName = "projects\\FinalProject\\data\\outputFile.txt";
        String model = "gemini-3.5-flash";
        Client client = Client.builder().apiKey(apiKey).build();
        int numQuestions = 5;
        int numChoices = 4;
        String format = """
                QUESTION NUMBER
                QUESTION
                CHOICE 1
                CHOICE 2
                ...
                ANSWER NUMBER

                Example:
                1
                What is the main function of a mitochondria in a cell?
                Store genetic information
                Produce energy
                Control what enters and leaves the cell
                Make proteins
                2
                                                """;
        String prompt = "turn these notes into " + numQuestions + " multiple choice questions with " + numChoices
                + " choices per question. \nFollow this exact format:\n" + format + "\n\nNotes: \n" + getInput(inputFileName);
        GenerateContentResponse response = client.models.generateContent(model, prompt, null);
        System.out.println(response.text());
        writeResponseToFile(response.text(), outputFileName);
    }

    public static String convertToNotes(int numQuestions, int numChoices ){
        return "";
    }

    public static String getInput(String fileName) throws FileNotFoundException {
        Scanner sc = new Scanner(System.in);
        System.out.println("File or Paste:");
        String inputType = sc.nextLine(); // type of input (file or copy/paste)
        String userInput = """
                """;

        if (inputType.equals("File")) {
            Scanner fScan = new Scanner(new File(fileName));
            while (fScan.hasNextLine()) {
                userInput += fScan.nextLine() + "\n";
            }
        }
        return userInput;
    }

    // HELPED BY GOOGLE AI OVERVIEW: https://share.google/aimode/F4j392uGTxxAnUFyp
    public static String getApiKey() throws FileNotFoundException {
        Properties prop = new Properties();
        InputStream input = new FileInputStream("config.properties");
        try {
            prop.load(input);
        } catch (IOException e) {
        }
        return prop.getProperty("api.key");
    }

    public static void writeResponseToFile(String response, String fileName) {
        try {
            Files.writeString(Paths.get(fileName),response);
            System.out.println("response saved");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void parseOutput(String output){

    }


}

