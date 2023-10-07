package Com.dao;

import Com.model.Location;

import java.util.List;
import java.util.UUID;

public interface LocationDAO {
    Location findById(UUID id);
    List<Location>findAll();

    List<Location> findAll(UUID id);

    void save(Location location);
    void update(Location location);
    void delete(Location location);

}
