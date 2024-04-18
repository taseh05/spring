package tahaseen.learning.springioc;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import tahaseen.learning.springioc.demo.Car;

@SpringBootApplication
@Slf4j
public class SpringIocApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringIocApplication.class, args);
		Car car = context.getBean(Car.class);
		log.info("{}", car.getEngineData());
	}

}
