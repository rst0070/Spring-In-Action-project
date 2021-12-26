package tryspring.jdbc;

import lombok.Data;
import java.util.List;

@Data
public class ClassRoom {
    private int classNumber;

    /** 실제로 CLASS_ROOM 테이블에는 저장되지 않는 데이터 */
    private List<Student> studentList;

    /**
     * @param classNumber - 반 번호
     * @param studentList - 반의 학생들
     */
    public ClassRoom(
        int classNumber,
        List<Student> studentList
    ){
        this.classNumber = classNumber;
        this.studentList = studentList;
    }
}
