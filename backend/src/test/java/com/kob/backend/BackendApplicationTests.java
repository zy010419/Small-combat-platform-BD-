package com.kob.backend;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class BackendApplicationTests {

    @Test
    void contextLoads() {
        PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        System.out.println(passwordEncoder.encode("pzhaoyu"));
        System.out.println(passwordEncoder.encode("pe"));
        System.out.println(passwordEncoder.matches("pzhaoyu", "$2a$10$pS/8zwCLjkd0L5FBSoWem.RwCJvd/A2/hXfE2us35Hwi1YDRDlDSW"));
    }

}
