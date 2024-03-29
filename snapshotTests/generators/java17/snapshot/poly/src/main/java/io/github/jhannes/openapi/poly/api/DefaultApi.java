/*
 * Poly API
 * An example of a polymorphic API
 *
 * The version of the OpenAPI document: 0.1.0
 * Contact: johannes@brodwall.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package io.github.jhannes.openapi.poly.api;

import io.github.jhannes.openapi.poly.model.AnyPartyDto;
import io.github.jhannes.openapi.poly.model.CreationErrorDto;
import io.github.jhannes.openapi.poly.model.LogMessageDto;
import java.util.UUID;
import io.github.jhannes.openapi.poly.model.UpdateErrorDto;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

import static java.net.URLEncoder.encode;
import static java.nio.charset.StandardCharsets.UTF_8;

public interface DefaultApi {
    /**
     * @param logMessageDto  (optional)
     */
    void logMessage(
            LogMessageDto logMessageDto
    ) throws IOException;
    /**
     * @return AnyPartyDto
     */
    AnyPartyDto partiesGet(
    ) throws IOException;
    /**
     * @param id  (path) (required)
     * @param anyPartyDto  (optional)
     */
    void partiesIdPut(
            UUID id,
            AnyPartyDto anyPartyDto
    ) throws IOException;
    /**
     * @param anyPartyDto  (optional)
     */
    void partiesPost(
            AnyPartyDto anyPartyDto
    ) throws IOException;
}
