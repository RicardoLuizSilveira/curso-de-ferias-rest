package matera.systems.cursoferias2018.api.services;

import java.util.Optional;
import java.util.function.Function;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import matera.systems.cursoferias2018.api.domain.entity.UsuarioEntity;
import matera.systems.cursoferias2018.api.domain.request.UsuarioLoginRequest;
import matera.systems.cursoferias2018.api.domain.response.UsuarioLoginResponse;
import matera.systems.cursoferias2018.api.domain.response.UsuarioResponse;
import matera.systems.cursoferias2018.api.repository.UsuarioRepository;

@Service
public class LoginService {
	
	@Autowired
	private UsuarioRepository repository;
	
	public Optional<UsuarioLoginResponse> login(UsuarioLoginRequest request) {
		
		return repository.findByNomeESenha(request).map(toResponse);
	}
	
	 private Function<UsuarioEntity, UsuarioLoginResponse> toResponse = (entity) -> {
	        UsuarioResponse response = new UsuarioResponse();
	        response.setUuid(entity.getUuid());
	        response.setNome(entity.getNome());
	        response.setLogin(entity.getLogin());
	        response.setEmail(entity.getEmail());
	        response.setPerfil(entity.getPerfil());
	        response.setUrlPhoto(entity.getUrlPhoto());
	        
	        UsuarioLoginResponse resp = new UsuarioLoginResponse();
	        resp.setUuid(entity.getUuid());
	        resp.setUsuarioResponse(response);
	        
	        return resp;
	    };

}
