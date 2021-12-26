package tryspring.jdbc;

import lombok.Data;

@Data
public class Student {

    private String name;
    private String email;
    private int classRoom;

    public Student(
        String name,
        String email,
        int classRoom){
            this.name = name;
            this.email = email;
            this.classRoom = classRoom;
        }
}