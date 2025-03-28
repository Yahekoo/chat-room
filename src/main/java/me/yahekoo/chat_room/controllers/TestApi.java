package me.yahekoo.chat_room.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class TestApi {

    @GetMapping("/hello")
    public ResponseEntity<String> test() {
        return ResponseEntity.ok("Hello Test");
    }
}
