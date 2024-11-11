package ua.ucu.edu.apps.FlowerReboot.controller;

import java.util. List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework. web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org. springframework. web. bind. annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ua.ucu.edu.apps.FlowerReboot.model.Flower;
import ua.ucu.edu.apps.FlowerReboot.service.FlowerService;


@RestController
@RequestMapping ("/api/v1/flowers")
public class FlowerController {

    private FlowerService flowerService;

    @Autowired
    public FlowerController(FlowerService flowerService) {
        this.flowerService = flowerService;
    }

    @GetMapping
    public List<Flower> getFlowers () {
        return flowerService.getFlowers();
    }

    @PostMapping
    public Flower addFlower(@RequestBody Flower flower){
        return flowerService.addFlower(flower);
    }
} 