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

import io.github.jhannes.openapi.openid_configuration.model.DiscoveryDocumentDto;
import io.github.jhannes.openapi.openid_configuration.model.JwksDocumentDto;
import io.github.jhannes.openapi.openid_configuration.model.SampleModelData;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

/**
 * API tests for DiscoveryApi
 */
public class DiscoveryApiTest {

    private final DiscoveryApi api = new HttpDiscoveryApi();
    private final SampleModelData sampleData = new SampleModelData(-1);

    public DiscoveryApiTest() throws MalformedURLException {
    }

    @Test
    public void getDiscoveryDocumentTest() throws IOException {
        //DiscoveryDocumentDto response = api.getDiscoveryDocument();
        // TODO: test validations
    }

    @Test
    public void getJwksDocumentTest() throws IOException {
        //JwksDocumentDto response = api.getJwksDocument();
        // TODO: test validations
    }

}
