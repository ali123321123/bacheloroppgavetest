package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmpController {
    @Autowired
    private Emprepo repo ;


public EmpController(){

}

    @PostMapping("/lagre")
    public void lagreEmp(Emp emp) {
        System.out.print(emp.getFirstname());
    repo.lagreEmp(emp);
    }

    @GetMapping("/hente")
    public List<Emp> hentBilletter() {
        return repo.hentEmployee();
    }

    @GetMapping("/slett")
    public void slettAlle() {
        repo.slettAlle();
    }

}
