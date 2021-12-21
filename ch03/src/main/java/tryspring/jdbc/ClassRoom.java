package tryspring.jdbc;

import lombok.Data;
import java.util.List;

@Data
public class ClassRoom {
    private int classNumber;
    private List<Student> studentList;
}
