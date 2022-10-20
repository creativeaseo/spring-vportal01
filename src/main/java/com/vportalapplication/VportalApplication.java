package com.vportalapplication;

import com.vportalapplication.model.InspectionRequest;
import com.vportalapplication.repository.InspectionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class VportalApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(VportalApplication.class, args);
	}

	@Autowired
	private InspectionRepository inspectionRepository;

	@Override
	public void run(String... args) throws Exception {
	}
}
