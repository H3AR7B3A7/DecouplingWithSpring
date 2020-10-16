package be.dog.d.steven.decoupledhellospring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HelloWorldConfiguration {

    @Bean
    public MessageProvider world_provider(){
        return new HelloWorldMessageProvider();
    }

    @Bean
    public MessageProvider spring_provider(){
        return new HelloSpringMessageProvider();
    }

    @Bean
    public MessageRenderer world_renderer(){
        MessageRenderer renderer = new StandardOutMessageRenderer();
        renderer.setMessageProvider(world_provider());
        return renderer;
    }

    @Bean
    public MessageRenderer spring_renderer(){
        MessageRenderer renderer = new StandardOutMessageRenderer();
        renderer.setMessageProvider(spring_provider());
        return renderer;
    }

    @Bean
    public MessageRenderer world_lowercase_renderer(){
        MessageRenderer renderer = new LowerCaseMessageRenderer();
        renderer.setMessageProvider(world_provider());
        return renderer;
    }

    @Bean
    public MessageRenderer spring_lowercase_renderer(){
        MessageRenderer renderer = new LowerCaseMessageRenderer();
        renderer.setMessageProvider(spring_provider());
        return renderer;
    }
}
