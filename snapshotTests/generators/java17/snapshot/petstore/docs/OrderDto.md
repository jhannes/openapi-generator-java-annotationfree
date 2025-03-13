
# OrderDto

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Long** |  |  [optional]
**petId** | **Long** |  |  [optional]
**quantity** | **Integer** |  |  [optional]
**shipDate** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**status** | [**StatusEnum**](#StatusEnum) | Order Status |  [optional]
**complete** | **Boolean** |  |  [optional]



## Enum: StatusEnum

Name | Value
---- | -----
placed | &quot;placed&quot;
approved | &quot;approved&quot;
delivered | &quot;delivered&quot;



