
# WorkingDogDto

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** |  |  [optional] [readonly]
**name** | **String** |  | 
**birthDate** | **String** |  |  [optional]
**ownerAddress** | [**AddressDto**](AddressDto.md) |  |  [optional]
**petType** | **"WorkingDog"** |  | 
**bark** | **Boolean** |  |  [optional]
**breed** | [**BreedEnum**](#BreedEnum) |  |  [optional]
**capabilities** | [**List<WorkingDogCapabilityDto>**](WorkingDogCapabilityDto.md) |  | 



## Enum: BreedEnum

Name | Value
---- | -----
DINGO | &quot;Dingo&quot;
HUSKY | &quot;Husky&quot;
RETRIEVER | &quot;Retriever&quot;
SHEPHERD | &quot;Shepherd&quot;



