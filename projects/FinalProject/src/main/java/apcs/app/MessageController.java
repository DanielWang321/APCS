package apcs.app;

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
    public Map<String, String> receiveMessage(@RequestBody MessageRequest request) {
        String name = request.getName();
        String message = request.getMessage();

        System.out.println("Name: " + name);
        System.out.println("Message: " + message);

        return Map.of(
                "reply", "Java received your message, " + name + ": " + message
        );
    }
}