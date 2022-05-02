/*
 * Poly API
 * An example of a polymorphic API
 *
 * The version of the OpenAPI document: 0.1.0
 * Contact: johannes@brodwall.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package io.github.jhannes.openapi.poly.model;


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
 * Model tests for Poly API
 */
public class SampleModelData {

    public SampleModelData(long seed) {
        this.random = new Random(seed);
    }

    public AnyPartyDto sampleAnyPartyDto(String propertyName) {
        List<Supplier<AnyPartyDto>> factories = List.of(
            () -> sampleOrganizationDto(propertyName),
            () -> samplePersonDto(propertyName)
        );
        return pickOne(factories).get();
    }

    public List<AnyPartyDto> sampleListOfAnyPartyDto(String propertyName) {
        return sampleList(() -> sampleAnyPartyDto(propertyName), propertyName);
    }

    public CreationErrorDto sampleCreationErrorDto(String propertyName) {
        List<Supplier<CreationErrorDto>> factories = List.of(
            () -> sampleIllegalEmailAddressErrorDto(propertyName),
            () -> sampleDuplicateIdentifierErrorDto(propertyName),
            () -> sampleGeneralErrorDto(propertyName)
        );
        return pickOne(factories).get();
    }

    public List<CreationErrorDto> sampleListOfCreationErrorDto(String propertyName) {
        return sampleList(() -> sampleCreationErrorDto(propertyName), propertyName);
    }

    public DuplicateIdentifierErrorDto sampleDuplicateIdentifierErrorDto(String propertyName) {
        return new DuplicateIdentifierErrorDto()
            .code(randomString("code"))
            .identifierValue(randomString("identifierValue"))
            .entityType(randomString("entityType"))
            ;
    }

    public List<DuplicateIdentifierErrorDto> sampleListOfDuplicateIdentifierErrorDto(String propertyName) {
        return sampleList(() -> sampleDuplicateIdentifierErrorDto(propertyName), propertyName);
    }

    public GeneralErrorDto sampleGeneralErrorDto(String propertyName) {
        return new GeneralErrorDto()
            .code(randomString("code"))
            .description(randomString("description"))
            ;
    }

    public List<GeneralErrorDto> sampleListOfGeneralErrorDto(String propertyName) {
        return sampleList(() -> sampleGeneralErrorDto(propertyName), propertyName);
    }

    public IllegalEmailAddressErrorDto sampleIllegalEmailAddressErrorDto(String propertyName) {
        return new IllegalEmailAddressErrorDto()
            .code(randomString("code"))
            .inputEmailAddress(randomString("inputEmailAddress"))
            .validDomains(sampleList(() -> randomString("validDomains"), "validDomains"))
            ;
    }

    public List<IllegalEmailAddressErrorDto> sampleListOfIllegalEmailAddressErrorDto(String propertyName) {
        return sampleList(() -> sampleIllegalEmailAddressErrorDto(propertyName), propertyName);
    }

    public NotFoundErrorDto sampleNotFoundErrorDto(String propertyName) {
        return new NotFoundErrorDto()
            .code(randomString("code"))
            .identifierValue(randomString("identifierValue"))
            .entityType(randomString("entityType"))
            ;
    }

    public List<NotFoundErrorDto> sampleListOfNotFoundErrorDto(String propertyName) {
        return sampleList(() -> sampleNotFoundErrorDto(propertyName), propertyName);
    }

    public OrganizationDto sampleOrganizationDto(String propertyName) {
        return new OrganizationDto()
            .id(randomUUID("id"))
            .type(randomString("type"))
            .name(randomString("name"))
            .organizationId(randomString("organizationId"))
            .url(randomURI("url"))
            .email(randomString("email", "email"))
            .emailDomains(sampleList(() -> randomString("emailDomains"), "emailDomains"))
            .phone(randomString("phone", "phone"))
            ;
    }

    public List<OrganizationDto> sampleListOfOrganizationDto(String propertyName) {
        return sampleList(() -> sampleOrganizationDto(propertyName), propertyName);
    }

    public PersonDto samplePersonDto(String propertyName) {
        return new PersonDto()
            .id(randomUUID("id"))
            .type(randomString("type"))
            .givenName(randomString("givenName"))
            .familyName(randomString("familyName"))
            .email(randomString("email", "email"))
            .phone(randomString("phone", "phone"))
            .birthDate(sampleLocalDate("birthDate"))
            ;
    }

    public List<PersonDto> sampleListOfPersonDto(String propertyName) {
        return sampleList(() -> samplePersonDto(propertyName), propertyName);
    }

    public UpdateErrorDto sampleUpdateErrorDto(String propertyName) {
        List<Supplier<UpdateErrorDto>> factories = List.of(
            () -> sampleIllegalEmailAddressErrorDto(propertyName),
            () -> sampleDuplicateIdentifierErrorDto(propertyName),
            () -> sampleGeneralErrorDto(propertyName),
            () -> sampleNotFoundErrorDto(propertyName)
        );
        return pickOne(factories).get();
    }

    public List<UpdateErrorDto> sampleListOfUpdateErrorDto(String propertyName) {
        return sampleList(() -> sampleUpdateErrorDto(propertyName), propertyName);
    }

    protected final Random random;

    public <T> List<T> sampleList(Supplier<T> supplier, String propertyName) {
        return sampleList(supplier, propertyName, 1, 4);
    }

    public <T> List<T> sampleList(Supplier<T> supplier, String propertyName, int min, int max) {
        List<T> result = new ArrayList<>();
        int count = min + random.nextInt(max - min);
        for (int i=0; i<count; i++) {
            result.add(supplier.get());
        }
        return result;
    }

    public <T> Map<String, T> sampleMap(Supplier<T> supplier, String propertyName) {
        return sampleMap(supplier, propertyName, 1, 4);
    }

    public <T> Map<String, T> sampleMap(Supplier<T> supplier, String propertyName, int min, int max) {
        Map<String, T> result = new HashMap<>();
        int count = min + random.nextInt(max - min);
        for (int i=0; i<count; i++) {
            result.put(randomString(propertyName), supplier.get());
        }
        return result;
    }

    public String randomString(String propertyName, String dataFormat) {
        return "str" + randomUUID(propertyName);
    }

    public String randomString(String propertyName) {
        return randomString(propertyName, null);
    }

    public UUID randomUUID(String propertyName) {
        byte[] bytes = new byte[16];
        random.nextBytes(bytes);
        return UUID.nameUUIDFromBytes(bytes);
    }

    public URI randomURI(String propertyName) {
        return asURI("https://" +
            pickOne(List.of("a", "b", "c")) +
            ".example." +
            pickOne(List.of("com", "net", "io"))
        );
    }

    public Long randomLong(String propertyName) {
        return random.nextLong() % 10000L;
    }

    public Integer randomInteger(String propertyName) {
        return random.nextInt(10000);
    }

    public Double randomDouble(String propertyName) {
        return random.nextDouble() * 10000.0;
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
