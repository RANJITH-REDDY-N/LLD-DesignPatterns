package builder;

public class Employee {

    private String name;
    private int employeeId;
    private int age;
    private int yearsOfExperience;
    private String designation;

    public Employee(Builder builder) {
        this.name = builder.name;
        this.employeeId = builder.employeeId;
        this.age = builder.age;
        this.yearsOfExperience = builder.yearsOfExperience;
        this.designation = builder.designation;
    }

    public static Builder builder(){
        return new Builder();
    }

    @Override
    public String toString() {
        return "Employee{" +
                "Name = '" + name + '\'' +
                ", EmployeeID = " + employeeId +
                ", Age = " + age +
                ", Years Of Experience = " + yearsOfExperience +
                ", Designation = '" + designation + '\'' +
                '}';
    }

    protected static class Builder{
        private String name;
        private int employeeId;
        private int age;
        private int yearsOfExperience;
        private String designation;

        public Builder setName(String name){
            this.name = name;
            return this;
        }
        public Builder setEmployeeId(int employeeId){
            this.employeeId = employeeId;
            return this;
        }
        public Builder setAge(int age){
            this.age = age;
            return this;
        }
        public Builder setYearsOfExperience(int yearsOfExperience){
            this.yearsOfExperience = yearsOfExperience;
            return this;
        }
        public Builder setDesignation(String designation){
            this.designation = designation;
            return this;
        }

        private void validate(Builder builder) throws Exception {
            if(age < 18) throw new Exception("Invalid Age");
            if(yearsOfExperience < 2) throw new Exception("Experience should be more than 2 years");
            if(designation == null || designation.isBlank()) throw new Exception("Invalid Designation");
        }

        public Employee build() throws Exception {
            validate(this);
            return new Employee(this);
        }
    }
}
