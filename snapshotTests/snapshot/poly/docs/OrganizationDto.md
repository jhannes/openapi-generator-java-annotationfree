
# OrganizationDto

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**UUID**](UUID.md) |  |  [optional] [readonly]
**type** | **String** |  | 
**name** | **String** |  | 
**organizationId** | **String** |  |  [optional]
**url** | [**URI**](URI.md) |  |  [optional]
**email** | **String** |  |  [optional]
**emailDomains** | **Set<String>** |  |  [optional] [readonly]
**phone** | **String** |  |  [optional]
**status** | [**StatusEnum**](#StatusEnum) |  |  [optional]
**contactChannels** | [**List<ContactChannelsEnum>**](#List<ContactChannelsEnum>) |  |  [optional]



## Enum: StatusEnum

Name | Value
---- | -----
active | &quot;active&quot;
dissolved | &quot;dissolved&quot;



## Enum: List<ContactChannelsEnum>

Name | Value
---- | -----
email | &quot;email&quot;
phone | &quot;phone&quot;



