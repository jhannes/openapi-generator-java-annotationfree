/*
 * Open ID Connect
 * Open ID Connect Discovery
 *
 * The version of the OpenAPI document: 1.0.0-draft
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package io.github.jhannes.openapi.openid_configuration.model;


import java.net.URI;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.OffsetDateTime;
import java.time.ZonedDateTime;
import java.time.ZoneId;

import java.util.function.Supplier;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.UUID;

/**
 * Model tests for Open ID Connect
 */
public class SampleModelData {

    protected final Random random;

    public SampleModelData(long seed) {
        this.random = new Random(seed);
    }

    public DiscoveryDocumentDto sampleDiscoveryDocumentDto(String propertyName) {

        return new DiscoveryDocumentDto()




            .issuer(randomString("issuer"))






            .authorizationEndpoint(randomString("authorizationEndpoint", "url"))






            .tokenEndpoint(randomString("tokenEndpoint", "url"))






            .endSessionEndpoint(randomString("endSessionEndpoint", "url"))






            .jwksUri(randomString("jwksUri", "url"))




            .responseTypesSupported(sampleList(() -> sampleDiscoveryDocumentDtoResponseTypesSupportedEnum("responseTypesSupported"), "responseTypesSupported"))



            .responseModesSupported(sampleList(() -> sampleDiscoveryDocumentDtoResponseModesSupportedEnum("responseModesSupported"), "responseModesSupported"))



            .subjectTypesSupported(sampleList(() -> sampleDiscoveryDocumentDtoSubjectTypesSupportedEnum("subjectTypesSupported"), "subjectTypesSupported"))



            .codeChallengeMethodsSupported(sampleList(() -> sampleDiscoveryDocumentDtoCodeChallengeMethodsSupportedEnum("codeChallengeMethodsSupported"), "codeChallengeMethodsSupported"))



            .idTokenSigningAlgValuesSupported(sampleList(() -> sampleDiscoveryDocumentDtoIdTokenSigningAlgValuesSupportedEnum("idTokenSigningAlgValuesSupported"), "idTokenSigningAlgValuesSupported"))





            .xSsoFrame(randomString("xSsoFrame", "url"))


            ;

    }

    public List<DiscoveryDocumentDto> sampleListOfDiscoveryDocumentDto(String propertyName) {
        return sampleList(() -> sampleDiscoveryDocumentDto(propertyName), propertyName);
    }

    public DiscoveryDocumentDto.ResponseTypesSupportedEnum sampleDiscoveryDocumentDtoResponseTypesSupportedEnum(String propertyName) {
        return pickOne(new DiscoveryDocumentDto.ResponseTypesSupportedEnum[] {

            DiscoveryDocumentDto.ResponseTypesSupportedEnum.CODE,

            DiscoveryDocumentDto.ResponseTypesSupportedEnum.TOKEN,

            DiscoveryDocumentDto.ResponseTypesSupportedEnum.ID_TOKEN,

        });
    }

    public DiscoveryDocumentDto.ResponseModesSupportedEnum sampleDiscoveryDocumentDtoResponseModesSupportedEnum(String propertyName) {
        return pickOne(new DiscoveryDocumentDto.ResponseModesSupportedEnum[] {

            DiscoveryDocumentDto.ResponseModesSupportedEnum.QUERY,

            DiscoveryDocumentDto.ResponseModesSupportedEnum.FRAGMENT,

        });
    }

    public DiscoveryDocumentDto.SubjectTypesSupportedEnum sampleDiscoveryDocumentDtoSubjectTypesSupportedEnum(String propertyName) {
        return pickOne(new DiscoveryDocumentDto.SubjectTypesSupportedEnum[] {

            DiscoveryDocumentDto.SubjectTypesSupportedEnum.PAIRWISE,

            DiscoveryDocumentDto.SubjectTypesSupportedEnum.PUBLIC,

        });
    }

    public DiscoveryDocumentDto.CodeChallengeMethodsSupportedEnum sampleDiscoveryDocumentDtoCodeChallengeMethodsSupportedEnum(String propertyName) {
        return pickOne(new DiscoveryDocumentDto.CodeChallengeMethodsSupportedEnum[] {

            DiscoveryDocumentDto.CodeChallengeMethodsSupportedEnum.S256,

            DiscoveryDocumentDto.CodeChallengeMethodsSupportedEnum.PLAIN,

        });
    }

    public DiscoveryDocumentDto.IdTokenSigningAlgValuesSupportedEnum sampleDiscoveryDocumentDtoIdTokenSigningAlgValuesSupportedEnum(String propertyName) {
        return pickOne(new DiscoveryDocumentDto.IdTokenSigningAlgValuesSupportedEnum[] {

            DiscoveryDocumentDto.IdTokenSigningAlgValuesSupportedEnum.RS256,

        });
    }



    public JwksDocumentDto sampleJwksDocumentDto(String propertyName) {

        return new JwksDocumentDto()

            .keys(sampleListOfJwksKeyDto("keys"))



            ;

    }

