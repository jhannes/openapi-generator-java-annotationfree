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


package io.github.jhannes.openapi.conversations.model;

import java.io.File;
import java.net.URI;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.UUID;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
* ConversationMessageInterface
*/
public interface ConversationMessageInterface {

    List<String> missingRequiredFields();

    void readOnlyFieldsWithValue(List<String> result);


    /**
     * Get text
     * @return text
     */
    String getText();

    void setText(String text);

    ConversationMessageInterface text(String text);

    default <T extends ConversationMessageInterface> T copyTo(T target) {
        if (this.getText() != null) target.setText(this.getText());
        return target;
    }
}
