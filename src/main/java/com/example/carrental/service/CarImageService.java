package com.example.carrental.service;

import java.util.List;
import org.springframework.stereotype.Service;
import com.example.carrental.model.CarImage;
import com.example.carrental.repository.CarImageRepository;

@Service
public class CarImageService {
    private CarImageRepository carImageRepository;

    public CarImageService(CarImageRepository carImageRepository) {
        this.carImageRepository = carImageRepository;
    }
    //lavet af Oliver
    public List<CarImage> getAllImages(int car_id) {
        return carImageRepository.getAllImages(car_id);
    }
    //lavet af Oliver
    public void insert(CarImage carImage) {
        carImageRepository.insert(carImage);
    }
    //lavet af Oliver
    public void delete(int car_image_id) {
        carImageRepository.delete(car_image_id);
    }
}
