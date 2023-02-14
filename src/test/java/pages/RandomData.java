package pages;
//import java.util.Random;

import com.github.javafaker.Faker;
import org.apache.commons.lang3.RandomStringUtils;



public class RandomData {

    Faker faker = new Faker();

    public String generateRandomString(int length){
        return RandomStringUtils.randomAlphabetic(length);
    }

    public String generateRandomNumber(int length){
        return RandomStringUtils.randomNumeric(length);
    }

    public String generateRandomAlphaNumeric(int length){
        return RandomStringUtils.randomAlphanumeric(length);
    }

    public String generateStringWithAllobedSplChars(int length,String allowdSplChrs){
        String allowedChars="abcdefghijklmnopqrstuvwxyz" +   //alphabets
                "1234567890" +   //numbers
                allowdSplChrs;
        return RandomStringUtils.random(length, allowedChars);
    }

    public String generateEmail(int length) {
        String allowedChars="abcdefghijklmnopqrstuvwxyz" +   //alphabets
                "1234567890" +   //numbers
                "_-";   //special characters
        String email="";
        String temp=RandomStringUtils.random(length,allowedChars);
        email=temp.substring(0,temp.length()-9)+"@xyz.com";
        return email;
    }

    public String generateUrl(int length) {
        String allowedChars="abcdefghijklmnopqrstuvwxyz" +   //alphabets
                "1234567890" +   //numbers
                "_-.";   //special characters
        String url="";
        String temp=RandomStringUtils.random(length,allowedChars);
        url=temp.substring(0,3)+"."+temp.substring(4,temp.length()-4)+"."+temp.substring(temp.length()-3);
        return url;
    }


    public String Randomaddress() {
        String address= faker.address().fullAddress();
        return address;
    }


    public String CompanyName() {
        String companyname= faker.company().name();
        return companyname;
    }

    public String CompanyPhoneNumber() {
        String companyphonenumber= faker.phoneNumber().subscriberNumber();
        return companyphonenumber;
    }

    public String CompanyWebsite() {
        String companywebsite= faker.internet().url();
        return companywebsite;
    }



    public String RandomString() {
        String string= faker.lorem().paragraph();
        return string;
    }

    public String RandomNumber() {
        String string= faker.number().digit();
        return string;
    }

    public String RandomEmail() {
        String emailAddress= faker.internet().emailAddress();
        return emailAddress;
    }
}


/*public class RandomData {
    protected String getSaltString() {
        String SALTCHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        StringBuilder salt = new StringBuilder();
        Random rnd = new Random();
        while (salt.length() < 10) { // length of the random string.
            int index = (int) (rnd.nextFloat() * SALTCHARS.length());
            salt.append(SALTCHARS.charAt(index));
        }
        String saltStr = salt.toString();
        return saltStr;

    }*/



