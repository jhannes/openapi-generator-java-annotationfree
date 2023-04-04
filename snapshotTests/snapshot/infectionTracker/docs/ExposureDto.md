
# ExposureDto

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**UUID**](UUID.md) |  |  [optional] [readonly]
**exposedPersonName** | **String** |  |  [optional]
**exposedPersonPhoneNumber** | **String** |  |  [optional]
**exposedDate** | [**LocalDate**](LocalDate.md) |  |  [optional]
**exposureLocation** | **String** | Address or other identifying description of the location |  [optional]
**notes** | **String** | Information that may be relevant to identify the person fully or determine if they are infected |  [optional]
**caseWorker** | [**UUID**](UUID.md) | The id of the case worker assigned to follow up this person |  [optional]
**status** | [**StatusEnum**](#StatusEnum) |  | 
**delayAfterInfection** | [**DelayAfterInfectionEnum**](#DelayAfterInfectionEnum) |  |  [optional]



## Enum: StatusEnum

Name | Value
---- | -----
UNIDENTIFIED | &quot;unidentified&quot;
IDENTIFIED | &quot;identified&quot;
CONTACTED | &quot;contacted&quot;
TESTED | &quot;tested&quot;
INFECTED | &quot;infected&quot;



## Enum: DelayAfterInfectionEnum

Name | Value
---- | -----
NUMBER_MINUS_2 | -2
NUMBER_MINUS_1 | -1
NUMBER_0 | 0
NUMBER_1 | 1
NUMBER_2 | 2
NUMBER_3 | 3
NUMBER_4 | 4



