package com.talbn.HRService.data;

import java.util.List;
import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.talbn.HRService.model.Employee;



@Repository
public interface  EmployeeDaoRepository extends MongoRepository<Employee, String> {
	
    public Employee findByEmployeeId(String employeeId);

    @Query("{employeeId : ?0}")
    public Employee findByEmployeeIdQuery(String employeeId);

}
