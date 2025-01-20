package exeption;



public class AgeValidator extends Thread{
    public void validateAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age must be 18 or older");
        }
    }
}

