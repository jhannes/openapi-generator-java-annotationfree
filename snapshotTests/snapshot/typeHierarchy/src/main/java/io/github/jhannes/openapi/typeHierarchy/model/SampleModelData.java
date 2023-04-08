/*
 * Sample API
 * Optional multiline or single-line description in [CommonMark](http://commonmark.org/help/) or HTML.
 *
 * The version of the OpenAPI document: 0.1.9
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package io.github.jhannes.openapi.typeHierarchy.model;


import java.net.URI;
import java.time.Instant;
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
 * Model tests for Sample API
 */
public class SampleModelData {

    public SampleModelData(Random random) {
        this.random = random;
    }

    public SampleModelData(long seed) {
        this(new Random(seed));
    }

    public AddressDto sampleAddressDto(String propertyName) {
        return sampleAddressDto();
    }

    public AddressDto sampleAddressDto() {
        return new AddressDto()
            .addressLine1(sampleString("addressLine1"))
            .addressLine2(sampleString("addressLine2"))
            .city(sampleString("city"))
            .country(sampleString("country"));
    }

    public List<AddressDto> sampleListOfAddressDto(String propertyName) {
        return sampleListOfAddressDto();
    }

    public List<AddressDto> sampleListOfAddressDto() {
        return sampleList(() -> sampleAddressDto());
    }

    public CatDto sampleCatDto(String propertyName) {
        return sampleCatDto();
    }

    public CatDto sampleCatDto() {
        return new CatDto()
            .petType("Cat")
            .hunts(sampleBoolean("hunts"))
            .age(sampleInteger("age"))
            .id(sampleString("id"))
            .name(sampleString("name"))
            .birthDate(sampleString("birthDate"))
            .ownerAddress(sampleAddressDto("ownerAddress"));
    }

    public List<CatDto> sampleListOfCatDto(String propertyName) {
        return sampleListOfCatDto();
    }

    public List<CatDto> sampleListOfCatDto() {
        return sampleList(() -> sampleCatDto());
    }

    public DogDto sampleDogDto(String propertyName) {
        return sampleDogDto();
    }

    public DogDto sampleDogDto() {
        return new DogDto()
            .petType("Dog")
            .bark(sampleBoolean("bark"))
            .breed(sampleDogDtoBreedEnum("breed"))
            .id(sampleString("id"))
            .name(sampleString("name"))
            .birthDate(sampleString("birthDate"))
            .ownerAddress(sampleAddressDto("ownerAddress"));
    }

    public List<DogDto> sampleListOfDogDto(String propertyName) {
        return sampleListOfDogDto();
    }

    public List<DogDto> sampleListOfDogDto() {
        return sampleList(() -> sampleDogDto());
    }

    public DogDto.BreedEnum sampleDogDtoBreedEnum(String propertyName) {
        return pickOne(DogDto.BreedEnum.values());
    }

    public GoldfishDto sampleGoldfishDto(String propertyName) {
        return sampleGoldfishDto();
    }

    public GoldfishDto sampleGoldfishDto() {
        return new GoldfishDto()
            .petType("Goldfish")
            .name(sampleString("name"))
            .species(sampleString("species"));
    }

    public List<GoldfishDto> sampleListOfGoldfishDto(String propertyName) {
        return sampleListOfGoldfishDto();
    }

    public List<GoldfishDto> sampleListOfGoldfishDto() {
        return sampleList(() -> sampleGoldfishDto());
    }

    public PetBaseDto samplePetBaseDto(String propertyName) {
        return samplePetBaseDto();
    }

    public PetBaseDto samplePetBaseDto() {
        return new PetBaseDto()
            .id(sampleString("id"))
            .name(sampleString("name"))
            .birthDate(sampleString("birthDate"))
            .ownerAddress(sampleAddressDto("ownerAddress"));
    }

    public List<PetBaseDto> sampleListOfPetBaseDto(String propertyName) {
        return sampleListOfPetBaseDto();
    }

    public List<PetBaseDto> sampleListOfPetBaseDto() {
        return sampleList(() -> samplePetBaseDto());
    }

    public PetDto samplePetDto(String propertyName) {
        return samplePetDto();
    }

    public PetDto samplePetDto() {
        List<Supplier<PetDto>> factories = List.of(
            () -> sampleWorkingDogDto().petType("WorkingDog"),
            () -> sampleCatDto().petType("Cat"),
            () -> sampleGoldfishDto().petType("Goldfish"),
            () -> sampleDogDto().petType("Dog")
        );
        return pickOne(factories).get();
    }

    public List<PetDto> sampleListOfPetDto(String propertyName) {
        return sampleListOfPetDto();
    }

    public List<PetDto> sampleListOfPetDto() {
        return sampleList(() -> samplePetDto());
    }

