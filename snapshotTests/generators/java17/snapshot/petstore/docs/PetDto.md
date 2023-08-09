
# PetDto

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Long** |  |  [optional]
**category** | [**CategoryDto**](CategoryDto.md) |  |  [optional]
**name** | **String** |  | 
**photoUrls** | **List<String>** |  | 
**tags** | [**List<TagDto>**](TagDto.md) |  |  [optional]
**status** | [**StatusEnum**](#StatusEnum) | pet status in the store |  [optional]



## Enum: StatusEnum

Name | Value
---- | -----
AVAILABLE | &quot;available&quot;
PENDING | &quot;pending&quot;
SOLD | &quot;sold&quot;



