package tryspring.jdbc;

public interface ClassRoomRepository {
    public Iterable<ClassRoom> findAll();

    public void save(ClassRoom data);

}