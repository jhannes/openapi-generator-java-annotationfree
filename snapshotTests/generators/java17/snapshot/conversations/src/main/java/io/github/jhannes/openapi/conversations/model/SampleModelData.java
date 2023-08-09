/*
 * Conversations
 * Conversations for real time and offline peer-to-peer web chat
 *
 * The version of the OpenAPI document: 1.0.0
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package io.github.jhannes.openapi.conversations.model;


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
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.UUID;

/**
 * Model tests for Conversations
 */
public class SampleModelData {

    public SampleModelData(Random random) {
        this.random = random;
    }

    public SampleModelData(long seed) {
        this(new Random(seed));
    }

    public AddMessageToConversationDeltaDto sampleAddMessageToConversationDeltaDto(String propertyName) {
        return sampleAddMessageToConversationDeltaDto();
    }

    public AddMessageToConversationDeltaDto sampleAddMessageToConversationDeltaDto() {
        return new AddMessageToConversationDeltaDto()
            .delta("AddMessageToConversationDelta")
            .conversationId(sampleUUID("conversationId"))
            .messageId(sampleUUID("messageId"))
            .message(sampleConversationMessageDto("message"));
    }

    public List<AddMessageToConversationDeltaDto> sampleListOfAddMessageToConversationDeltaDto(String propertyName) {
        return sampleListOfAddMessageToConversationDeltaDto();
    }

    public List<AddMessageToConversationDeltaDto> sampleListOfAddMessageToConversationDeltaDto() {
        return sampleList(() -> sampleAddMessageToConversationDeltaDto());
    }

    public ChangeTrackedDto sampleChangeTrackedDto(String propertyName) {
        return sampleChangeTrackedDto();
    }

    public ChangeTrackedDto sampleChangeTrackedDto() {
        return new ChangeTrackedDto()
            .createdAt(sampleOffsetDateTime("createdAt"))
            .updatedAt(sampleOffsetDateTime("updatedAt"));
    }

    public List<ChangeTrackedDto> sampleListOfChangeTrackedDto(String propertyName) {
        return sampleListOfChangeTrackedDto();
    }

    public List<ChangeTrackedDto> sampleListOfChangeTrackedDto() {
        return sampleList(() -> sampleChangeTrackedDto());
    }

    public CommandToServerDto sampleCommandToServerDto(String propertyName) {
        return sampleCommandToServerDto();
    }

    public CommandToServerDto sampleCommandToServerDto() {
        return new CommandToServerDto()
            .id(sampleUUID("id"))
            .clientTime(sampleOffsetDateTime("clientTime"))
            .delta(sampleDeltaDto("delta"));
    }

    public List<CommandToServerDto> sampleListOfCommandToServerDto(String propertyName) {
        return sampleListOfCommandToServerDto();
    }

    public List<CommandToServerDto> sampleListOfCommandToServerDto() {
        return sampleList(() -> sampleCommandToServerDto());
    }

    public ConversationInfoDto sampleConversationInfoDto(String propertyName) {
        return sampleConversationInfoDto();
    }

    public ConversationInfoDto sampleConversationInfoDto() {
        return new ConversationInfoDto()
            .title(sampleString("title"))
            .summary(sampleString("summary"));
    }

    public List<ConversationInfoDto> sampleListOfConversationInfoDto(String propertyName) {
        return sampleListOfConversationInfoDto();
    }

    public List<ConversationInfoDto> sampleListOfConversationInfoDto() {
        return sampleList(() -> sampleConversationInfoDto());
    }

    public ConversationMessageDto sampleConversationMessageDto(String propertyName) {
        return sampleConversationMessageDto();
    }

    public ConversationMessageDto sampleConversationMessageDto() {
        return new ConversationMessageDto()
            .text(sampleString("text"));
    }

    public List<ConversationMessageDto> sampleListOfConversationMessageDto(String propertyName) {
        return sampleListOfConversationMessageDto();
    }

    public List<ConversationMessageDto> sampleListOfConversationMessageDto() {
        return sampleList(() -> sampleConversationMessageDto());
    }

    public ConversationMessageSnapshotDto sampleConversationMessageSnapshotDto(String propertyName) {
        return sampleConversationMessageSnapshotDto();
    }

    public ConversationMessageSnapshotDto sampleConversationMessageSnapshotDto() {
        return new ConversationMessageSnapshotDto()
            .createdAt(sampleOffsetDateTime("createdAt"))
            .updatedAt(sampleOffsetDateTime("updatedAt"))
            .text(sampleString("text"));
    }

