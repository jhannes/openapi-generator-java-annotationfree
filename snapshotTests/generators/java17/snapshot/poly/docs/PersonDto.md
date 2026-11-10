
# PersonDto

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
**status** | [**StatusEnum**](#StatusEnum) |  |  [optional]
**contactChannels** | [**List<ContactChannelsEnum>**](#List<ContactChannelsEnum>) |  |  [optional]



## Enum: StatusEnum

Name | Value
---- | -----
active | &quot;active&quot;
deceased | &quot;deceased&quot;



## Enum: List<ContactChannelsEnum>

Name | Value
---- | -----
email | &quot;email&quot;
phone | &quot;phone&quot;



