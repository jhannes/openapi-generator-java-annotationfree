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

import io.github.jhannes.openapi.fakerestapi.model.BookDto;
import io.github.jhannes.openapi.fakerestapi.model.SampleModelData;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

/**
 * API tests for BooksApi
 */
public class BooksApiTest {

    private final BooksApi api = new HttpBooksApi();
    private final SampleModelData sampleData = new SampleModelData(-1);

    public BooksApiTest() throws MalformedURLException {
    }

    @Test
    public void apiV1BooksGetTest() throws IOException {
        //List<BookDto> response = api.apiV1BooksGet();
        // TODO: test validations
    }

    @Test
    public void apiV1BooksIdDeleteTest() throws IOException {
        //Integer id = null;
        //api.apiV1BooksIdDelete(id);
        // TODO: test validations
    }

    @Test
    public void apiV1BooksIdGetTest() throws IOException {
        //Integer id = null;
        //BookDto response = api.apiV1BooksIdGet(id);
        // TODO: test validations
    }

    @Test
    public void apiV1BooksIdPutTest() throws IOException {
        //Integer id = null;
        //BookDto bookDto = null;
        //api.apiV1BooksIdPut(id, bookDto);
        // TODO: test validations
    }

    @Test
    public void apiV1BooksPostTest() throws IOException {
        //BookDto bookDto = null;
        //api.apiV1BooksPost(bookDto);
        // TODO: test validations
    }

}
