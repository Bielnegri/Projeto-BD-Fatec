package fatec.lanchoneteapp.adapters.repository.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SQLServerConnection implements IDBConnection{

    private Connection c;

    @Override
    public Connection getConnection() throws ClassNotFoundException, SQLException {
        String hostName = "";
        String dbName = "";
        String user = "";
        String password = "";

        Class.forName("net.sourceforge.jtds.jdbc.Driver");

        c = DriverManager.getConnection(String.format(
                "jdbc:jtds:sqlserver://%s:1433;databaseName=%s;user=%s;password=%s", hostName, dbName, user, password
        ));

        return c;
    }
}
