package pe.edu.i201515503.EF_Jhon_Sucapuca.response;

import pe.edu.i201515503.EF_Jhon_Sucapuca.dto.CarDetailDto;

public record FindCarResponse(String code,
                              String error,
                              CarDetailDto carDetailDto) {
}
