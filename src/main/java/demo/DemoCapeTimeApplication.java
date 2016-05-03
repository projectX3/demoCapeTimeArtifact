package demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
// same as @Configuration @EnableAutoConfiguration @ComponentScan
@Import(MyRepositoryRestMvcConfiguration.class)
@EnableJpaRepositories
public class DemoCapeTimeApplication {

    //
    // Connection connection;
    //
    // Connection getConnection(String host, String database, String user,
    // String passwd) {
    // String connectionCommand = "jdbc:mysql://" + host + "/" + database +
    // "?user=" + user + "&password=" + passwd;
    // try {
    // connection = DriverManager.getConnection(connectionCommand);
    // } catch (SQLException e) {
    // // TODO Auto-generated catch block
    // e.printStackTrace();
    // }
    // return connection;
    // }

    public static void main(String[] args) {
        SpringApplication.run(DemoCapeTimeApplication.class, args);
    }
}
