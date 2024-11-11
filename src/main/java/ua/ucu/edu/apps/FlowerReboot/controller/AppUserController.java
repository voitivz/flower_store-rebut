package ua.ucu.edu.apps.FlowerReboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import ua.ucu.edu.apps.FlowerReboot.service.AppUserService;
import ua.ucu.edu.apps.FlowerReboot.user.AppUser;


@RestController
@RequestMapping ("/api/v1/users")
public class AppUserController {
    private AppUserService userService;

    @Autowired
    public AppUserController(AppUserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public List<AppUser> getUsers() {
        return userService.getUsers();
    }

    @PostMapping
    public AppUser addUser(@RequestBody AppUser user){
        return userService.addUser(user);
    }

    @GetMapping("/email")
    public ResponseEntity<AppUser> getUserByEmail(@RequestParam String email){
        AppUser userByEmail = userService.getUserByEmail(email);

        if (userByEmail != null) {
            return ResponseEntity.ok(userByEmail);
        }
        return ResponseEntity.notFound().build();
    }
} 