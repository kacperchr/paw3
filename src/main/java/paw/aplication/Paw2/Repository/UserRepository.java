package paw.aplication.Paw2.Repository;

import org.springframework.data.repository.CrudRepository;
import paw.aplication.Paw2.Entity.User;

public interface UserRepository extends CrudRepository<User, Integer> {

    public User findUserByName(String name);

}
