package tn.esprit.spring.services;
import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import tn.esprit.spring.services.IEmployeService;


@SpringBootTest
@RunWith(SpringRunner.class)

public class EmployeeServiceTest {
	
@Autowired

IEmployeService es;

@Test
public void listerEmployeTest() {

List<String> listEmp = es.getAllEmployeNamesJPQL();
assertEquals(listEmp.size(),1);

}
}
