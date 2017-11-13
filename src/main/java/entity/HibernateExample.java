package entity;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

//import javax.security.auth.login.Configuration;

public class HibernateExample {
    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();

        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        Student student = new Student();
        student.setAge(35);
        student.setLastName("Wayn");
        student.setFirstName("Ara");

        session.save(student);
        transaction.commit();

       session.close();
      sessionFactory.close();
    }
}
