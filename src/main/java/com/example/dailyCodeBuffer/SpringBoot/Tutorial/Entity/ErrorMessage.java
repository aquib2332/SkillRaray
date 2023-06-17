package com.example.dailyCodeBuffer.SpringBoot.Tutorial.Entity;

import org.springframework.http.HttpStatus;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class ErrorMessage {

    public ErrorMessage(HttpStatus status, String message) {
		// TODO Auto-generated constructor stub
	}
	private HttpStatus status;
    private String message;
}
