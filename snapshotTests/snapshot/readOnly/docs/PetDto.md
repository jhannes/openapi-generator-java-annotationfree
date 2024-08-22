
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
Cat | &quot;Cat&quot;
Dog | &quot;Dog&quot;



## Enum: StatusEnum

Name | Value
---- | -----
Pending | &quot;Pending&quot;
Available | &quot;Available&quot;
Sold | &quot;Sold&quot;



