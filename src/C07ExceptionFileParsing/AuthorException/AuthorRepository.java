package C07ExceptionFileParsing.AuthorException;

import javax.swing.text.html.Option;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

//저장소역할을 하는 계층
public class AuthorRepository {
    private static List<Author> authorList = new ArrayList<>();

    public void register(Author author) throws IllegalArgumentException {
        if (author.getPassword().length() < 8) {
            throw new IllegalArgumentException("비밀번호가 짧습니다.");
        }

        for (int i = 0; i < authorList.size(); i++) {
            if (authorList.get(i).getEmail().equals(author.getEmail())) {
                throw new IllegalArgumentException("중복된 이메일입니다.");
            }
        }
        authorList.add(author);
    }

    public Optional<Author> findByEmail(String email) {
        for (int i = 0; i < authorList.size(); i++) {
            if (authorList.get(i).getEmail().equals(email)) {
                return Optional.of(authorList.get(i));
            }
        }
        return null;
    }
//
    public List<Author> findAll() {
        return authorList;
    }
}
