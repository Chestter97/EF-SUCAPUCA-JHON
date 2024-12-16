package pe.edu.i201515503.EF_Jhon_Sucapuca.response;

import pe.edu.i201515503.EF_Jhon_Sucapuca.dto.CarDetailDto;
import pe.edu.i201515503.EF_Jhon_Sucapuca.dto.CarDto;

import java.util.List;

public record FindCarsResponse(String code,
                               String error,
                               List<CarDto> cars) {
}
