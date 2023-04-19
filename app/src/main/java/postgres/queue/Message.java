package postgres.queue;

public class Message {

    private Long id;

    private Long timestamp;

    private String payload;

    public Message(Long id, Long timestamp, String payload) {
        this.id = id;
        this.timestamp = timestamp;
        this.payload = payload;
    }

    public Message(Long timestamp, String payload) {
        this.timestamp = timestamp;
        this.payload = payload;
    }

    public Long getTimestamp() {
        return timestamp;
    }

    public String getPayload() {
        return payload;
    }

    public Long getId() {
        return id;
    }
}
