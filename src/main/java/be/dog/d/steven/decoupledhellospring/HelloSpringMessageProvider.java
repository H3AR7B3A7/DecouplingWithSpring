package be.dog.d.steven.decoupledhellospring;

public class HelloSpringMessageProvider implements MessageProvider{
    @Override
    public String getMessage() {
        return "Hello SPRING!";
    }
}
