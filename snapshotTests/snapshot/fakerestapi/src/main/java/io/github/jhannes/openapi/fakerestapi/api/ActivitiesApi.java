/*
 * FakeRESTApi.Web V1
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: v1
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package io.github.jhannes.openapi.fakerestapi.api;

import io.github.jhannes.openapi.fakerestapi.model.ActivityDto;

import java.io.IOException;
import java.util.Map;
import java.util.List;
import java.util.Optional;

public interface ActivitiesApi {
    /**
     * @return List&lt;ActivityDto&gt;
     */
    List<ActivityDto> apiV1ActivitiesGet(
    ) throws IOException;
    /**
     * @param id  (path) (required)
     */
    void apiV1ActivitiesIdDelete(
            Integer id
    ) throws IOException;
    /**
     * @param id  (path) (required)
     * @return ActivityDto
     */
    ActivityDto apiV1ActivitiesIdGet(
            Integer id
    ) throws IOException;
    /**
     * @param id  (path) (required)
     * @param activityDto  (optional)
     * @return ActivityDto
     */
    ActivityDto apiV1ActivitiesIdPut(
            Integer id,
            ActivityDto activityDto
    ) throws IOException;
    /**
     * @param activityDto  (optional)
     * @return ActivityDto
     */
    ActivityDto apiV1ActivitiesPost(
            ActivityDto activityDto
    ) throws IOException;
}
