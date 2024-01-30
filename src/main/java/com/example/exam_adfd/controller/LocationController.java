package com.example.exam_adfd.controller;


import com.example.exam_adfd.entity.Location;
import com.example.exam_adfd.repository.LocationRepository;
import com.example.exam_adfd.service.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/location_all")
public class LocationController {
    @Autowired
    private LocationService locationService;
    @GetMapping
    public String getAllPlace(Model model){
        List<Location> locations = locationService.getAllPlace();
        model.addAttribute("locations",locations);
        return "locationsList";
    }
}
