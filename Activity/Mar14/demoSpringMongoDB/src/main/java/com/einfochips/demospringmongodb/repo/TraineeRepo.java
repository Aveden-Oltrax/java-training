/**
 * 
 */
package com.einfochips.demospringmongodb.repo;

//import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.einfochips.demospringmongodb.model.Trainee;

/**
 * @author 158417
 *
 */
@Repository
public interface TraineeRepo extends MongoRepository<Trainee,Integer> {

	@Query("select count(t) from Trainee t")
	int countTrainees();

//	List<Trainee> getTraineeByLocation();
}
