package DB;

/**
 * Created by User on 30.05.2016.
 */
import java.sql.*;
import java.util.*;

/**
 * CREATE TABLE product (id integer PRIMARY KEY, name varchar(20), category varchar(20), price integer);
 * <p>
 * INSERT INTO product VALUES
 * (1, 'Elephant', 'African animal', 1000000),
 * (2, 'Ostrich', 'Australian bird', 20000),
 * (3, 'Lion', 'African animal', 500000),
 * (4, 'Hipo', 'African animal', 850000);
 */
public class DbMain {
    private Connection connection;

    public DbMain(Connection connection) {
        this.connection = connection;
    }

    public List<Product> findAllProducts() throws Exception {
        Statement statement = connection.createStatement();
        String sql = "SELECT id, name, category, price FROM product";
        ResultSet resultSet = statement.executeQuery(sql);
        List<Product> products = new ArrayList<>();
        while (resultSet.next()) {
            int id = resultSet.getInt("id");
            String name = resultSet.getString("name");
            String category = resultSet.getString("category");
            int price = resultSet.getInt("price");
            Product product = new Product(id, name, category, price);
            products.add(product);
        }
        resultSet.close();
        statement.close();
        return products;
    }

    public Product findById(int id) throws Exception {
        Statement statement = connection.createStatement();
        String sql =
                "SELECT name, category, price " +
                        " FROM product" +
                        " WHERE id=" + id;
        ResultSet resultSet = statement.executeQuery(sql);
        Product result = null;
        while (resultSet.next()) {
            String name = resultSet.getString("name");
            String category = resultSet.getString("category");
            int price = resultSet.getInt("price");
            result = new Product(id, name, category, price);
        }
        resultSet.close();
        statement.close();
        return result;
    }
}