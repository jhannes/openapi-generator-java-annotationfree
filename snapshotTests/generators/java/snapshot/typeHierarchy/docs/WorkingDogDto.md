

# WorkingDogDto


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** |  |  [optional] [readonly] |
|**name** | **String** |  |  |
|**birthDate** | **String** |  |  [optional] |
|**ownerAddress** | [**AddressDto**](AddressDto.md) |  |  [optional] |
|**petType** | [**PetTypeEnum**](#PetTypeEnum) |  |  |
|**bark** | **Boolean** |  |  [optional] |
|**breed** | [**BreedEnum**](#BreedEnum) |  |  [optional] |
|**capabilities** | **List&lt;WorkingDogCapabilityDto&gt;** |  |  |



## Enum: PetTypeEnum

| Name | Value |
|---- | -----|
| WORKING_DOG | &quot;WorkingDog&quot; |



## Enum: BreedEnum

| Name | Value |
|---- | -----|
| DINGO | &quot;Dingo&quot; |
| HUSKY | &quot;Husky&quot; |
| RETRIEVER | &quot;Retriever&quot; |
| SHEPHERD | &quot;Shepherd&quot; |



