package com.kovanlabs.ecommercespringmvc.service;

import com.kovanlabs.ecommercespringmvc.config.JDBCConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.sql.*;

@Service
public class ProductService {

    private static final Logger logger = LoggerFactory.getLogger(ProductService.class);

    private final JDBCConfig jdbcConfig;

    public ProductService(JDBCConfig jdbcConfig) {
        this.jdbcConfig = jdbcConfig;
    }

    public String getAll() throws Exception {
        logger.info("Fetching all products");

        StringBuilder res = new StringBuilder();

        try (Connection connection = jdbcConfig.getConnection();
             Statement statement = connection.createStatement();
             ResultSet rs = statement.executeQuery("SELECT * FROM PRODUCT")) {

            while (rs.next()) {
                res.append(rs.getLong("id"))
                        .append(" ")
                        .append(rs.getString("name"))
                        .append("\n");
            }
        }

        logger.info("Products fetched successfully");
        return res.toString();
    }

    public String addProduct() throws Exception {
        logger.info("Adding product...");

        try (Connection connection = jdbcConfig.getConnection();
             PreparedStatement ps =
                     connection.prepareStatement("INSERT INTO PRODUCT VALUES (?,?,?,?)")) {

            ps.setLong(1, 2);
            ps.setString(2, "Laptop");
            ps.setString(3, "Electronics");
            ps.setDouble(4, 50000);

            ps.executeUpdate();
        }

        logger.info("Product inserted successfully");
        return "Inserted";
    }

    public String updateProduct(Long id, String name) throws Exception {
        logger.info("Updating product ID: {}", id);

        try (Connection connection = jdbcConfig.getConnection();
             PreparedStatement ps =
                     connection.prepareStatement("UPDATE PRODUCT SET NAME=? WHERE ID=?")) {

            ps.setString(1, name);
            ps.setLong(2, id);

            ps.executeUpdate();
        }

        logger.info("Product updated successfully");
        return getAll();
    }
}