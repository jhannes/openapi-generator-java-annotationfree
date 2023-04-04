
# WorkingDogDto

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**petType** | **"WorkingDog"** |  | 
**capabilities** | [**List<CapabilitiesEnum>**](#List<CapabilitiesEnum>) |  | 
**id** | **String** |  |  [optional] [readonly]
**name** | **String** |  | 
**birthDate** | **String** |  |  [optional]
**ownerAddress** | [**AddressDto**](AddressDto.md) |  |  [optional]
**bark** | **Boolean** |  |  [optional]
**breed** | [**BreedEnum**](#BreedEnum) |  |  [optional]



## Enum: List<CapabilitiesEnum>

Name | Value
---- | -----
GUIDE | &quot;Guide&quot;
RESCUE | &quot;Rescue&quot;
SEARCH | &quot;Search&quot;



## Enum: BreedEnum

Name | Value
---- | -----
DINGO | &quot;Dingo&quot;
HUSKY | &quot;Husky&quot;
RETRIEVER | &quot;Retriever&quot;
SHEPHERD | &quot;Shepherd&quot;



