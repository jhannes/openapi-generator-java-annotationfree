

# PersonInterface

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**UUID**](UUID.md) |  |  [optional] [readonly]
**type** | **String** |  | 
**givenName** | **String** |  | 
**familyName** | **String** |  | 
**email** | **String** |  |  [optional]
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



