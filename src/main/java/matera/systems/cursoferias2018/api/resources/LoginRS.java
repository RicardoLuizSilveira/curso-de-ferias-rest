package matera.systems.cursoferias2018.api.resources;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import matera.systems.cursoferias2018.api.domain.request.UsuarioLoginRequest;
import matera.systems.cursoferias2018.api.domain.response.UsuarioLoginResponse;
import matera.systems.cursoferias2018.api.services.LoginService;

@RestController
@RequestMapping(path = "/login")
public class LoginRS {
	
	@Autowired
	private LoginService service;
	
	@PostMapping(
			consumes = {"application/json", "application/xml"}
	)
	public ResponseEntity<UsuarioLoginResponse> login(@RequestBody UsuarioLoginRequest request) {
		
		final Optional<UsuarioLoginResponse> response = service.login(request);
		
		if (response.isPresent()) {
			return ResponseEntity.status(201)
					.header("location", "/usuarios/" + response.get().getUuid())
					.build();
		} else {
			return ResponseEntity.status(404).build();
		}
		
	}
	
}
