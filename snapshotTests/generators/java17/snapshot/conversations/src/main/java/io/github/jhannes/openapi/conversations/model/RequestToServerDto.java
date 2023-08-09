/*
 * Conversations
 * Conversations for real time and offline peer-to-peer web chat
 *
 * The version of the OpenAPI document: 1.0.0
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package io.github.jhannes.openapi.conversations.model;

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

public interface RequestToServerDto extends MessageToServerDto {
    String getRequest();

    UUID getClientId();

    static SubscribeRequestDto SubscribeRequest() {
        SubscribeRequestDto result = new SubscribeRequestDto();
        result.request("SubscribeRequest");
        return result;
    }

    static Class<? extends RequestToServerDto> getType(String request) {
        switch (request) {
        case "SubscribeRequest":
            return SubscribeRequestDto.class;
        default:
            throw new IllegalArgumentException("Illegal request " + request);
        }
    }

    void readOnlyFieldsWithValue(List<String> fields);
}

