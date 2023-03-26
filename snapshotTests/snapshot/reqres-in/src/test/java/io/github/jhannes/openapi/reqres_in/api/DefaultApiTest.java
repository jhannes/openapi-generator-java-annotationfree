/*
 * ReqRes API
 * Fake data CRUD API
 *
 * The version of the OpenAPI document: 1
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package io.github.jhannes.openapi.reqres_in.api;

import io.github.jhannes.openapi.reqres_in.ApiException;
import io.github.jhannes.openapi.reqres_in.model.LoginPost200ResponseDto;
import io.github.jhannes.openapi.reqres_in.model.LoginPost400ResponseDto;
import io.github.jhannes.openapi.reqres_in.model.LoginPostRequestDto;
import io.github.jhannes.openapi.reqres_in.model.RegisterPost200ResponseDto;
import io.github.jhannes.openapi.reqres_in.model.UsersGet200ResponseDto;
import io.github.jhannes.openapi.reqres_in.model.UsersIdDelete200Response1Dto;
import io.github.jhannes.openapi.reqres_in.model.UsersIdDelete200ResponseDto;
import org.junit.Test;
import org.junit.Ignore;
import org.junit.Assert;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for DefaultApi
 */
public class DefaultApiTest {

    private final DefaultApi api = new DefaultApi();

    /**
     * Creates a session
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void loginPostTest() throws ApiException {
        //
        //LoginPostRequestDto loginPostRequestDto = null;
        //
        //LoginPost200ResponseDto response = api.loginPost(loginPostRequestDto);

        // TODO: test validations
    }
    /**
     * Ends a session
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void logoutPostTest() throws ApiException {
        //
        //api.logoutPost();

        // TODO: test validations
    }
    /**
     * Creates a user
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void registerPostTest() throws ApiException {
        //
        //LoginPostRequestDto loginPostRequestDto = null;
        //
        //RegisterPost200ResponseDto response = api.registerPost(loginPostRequestDto);

        // TODO: test validations
    }
    /**
     * Fetches a user list
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void usersGetTest() throws ApiException {
        //
        //Integer page = null;
        //
        //Integer perPage = null;
        //
        //UsersGet200ResponseDto response = api.usersGet(page, perPage);

        // TODO: test validations
    }
    /**
     * Deletes a user
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void usersIdDeleteTest() throws ApiException {
        //
        //Integer id = null;
        //
        //api.usersIdDelete(id);

        // TODO: test validations
    }
    /**
     * Fetches a user
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void usersIdGetTest() throws ApiException {
        //
        //Integer id = null;
        //
        //UsersIdDelete200ResponseDto response = api.usersIdGet(id);

        // TODO: test validations
    }
    /**
     * Updates a user
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void usersIdPatchTest() throws ApiException {
        //
        //Integer id = null;
        //
        //UsersIdDelete200Response1Dto response = api.usersIdPatch(id);

        // TODO: test validations
    }
    /**
     * Updates a user
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void usersIdPutTest() throws ApiException {
        //
        //Integer id = null;
        //
        //UsersIdDelete200Response1Dto response = api.usersIdPut(id);

        // TODO: test validations
    }
}
