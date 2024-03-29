/*
 * Sample API
 * A small example to demonstrate individual problems
 *
 * The version of the OpenAPI document: 0.1.9
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package io.github.jhannes.openapi.readOnly.api;

import java.time.LocalDate;
import io.github.jhannes.openapi.readOnly.model.PetDto;
import java.util.UUID;

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
     * @param storeId  (path) (required)
     * @param petDto  (optional)
     */
    void addPet(
            UUID storeId,
            PetDto petDto
    ) throws IOException;
    /**
     * @param petId  (path) (required)
     * @param name Updated name of the pet (optional)
     * @param status Updated status of the pet (optional)
     */
    void addPetWithForm(
            UUID petId,
            Optional<String> name,
            Optional<String> status
    ) throws IOException;

    public static class AddPetWithFormForm {
        private String name;

        public AddPetWithFormForm name(String name) {
            this.name = name;
            return this;
        }
        private String status;

        public AddPetWithFormForm status(String status) {
            this.status = status;
            return this;
        }

        public String toUrlEncoded() {
            List<String> parameters = new ArrayList<>();
            if (name != null) {
                parameters.add("name=" + encode(name.toString(), UTF_8));
            }
            if (status != null) {
                parameters.add("status=" + encode(status.toString(), UTF_8));
            }
            return String.join("&", parameters);
        }
    }
    /**
     * @param storeId  (path) (required)
     * @param status  (query) (optional
     * @param tags  (query) (optional
     * @param bornAfter  (query) (optional)
     * @return PetDto
     */
    PetDto listPets(
            UUID storeId,
            Optional<List<String>> status,
            Optional<List<String>> tags,
            Optional<LocalDate> bornAfter
    ) throws IOException;

    public static class ListPetsQuery {
        private List<String> status;

        public ListPetsQuery status(List<String> status) {
            this.status = status;
            return this;
        }
        private List<String> tags;

        public ListPetsQuery tags(List<String> tags) {
            this.tags = tags;
            return this;
        }
        private LocalDate bornAfter;

        public ListPetsQuery bornAfter(LocalDate bornAfter) {
            this.bornAfter = bornAfter;
            return this;
        }

        public String toUrlEncoded() {
            List<String> parameters = new ArrayList<>();
            if (status != null) {
                parameters.add("status=" + encode(status.toString(), UTF_8));
            }
            if (tags != null) {
                parameters.add("tags=" + encode(tags.toString(), UTF_8));
            }
            if (bornAfter != null) {
                parameters.add("bornAfter=" + encode(bornAfter.toString(), UTF_8));
            }
            return String.join("&", parameters);
        }
    }
}
