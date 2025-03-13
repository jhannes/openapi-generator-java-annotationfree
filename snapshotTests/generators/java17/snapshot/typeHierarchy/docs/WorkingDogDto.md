
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
Dingo | &quot;Dingo&quot;
Husky | &quot;Husky&quot;
Retriever | &quot;Retriever&quot;
Shepherd | &quot;Shepherd&quot;



