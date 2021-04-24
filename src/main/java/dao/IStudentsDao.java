package dao;

import model.Students;

import java.util.List;

public interface IStudentsDao {
    Students getById(int id);
    void initialize();
    void closeSession();
    void addStudent(Students student);

}
