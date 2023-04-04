
# DiscoveryDocumentDto

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**issuer** | **String** |  |  [optional]
**authorizationEndpoint** | **String** |  |  [optional]
**tokenEndpoint** | **String** |  |  [optional]
**endSessionEndpoint** | **String** |  |  [optional]
**jwksUri** | **String** |  |  [optional]
**responseTypesSupported** | [**List<ResponseTypesSupportedEnum>**](#List<ResponseTypesSupportedEnum>) |  |  [optional]
**responseModesSupported** | [**List<ResponseModesSupportedEnum>**](#List<ResponseModesSupportedEnum>) |  |  [optional]
**subjectTypesSupported** | [**List<SubjectTypesSupportedEnum>**](#List<SubjectTypesSupportedEnum>) |  |  [optional]
**codeChallengeMethodsSupported** | [**List<CodeChallengeMethodsSupportedEnum>**](#List<CodeChallengeMethodsSupportedEnum>) |  |  [optional]
**idTokenSigningAlgValuesSupported** | [**List<IdTokenSigningAlgValuesSupportedEnum>**](#List<IdTokenSigningAlgValuesSupportedEnum>) |  |  [optional]
**xSsoFrame** | **String** |  |  [optional]



## Enum: List<ResponseTypesSupportedEnum>

Name | Value
---- | -----
CODE | &quot;code&quot;
TOKEN | &quot;token&quot;
ID_TOKEN | &quot;id_token&quot;



## Enum: List<ResponseModesSupportedEnum>

Name | Value
---- | -----
QUERY | &quot;query&quot;
FRAGMENT | &quot;fragment&quot;



## Enum: List<SubjectTypesSupportedEnum>

Name | Value
---- | -----
PAIRWISE | &quot;pairwise&quot;
PUBLIC | &quot;public&quot;



## Enum: List<CodeChallengeMethodsSupportedEnum>

Name | Value
---- | -----
S256 | &quot;S256&quot;
PLAIN | &quot;plain&quot;



## Enum: List<IdTokenSigningAlgValuesSupportedEnum>

Name | Value
---- | -----
RS256 | &quot;RS256&quot;



