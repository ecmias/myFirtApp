package pvt.una.myFistApp.repository;

import org.springframework.data.repository.CrudRepository;

import pvt.una.myFistApp.modelo.User;



public interface UserRepository extends CrudRepository<User, Long> {

	User findByUsername(String name);
}
