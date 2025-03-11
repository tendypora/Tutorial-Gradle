package br.com.dio;

import br.com.dio.dto.UserDTO;
import br.com.dio.mapper.UserMapper;
import br.com.dio.model.UserModel;
import org.mapstruct.factory.Mappers;
import java.time.LocalDate;

public class Main {

    private static final UserMapper mapper = Mappers.getMapper(UserMapper.class);

    public static void main(String[] args) {
        var model = new UserModel();
        model.setUsername("Mario");
        model.setCode(1);
        long yearsToSubtract = 30;
        model.setBirthday(LocalDate.now().minusYears(yearsToSubtract));
        System.out.println(mapper.toDTO(model));
        
        var dto = new UserDTO();
        dto.setName("Ana");
        dto.setId(2);
        dto.setBirthday(LocalDate.now().minusYears(40));
        System.out.println(mapper.toModel(dto));
        
        
    }
    
}



/*

Executar aplicativo: no terminal:
cd "C:\Users\tendy\OneDrive\Documentos\Curso Spring Boot\Tutorial-Gradle"
gradle :app:run


Executar com relatório de erros:
cd "C:\Users\tendy\OneDrive\Documentos\Curso Spring Boot\Tutorial-Gradle"
gradle :app:clean :app:checkstyleMain --no-build-cache --info

Outros comandos:
Gradle build
./gradlew build

*/