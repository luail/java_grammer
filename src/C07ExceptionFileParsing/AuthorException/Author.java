package C07ExceptionFileParsing.AuthorException;


//엔티티계층
public class Author {
    private static Long static_id = 0L;
    private Long id;
    private String name;
    private String email;
    private String password;

    public Author(String name, String email, String password) {
        static_id++;
        this.id = static_id;
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public Long getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public String toString() {
        return "Author{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
