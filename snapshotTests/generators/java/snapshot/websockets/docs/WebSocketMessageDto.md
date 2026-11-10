

# WebSocketMessageDto

## oneOf schemas
* [SubscribeDto](SubscribeDto.md)
* [WebSocketCommandDto](WebSocketCommandDto.md)

## Example
```java
// Import classes:
import io.github.jhannes.openapi.websockets.model.WebSocketMessageDto;
import io.github.jhannes.openapi.websockets.model.SubscribeDto;
import io.github.jhannes.openapi.websockets.model.WebSocketCommandDto;

public class Example {
    public static void main(String[] args) {
        WebSocketMessageDto exampleWebSocketMessageDto = new WebSocketMessageDto();

        // create a new SubscribeDto
        SubscribeDto exampleSubscribeDto = new SubscribeDto();
        // set WebSocketMessageDto to SubscribeDto
        exampleWebSocketMessageDto.setActualInstance(exampleSubscribeDto);
        // to get back the SubscribeDto set earlier
        SubscribeDto testSubscribeDto = (SubscribeDto) exampleWebSocketMessageDto.getActualInstance();

        // create a new WebSocketCommandDto
        WebSocketCommandDto exampleWebSocketCommandDto = new WebSocketCommandDto();
        // set WebSocketMessageDto to WebSocketCommandDto
        exampleWebSocketMessageDto.setActualInstance(exampleWebSocketCommandDto);
        // to get back the WebSocketCommandDto set earlier
        WebSocketCommandDto testWebSocketCommandDto = (WebSocketCommandDto) exampleWebSocketMessageDto.getActualInstance();
    }
}
```


