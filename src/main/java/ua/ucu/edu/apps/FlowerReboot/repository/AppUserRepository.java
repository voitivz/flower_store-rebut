package ua.ucu.edu.apps.FlowerReboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import ua.ucu.edu.apps.FlowerReboot.user.AppUser;

@Repository
public interface AppUserRepository
    extends JpaRepository<AppUser, Integer>{

        @Query
        AppUser findUserByEmail(String email);
}

