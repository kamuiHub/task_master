package dev.kamui.taskmaster;

import dev.kamui.taskmaster.dto.ContentResponse;
import dev.kamui.taskmaster.dto.user.UserResponse;
import dev.kamui.taskmaster.model.User;
import dev.kamui.taskmaster.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@AllArgsConstructor
@RestController
@RequestMapping("/api")
public class SampleController {

    private final UserRepository userRepository;

    @GetMapping("/{name}")
    public ResponseEntity<ContentResponse> getUser(@PathVariable(name = "name") String name) {
        UserResponse userResponse = new UserResponse(name);
        ContentResponse contentResponse = new ContentResponse(true,userResponse);
        return ResponseEntity.ok(contentResponse);
    }
}
