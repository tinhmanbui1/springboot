package com.example.mike.photoz.clone;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class PhotozController {

    private List<Photo> db = list.of(new Photo())
    @GetMapping("/")
    public String hello() {
        return "Hello World";
    }
    @GetMapping("/photoz")
    public List<Photo> get() {

    }
}
