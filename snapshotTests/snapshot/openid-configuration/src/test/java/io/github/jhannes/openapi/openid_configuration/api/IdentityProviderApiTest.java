/*
 * Open ID Connect
 * Open ID Connect Discovery
 *
 * The version of the OpenAPI document: 1.0.0-draft
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package io.github.jhannes.openapi.openid_configuration.api;

import io.github.jhannes.openapi.openid_configuration.model.ResponseTypeDto;
import io.github.jhannes.openapi.openid_configuration.model.TokenResponseDto;
import io.github.jhannes.openapi.openid_configuration.model.UserinfoDto;
import io.github.jhannes.openapi.openid_configuration.model.SampleModelData;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

/**
 * API tests for IdentityProviderApi
 */
public class IdentityProviderApiTest {

    private final IdentityProviderApi api = new HttpIdentityProviderApi();
    private final SampleModelData sampleData = new SampleModelData(-1);

    public IdentityProviderApiTest() throws MalformedURLException {
    }

    @Test
    public void fetchTokenTest() throws IOException {
        //String authorization = null;
        //String grantType = null;
        //String code = null;
        //String clientId = null;
        //String clientSecret = null;
        //String redirectUri = null;
        //String subjectToken = null;
        //String audience = null;
        //TokenResponseDto response = api.fetchToken(authorization, grantType, code, clientId, clientSecret, redirectUri, subjectToken, audience);
        // TODO: test validations
    }

    @Test
    public void getUserinfoTest() throws IOException {
        //Object authorization = null;
        //UserinfoDto response = api.getUserinfo(authorization);
        // TODO: test validations
    }

    @Test
    public void startAuthorizationTest() throws IOException {
        //String clientId = null;
        //ResponseTypeDto responseType = null;
        //String state = null;
        //Object redirectUri = null;
        //String scope = null;
        //api.startAuthorization(clientId, responseType, state, redirectUri, scope);
        // TODO: test validations
    }

}
