package aop.ex01;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component("employeeManager")
public class EmployeeManagerImpl implements EmployeeManager{ // 핵심 기능만 있는 클래스
    public EmployeeVO getEmployeeById(Integer employeeId) {
        System.out.println("Method getEmployeeById() called");
        return new EmployeeVO();
    }

    public List<EmployeeVO> getAllEmployees() {
        System.out.println("Method getAllEmployees() called");
        return new ArrayList<EmployeeVO>();
    }

    public void createEmployee(EmployeeVO employee){
        System.out.println("Method createEmployee() called");
    }

    public void deleteEmployee(Integer employeeId) {
        System.out.println("Method deleteEmployee() called");
    }

    public void updateEmployee(EmployeeVO employee) {
        System.out.println("Method updateEmployee() called");
    }
}
