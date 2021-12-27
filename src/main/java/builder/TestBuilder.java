package builder;

public class TestBuilder {
    public static void main(String[] args) {
        Person person = Person.builder()
                .setFirstName("FirstName")
                .setLastName("LastName")
                .setMiddleName("MiddleName")
                .setAddress("Address")
                .setAge(99)
                .setCountry("Country")
                .setGender("Gender")
                .setPhone("Phone")
                .build();
    }
}
