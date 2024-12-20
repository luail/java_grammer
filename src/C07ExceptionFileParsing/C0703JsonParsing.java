package C07ExceptionFileParsing;

import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class C0703JsonParsing {
    public static void main(String[] args) throws IOException {
//        ObjectMapper objectMapper = new ObjectMapper();
//        Path filePath = Paths.get("src/C07ExceptionFileParsing/json1.json");
//        String st1 = Files.readString(filePath);
////        System.out.println(st1);

////        readTree : 트리구조의 JsonNode 객체로 변환 **중요**
////        트리구조의 장점은 유연하게 데이터를 파싱한다는 것.
//        JsonNode j1 = objectMapper.readTree(st1);
//        Map<String, String> m1 = new HashMap<>();
//        System.out.println(m1.put("id", j1.get("id").asText()));
//        System.out.println(m1.put("name", j1.get("name").asText()));
//        for (JsonNode j : j1) {
//            System.out.println(j);
//        }

//        readValue : 바로 java 객체로 변환 **제일중요**
//        Map<String, String> myMap = objectMapper.readValue(st1, Map.class);
//        System.out.println(myMap);
//        System.out.println(myMap.get("name"));
//        System.out.println(myMap.get("city"));

//        Student s1 = objectMapper.readValue(st1, Student.class);
//        System.out.println(s1.toString());

//        실습 : 리스트형식의 student json데이터를 파싱.
        List<Student> students = new ArrayList<>();
        ObjectMapper objectMapper = new ObjectMapper();  //JSON 데이터를 JAVA 객체를 바꾸기 위한 객체
        Path filePath = Paths.get("src/C07ExceptionFileParsing/json2.json");  // json데이터를 가져옴.
        String st1 = Files.readString(filePath);  // json 데이터를 String st1에 담음.
        JsonNode j1 = objectMapper.readTree(st1);  // st1을 JsonNode j1에 tree형태로 가져옴.
        for (JsonNode j : j1) {   // 트리형태의 j1을 Jsonnode j로 가져와서 Student 객체에 담고 students 리스트에 담음.
            Student s1 = objectMapper.readValue(j.toString(), Student.class);
            students.add(s1);
        }
        System.out.println(students);

    }
}

//실제 값의 setting은 reflection이라는 기술을 통해 변수에 직접 접근. private여도 접근 가능하다.
//objectmapper는 getter의 메서드명을 통해 필드값을 유추.
class Student {
    private int id;
    private String name;
    private String classNumber;
    private String city;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getClassNumber() {
        return classNumber;
    }

    public String getCity() {
        return city;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", classNumber='" + classNumber + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}