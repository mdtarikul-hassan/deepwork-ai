
package com.deepwork.ai;

import com.deepwork.ai.entity.Meeting;
import com.deepwork.ai.entity.User;
import com.deepwork.ai.repository.MeetingRepository;
import com.deepwork.ai.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DeepworkAiApplication implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private MeetingRepository meetingRepository;

	public static void main(String[] args) {
		SpringApplication.run(DeepworkAiApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {


	}
}