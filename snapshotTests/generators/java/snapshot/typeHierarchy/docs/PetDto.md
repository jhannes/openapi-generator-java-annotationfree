

# PetDto

## oneOf schemas
* [CatDto](CatDto.md)
* [DogDto](DogDto.md)
* [GoldfishDto](GoldfishDto.md)
* [WorkingDogDto](WorkingDogDto.md)

## Example
```java
// Import classes:
import io.github.jhannes.openapi.typeHierarchy.model.PetDto;
import io.github.jhannes.openapi.typeHierarchy.model.CatDto;
import io.github.jhannes.openapi.typeHierarchy.model.DogDto;
import io.github.jhannes.openapi.typeHierarchy.model.GoldfishDto;
import io.github.jhannes.openapi.typeHierarchy.model.WorkingDogDto;

public class Example {
    public static void main(String[] args) {
        PetDto examplePetDto = new PetDto();

        // create a new CatDto
        CatDto exampleCatDto = new CatDto();
        // set PetDto to CatDto
        examplePetDto.setActualInstance(exampleCatDto);
        // to get back the CatDto set earlier
        CatDto testCatDto = (CatDto) examplePetDto.getActualInstance();

        // create a new DogDto
        DogDto exampleDogDto = new DogDto();
        // set PetDto to DogDto
        examplePetDto.setActualInstance(exampleDogDto);
        // to get back the DogDto set earlier
        DogDto testDogDto = (DogDto) examplePetDto.getActualInstance();

        // create a new GoldfishDto
        GoldfishDto exampleGoldfishDto = new GoldfishDto();
        // set PetDto to GoldfishDto
        examplePetDto.setActualInstance(exampleGoldfishDto);
        // to get back the GoldfishDto set earlier
        GoldfishDto testGoldfishDto = (GoldfishDto) examplePetDto.getActualInstance();

        // create a new WorkingDogDto
        WorkingDogDto exampleWorkingDogDto = new WorkingDogDto();
        // set PetDto to WorkingDogDto
        examplePetDto.setActualInstance(exampleWorkingDogDto);
        // to get back the WorkingDogDto set earlier
        WorkingDogDto testWorkingDogDto = (WorkingDogDto) examplePetDto.getActualInstance();
    }
}
```


