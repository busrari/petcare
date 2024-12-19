package projects.petcare.domain.users.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsersController {
    @GetMapping("/users/hello")
    public String hello() {
        return "Hello, Users!";
    }
}
