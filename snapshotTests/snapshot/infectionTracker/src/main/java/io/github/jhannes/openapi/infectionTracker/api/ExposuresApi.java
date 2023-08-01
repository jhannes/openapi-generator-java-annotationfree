/*
 * Infection Tracker
 * Infection Tracker - A case management system for tracking the spread of diseases
 *
 * The version of the OpenAPI document: 1.0.0-draft
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package io.github.jhannes.openapi.infectionTracker.api;

import io.github.jhannes.openapi.infectionTracker.model.ExposureDto;
import java.time.LocalDate;
import java.util.UUID;

import java.io.IOException;
import java.util.Map;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public interface ExposuresApi {
    /**
     * @param exposureDate  (query) (optional
     * @param maxCount  (query) (optional)
     * @return ExposureDto
     */
    ExposureDto listExposures(
            Optional<List<LocalDate>> exposureDate,
            Optional<Integer> maxCount
    ) throws IOException;
    /**
     * @param exposureId  (path) (required)
     * @param exposureDto  (optional)
     */
    void updateExposure(
            UUID exposureId,
            ExposureDto exposureDto
    ) throws IOException;
}
