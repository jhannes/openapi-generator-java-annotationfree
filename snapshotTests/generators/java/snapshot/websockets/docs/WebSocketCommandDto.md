

# WebSocketCommandDto

## oneOf schemas
* [CreatePersonCommandDto](CreatePersonCommandDto.md)
* [UpdatePersonCommandDto](UpdatePersonCommandDto.md)

## Example
```java
// Import classes:
import io.github.jhannes.openapi.websockets.model.WebSocketCommandDto;
import io.github.jhannes.openapi.websockets.model.CreatePersonCommandDto;
import io.github.jhannes.openapi.websockets.model.UpdatePersonCommandDto;

public class Example {
    public static void main(String[] args) {
        WebSocketCommandDto exampleWebSocketCommandDto = new WebSocketCommandDto();

        // create a new CreatePersonCommandDto
        CreatePersonCommandDto exampleCreatePersonCommandDto = new CreatePersonCommandDto();
        // set WebSocketCommandDto to CreatePersonCommandDto
        exampleWebSocketCommandDto.setActualInstance(exampleCreatePersonCommandDto);
        // to get back the CreatePersonCommandDto set earlier
        CreatePersonCommandDto testCreatePersonCommandDto = (CreatePersonCommandDto) exampleWebSocketCommandDto.getActualInstance();

        // create a new UpdatePersonCommandDto
        UpdatePersonCommandDto exampleUpdatePersonCommandDto = new UpdatePersonCommandDto();
        // set WebSocketCommandDto to UpdatePersonCommandDto
        exampleWebSocketCommandDto.setActualInstance(exampleUpdatePersonCommandDto);
        // to get back the UpdatePersonCommandDto set earlier
        UpdatePersonCommandDto testUpdatePersonCommandDto = (UpdatePersonCommandDto) exampleWebSocketCommandDto.getActualInstance();
    }
}
```


