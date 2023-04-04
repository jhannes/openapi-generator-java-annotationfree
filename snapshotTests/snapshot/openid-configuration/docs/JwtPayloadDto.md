
# JwtPayloadDto

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**iss** | **String** | Issuer - the URI for the login provider | 
**sub** | **String** | Subject - the unique identifier for the logged in user | 
**aud** | **String** | Audience - the client_id that the JWT was issued to | 
**name** | **String** | The name of the logged in user |  [optional]
**email** | **String** | The email of the logged in user |  [optional]
**orgId** | **String** | The unique identifier of the organization that the user has selected |  [optional]
**org** | **String** | The name of the organization that the user has selected |  [optional]
**pid** | **String** | For JWT from ID-porten, contains national identity number |  [optional]



