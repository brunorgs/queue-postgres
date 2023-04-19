package postgres.queue;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Sender {

    private final Connection connection;

    public Sender(Connection connection) {
        this.connection = connection;
    }

    public void sendMessage(Message message) throws SQLException {

        PreparedStatement statement = connection.prepareStatement("INSERT INTO queue (timestamp, payload) VALUES (?, ?)");
        statement.setLong(1, message.getTimestamp());
        statement.setString(2, message.getPayload());

        statement.executeUpdate();
        statement.close();
    }
}
