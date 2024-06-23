package pe.edu.cibertec.T2_SW_OrtizPelaezLuisHumberto.util;

import org.springframework.stereotype.Component;

@Component
public class DtoUtil {
    public DtoEntity convertirADto(Object obj, DtoEntity mapper){
        return new ModelMapper().map(obj, mapper.getClass());
    }
    public Object convertirDtoAEntity(Object obj, DtoEntity mapper){
        return new ModelMapper().map(mapper, obj.getClass());
    }
}
