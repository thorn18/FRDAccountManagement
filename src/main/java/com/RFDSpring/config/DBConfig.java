package com.RFDSpring.config;

import com.mysql.cj.jdbc.Driver;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.datasource.SimpleDriverDataSource;
import java.sql.*;
import javax.sql.DataSource;
import java.sql.SQLException;

public class DBConfig {

    @Bean
    public DataSource dataSource() throws SQLException {
        SimpleDriverDataSource dataSource = new SimpleDriverDataSource();
        dataSource.setUrl("jdbc:mysql://localhost:3306/newschema");
        dataSource.setUsername("admin");
        dataSource.setPassword("password");
        dataSource.setDriver(new Driver());
        return dataSource;
    }
}
