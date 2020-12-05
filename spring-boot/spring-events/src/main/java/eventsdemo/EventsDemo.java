package eventsdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
public class EventsDemo {

	public static void main(String[] args) {
		SpringApplication springApplication = new SpringApplication(EventsDemo.class);
		// uncomment below line if you are not using spring.factories
		// springApplication.addListeners(new SpringBuiltInEventsListener());
		springApplication.run(args);
	}

}
