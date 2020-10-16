package be.dog.d.steven.decoupledhellospring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class DecoupledHelloSpringApplication {

    public static void main(String[] args) {
        SpringApplication.run(DecoupledHelloSpringApplication.class, args);
        ApplicationContext ctx = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);
        MessageRenderer mr = ctx.getBean("world_renderer", MessageRenderer.class);
        mr.render();
        mr = ctx.getBean("spring_renderer", MessageRenderer.class);
        mr.render();
        mr = ctx.getBean("world_lowercase_renderer", MessageRenderer.class);
        mr.render();
        mr = ctx.getBean("spring_lowercase_renderer", MessageRenderer.class);
        mr.render();
    }
}
