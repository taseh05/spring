package tahaseen.learning.springbootdemo.controller;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/test")
@Slf4j
public class Controller {

	@GetMapping("/getDate")
	ResponseEntity<String> getCurrentDate() {
		log.info("getDate:{}", new Date());
		return new ResponseEntity<>(new Date().toString(), HttpStatus.OK);

	}
}
