/*
 * WebSockets
 * An example of sending requests and commands
 *
 * The version of the OpenAPI document: 0.1.0
 * Contact: johannes@brodwall.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package io.github.jhannes.openapi.websockets.model;

import java.io.File;
import java.net.URI;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.UUID;
import java.util.function.Function;
import java.util.stream.Collectors;

public interface WebSocketMessageDto  {
    String getCommand();

    static UpdatePersonCommandDto updatePerson() {
        UpdatePersonCommandDto result = new UpdatePersonCommandDto();
        result.command("updatePerson");
        return result;
    }
    static CreatePersonCommandDto createPerson() {
        CreatePersonCommandDto result = new CreatePersonCommandDto();
        result.command("createPerson");
        return result;
    }

    static Class<? extends WebSocketMessageDto> getType(String command) {
        switch (command) {
        case "updatePerson":
            return UpdatePersonCommandDto.class;
        case "createPerson":
            return CreatePersonCommandDto.class;
        default:
            throw new IllegalArgumentException("Illegal command " + command);
        }
    }

    void readOnlyFieldsWithValue(List<String> fields);
}
