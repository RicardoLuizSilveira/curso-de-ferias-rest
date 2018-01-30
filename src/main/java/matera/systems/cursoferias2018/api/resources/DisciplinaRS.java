package matera.systems.cursoferias2018.api.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import matera.systems.cursoferias2018.api.domain.response.DisciplinaResponse;
import matera.systems.cursoferias2018.api.services.DisciplinaService;

@RestController
@RequestMapping(path = "/disciplinas")
public class DisciplinaRS {
	
	@Autowired
	private DisciplinaService service;
	
	@GetMapping(
			value = "disciplinaID",
			produces = {"application/json", "application/xml"}
	)
	public ResponseEntity<DisciplinaResponse> findByID(@PathVariable String disciplinaID) {
		
		return null;
	}

}
