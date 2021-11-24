package test.MongoTemplate.dal;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import test.MongoTemplate.model.Person;

@Repository
public class PersonDALImpl implements PersonDAL {
	
	private final MongoTemplate mongoTemplate;
	
	@Autowired
	public PersonDALImpl(MongoTemplate mongoTemplate){
		this.mongoTemplate = mongoTemplate;
	}

	@Override
	public void addPerson(Person person) {
		mongoTemplate.save(person);
		
	}

	@Override
	public void savePerson(Person Person) {
		mongoTemplate.save(Person);
		
	}

	@Override
	public void deletePerson(Person person) {
		mongoTemplate.remove(person);
	}

	@Override
	public void updatePerson(Person person) {
		Person person1 = mongoTemplate.findOne(
				Query.query(Criteria.where("name").is("noname")), Person.class);
		person1.setName("sahrul");
		mongoTemplate.save(person1);
	}

	@Override
	public void updatemultiPerson(Person person) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Person> findByName(String person1) {
		Query query = new Query();
		query.addCriteria(Criteria.where("name").is(person1));
		return mongoTemplate.find(query, Person.class);
	}

	@Override
	public Person findOneByName(String name) {
		Query query = new Query();
		query.addCriteria(Criteria.where("name").is(name));
		
		return mongoTemplate.findOne(query, Person.class);
	}

}
