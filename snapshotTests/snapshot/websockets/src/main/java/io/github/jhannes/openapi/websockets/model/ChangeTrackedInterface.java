package io.github.jhannes.openapi.websockets.model;

import java.time.OffsetDateTime;
import java.util.List;

public interface ChangeTrackedInterface {
    static String[] readOnlyFields() {
        return new String[]{
        };
    }

    static String[] writeOnlyFields() {
        return new String[]{
        };
    }

    static String[] requiredFields() {
        return new String[]{
                "createdBy",
                "createdAt",
        };
    }

    List<String> missingRequiredFields();

    void readOnlyFieldsWithValue(List<String> result);

    String getCreatedBy();

    void setCreatedBy(String createdBy);

    ChangeTrackedInterface createdBy(String createdBy);

    OffsetDateTime getCreatedAt();

    void setCreatedAt(OffsetDateTime createdAt);

    ChangeTrackedInterface createdAt(OffsetDateTime createdAt);

    OffsetDateTime getUpdatedAt();

    void setUpdatedAt(OffsetDateTime updatedAt);

    ChangeTrackedInterface updatedAt(OffsetDateTime updatedAt);

    String getUpdatedBy();

    void setUpdatedBy(String updatedBy);

    ChangeTrackedInterface updatedBy(String updatedBy);
}
