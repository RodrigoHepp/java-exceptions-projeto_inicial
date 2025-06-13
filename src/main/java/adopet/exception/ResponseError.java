package adopet.exception;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;

public record ResponseError(String mensagem, HttpStatus status, LocalDateTime time) {

}
