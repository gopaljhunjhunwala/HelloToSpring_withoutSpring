import github.gopal.beans.Employee;
import github.gopal.repository.EmployeeRepository;
import github.gopal.repository.ListEmployeeRepositoryImpl;
import github.gopal.service.EmployeeService;
import github.gopal.service.EmployeeServiceImpl;

import java.util.List;

/**
 * Author: Gopal
 */
public class Main {

    public static void main(String[] args) {
        EmployeeRepository repository = new ListEmployeeRepositoryImpl();
        EmployeeService service = new EmployeeServiceImpl(repository);
        List<Employee> allEmployees = service.getAllEmployees();

        System.out.println(allEmployees.get(0).getFirstName());
        System.out.println(allEmployees.get(0).getLastName());
    }
}
