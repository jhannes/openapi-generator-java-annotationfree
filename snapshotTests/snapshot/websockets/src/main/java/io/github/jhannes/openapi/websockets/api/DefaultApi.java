/*
 * WebSockets
 * An example of sending requests and commands
 *
 * The version of the OpenAPI document: 0.1.0
 * Contact: johannes@brodwall.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package io.github.jhannes.openapi.websockets.api;

import io.github.jhannes.openapi.websockets.model.*;

import io.github.jhannes.openapi.websockets.model.WebSocketCommandDto;

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

public interface DefaultApi {
    /**
     * @return WebSocketCommandDto
     */
    @GET("/commands")
    @JsonBody
    public WebSocketCommandDto commandsGet(
    ) throws IOException;
}
