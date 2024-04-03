package builder;

public class Client {
    public static void main(String[] args) throws Exception {
        Employee employee = Employee.builder()
                                .setName("Ranjith")
                                .setAge(25)
                                .setDesignation("SDE")
                                .setEmployeeId(456081)
                                .setYearsOfExperience(2)
                                .build();
        System.out.println(employee);
    }
}
