package Task1;

public class User {
    private double id;
    private String username;
    private Address address;
    private String firstname;
    private String lastname;

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getUsername() {
        return username;
    }

    public void setId(){
        id = Math.random()*(1000-100)+100;
        id = (int) id;
    }

    public double getId() {
        return id;
    }

    public void validate() throws UncheckedException {
        validateU();
        validateF();
        validateL();
        System.out.println("Validated!");
    }
        public void changeU(String username) throws UncheckedException {
                this.username = username;
                validateU();
        }
        public void changeF(String firstname) throws UncheckedException {
                this.firstname = firstname;
                validateF();
        }
        public void changeL(String lastname) throws UncheckedException {
                this.lastname = lastname;
                validateL();
        }

    @Override
    public String toString() {
        return "{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", address=" + address.getAddress() +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                '}';
    }

    public void validateU() throws UncheckedException {
           char ex [] = {'#','!','$','%','^','&','*','(',')','=','+'};
           char[] vu =  this.getUsername().toCharArray(); // user
           if (vu.length < 1) throw new UncheckedException("Username cant be empty!");
            for (int i = 0 ; i < ex.length ; i++)
               for (char e : vu)
                   if (e == ex[i])  throw new UncheckedException("Username can`t contain " + e+"!");
           System.out.println("your new username is " + this.getUsername()+ "!");

       }
       public void validateF() throws UncheckedException {
           if (firstname.matches(".*\\d+.*") || firstname.matches(".*\\s+.*")
                   || !firstname.matches(".+")) throw new UncheckedException("Firstname can only contain english letters, and can`t be empty!");
           System.out.println("your new firstname is " + this.getFirstname() +"!");
       }
       public void validateL() throws UncheckedException {
           if (lastname.matches(".*\\d+.*") || lastname.matches(".*\\s+.*")
                   || !lastname.matches(".+")) throw new UncheckedException("Lastname can only contain english letters, and can`t be empty!");
           System.out.println("your new lastname is " + this.getLastname() +"!");

       }

       User(String username,Address address,String firstname,String lastname) throws UncheckedException {
        this.address = address;
        this.firstname = firstname;
        this.lastname = lastname;
        this.username = username;
        validate();
        setId();
    }
}
