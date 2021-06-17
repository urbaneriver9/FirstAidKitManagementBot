package repository;

import models.FirstAidKit;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.internal.SessionFactoryImpl;

public class FirstAidKitRepositoryImpl implements FirstAidKitRepository {

    private static SessionFactory sessionFactory;

    @Override
    public void create(FirstAidKit firstAidKit) {
        Configuration configuration = new Configuration().configure();
        configuration.addAnnotatedClass(FirstAidKit.class);
        StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties());
        sessionFactory = configuration.buildSessionFactory(builder.build());

        Session session = sessionFactory.openSession();
        Transaction transaction = null;

        transaction = session.beginTransaction();
        session.save(firstAidKit);
        transaction.commit();
        session.close();
    }

    public static void main(String[] args) {
//        sessionFactory = new Configuration().configure().buildSessionFactory();

        FirstAidKitRepositoryImpl repository = new FirstAidKitRepositoryImpl();

        repository.create(new FirstAidKit("kit1", "login", "pass", "date"));
    }
    @Override
    public FirstAidKit get() {
        return null;
    }

    @Override
    public void delete() {

    }

    @Override
    public void update() {

    }
}
