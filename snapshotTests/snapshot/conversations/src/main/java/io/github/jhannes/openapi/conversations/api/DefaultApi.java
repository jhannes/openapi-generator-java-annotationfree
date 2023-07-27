/*
 * Conversations
 * Conversations for real time and offline peer-to-peer web chat
 *
 * The version of the OpenAPI document: 1.0.0
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package io.github.jhannes.openapi.conversations.api;

import io.github.jhannes.openapi.conversations.model.CommandToServerDto;
import io.github.jhannes.openapi.conversations.model.ConversationSnapshotDto;

import java.io.IOException;
import java.util.Map;
import java.util.List;
import java.util.Optional;

public interface DefaultApi {
    /**
     * @param commandToServerDto A command sent to the server (required)
     */
    void apiCommandsPost(
            CommandToServerDto commandToServerDto
    ) throws IOException;
    /**
     * @return List&lt;ConversationSnapshotDto&gt;
     */
    List<ConversationSnapshotDto> apiConversationsGet(
    ) throws IOException;
}
