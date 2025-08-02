package com.minpooh.travel.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
    @GetMapping(value = "")
    public String index() {
        return "index";
    }

    @GetMapping(value = "/travel")
    public String travel() {
        return "travel";
    }

    @GetMapping(value = "/travel/singapore")
    public String travelSingapore() {
        return "travel_singapore";
    }

    @GetMapping(value = "/travel/japan")
    public String travelJapan() {
        return "travel_japan";
    }

    @GetMapping(value = "/food")
    public String food() {
        return "food";
    }

    @GetMapping(value = "/food/view")
    public String foodView() {
        return "food_view";
    }

    @GetMapping(value = "/experience")
    public String experience() {
        return "experience";
    }

    @GetMapping(value = "/photospot")
    public String photospot() {
        return "photospot";
    }

    @GetMapping(value = "/mystory")
    public String mystory() {
        return "mystory";
    }

    @GetMapping(value = "/mystory/write")
    public String mystoryWrite() {
        return "mystory_write";
    }

    @GetMapping(value = "/mystory/view")
    public String mystoryView() {
        return "mystory_view";
    }

    @GetMapping(value = "/mystory/edit")
    public String mystoryEdit() {
        return "mystory_edit";
    }

}

