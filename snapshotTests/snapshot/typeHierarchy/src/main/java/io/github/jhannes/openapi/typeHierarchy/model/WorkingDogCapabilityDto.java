/*
 * Sample API
 * Optional multiline or single-line description in [CommonMark](http://commonmark.org/help/) or HTML.
 *
 * The version of the OpenAPI document: 0.1.9
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package io.github.jhannes.openapi.typeHierarchy.model;

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
* Gets or Sets WorkingDogCapability
*/
public enum WorkingDogCapabilityDto {

    GUIDE("Guide"),
    RESCUE("Rescue"),
    SEARCH("Search");

    private String value;

    WorkingDogCapabilityDto(String value) {
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
            "Guide",
            "Rescue",
            "Search",
        });
    }

    public static WorkingDogCapabilityDto fromValue(String text) {
        for (WorkingDogCapabilityDto b : WorkingDogCapabilityDto.values()) {
            if (String.valueOf(b.value).equals(text)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + text + "' (should be one of " + getValues() + ")");
    }
}

