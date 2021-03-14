package modelo;
import java.util.ArrayList;
import java.util.List;

public class Usuario {
	private String email;
	private List<Visualizacao> visualizacoes = new ArrayList<>();

	public Usuario(String email) {
		this.email = email;
	}

	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {  //Method add
		this.email = email;
	}
	
	public void adicionar(Visualizacao visu) {
		visualizacoes.add(visu);
	}
	
	public void remover(Visualizacao visu){  //Method add
		this.visualizacoes.remove(visu);
	}

	@Override
	public String toString() {
		String texto =  "Usuario [email=" + email + "]";
		
		texto+="\n visualizacoes=";
		for(Visualizacao vis : visualizacoes) {
			texto += vis;
		}
		return texto;
	}
}
