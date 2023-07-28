
# DiscoveryDocumentDto

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**issuer** | **String** |  |  [optional]
**authorizationEndpoint** | **String** |  |  [optional]
**tokenEndpoint** | **String** |  |  [optional]
**endSessionEndpoint** | **String** |  |  [optional]
**jwksUri** | **String** |  |  [optional]
**responseTypesSupported** | [**Set<ResponseTypesSupportedEnum>**](#Set<ResponseTypesSupportedEnum>) |  | 
**responseModesSupported** | [**Set<ResponseModesSupportedEnum>**](#Set<ResponseModesSupportedEnum>) |  |  [optional]
**subjectTypesSupported** | [**Set<SubjectTypesSupportedEnum>**](#Set<SubjectTypesSupportedEnum>) |  |  [optional]
**codeChallengeMethodsSupported** | [**Set<CodeChallengeMethodsSupportedEnum>**](#Set<CodeChallengeMethodsSupportedEnum>) |  |  [optional]
**idTokenSigningAlgValuesSupported** | [**List<IdTokenSigningAlgValuesSupportedEnum>**](#List<IdTokenSigningAlgValuesSupportedEnum>) |  |  [optional]
**xSsoFrame** | **String** |  |  [optional]



## Enum: Set<ResponseTypesSupportedEnum>

Name | Value
---- | -----
CODE | &quot;code&quot;
TOKEN | &quot;token&quot;
ID_TOKEN | &quot;id_token&quot;



## Enum: Set<ResponseModesSupportedEnum>

Name | Value
---- | -----
QUERY | &quot;query&quot;
FRAGMENT | &quot;fragment&quot;



## Enum: Set<SubjectTypesSupportedEnum>

Name | Value
---- | -----
PAIRWISE | &quot;pairwise&quot;
PUBLIC | &quot;public&quot;



## Enum: Set<CodeChallengeMethodsSupportedEnum>

Name | Value
---- | -----
S256 | &quot;S256&quot;
PLAIN | &quot;plain&quot;



## Enum: List<IdTokenSigningAlgValuesSupportedEnum>

Name | Value
---- | -----
RS256 | &quot;RS256&quot;



