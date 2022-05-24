

# PetDto

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**UUID**](UUID.md) |  |  [optional] [readonly]
**petType** | [**PetTypeEnum**](#PetTypeEnum) |  | 
**name** | **String** |  |  [optional]
**birthDate** | [**LocalDate**](LocalDate.md) |  |  [optional]
**createdAt** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional] [readonly]
**comments** | [**List<CommentDto>**](CommentDto.md) |  |  [optional] [readonly]
**status** | [**StatusEnum**](#StatusEnum) |  |  [optional] [readonly]



## Enum: PetTypeEnum

Name | Value
---- | -----
CAT | &quot;Cat&quot;
DOG | &quot;Dog&quot;



## Enum: StatusEnum

Name | Value
---- | -----
PENDING | &quot;Pending&quot;
AVAILABLE | &quot;Available&quot;
SOLD | &quot;Sold&quot;



