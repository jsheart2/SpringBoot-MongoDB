package test.MongoTemplate;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.core.query.Query;

import test.MongoTemplate.dal.PersonDAL;
import test.MongoTemplate.model.Address;
import test.MongoTemplate.model.Person;

@SpringBootApplication
public class MongoTemplateApps implements CommandLineRunner {
	
	@Autowired
	PersonDAL personDAL;
	
	public static void main(String[] args) {
		SpringApplication.run(MongoTemplateApps.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Person person1 = new Person();
		person1.setPersonId("1323");
		person1.setName("noname");
		person1.setEmail("sdadasdw@gmail.com");
		person1.setPhoneNumbers(new String[]{"11111", "22222", "3333434"});
		person1.setAddressObject(new Address("Bandung", "west java"));
		personDAL.addPerson(person1);
		
		
		//Person person2 = new Person();
		//person2.setPersonId("12345");
		//person2.setName("ndasdasdasd");
		//person2.setEmail("noname@gmail.com");
		//person2.setPhoneNumbers(new String[]{"11111", "22222", "3333434"});
		//person2.setAddressObject(new Address("Bandung", "west java"));
		//personDAL.addPerson(person2);
		
		//personDAL.deletePerson(person1);
		//personDAL.updatePerson(person1);
		//Person person = personDAL.findOneByName("noname");
		//System.out.println("dsadsa: " + person.getName() + ":" + person.getEmail());
	}

	public List<Person> findAll(Class<Person> class1) {
		// TODO Auto-generated method stub
		return null;
	}

	public static Person findOne(Query query, Class<MongoTemplateApps> class1) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
