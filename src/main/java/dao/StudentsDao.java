package dao;

import model.Students;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.io.Serializable;

public class StudentsDao implements IStudentsDao{

    private Session session;
    private SessionFactory factory;

    public Students getById(int id) {
        return null;
    }

    public void initialize() {
        factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
        session = factory.openSession();
    }

    public void closeSession(){
        session.close();
        factory.close();
    }

    public void addStudent(Students student) {
        initialize();
        Transaction transaction = session.beginTransaction();
        Serializable save = session.save(student);

        transaction.commit();
        closeSession();
    }


}
