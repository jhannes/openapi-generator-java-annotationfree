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

import io.github.jhannes.openapi.infectionTracker.model.CaseWorkerDto;

import java.io.IOException;
import java.util.Map;
import java.util.List;
import java.util.Optional;

public interface CaseWorkersApi {
    /**
     * @return CaseWorkerDto
     */
    CaseWorkerDto listCaseWorkers(
    ) throws IOException;
    /**
     * @param caseWorkerDto  (optional)
     */
    void registerCaseWorker(
            CaseWorkerDto caseWorkerDto
    ) throws IOException;
}
