package mahima_goyal;

      public class employee {
    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }
    public void setLastName(String LastName) {
        this.LastName = LastName;
    }
    public void setAge(int Age) {
        this.Age = Age;
    }
    public void setDesignation(String Designation) {
        this.Designation = Designation;
    }
    public employee(String FirstName, String LastName, int Age,String Designation) {
        super();
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.Age = Age;
        this.Designation = Designation;
    }
    String FirstName;
    String LastName;
    int Age;
    String Designation;
}


