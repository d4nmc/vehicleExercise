package repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public class VehicleRepo {



	

	@Repository
	public interface VehicleRepo extends JpaRepository<Vehicle, Long> {

		
		
	}
	
}