    public WorkingDogDto sampleWorkingDogDto(String propertyName) {
        return sampleWorkingDogDto();
    }

    public WorkingDogDto sampleWorkingDogDto() {
        return new WorkingDogDto()
            .petType("WorkingDog")
            .capabilities(sampleList(() -> sampleWorkingDogDtoCapabilitiesEnum("capabilities"), "capabilities"))
            .id(sampleString("id"))
            .name(sampleString("name"))
            .birthDate(sampleString("birthDate"))
            .ownerAddress(sampleAddressDto("ownerAddress"))
            .bark(sampleBoolean("bark"))
            .breed(sampleWorkingDogDtoBreedEnum("breed"));
    }

    public List<WorkingDogDto> sampleListOfWorkingDogDto(String propertyName) {
        return sampleListOfWorkingDogDto();
    }

    public List<WorkingDogDto> sampleListOfWorkingDogDto() {
        return sampleList(() -> sampleWorkingDogDto());
    }

    public WorkingDogDto.CapabilitiesEnum sampleWorkingDogDtoCapabilitiesEnum(String propertyName) {
        return pickOne(WorkingDogDto.CapabilitiesEnum.values());
    }

    public WorkingDogDto.BreedEnum sampleWorkingDogDtoBreedEnum(String propertyName) {
        return pickOne(WorkingDogDto.BreedEnum.values());
    }

    protected final Random random;
    protected final Map<String, Supplier<String>> dataFormatFactories = new HashMap<>(Map.of(
        "email", this::randomEmail,
        "phone", this::randomPhoneNumber
    ));
    protected final Map<String, Supplier<String>> propertyNameFactories = new HashMap<>(Map.of(
        "givenName", this::randomGivenName,
        "familyName", this::randomFamilyName,
        "personName", this::randomPersonName
    ));

    public <T> List<T> sampleList(Supplier<T> supplier, String propertyName) {
        return sampleList(supplier, propertyName, 1, 4);
    }

    public <T> List<T> sampleList(Supplier<T> supplier) {
        return sampleList(supplier, 1, 4);
    }

    public <T> List<T> sampleList(Supplier<T> supplier, String propertyName, int min, int max) {
        return sampleList(supplier, min, max);
    }

    public <T> List<T> sampleList(Supplier<T> supplier, int min, int max) {
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
            result.put(sampleString(propertyName), supplier.get());
        }
        return result;
    }

    public String sampleString(String propertyName, String dataFormat) {
        if (dataFormatFactories.containsKey(dataFormat)) {
            return dataFormatFactories.get(dataFormat).get();
        }
        if (propertyNameFactories.containsKey(propertyName)) {
            return propertyNameFactories.get(propertyName).get();
        }
        return "str" + sampleUUID(propertyName);
    }

    public String sampleString(String propertyName) {
        return sampleString(propertyName, null);
    }

    public UUID sampleUUID(String propertyName) {
        byte[] bytes = new byte[16];
        random.nextBytes(bytes);
        return UUID.nameUUIDFromBytes(bytes);
    }

    public Long sampleLong(String propertyName) {
        return random.nextLong() % 10000L;
    }

    public Integer sampleInteger(String propertyName) {
        return random.nextInt(10000);
    }

    public Double sampleDouble(String propertyName) {
        return random.nextDouble() * 10000.0;
    }

    public Boolean sampleBoolean(String propertyName) {
        return random.nextBoolean();
    }

    public Object sampleObject(String propertyName) {
        Map<String, String> result = new HashMap<>();
        result.put(sampleString(propertyName + ".key"), sampleString(propertyName + ".value"));
        return result;
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

    public Instant sampleInstant(String propertyName) {
        return sampleZonedDateTime(propertyName).toInstant();
    }

    public URI sampleURI(String propertyName) {
        return asURI("https://" + randomDomainName());
    }

    public String randomDomainName() {
        return pickOne(List.of("a", "b", "c")) +
            ".example." +
            pickOne(List.of("com", "net", "io"));
    }

    public String randomEmail() {
        return (
            randomGivenName().toLowerCase() +
            "." +
            randomFamilyName().toLowerCase() +
            "@" +
            randomDomainName()
        );
    }

    public String randomPersonName() {
        return randomGivenName() + " " + randomFamilyName();
    }

    public String randomGivenName() {
        return pickOne(List.of("James", "Mary", "John", "Patricia", "Robert", "Jennifer", "Linda"));
    }

    public String randomFamilyName() {
        return pickOne(List.of("Smith", "Williams", "Johnson", "Jones", "Brown", "Davis", "Wilson"));
    }

    public String randomPhoneNumber() {
        return "636-555-" + (1000 + random.nextInt(9000));
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
