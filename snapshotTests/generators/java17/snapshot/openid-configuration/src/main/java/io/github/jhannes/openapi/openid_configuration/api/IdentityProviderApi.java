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

import io.github.jhannes.openapi.openid_configuration.model.GrantTypeDto;
import io.github.jhannes.openapi.openid_configuration.model.OauthErrorDto;
import io.github.jhannes.openapi.openid_configuration.model.ResponseTypeDto;
import io.github.jhannes.openapi.openid_configuration.model.TokenResponseDto;
import java.net.URI;
import io.github.jhannes.openapi.openid_configuration.model.UserinfoDto;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

import static java.net.URLEncoder.encode;
import static java.nio.charset.StandardCharsets.UTF_8;

public interface IdentityProviderApi {
    /**
     * Starts an authentication flow. If the request is successful, the user is returned to the redirect_uri with a parameter, otherwise the user is redirected with an error parameter
     * @param responseType  (query) (required)
     * @param clientId  (query) (required)
     * @param redirectUri  (query) (required)
     * @param responseMode  (query) (optional)
     * @param state  (query) (optional)
     * @param scope  (query) (optional)
     * @param loginHint  (query) (optional)
     * @param prompt  (query) (optional
     * @param acrValues Requested Authentication Context Class Reference values. Space-separated string that specifies the acr values that the Authorization Server is being requested to use for processing this Authentication Request, with the values appearing in order of preference. The Authentication Context Class satisfied by the authentication performed is returned as the acr Claim Value, as specified in Section 2 (query) (optional
     * @param nonce OPTIONAL. String value used to associate a Client session with an ID Token, and to mitigate replay attacks. The value is passed through unmodified from the Authentication Request to the ID Token (query) (optional)
     * @param display  (query) (optional)
     * @see <a href="https://openid.net/specs/openid-connect-core-1_0.html#AuthRequest"> Documentation</a>
     */
    void authorization(
            ResponseTypeDto response_type,
            String client_id,
            URI redirect_uri,
            Optional<String> response_mode,
            Optional<String> state,
            Optional<String> scope,
            Optional<String> login_hint,
            Optional<List<String>> prompt,
            Optional<List<String>> acr_values,
            Optional<String> nonce,
            Optional<String> display
    ) throws IOException;

    public static class AuthorizationQuery {
        private ResponseTypeDto responseType;

        public AuthorizationQuery responseType(ResponseTypeDto responseType) {
            this.responseType = responseType;
            return this;
        }
        private String responseMode;

        public AuthorizationQuery responseMode(String responseMode) {
            this.responseMode = responseMode;
            return this;
        }
        private String clientId;

        public AuthorizationQuery clientId(String clientId) {
            this.clientId = clientId;
            return this;
        }
        private String state;

        public AuthorizationQuery state(String state) {
            this.state = state;
            return this;
        }
        private URI redirectUri;

        public AuthorizationQuery redirectUri(URI redirectUri) {
            this.redirectUri = redirectUri;
            return this;
        }
        private String scope;

        public AuthorizationQuery scope(String scope) {
            this.scope = scope;
            return this;
        }
        private String loginHint;

        public AuthorizationQuery loginHint(String loginHint) {
            this.loginHint = loginHint;
            return this;
        }
        private List<String> prompt;

        public AuthorizationQuery prompt(List<String> prompt) {
            this.prompt = prompt;
            return this;
        }
        private List<String> acrValues;

        public AuthorizationQuery acrValues(List<String> acrValues) {
            this.acrValues = acrValues;
            return this;
        }
        private String nonce;

        public AuthorizationQuery nonce(String nonce) {
            this.nonce = nonce;
            return this;
        }
        private String display;

        public AuthorizationQuery display(String display) {
            this.display = display;
            return this;
        }

