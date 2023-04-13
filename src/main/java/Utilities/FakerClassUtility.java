package Utilities;
import org.testng.annotations.Test;


import com.github.javafaker.Faker;

public class FakerClassUtility {
	
	

	public static String generateFirstName() {
		Faker faker = new Faker();
        return faker.name().firstName();
    }
	
	public static String generateLastName() {
		Faker faker = new Faker();
        return faker.name().lastName();
    }
	
	public static String generateUsername() {
		Faker faker = new Faker();
        return faker.name().username();
    }

	public static String generateCityname() {
		Faker faker = new Faker();
       
		return faker.address().cityName();
    }
	public static String generateStatename() {
		Faker faker = new Faker();
       return faker.address().state();
    }
	public static String generateCountryname() {
		Faker faker = new Faker();
       return faker.address().country();
    }
	public static String generateCellPhone() {
		Faker faker = new Faker();
       return faker.phoneNumber().cellPhone();
    }
	public static String generateAnimalName() {
		Faker faker = new Faker();
       return faker.animal().name();
       }
	public static String generatePassword() {
		Faker faker = new Faker();
       return faker.internet().password();
       }
	public static String generateEmail() {
		Faker faker = new Faker();
       return faker.internet().emailAddress();
       }
	
	
	
	
	

}


