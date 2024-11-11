package ua.ucu.edu.apps.FlowerReboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import ua.ucu.edu.apps.FlowerReboot.repository.AppUserRepository;
import ua.ucu.edu.apps.FlowerReboot.user.AppUser;

@Service
public class AppUserService {
    private AppUserRepository userRepository;

    @Autowired
    public AppUserService(AppUserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<AppUser> getUsers() {
        return userRepository.findAll();
    }
    public AppUser addUser(@RequestBody AppUser user){
        return userRepository.save(user);
    }

    public AppUser getUserByEmail(String email) {
        return userRepository.findUserByEmail(email);
    }
}
