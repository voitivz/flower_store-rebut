package ua.ucu.edu.apps.FlowerReboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ua.ucu.edu.apps.FlowerReboot.model.Flower;


@Repository
public interface FlowerRepository
    extends JpaRepository<Flower, Integer>{
}
