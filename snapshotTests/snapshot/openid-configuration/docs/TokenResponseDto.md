

# TokenResponseDto

Token response according to https://www.oauth.com/oauth2-servers/access-tokens/access-token-response/
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**accessToken** | **String** |  | 
**tokenType** | **String** | The type of token this is. Always the string &#39;bearer&#39; | 
**expiresIn** | **Integer** | The duration of time the access token is granted for in seconds |  [optional]
**scope** | **String** | Space separated list of granted scopes for the access_token |  [optional]
**idToken** | **String** | JWT which has format base64(JwtHeader) + &#39;.&#39; base64(JwtPayload) + &#39;.&#39; + base64(signature) |  [optional]
**refreshToken** | **String** |  |  [optional]



