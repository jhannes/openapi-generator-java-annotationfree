
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
male | &quot;male&quot;
female | &quot;female&quot;
other | &quot;other&quot;
unspecified | &quot;unspecified&quot;