    public List<JwksDocumentDto> sampleListOfJwksDocumentDto(String propertyName) {
        return sampleList(() -> sampleJwksDocumentDto(propertyName), propertyName);
    }



    public JwksKeyDto sampleJwksKeyDto(String propertyName) {

        return new JwksKeyDto()




            .kty(randomString("kty"))






            .use(randomString("use"))






            .kid(randomString("kid"))






            .x5c(randomString("x5c"))


            ;

    }

    public List<JwksKeyDto> sampleListOfJwksKeyDto(String propertyName) {
        return sampleList(() -> sampleJwksKeyDto(propertyName), propertyName);
    }



    public JwtHeaderDto sampleJwtHeaderDto(String propertyName) {

        return new JwtHeaderDto()




            .typ(randomString("typ"))






            .kid(randomString("kid"))






            .alg(randomString("alg"))


            ;

    }

    public List<JwtHeaderDto> sampleListOfJwtHeaderDto(String propertyName) {
        return sampleList(() -> sampleJwtHeaderDto(propertyName), propertyName);
    }



    public JwtPayloadDto sampleJwtPayloadDto(String propertyName) {

        return new JwtPayloadDto()




            .iss(randomString("iss", "url"))






            .sub(randomString("sub"))






            .aud(randomString("aud"))






            .name(randomString("name"))






            .email(randomString("email"))






            .orgId(randomString("orgId"))






            .org(randomString("org"))






            .pid(randomString("pid"))


            ;

    }

    public List<JwtPayloadDto> sampleListOfJwtPayloadDto(String propertyName) {
        return sampleList(() -> sampleJwtPayloadDto(propertyName), propertyName);
    }



    public TokenResponseDto sampleTokenResponseDto(String propertyName) {

        return new TokenResponseDto()




            .accessToken(randomString("accessToken"))






            .tokenType(randomString("tokenType"))





            .expiresIn(randomInteger("expiresIn"))







            .scope(randomString("scope"))






            .idToken(randomString("idToken"))






            .refreshToken(randomString("refreshToken"))


            ;

    }

    public List<TokenResponseDto> sampleListOfTokenResponseDto(String propertyName) {
        return sampleList(() -> sampleTokenResponseDto(propertyName), propertyName);
    }




    public <T> List<T> sampleList(Supplier<T> supplier, String propertyName) {
        return sampleList(supplier, propertyName, 1, 1);
    }

    public <T> List<T> sampleList(Supplier<T> supplier, String propertyName, int min, int max) {
        return List.of(supplier.get());
    }

    public String randomString(String propertyName, String dataFormat) {
        return "str" + randomUUID(propertyName, dataFormat);
    }

    public String randomString(String propertyName) {
        return randomString(propertyName, null);
    }

    public UUID randomUUID(String propertyName, String dataFormat) {
        byte[] bytes = new byte[16];
        random.nextBytes(bytes);
        return UUID.nameUUIDFromBytes(bytes);
    }

    public URI randomURI(String propertyName, String dataFormat) {
        return asURI("https://" +
            pickOne(List.of("a", "b", "c")) +
            ".example." +
            pickOne(List.of("com", "net", "io"))
        );
    }

    public Long randomLong(String propertyName) {
        return random.nextLong(10000L);
    }

    public Integer randomInteger(String propertyName) {
        return random.nextInt(10000);
    }

    public Double randomDouble(String propertyName) {
        return random.nextDouble(10000.0);
    }

    public Boolean randomBoolean(String propertyName) {
        return random.nextBoolean();
    }

    public LocalDate sampleLocalDate(String propertyName) {
        return LocalDate.of(2022, 1, 1).plusDays(random.nextInt(1000));
    }

    public LocalTime sampleLocalTime(String propertyName) {
        return LocalTime.of(0, 0).plusMinutes(random.nextInt(24*60));
    }

    public LocalDateTime sampleLocalDateTime(String propertyName) {
        return LocalDateTime.of(
            sampleLocalDate(propertyName), sampleLocalTime(propertyName)
        );
    }

    public ZoneId sampleZoneId(String propertyName) {
        return ZoneId.of(pickOne(ZoneId.getAvailableZoneIds()));
    }

    public ZonedDateTime sampleZonedDateTime(String propertyName) {
        return ZonedDateTime.of(
            sampleLocalDateTime(propertyName), sampleZoneId(propertyName)
        );
    }

    public OffsetDateTime sampleOffsetDateTime(String propertyName) {
        return sampleZonedDateTime(propertyName).toOffsetDateTime();
    }

    public <T> T pickOne(T[] alternatives) {
        return alternatives[random.nextInt(alternatives.length)];
    }

    public <T> T pickOne(List<T> alternatives) {
        return alternatives.get(random.nextInt(alternatives.size()));
    }

    public <T> T pickOne(Set<T> alternatives) {
        return pickOne(new ArrayList<>(alternatives));
    }

    public static URI asURI(String uri) {
        try {
            return new URI(uri);
        } catch (java.net.URISyntaxException e) {
            throw new RuntimeException(e);
        }
    }
}
