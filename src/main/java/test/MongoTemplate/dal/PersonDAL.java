package test.MongoTemplate.dal;

import java.util.List;

import test.MongoTemplate.model.Person;

public interface PersonDAL {
	void addPerson(Person person);
	void savePerson(Person person);
	void updatePerson(Person person);
	void deletePerson(Person person);
	void updatemultiPerson(Person person);
	Person findOneByName(String name);
	List<Person>findByName(String person1);
}