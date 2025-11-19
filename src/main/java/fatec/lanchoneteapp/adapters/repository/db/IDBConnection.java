package fatec.lanchoneteapp.adapters.repository.db;

import java.sql.Connection;
import java.sql.SQLException;

public interface IDBConnection {
    Connection getConnection() throws ClassNotFoundException, SQLException;
}
