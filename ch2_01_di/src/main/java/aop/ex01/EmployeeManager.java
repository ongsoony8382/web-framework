package aop.ex01;

import java.util.List;

public interface EmployeeManager {
    public EmployeeVO getEmployeeById(Integer employeeId);

    public List<EmployeeVO> getAllEmployees();

    public void createEmployee(EmployeeVO employee);

    public void deleteEmployee(Integer employeeId);

    public void updateEmployee(EmployeeVO employee);
}
