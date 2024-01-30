package com.example.exam_adfd.service;

import com.example.exam_adfd.entity.Location;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface LocationService {
    List <Location> getAllPlace();
}
