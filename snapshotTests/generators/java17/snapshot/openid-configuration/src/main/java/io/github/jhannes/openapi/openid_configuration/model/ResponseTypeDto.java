/*
 * Open ID Connect
 * Open ID Connect Discovery
 *
 * The version of the OpenAPI document: 1.0.0-draft
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package io.github.jhannes.openapi.openid_configuration.model;

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

/**
* Gets or Sets ResponseType
*/
public enum ResponseTypeDto {

    code("code"),
    token("token"),
    id_token("id_token"),
    code_id_token("code id_token"),
    id_token_token("id_token token");

    private String value;

    ResponseTypeDto(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static List<String> getValues() {
        return Arrays.asList(new String[] {
            "code",
            "token",
            "id_token",
            "code id_token",
            "id_token token",
        });
    }

    public static ResponseTypeDto fromValue(String text) {
        for (ResponseTypeDto b : ResponseTypeDto.values()) {
            if (String.valueOf(b.value).equals(text)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + text + "' (should be one of " + getValues() + ")");
    }
}

