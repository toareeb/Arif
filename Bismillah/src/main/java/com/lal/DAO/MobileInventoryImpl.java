package com.lal.DAO;

import com.lal.Model.Item;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
public class MobileInventoryImpl implements MobileInventoryDAO {
    private NamedParameterJdbcTemplate jdbcTemplate;

    public MobileInventoryImpl(NamedParameterJdbcTemplate jdbcTemplate){
        this.jdbcTemplate = jdbcTemplate;
    }
    public List<Item> getAllInventory(){
        return jdbcTemplate.query("SELECT ID, NAME, PRICE FROM SITE_INVENTORY", new RowMapper<Item>() {
            @Override
            public Item mapRow(ResultSet resultSet, int i) throws SQLException {
                return new Item(
                        resultSet.getLong("EmpId"),
                        resultSet.getString("EmpmName"),
                        resultSet.getDouble("Price"));
            }
        });
    }

}
