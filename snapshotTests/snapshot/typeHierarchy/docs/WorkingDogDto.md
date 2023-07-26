
# WorkingDogDto

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**petType** | **"WorkingDog"** |  | 
**capabilities** | [**List<WorkingDogCapabilityDto>**](WorkingDogCapabilityDto.md) |  | 
**id** | **String** |  |  [optional] [readonly]
**name** | **String** |  | 
**birthDate** | **String** |  |  [optional]
**ownerAddress** | [**AddressDto**](AddressDto.md) |  |  [optional]
**bark** | **Boolean** |  |  [optional]
**breed** | [**BreedEnum**](#BreedEnum) |  |  [optional]



## Enum: BreedEnum

Name | Value
---- | -----
DINGO | &quot;Dingo&quot;
HUSKY | &quot;Husky&quot;
RETRIEVER | &quot;Retriever&quot;
SHEPHERD | &quot;Shepherd&quot;



