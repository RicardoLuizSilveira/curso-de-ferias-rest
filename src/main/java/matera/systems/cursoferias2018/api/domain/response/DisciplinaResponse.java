package matera.systems.cursoferias2018.api.domain.response;

import java.util.List;
import java.util.UUID;

import matera.systems.cursoferias2018.api.domain.entity.enums.Segmento;

public class DisciplinaResponse {
	
	private UUID uuid;
	private String descricao;
	private String dataInicio;
	private String dataTermino;	
	private List<Integer> instrutores;
	private Segmento segmento;
	private String urlLogo;
	
	public UUID getUuid() {
		return uuid;
	}
	public void setUuid(UUID uuid) {
		this.uuid = uuid;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getDataInicio() {
		return dataInicio;
	}
	public void setDataInicio(String dataInicio) {
		this.dataInicio = dataInicio;
	}
	public String getDataTermino() {
		return dataTermino;
	}
	public void setDataTermino(String dataTermino) {
		this.dataTermino = dataTermino;
	}
	public List<Integer> getInstrutores() {
		return instrutores;
	}
	public void setInstrutores(List<Integer> instrutores) {
		this.instrutores = instrutores;
	}
	public Segmento getSegmento() {
		return segmento;
	}
	public void setSegmento(Segmento segmento) {
		this.segmento = segmento;
	}
	public String getUrlLogo() {
		return urlLogo;
	}
	public void setUrlLogo(String urlLogo) {
		this.urlLogo = urlLogo;
	}

}
