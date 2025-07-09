
# ThreadHealthDetailsDto

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **"ThreadHealthDetails"** |  | 
**threadState** | [**ThreadStateEnum**](#ThreadStateEnum) |  |  [optional]
**stackTrace** | [**List<StackTraceInnerDto>**](StackTraceInnerDto.md) |  |  [optional]
**lastAliveTime** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**lastSuccessTime** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**lastFailureTime** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**lastFailureException** | [**ExceptionDto**](ExceptionDto.md) |  |  [optional]



## Enum: ThreadStateEnum

Name | Value
---- | -----
NEW | &quot;NEW&quot;
RUNNABLE | &quot;RUNNABLE&quot;
WAITING | &quot;WAITING&quot;
TIMED_WAITING | &quot;TIMED_WAITING&quot;
TERMINATED | &quot;TERMINATED&quot;



