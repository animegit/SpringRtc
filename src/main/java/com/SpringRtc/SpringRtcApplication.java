	package com.SpringRtc;

	import com.SpringRtc.User.User;
	import com.SpringRtc.User.UserSerivce;
	import org.springframework.boot.CommandLineRunner;
	import org.springframework.boot.SpringApplication;
	import org.springframework.boot.autoconfigure.SpringBootApplication;
	import org.springframework.context.annotation.Bean;

	@SpringBootApplication
	public class SpringRtcApplication {

		public static void main(String[] args) {
			SpringApplication.run(SpringRtcApplication.class, args);
		}

		@Bean
		public CommandLineRunner commandLineRunner(UserSerivce service) {
			return args -> {
				User u1 = new User("Animesh", "Animesh@mail.com", "aaa", "online");
				service.register(u1);
				User u2 = new User("xyz", "Aim@mail.com", "aaa", "online");
				service.register(u2);
			};
		}
	}
