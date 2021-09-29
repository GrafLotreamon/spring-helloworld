import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Configuration
public class AppConfig {

    @Bean
    @Scope ("prototype")
    public Cat catBean () {
        Cat cat = new Cat();
        cat.catSay();
        return new Cat();
    }

    @Bean (name = "helloworld")
    @Scope ("singleton")

    public HelloWorld getHelloWorld() {
        HelloWorld helloWorld = new HelloWorld();
        helloWorld.setMessage("Hello World!");
        return helloWorld;
    }
}