
# DiscoveryDocumentDto

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**issuer** | **String** |  | 
**authorizationEndpoint** | [**URI**](URI.md) |  | 
**tokenEndpoint** | [**URI**](URI.md) |  | 
**userinfoEndpoint** | [**URI**](URI.md) |  |  [optional]
**endSessionEndpoint** | [**URI**](URI.md) |  |  [optional]
**jwksUri** | [**URI**](URI.md) |  |  [optional]
**grantTypesSupported** | [**Set<GrantTypeDto>**](GrantTypeDto.md) |  |  [optional]
**scopesSupported** | **Set<Object>** |  |  [optional]
**claimsSupported** | **Set<Object>** |  |  [optional]
**responseTypesSupported** | [**Set<ResponseTypeDto>**](ResponseTypeDto.md) |  | 
**responseModesSupported** | [**Set<ResponseModesSupportedEnum>**](#Set<ResponseModesSupportedEnum>) |  |  [optional]
**subjectTypesSupported** | [**Set<SubjectTypesSupportedEnum>**](#Set<SubjectTypesSupportedEnum>) |  |  [optional]
**codeChallengeMethodsSupported** | [**Set<CodeChallengeMethodsSupportedEnum>**](#Set<CodeChallengeMethodsSupportedEnum>) |  |  [optional]
**idTokenSigningAlgValuesSupported** | [**List<IdTokenSigningAlgValuesSupportedEnum>**](#List<IdTokenSigningAlgValuesSupportedEnum>) |  |  [optional]
**xSsoFrame** | **String** |  |  [optional]



## Enum: Set<ResponseModesSupportedEnum>

Name | Value
---- | -----
QUERY | &quot;query&quot;
FRAGMENT | &quot;fragment&quot;
FORM_POST | &quot;form_post&quot;



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



