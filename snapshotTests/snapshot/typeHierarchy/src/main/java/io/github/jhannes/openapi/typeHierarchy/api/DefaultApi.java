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

package io.github.jhannes.openapi.typeHierarchy.api;

import io.github.jhannes.openapi.typeHierarchy.model.PetDto;

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
     * @param petDto  (optional)
     */
    void petsPost(
            PetDto petDto
    ) throws IOException;
}
