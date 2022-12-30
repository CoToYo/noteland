package com.example.noteland;

import com.example.noteland.user.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;

@SpringBootApplication
public class NotelandApplication {

	public static void main(String[] args) {
		SpringApplication.run(NotelandApplication.class, args);
	}


}
