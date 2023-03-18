package Tekpro.MongoDB.repository;

import java.util.Optional;

import Tekpro.MongoDB.model.Expense;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

public interface ExpenseRepository extends MongoRepository<Expense, String>{
	@Query("{'name': ?0}")
	Optional<Expense> findByName(String name);
 
}
