package be.dog.d.steven.decoupledhellospring;

public class HelloWorldMessageProvider implements MessageProvider {

    @Override
    public String getMessage() {
        return "Hello world!";
    }
}
