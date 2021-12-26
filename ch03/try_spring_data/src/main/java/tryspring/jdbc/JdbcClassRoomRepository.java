package tryspring.jdbc;

import tryspring.jdbc.ClassRoomRepository;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.sql.ResultSet;
import java.sql.SQLException;

@Repository
public class JdbcClassRoomRepository implements ClassRoomRepository{

    private JdbcTemplate jdbc;
    private JdbcStudentRepository studentRepo;
    @Autowired
    public JdbcClassRoomRepository(JdbcTemplate jdbc, JdbcStudentRepository studentRepo){
        this.jdbc = jdbc;
        this.studentRepo = studentRepo;
    }
    @Override
    public Iterable<ClassRoom> findAll(){
        return jdbc.query("select * from class_room", this::mapRowToClassRoom);
    }

    @Override
    public void save(ClassRoom data){

    }

    private ClassRoom mapRowToClassRoom(ResultSet rs, int rowNum) throws SQLException {
        List<Student> students = getStudentList(rs.getInt("class_number"));
        ClassRoom result = new ClassRoom(
            rs.getInt("class_number"),
            students
             );
        return result;
    }

    private List<Student> getStudentList(int classNumber){
        return studentRepo.getByClassNumber(classNumber);
    }
}
