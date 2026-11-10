

# PersonSnapshotDto


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**createdAt** | **OffsetDateTime** |  |  |
|**createdBy** | **String** |  |  |
|**updatedAt** | **OffsetDateTime** |  |  [optional] |
|**updatedBy** | **String** |  |  [optional] |
|**email** | **String** |  |  [optional] |
|**id** | **UUID** |  |  [optional] [readonly] |
|**type** | **String** |  |  |
|**name** | [**PersonNameDto**](PersonNameDto.md) |  |  |
|**phone** | **String** |  |  [optional] |
|**birthDate** | **LocalDate** |  |  [optional] |
|**gender** | [**GenderEnum**](#GenderEnum) |  |  [optional] |
|**extra** | **String** |  |  [optional] |



## Enum: GenderEnum

| Name | Value |
|---- | -----|
| MALE | &quot;male&quot; |
| FEMALE | &quot;female&quot; |
| OTHER | &quot;other&quot; |
| UNSPECIFIED | &quot;unspecified&quot; |



