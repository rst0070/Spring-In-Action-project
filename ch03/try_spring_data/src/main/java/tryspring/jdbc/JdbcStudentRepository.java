package tryspring.jdbc;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.sql.ResultSet;
import java.sql.SQLException;

@Repository
public class JdbcStudentRepository implements StudentRepository{

    private JdbcTemplate jdbc;

    @Autowired
    public JdbcStudentRepository(JdbcTemplate jdbc){
        this.jdbc = jdbc;
    }

    @Override
    public void save(Student student){

    }

    @Override
    public List<Student> findAll(){
        return jdbc.query("select * from student", this::mapRowToStudent);
    }

    @Override
    public List<Student> getByClassNumber(int classNumber){
        return jdbc.query("select * from student where class_room = ?", this::mapRowToStudent, classNumber);
    }

    private Student mapRowToStudent(ResultSet rs, int rowNum) throws SQLException{ 
        return new Student(
            rs.getString("name"),
            rs.getString("email"),
            rs.getInt("class_room")
        );
    }

}
