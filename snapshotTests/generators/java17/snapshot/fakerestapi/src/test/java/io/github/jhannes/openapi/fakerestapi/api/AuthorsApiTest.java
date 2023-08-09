/*
 * FakeRESTApi.Web V1
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: v1
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package io.github.jhannes.openapi.fakerestapi.api;

import io.github.jhannes.openapi.fakerestapi.model.AuthorDto;
import io.github.jhannes.openapi.fakerestapi.model.SampleModelData;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

/**
 * API tests for AuthorsApi
 */
public class AuthorsApiTest {

    private final AuthorsApi api = new HttpAuthorsApi();
    private final SampleModelData sampleData = new SampleModelData(-1);

    public AuthorsApiTest() throws MalformedURLException {
    }

    @Test
    public void apiV1AuthorsAuthorsBooksIdBookGetTest() throws IOException {
        //Integer idBook = null;
        //List<AuthorDto> response = api.apiV1AuthorsAuthorsBooksIdBookGet(idBook);
        // TODO: test validations
    }

    @Test
    public void apiV1AuthorsGetTest() throws IOException {
        //List<AuthorDto> response = api.apiV1AuthorsGet();
        // TODO: test validations
    }

    @Test
    public void apiV1AuthorsIdDeleteTest() throws IOException {
        //Integer id = null;
        //api.apiV1AuthorsIdDelete(id);
        // TODO: test validations
    }

    @Test
    public void apiV1AuthorsIdGetTest() throws IOException {
        //Integer id = null;
        //AuthorDto response = api.apiV1AuthorsIdGet(id);
        // TODO: test validations
    }

    @Test
    public void apiV1AuthorsIdPutTest() throws IOException {
        //Integer id = null;
        //AuthorDto authorDto = null;
        //AuthorDto response = api.apiV1AuthorsIdPut(id, authorDto);
        // TODO: test validations
    }

    @Test
    public void apiV1AuthorsPostTest() throws IOException {
        //AuthorDto authorDto = null;
        //AuthorDto response = api.apiV1AuthorsPost(authorDto);
        // TODO: test validations
    }

}
