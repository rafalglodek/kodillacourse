package com.kodilla.hibernate.manytomany;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

@NamedNativeQuery(
        name = "Company.retrieveCompaniesWithNameEquals",
        query = "SELECT * FROM companies WHERE SUBSTRING(COMPANY_NAME, 1,3) = :NAME",
/*        query = "SELECT COMPANY_NAME , LEFT(COMPANY_NAME, 3) AS EXTRACTEDSTRING" +
                " FROM COMPANIES" +
                " WHERE LEFT(NAME, 3) = 'Dat'",

 */


        resultClass = Company.class
)

@Entity
@Table(name = "COMPANIES")
public class Company {

    private int id;
    private String name;
    private List<Employee> employees = new ArrayList<>();
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "JOIN_TABLE_NAME",
            joinColumns = {@JoinColumn(name = "EMPLOYEE_ID", referencedColumnName = "COMPANY_ID")},
                    inverseJoinColumns = {@JoinColumn(name = "COMPANY_ID", referencedColumnName = "EMPLOYEE_ID")}
            )
    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    public Company() {
    }

    public Company(String name) {
        this.name = name;
    }

    @Id
    @GeneratedValue
    @NotNull
    @Column(name = "COMPANY_ID", unique = true)
    public int getId() {
        return id;
    }

    @NotNull
    @Column(name = "COMPANY_NAME")
    public String getName() {
        return name;
    }

    private void setId(int id) {
        this.id = id;
    }

    private void setName(String name) {
        this.name = name;
    }
}