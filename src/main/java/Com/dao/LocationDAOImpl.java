package Com.dao;

import Com.model.Location;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.List;
import java.util.UUID;


public class LocationDAOImpl implements LocationDAO {

    private SessionFactory sessionFactory;

    @Override
    public Location findById(UUID id) {
        Session session = sessionFactory.getCurrentSession();
        return session.get(Location.class, id);
    }

    @Override
    public List<Location> findAll() {
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("from Location", Location.class).list();
    }

    @Override
    public List<Location> findAll(UUID id) {
        return null;
    }

    @Override
    public void save(Location location) {
        Session session = sessionFactory.getCurrentSession();
        session.save(location);
    }

    @Override
    public void update(Location location) {
        Session session = sessionFactory.getCurrentSession();
        session.update(location);
    }

    @Override
    public void delete(Location location) {
        Session session = sessionFactory.getCurrentSession();
        session.delete(location);
    }
}