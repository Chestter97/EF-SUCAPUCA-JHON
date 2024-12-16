package pe.edu.i201515503.EF_Jhon_Sucapuca.service;

import pe.edu.i201515503.EF_Jhon_Sucapuca.dto.CarDetailDto;
import pe.edu.i201515503.EF_Jhon_Sucapuca.dto.CarDto;
import pe.edu.i201515503.EF_Jhon_Sucapuca.dto.CarUpdateDto;

import java.util.List;
import java.util.Optional;

public interface ManageService {
    List<CarDto> getAllCars() throws Exception;

    Optional<CarDetailDto> getCarById(int id) throws Exception;

    boolean updateCar(CarDto CarDto) throws Exception;

    boolean deleteCarById(int id) throws Exception;

    boolean addCar(CarUpdateDto carUpdateDto) throws Exception;
}
