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
import io.github.jhannes.openapi.readOnly.model.SampleModelData;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

/**
 * API tests for DefaultApi
 */
public class DefaultApiTest {

    private final DefaultApi api = new HttpDefaultApi();
    private final SampleModelData sampleData = new SampleModelData(-1);

    public DefaultApiTest() throws MalformedURLException {
    }

    @Test
    public void addPetTest() throws IOException {
        //UUID storeId = null;
        //PetDto petDto = null;
        //api.addPet(storeId, petDto);
        // TODO: test validations
    }

    @Test
    public void addPetWithFormTest() throws IOException {
        //UUID petId = null;
        //String name = null;
        //String status = null;
        //api.addPetWithForm(petId, name, status);
        // TODO: test validations
    }

    @Test
    public void listPetsTest() throws IOException {
        //UUID storeId = null;
        //List<String> status = null;
        //List<String> tags = null;
        //LocalDate bornAfter = null;
        //PetDto response = api.listPets(storeId, status, tags, bornAfter);
        // TODO: test validations
    }

}