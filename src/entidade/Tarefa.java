package entidade;

public class Tarefa {
	private String titulo;
	private String descricao;
	private Data data;
	private boolean status;
	
	public Tarefa(){
		this.status = false;
	}
	
	public void AlterarStatus(){
		if(!status)
			status = true;
		else
			status = false;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Data getData() {
		return data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public String isStatus() {
		
		if (status)
			return "Concluída";
		
		return "Pendente";
	}

	public void setStatus(boolean status) {
		this.status = status;
	}
}
