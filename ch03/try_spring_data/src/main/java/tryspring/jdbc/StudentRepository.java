package tryspring.jdbc;

import java.util.List;

public interface StudentRepository {
    public void save(Student student);

    public List<Student> findAll();

    public List<Student> getByClassNumber(int classNumber);

}
