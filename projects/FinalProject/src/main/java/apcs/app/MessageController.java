package apcs.app;

import java.io.FileNotFoundException;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {

    @GetMapping("/api/hello")
    public Map<String, String> hello() {
        return Map.of("message", "Java backend is working");
    }

    @PostMapping("/api/message")
    public Map<String, String> receiveMessage(@RequestBody MessageRequest request) throws FileNotFoundException {
        int numQuestions = request.getNumQuestions();
        int numChoices = request.getNumChoices();
        String notes = request.getNotes();
        
        String outputFile = Main.notesToQuestions(numQuestions, numChoices, notes);

        return Map.of(
                "reply", Main.fileToString(outputFile));
    }
}