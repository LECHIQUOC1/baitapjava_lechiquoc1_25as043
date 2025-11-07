package ex2_3;

public class author {
    private String name;
    private String email;

    public author (String name, String email){
        this.name=name;
        this.email=email;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "author{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
