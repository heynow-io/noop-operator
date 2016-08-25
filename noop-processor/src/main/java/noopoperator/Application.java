package noopoperator;

import io.heynow.poc.router.Note;
import io.heynow.poc.router.Router;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication
public class Application extends Router {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Override
    protected Note process(Note input) {
        return input;
    }
}