        public String toUrlEncoded() {
            List<String> parameters = new ArrayList<>();
            if (responseType != null) {
                parameters.add("response_type=" + encode(responseType.toString(), UTF_8));
            }
            if (responseMode != null) {
                parameters.add("response_mode=" + encode(responseMode.toString(), UTF_8));
            }
            if (clientId != null) {
                parameters.add("client_id=" + encode(clientId.toString(), UTF_8));
            }
            if (state != null) {
                parameters.add("state=" + encode(state.toString(), UTF_8));
            }
            if (redirectUri != null) {
                parameters.add("redirect_uri=" + encode(redirectUri.toString(), UTF_8));
            }
            if (scope != null) {
                parameters.add("scope=" + encode(scope.toString(), UTF_8));
            }
            if (loginHint != null) {
                parameters.add("login_hint=" + encode(loginHint.toString(), UTF_8));
            }
            if (prompt != null) {
                parameters.add("prompt=" + encode(prompt.toString(), UTF_8));
            }
            if (acrValues != null) {
                parameters.add("acr_values=" + encode(acrValues.toString(), UTF_8));
            }
            if (nonce != null) {
                parameters.add("nonce=" + encode(nonce.toString(), UTF_8));
            }
            if (display != null) {
                parameters.add("display=" + encode(display.toString(), UTF_8));
            }
            return String.join("&", parameters);
        }
    }
    /**
     * @param grantType  (required)
     * @param clientId  (required)
     * @param code  (required)
     * @param authorization Used with token-exchange to validate client_name - use Basic authentication with client_id:client_secret (optional)
     * @param clientSecret  (optional)
     * @param redirectUri  (optional)
     * @param refreshToken  (optional)
     * @param subjectToken Used with grant_type&#x3D;urn:ietf:params:oauth:grant-type:token-exchange to do a token exchange (optional)
     * @param audience Used with token-exchange to indicate which application the token will be used with (optional)
     * @return TokenResponseDto
     */
    TokenResponseDto fetchToken(
            GrantTypeDto grant_type,
            String client_id,
            String code,
            Optional<String> authorization,
            Optional<String> client_secret,
            Optional<URI> redirect_uri,
            Optional<String> refresh_token,
            Optional<String> subject_token,
            Optional<String> audience
    ) throws IOException;

    public static class FetchTokenHeaders {
        private String authorization;

        public FetchTokenHeaders authorization(String authorization) {
            this.authorization = authorization;
            return this;
        }
    }

    public static class FetchTokenForm {
        private GrantTypeDto grantType;

        public FetchTokenForm grantType(GrantTypeDto grantType) {
            this.grantType = grantType;
            return this;
        }
        private String clientId;

        public FetchTokenForm clientId(String clientId) {
            this.clientId = clientId;
            return this;
        }
        private String clientSecret;

        public FetchTokenForm clientSecret(String clientSecret) {
            this.clientSecret = clientSecret;
            return this;
        }
        private URI redirectUri;

        public FetchTokenForm redirectUri(URI redirectUri) {
            this.redirectUri = redirectUri;
            return this;
        }
        private String code;

        public FetchTokenForm code(String code) {
            this.code = code;
            return this;
        }
        private String refreshToken;

        public FetchTokenForm refreshToken(String refreshToken) {
            this.refreshToken = refreshToken;
            return this;
        }
        private String subjectToken;

        public FetchTokenForm subjectToken(String subjectToken) {
            this.subjectToken = subjectToken;
            return this;
        }
        private String audience;

        public FetchTokenForm audience(String audience) {
            this.audience = audience;
            return this;
        }

        public String toUrlEncoded() {
            List<String> parameters = new ArrayList<>();
            if (grantType != null) {
                parameters.add("grant_type=" + encode(grantType.toString(), UTF_8));
            }
            if (clientId != null) {
                parameters.add("client_id=" + encode(clientId.toString(), UTF_8));
            }
            if (clientSecret != null) {
                parameters.add("client_secret=" + encode(clientSecret.toString(), UTF_8));
            }
            if (redirectUri != null) {
                parameters.add("redirect_uri=" + encode(redirectUri.toString(), UTF_8));
            }
            if (code != null) {
                parameters.add("code=" + encode(code.toString(), UTF_8));
            }
            if (refreshToken != null) {
                parameters.add("refresh_token=" + encode(refreshToken.toString(), UTF_8));
            }
            if (subjectToken != null) {
                parameters.add("subject_token=" + encode(subjectToken.toString(), UTF_8));
            }
            if (audience != null) {
                parameters.add("audience=" + encode(audience.toString(), UTF_8));
            }
            return String.join("&", parameters);
        }
    }
    /**
     * Returns information about the currently logged in user
     * @param authorization  (required)
     * @return UserinfoDto
     */
    UserinfoDto getUserinfo(
            String authorization
    ) throws IOException;

    public static class GetUserinfoHeaders {
        private String authorization;

        public GetUserinfoHeaders authorization(String authorization) {
            this.authorization = authorization;
            return this;
        }
    }
}
