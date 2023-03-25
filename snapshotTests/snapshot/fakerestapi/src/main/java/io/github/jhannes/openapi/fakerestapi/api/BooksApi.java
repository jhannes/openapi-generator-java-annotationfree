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

import io.github.jhannes.openapi.fakerestapi.model.*;

import io.github.jhannes.openapi.fakerestapi.model.BookDto;

import org.actioncontroller.actions.*;
import org.actioncontroller.values.*;
import org.actioncontroller.values.json.JsonBody;

import java.io.IOException;
import java.net.URI;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Consumer;

public interface BooksApi {
    /**
     * @return List&lt;BookDto&gt;
     */
    @GET("/api/v1/Books")
    @JsonBody
    public List<BookDto> apiV1BooksGet(
    ) throws IOException;
    /**
     * @param id  (required)
     */
    @DELETE("/api/v1/Books/{id}")
    public void apiV1BooksIdDelete(
            @PathParam("id") Integer id
    ) throws IOException;
    /**
     * @param id  (required)
     * @return BookDto
     */
    @GET("/api/v1/Books/{id}")
    @JsonBody
    public BookDto apiV1BooksIdGet(
            @PathParam("id") Integer id
    ) throws IOException;
    /**
     * @param id  (required)
     * @param bookDto  (optional)
     */
    @PUT("/api/v1/Books/{id}")
    public void apiV1BooksIdPut(
            @PathParam("id") Integer id,
            @JsonBody BookDto bookDto
    ) throws IOException;
    /**
     * @param bookDto  (optional)
     */
    @POST("/api/v1/Books")
    public void apiV1BooksPost(
            @JsonBody BookDto bookDto
    ) throws IOException;
}