    public List<ConversationMessageSnapshotDto> sampleListOfConversationMessageSnapshotDto(String propertyName) {
        return sampleListOfConversationMessageSnapshotDto();
    }

    public List<ConversationMessageSnapshotDto> sampleListOfConversationMessageSnapshotDto() {
        return sampleList(() -> sampleConversationMessageSnapshotDto());
    }

    public ConversationSnapshotDto sampleConversationSnapshotDto(String propertyName) {
        return sampleConversationSnapshotDto();
    }

    public ConversationSnapshotDto sampleConversationSnapshotDto() {
        return new ConversationSnapshotDto()
            .createdAt(sampleOffsetDateTime("createdAt"))
            .updatedAt(sampleOffsetDateTime("updatedAt"))
            .id(sampleUUID("id"))
            .info(sampleConversationInfoDto("info"))
            .messages(sampleMap(() -> sampleConversationMessageSnapshotDto("messages"), "messages"));
    }

    public List<ConversationSnapshotDto> sampleListOfConversationSnapshotDto(String propertyName) {
        return sampleListOfConversationSnapshotDto();
    }

    public List<ConversationSnapshotDto> sampleListOfConversationSnapshotDto() {
        return sampleList(() -> sampleConversationSnapshotDto());
    }

    public CreateConversationDeltaDto sampleCreateConversationDeltaDto(String propertyName) {
        return sampleCreateConversationDeltaDto();
    }

    public CreateConversationDeltaDto sampleCreateConversationDeltaDto() {
        return new CreateConversationDeltaDto()
            .delta("CreateConversationDelta")
            .conversationId(sampleUUID("conversationId"))
            .info(sampleConversationInfoDto("info"));
    }

    public List<CreateConversationDeltaDto> sampleListOfCreateConversationDeltaDto(String propertyName) {
        return sampleListOfCreateConversationDeltaDto();
    }

    public List<CreateConversationDeltaDto> sampleListOfCreateConversationDeltaDto() {
        return sampleList(() -> sampleCreateConversationDeltaDto());
    }

    public DeltaDto sampleDeltaDto(String propertyName) {
        return sampleDeltaDto();
    }

    public DeltaDto sampleDeltaDto() {
        List<Supplier<DeltaDto>> factories = List.of(
            () -> sampleAddMessageToConversationDeltaDto().delta("AddMessageToConversationDelta"),
            () -> sampleUpdateConversationDeltaDto().delta("UpdateConversationDelta"),
            () -> sampleCreateConversationDeltaDto().delta("CreateConversationDelta")
        );
        return pickOne(factories).get();
    }

    public List<DeltaDto> sampleListOfDeltaDto(String propertyName) {
        return sampleListOfDeltaDto();
    }

    public List<DeltaDto> sampleListOfDeltaDto() {
        return sampleList(() -> sampleDeltaDto());
    }

    public EventFromServerDto sampleEventFromServerDto(String propertyName) {
        return sampleEventFromServerDto();
    }

    public EventFromServerDto sampleEventFromServerDto() {
        return new EventFromServerDto()
            .id(sampleUUID("id"))
            .clientTime(sampleOffsetDateTime("clientTime"))
            .delta(sampleDeltaDto("delta"))
            .serverTime(sampleOffsetDateTime("serverTime"))
            .username(sampleString("username"));
    }

    public List<EventFromServerDto> sampleListOfEventFromServerDto(String propertyName) {
        return sampleListOfEventFromServerDto();
    }

    public List<EventFromServerDto> sampleListOfEventFromServerDto() {
        return sampleList(() -> sampleEventFromServerDto());
    }

    public MessageFromServerDto sampleMessageFromServerDto(String propertyName) {
        return sampleMessageFromServerDto();
    }

    public MessageFromServerDto sampleMessageFromServerDto() {
        List<Supplier<MessageFromServerDto>> factories = List.of(
        );
        return pickOne(factories).get();
    }

    public List<MessageFromServerDto> sampleListOfMessageFromServerDto(String propertyName) {
        return sampleListOfMessageFromServerDto();
    }

    public List<MessageFromServerDto> sampleListOfMessageFromServerDto() {
        return sampleList(() -> sampleMessageFromServerDto());
    }

    public MessageToServerDto sampleMessageToServerDto(String propertyName) {
        return sampleMessageToServerDto();
    }

    public MessageToServerDto sampleMessageToServerDto() {
        List<Supplier<MessageToServerDto>> factories = List.of(
        );
        return pickOne(factories).get();
    }

