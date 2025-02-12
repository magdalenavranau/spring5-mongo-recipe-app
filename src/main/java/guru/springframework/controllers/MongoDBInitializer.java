package guru.springframework.controllers;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Component;

@Component
public class MongoDBInitializer {

//    @Bean
//    CommandLineRunner initDatabase(MongoTemplate mongoTemplate) {
//        return args -> {
//            // Drop existing collections
//            mongoTemplate.getDb().drop();
//            System.out.println("Dropped all collections in database.");
//        };
//    }
}
