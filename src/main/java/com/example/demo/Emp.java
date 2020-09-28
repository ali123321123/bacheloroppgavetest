package com.example.demo;

 class Emp {
    private String firstname;
    private String lastname ;
    private String epost;
    private String password;

     public Emp(String firstname, String lastname, String epost, String password) {
         this.firstname = firstname;
         this.lastname = lastname;
         this.epost = epost;
         this.password = password;
     }
     public Emp(){

     }

     public String getFirstname() {
         return firstname;
     }

     public void setFirstname(String firstname) {
         this.firstname = firstname;
     }

     public String getLastname() {
         return lastname;
     }

     public void setLastname(String lastname) {
         this.lastname = lastname;
     }

     public String getEpost() {
         return epost;
     }

     public void setEpost(String epost) {
         this.epost = epost;
     }

     public String getPassword() {
         return password;
     }

     public void setPassword(String password) {
         this.password = password;
     }
 }