    public List<MessageToServerDto> sampleListOfMessageToServerDto(String propertyName) {
        return sampleListOfMessageToServerDto();
    }

    public List<MessageToServerDto> sampleListOfMessageToServerDto() {
        return sampleList(() -> sampleMessageToServerDto());
    }

    public RequestToServerDto sampleRequestToServerDto(String propertyName) {
        return sampleRequestToServerDto();
    }

    public RequestToServerDto sampleRequestToServerDto() {
        List<Supplier<RequestToServerDto>> factories = List.of(
            () -> sampleSubscribeRequestDto().request("SubscribeRequest")
        );
        return pickOne(factories).get();
    }

    public List<RequestToServerDto> sampleListOfRequestToServerDto(String propertyName) {
        return sampleListOfRequestToServerDto();
    }

    public List<RequestToServerDto> sampleListOfRequestToServerDto() {
        return sampleList(() -> sampleRequestToServerDto());
    }

    public SnapshotSetDto sampleSnapshotSetDto(String propertyName) {
        return sampleSnapshotSetDto();
    }

    public SnapshotSetDto sampleSnapshotSetDto() {
        return new SnapshotSetDto()
            .conversations(sampleListOfConversationSnapshotDto("conversations"));
    }

    public List<SnapshotSetDto> sampleListOfSnapshotSetDto(String propertyName) {
        return sampleListOfSnapshotSetDto();
    }

    public List<SnapshotSetDto> sampleListOfSnapshotSetDto() {
        return sampleList(() -> sampleSnapshotSetDto());
    }

    public SubscribeRequestDto sampleSubscribeRequestDto(String propertyName) {
        return sampleSubscribeRequestDto();
    }

    public SubscribeRequestDto sampleSubscribeRequestDto() {
        return new SubscribeRequestDto()
            .request("SubscribeRequest")
            .clientId(sampleUUID("clientId"));
    }

    public List<SubscribeRequestDto> sampleListOfSubscribeRequestDto(String propertyName) {
        return sampleListOfSubscribeRequestDto();
    }

    public List<SubscribeRequestDto> sampleListOfSubscribeRequestDto() {
        return sampleList(() -> sampleSubscribeRequestDto());
    }

    public UpdateConversationDeltaDto sampleUpdateConversationDeltaDto(String propertyName) {
        return sampleUpdateConversationDeltaDto();
    }

    public UpdateConversationDeltaDto sampleUpdateConversationDeltaDto() {
        return new UpdateConversationDeltaDto()
            .delta("UpdateConversationDelta")
            .conversationId(sampleUUID("conversationId"))
            .info(sampleConversationInfoDto("info"));
    }

    public List<UpdateConversationDeltaDto> sampleListOfUpdateConversationDeltaDto(String propertyName) {
        return sampleListOfUpdateConversationDeltaDto();
    }

    public List<UpdateConversationDeltaDto> sampleListOfUpdateConversationDeltaDto() {
        return sampleList(() -> sampleUpdateConversationDeltaDto());
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

    public <T> Set<T> sampleSet(Supplier<T> supplier, String propertyName) {
        return sampleSet(supplier, propertyName, 1, 4);
    }

    public <T> Set<T> sampleSet(Supplier<T> supplier) {
        return sampleSet(supplier, 1, 4);
    }

    public <T> Set<T> sampleSet(Supplier<T> supplier, String propertyName, int min, int max) {
        return sampleSet(supplier, min, max);
    }

    public <T> Set<T> sampleSet(Supplier<T> supplier, int min, int max) {
        Set<T> result = new LinkedHashSet<>();
        int count = min + random.nextInt(max - min);
        for (int i=0; i<count; i++) {
            result.add(supplier.get());
        }
        return result;
    }

    public <T> List<T> pickSome(T[] alternatives) {
        return pickSome(alternatives, 1, 4);
    }

    public <T> List<T> pickSome(T[] alternatives, int min, int max) {
        int count = min + random.nextInt(max - min);
        List<T> result = new ArrayList<>(List.of(alternatives));
        Collections.shuffle(result);
        return result.subList(0, count);
    }

    public <T> Set<T> sampleSubset(T[] alternatives) {
        return new LinkedHashSet<>(pickSome(alternatives, 1, 4));
    }

    public <T> Set<T> sampleSubset(T[] alternatives, int min, int max) {
        return new LinkedHashSet<>(pickSome(alternatives, min, max));
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
