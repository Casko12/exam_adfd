package com.example.exam_adfd.service.impl;

import com.example.exam_adfd.entity.Location;
import com.example.exam_adfd.repository.LocationRepository;
import com.example.exam_adfd.service.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LocationServiceImpl implements LocationService {
    @Autowired
    private LocationRepository locationRepository;
    @Override
    public List<Location> getAllPlace(){
        return locationRepository.findAll();
    }
}
