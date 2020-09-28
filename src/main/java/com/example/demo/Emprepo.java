package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class Emprepo {

    public Emprepo(){

    }
    @Autowired
    private JdbcTemplate db;

    public void lagreEmp(Emp emp) {
        String sql = "INSERT INTO Employee ( Fornavn, Etternavn, Password, Epost) VALUES(?,?,?,?)";
        db.update(sql, emp.getFirstname(), emp.getLastname(), emp.getPassword(), emp.getEpost());
    }

    public List<Emp> hentEmployee() {
        String sql = "SELECT * FROM Employee";
        return db.query(sql, new BeanPropertyRowMapper(Emp.class));
    }

    public void slettAlle() {
        String sql = "DELETE FROM Employee";
        db.update(sql);
    }
}
