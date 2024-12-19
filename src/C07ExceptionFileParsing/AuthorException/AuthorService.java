package C07ExceptionFileParsing.AuthorException;

import java.util.NoSuchElementException;

//핵심 로직을 구현하는 계층
//매개변수 및 리턴타입은 직접.
public class AuthorService {

    private AuthorRepository authorRepository;

    public AuthorService() {
        authorRepository = new AuthorRepository();
    }
    public void register(String name, String email, String password) throws IllegalArgumentException {
        authorRepository.register(new Author(name, email, password));
    }

    public void login(String email, String password) {
        if (this.authorRepository.findByEmail(email) == null){
            throw new NullPointerException("존재하지 않는 이메일입니다.");
        }
        if (this.authorRepository.findByEmail(email).isPresent()) {
            if (!this.authorRepository.findByEmail(email).get().getPassword().equals(password)) {
                throw new IllegalArgumentException("비밀번호가 틀립니다.");
            }
        }
    }

    public void findAll() {
            this.authorRepository.findAll();
    }
}
