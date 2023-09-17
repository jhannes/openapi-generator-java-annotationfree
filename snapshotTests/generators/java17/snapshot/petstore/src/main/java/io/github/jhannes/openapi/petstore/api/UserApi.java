/*
 * OpenAPI Petstore
 * This is a sample server Petstore server. For this sample, you can use the api key \"special-key\" to test the authorization filters
 *
 * The version of the OpenAPI document: 1.0.0
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package io.github.jhannes.openapi.petstore.api;

import io.github.jhannes.openapi.petstore.model.UserDto;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

import static java.net.URLEncoder.encode;
import static java.nio.charset.StandardCharsets.UTF_8;

public interface UserApi {
    /**
     * Create user
     * This can only be done by the logged in user.
     * @param userDto Created user object (optional)
     */
    void createUser(
            UserDto userDto
    ) throws IOException;
    /**
     * Creates list of users with given input array
     * @param userDto List of user object (optional
     */
    void createUsersWithArrayInput(
            List<UserDto> userDto
    ) throws IOException;
    /**
     * Creates list of users with given input array
     * @param userDto List of user object (optional
     */
    void createUsersWithListInput(
            List<UserDto> userDto
    ) throws IOException;
    /**
     * Delete user
     * This can only be done by the logged in user.
     * @param username The name that needs to be deleted (path) (required)
     */
    void deleteUser(
            String username
    ) throws IOException;
    /**
     * Get user by user name
     * @param username The name that needs to be fetched. Use user1 for testing.  (path) (required)
     * @return UserDto
     */
    UserDto getUserByName(
            String username
    ) throws IOException;
    /**
     * Logs user into the system
     * @param username The user name for login (query) (optional)
     * @param password The password for login in clear text (query) (optional)
     * @return String
     */
    String loginUser(
            Optional<String> username,
            Optional<String> password
    ) throws IOException;

    public static class LoginUserQuery {
        private String username;

        public LoginUserQuery username(String username) {
            this.username = username;
            return this;
        }
        private String password;

        public LoginUserQuery password(String password) {
            this.password = password;
            return this;
        }

        public String toUrlEncoded() {
            List<String> parameters = new ArrayList<>();
            if (username != null) {
                parameters.add("username=" + encode(username.toString(), UTF_8));
            }
            if (password != null) {
                parameters.add("password=" + encode(password.toString(), UTF_8));
            }
            return String.join("&", parameters);
        }
    }
    /**
     * Logs out current logged in user session
     */
    void logoutUser(
    ) throws IOException;
    /**
     * Updated user
     * This can only be done by the logged in user.
     * @param username name that need to be deleted (path) (required)
     * @param userDto Updated user object (optional)
     */
    void updateUser(
            String username,
            UserDto userDto
    ) throws IOException;
}