

# PetDto


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** |  |  [optional] [readonly] |
|**name** | **String** |  |  |
|**birthDate** | **String** |  |  [optional] |
|**ownerAddress** | [**AddressDto**](AddressDto.md) |  |  [optional] |
|**petType** | [**PetTypeEnum**](#PetTypeEnum) |  |  |
|**hunts** | **Boolean** |  |  [optional] |
|**age** | **Integer** |  |  [optional] [readonly] |
|**bark** | **Boolean** |  |  [optional] |
|**breed** | [**BreedEnum**](#BreedEnum) |  |  [optional] |
|**capabilities** | [**List&lt;CapabilitiesEnum&gt;**](#List&lt;CapabilitiesEnum&gt;) |  |  |
|**species** | **String** |  |  [optional] |



## Enum: PetTypeEnum

| Name | Value |
|---- | -----|
| GOLDFISH | &quot;Goldfish&quot; |



## Enum: BreedEnum

| Name | Value |
|---- | -----|
| DINGO | &quot;Dingo&quot; |
| HUSKY | &quot;Husky&quot; |
| RETRIEVER | &quot;Retriever&quot; |
| SHEPHERD | &quot;Shepherd&quot; |



## Enum: List&lt;CapabilitiesEnum&gt;

| Name | Value |
|---- | -----|
| GUIDE | &quot;Guide&quot; |
| RESCUE | &quot;Rescue&quot; |
| SEARCH | &quot;Search&quot; |



