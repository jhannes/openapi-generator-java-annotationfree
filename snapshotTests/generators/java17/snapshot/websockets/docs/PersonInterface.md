
# PersonInterface

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**email** | **String** |  |  [optional]
**id** | [**UUID**](UUID.md) |  |  [optional] [readonly]
**type** | **String** |  |  [optional]
**name** | [**PersonNameDto**](PersonNameDto.md) |  |  [optional]
**phone** | **String** |  |  [optional]
**birthDate** | [**LocalDate**](LocalDate.md) |  |  [optional]
**gender** | [**GenderEnum**](#GenderEnum) |  |  [optional]



## Enum: GenderEnum

Name | Value
---- | -----
MALE | &quot;male&quot;
FEMALE | &quot;female&quot;
OTHER | &quot;other&quot;
UNSPECIFIED | &quot;unspecified&quot;



