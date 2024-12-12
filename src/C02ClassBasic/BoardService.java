package C02ClassBasic;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BoardService {
    public static void main(String[] args) {
//        1.회원가입 : 이름, 이메일, 비밀번호, id값(auto_increment)
//        2.회원 전체 목록 조회 : id, email
//        3.회원 상세 조회(id로 조회) : id, email, name, password, 작성글수
//        4.게시글 작성 : 제목, 내용, 작성자Email -> author_id를 찾아서 author_id로 변경 입력, id값(auto_increment)
//        5.게시물 목록 조회 : id(post), title
//        6.게시물 상세 조회 : id(post), title, contents, 작성자email
//        7.서비스 종료



        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("BoardService입니다. 원하시는 서비스의 번호를 눌러주세요.");
            System.out.println("1.회원가입 2.전체 회원목록 조회 3.회원상세조회 4.게시글 작성 5.게시글 목록조회 6.게시글 상세조회 7.서비스종료");
            int answer = Integer.parseInt(sc.nextLine());
            if (answer == 1) {
                System.out.println("회원가입 서비스입니다.");
                System.out.println("이름을 입력해주세요.");
                String name = sc.nextLine();
                System.out.println("이메일을 입력해주세요.");
                String email = sc.nextLine();
                if (Author.findEmail(email)) {
                    System.out.println("중복된 이메일입니다.");
                } else {
                    System.out.println("사용가능한 이메일입니다.");
                    System.out.println("패스워드를 입력해주세요.");
                    String password = sc.nextLine();
                    new Author(name, email, password);
                    System.out.println("새로운 회원이 되신걸 환영합니다!");
                }

            } else if (answer == 2) {
                System.out.println("전체회원 목록조회 서비스입니다!");
                Author.findAllAuthor();
            } else if (answer == 3) {
                System.out.println("회원 상세조회 서비스입니다!");
                System.out.println("조회하고 싶은 회원의 id를 입력해주세요.");
                int id = Integer.parseInt(sc.nextLine());
                if (!Author.idCheck(id)) {
                    System.out.println("존재하지 않는 id입니다.");
                } else {
                    Author.authorDetail(id);
                    System.out.println("요청하신 회원의 상세 정보입니다!");
                }
            } else if (answer == 4) {
                System.out.println("게시글 작성 서비스입니다!");
                System.out.println("게시글의 제목을 입력해주세요.");
                String title = sc.nextLine();
                System.out.println("게시글의 내용을 입력해주세요.");
                String contents = sc.nextLine();
                System.out.println("작성자의 이메일을 입력해주세요.");
                String email = sc.nextLine();
                if (!Author.findEmail(email)) {
                    System.out.println("존재하지 않는 이메일입니다.");
                } else {
                    new Post(title, contents, email);
                    System.out.println("글이 게시되었습니다!");
                }
            } else if (answer == 5) {
                System.out.println("게시글 목록조회 서비스입니다!");
                Post.allPost();
            } else if ( answer == 6) {
                System.out.println("게시글 상세조회 서비스입니다!");
                System.out.println("상세조회 하고싶은 게시글의 id를 입력해주세요.");
                int id = Integer.parseInt(sc.nextLine());
                if (!Post.checkPostId(id)) {
                    System.out.println("존재하지 않는 id입니다.");
                } else {
                    Post.postDetail(id);
                }
            } else if (answer == 7) {
                System.out.println("서비스를 종료합니다.");
                break;
            } else {
                System.out.println("잘못된 입력입니다.");
            }
        }
    }
}





class Author {
    public static List<Author> myAuthor = new ArrayList<>();
    static long static_id = 0;
    String name;
    String email;
    String password;
    long author_id;

    public Author(String name, String email, String password) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.author_id = static_id;
        static_id++;
        myAuthor.add(this);
    }

    public static boolean idCheck(int id) {
        for (int i = 0; i < Author.myAuthor.size(); i++) {
            if (id == Author.myAuthor.get(i).author_id) {
                return true;
            }
        }
        return false;
    }

    public static int postCount(long id) {
        int count = 0;
        for (int i = 0; i < Post.myPost.size(); i++) {
            if (id == Post.myPost.get(i).author_id) {
                count++;
            }
        }
        return count;
    }

    public static void authorDetail(int id) {
        System.out.println("회원의 id는 " + Author.myAuthor.get(id).author_id + "입니다.");
        System.out.println("회원의 email은 " + Author.myAuthor.get(id).email + "입니다.");
        System.out.println("회원의 이름은 " + Author.myAuthor.get(id).name + "입니다.");
        System.out.println("회원의 비밀번호는 " + Author.myAuthor.get(id).password + "입니다.");
        System.out.println("회원의 작성글수는 " + Author.postCount(id) + "입니다.");
    }

    public static boolean findEmail(String email) {
        for (int i = 0; i < myAuthor.size(); i++) {
            if (myAuthor.get(i).email.equals(email)) {
                return true;
            }
        }
        return false;
    }

    public static void findAllAuthor() {
        for (int i = 0; i < myAuthor.size(); i++) {
            System.out.println("id : " + myAuthor.get(i).getAuthor_id());
            System.out.println("name : " + myAuthor.get(i).getEmail());
            System.out.println("------------------------");
        }
    }

    public static long findId(String email) {
        for (int i = 0; i < myAuthor.size(); i++) {
            if (myAuthor.get(i).email.equals(email)) {
                return myAuthor.get(i).getAuthor_id();
            }
        }
        return -1;
    }

    public static long getStatic_id() {
        return static_id;
    }

    public long getAuthor_id() {
        return author_id;
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
}



class Post{
    String title;
    String contents;
    long author_id;
    long post_id = 0;
    static long static_id = 0;
    static List<Post> myPost = new ArrayList<>();

    public String getTitle() {
        return title;
    }

    public String getContents() {
        return contents;
    }

    public long getAuthor_id() {
        return author_id;
    }

    public long getPost_id() {
        return post_id;
    }

    public static long getStatic_id() {
        return static_id;
    }

    public Post(String title, String contents, String email) {
        this.title = title;
        this.contents = contents;
        this.post_id = static_id;
        static_id++;
        if (Author.findId(email) >= 0) {
            this.author_id = Author.findId(email);
        }
        myPost.add(this);
    }

    public static void allPost() {
        for (int i = 0; i < myPost.size(); i++) {
            System.out.println("id : " + Post.myPost.get(i).post_id);
            System.out.println("title : " + Post.myPost.get(i).title);
            System.out.println("------------------------");
        }
    }

    public static boolean checkPostId(int id) {
        for (int i = 0; i < myPost.size(); i++) {
            if (id == myPost.get(i).post_id) {
                return true;
            }
        }
        return false;
    }

    public static String find_Email_To_Id (int id) {
        for (int i = 0; i < Author.myAuthor.size(); i++) {
            if (id == Author.myAuthor.get(i).author_id) {
                return Author.myAuthor.get(i).email;
            }
        }
        return null;
    }

    public static void postDetail(int id) {
        System.out.println("게시글의 id는 " + id + "입니다.");
        System.out.println("게시글의 제목은 " + myPost.get(id).title + "입니다.");
        System.out.println("게시글의 내용은 " + myPost.get(id).contents + "입니다.");
        System.out.println("게시글 작성자의 email은 " + Post.find_Email_To_Id(id) + "입니다.");
    }
}


