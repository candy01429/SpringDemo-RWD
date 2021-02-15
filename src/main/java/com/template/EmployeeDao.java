package com.template;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class EmployeeDao {

    JdbcTemplate jdbcTemplate; // 宣告欄位 JdbcTemplate

    // 由設定檔注入Datasource
    public EmployeeDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public Employee getEmployeeById(int id) {
        String sql = "select id, firstname, lastname, salary from employee where id = ?";
        return jdbcTemplate.queryForObject(sql, new EmployeeRowMapper(), id);
    }

    // 將資料庫查詢的資料轉換為Java物件
    private static class EmployeeRowMapper implements RowMapper<Employee> {

        // 將傳入的ResultSet轉換成Employee物件
        public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
            Employee employee = new Employee();
            employee.setId(rs.getInt("id"));
            employee.setFirstName(rs.getString("firstname"));
            employee.setLastName(rs.getString("lastname"));
            employee.setSalary(rs.getLong("salary"));
            return employee;
        }
    }
}
