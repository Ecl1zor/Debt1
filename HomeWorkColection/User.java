package Debt.HomeWorkColection;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

    public class User {
        private String firstName;
        private String lastName;

        public User(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }


        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            User user = (User) o;
            return Objects.equals(firstName, user.firstName) && Objects.equals(lastName, user.lastName);
        }

        @Override
        public int hashCode() {
            return Objects.hash(firstName, lastName);
        }

        public static void main(String[] args) {

            User user1 = new User("John", "Smith");
            User user2 = new User("John", "Smith");


            Set<User> userSet = new HashSet<>();
            userSet.add(user1);
            userSet.add(user2);


            System.out.println("Размер HashSet: " + userSet.size());
        }
    }

