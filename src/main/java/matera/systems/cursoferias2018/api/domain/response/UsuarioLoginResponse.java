package matera.systems.cursoferias2018.api.domain.response;

import java.util.UUID;

public class UsuarioLoginResponse {
	
	private UUID uuid;
	private UsuarioResponse usuarioResponse;
	
	public UUID getUuid() {
		return uuid;
	}
	public void setUuid(UUID uuid) {
		this.uuid = uuid;
	}
	public UsuarioResponse getUsuarioResponse() {
		return usuarioResponse;
	}
	public void setUsuarioResponse(UsuarioResponse usuarioResponse) {
		this.usuarioResponse = usuarioResponse;
	}
	
}
