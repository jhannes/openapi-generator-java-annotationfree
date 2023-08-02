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
import java.net.URI;
import io.github.jhannes.openapi.openid_configuration.model.UserinfoDto;

import java.io.IOException;
import java.util.Map;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public interface IdentityProviderApi {
    /**
     * @param authorization Used with token-exchange to validate client_name - use Basic authentication with client_id:client_secret (optional)
     * @param grantType  (optional)
     * @param code  (optional)
     * @param clientId  (optional)
     * @param clientSecret  (optional)
     * @param redirectUri  (optional)
     * @param subjectToken Used with grant_type&#x3D;urn:ietf:params:oauth:grant-type:token-exchange to do a token exchange (optional)
     * @param audience Used with token-exchange to indicate which application the token will be used with (optional)
     * @return TokenResponseDto
     */
    TokenResponseDto fetchToken(
            Optional<String> authorization,
            Optional<String> grant_type,
            Optional<String> code,
            Optional<String> client_id,
            Optional<String> client_secret,
            Optional<URI> redirect_uri,
            Optional<String> subject_token,
            Optional<String> audience
    ) throws IOException;
    /**
     * Returns information about the currently logged in user
     * @param authorization  (required)
     * @return UserinfoDto
     */
    UserinfoDto getUserinfo(
            String authorization
    ) throws IOException;
    /**
     * Starts an authentication flow. If the request is successful, the user is returned to the redirect_uri with a parameter, otherwise the user is redirected with an error parameter
     * @param clientId  (query) (required)
     * @param responseType  (query) (optional)
     * @param state  (query) (optional)
     * @param redirectUri  (query) (optional)
     * @param scope  (query) (optional)
     */
    void startAuthorization(
            String client_id,
            Optional<ResponseTypeDto> response_type,
            Optional<String> state,
            Optional<URI> redirect_uri,
            Optional<String> scope
    ) throws IOException;
}