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

import io.github.jhannes.openapi.poly.model.*;

import io.github.jhannes.openapi.poly.model.AnyPartyDto;
import io.github.jhannes.openapi.poly.model.CreationErrorDto;
import java.util.UUID;
import io.github.jhannes.openapi.poly.model.UpdateErrorDto;

import org.actioncontroller.*;
import org.actioncontroller.json.JsonBody;

import java.io.IOException;
import java.net.URI;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Consumer;

public interface DefaultApi {
        /**
         * 
         * 
         * @return AnyPartyDto
         */
        @GET("/parties")
        @JsonBody
        public AnyPartyDto partiesGet(
        ) throws IOException;
        /**
         * 
         * 
         * @param id  (required)
         * @param anyPartyDto  (optional)
         */
        @PUT("/parties/{id}")
        public void partiesIdPut(
                @PathParam("id") UUID id, 
                @JsonBody AnyPartyDto anyPartyDto
        ) throws IOException;
        /**
         * 
         * 
         * @param anyPartyDto  (optional)
         */
        @POST("/parties")
        public void partiesPost(
                @JsonBody AnyPartyDto anyPartyDto
        ) throws IOException;
}
