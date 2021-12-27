package builder;

public class Person {
    private final String firstName;
    private final String lastName;
    private final String middleName;
    private final String country;
    private final String address;
    private final String phone;
    private final int age;
    private final String gender;

    private Person(PersonBuilder builder) {
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.middleName = builder.middleName;
        this.country = builder.country;
        this.address = builder.address;
        this.phone = builder.phone;
        this.age = builder.age;
        this.gender = builder.gender;
    }

    public static PersonBuilder builder() {
        return new PersonBuilder();
    }

    public static class PersonBuilder{
        private String firstName;
        private String lastName;
        private String middleName;
        private String country;
        private String address;
        private String phone;
        private int age;
        private String gender;

        public PersonBuilder setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public PersonBuilder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public PersonBuilder setMiddleName(String middleName) {
            this.middleName = middleName;
            return this;
        }

        public PersonBuilder setCountry(String country) {
            this.country = country;
            return this;
        }

        public PersonBuilder setAddress(String address) {
            this.address = address;
            return this;
        }

        public PersonBuilder setPhone(String phone) {
            this.phone = phone;
            return this;
        }

        public PersonBuilder setAge(int age) {
            this.age = age;
            return this;
        }

        public PersonBuilder setGender(String gender) {
            this.gender = gender;
            return this;
        }

        public Person build() {
            return new Person(this);
        }

    }
}
