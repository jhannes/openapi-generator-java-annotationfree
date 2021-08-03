

# PetDto

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Long** |  |  [optional]
**category** | [**CategoryDto**](CategoryDto.md) |  |  [optional]
**name** | **String** |  | 
**photoUrls** | **List&lt;String&gt;** |  | 
**tags** | [**List&lt;TagDto&gt;**](TagDto.md) |  |  [optional]
**status** | [**StatusEnum**](#StatusEnum) | pet status in the store |  [optional]



## Enum: StatusEnum

Name | Value
---- | -----
AVAILABLE | &quot;available&quot;
PENDING | &quot;pending&quot;
SOLD | &quot;sold&quot;



