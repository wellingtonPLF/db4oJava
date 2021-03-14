package modelo;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Video {
	private String link;
	private String nome;
	private LocalDateTime datahora = LocalDateTime.now();
	private double media;
	private List<Assunto> assuntos = new ArrayList<>();
	private List<Visualizacao> visualizacoes = new ArrayList<>();

	
	public Video(String link, String nome) {
		this.link = link;
		this.nome = nome;
	}
	public String getNome() {
		return this.nome;
	}
	
	public String getLink() {
		return this.link;
	}
	
	public void setMedia(double media) {	//Method add
		this.media = media;
	}
	
	public void setNome(String nome) {  //Method add
		this.nome = nome;
	}

	public void adicionar(Assunto a) {
		assuntos.add(a);
	}
	public void adicionar(Visualizacao visu) {
		visualizacoes.add(visu);
	}
	
	public void remover(Visualizacao visu){  //Method add
		this.visualizacoes.remove(visu);
	}
	
	public List<Assunto> getAssuntos(){  //Method add
		return this.assuntos;
	}
	
	public List<Visualizacao> getVisu(){  //Method add
		return this.visualizacoes;
	}

	@Override
	public String toString() {
		String texto = "Video: \n[" + (link != null ? "link= " + link + "; " : "") + 
				(nome != null ? "\n nome= " + nome + "; " : "") +
				(datahora != null ? "\n datahora= " +  datahora.format(DateTimeFormatter.ofPattern("dd/MM/yyy hh:mm:ss")) + "; " : "")
				+ "\n media= " + media ;
		texto+=",\n assuntos= ";
		for(Assunto a : assuntos) {
			texto += "("+a.getPalavra() + ")";
		}
		texto+=";\n visualizacoes=";
		for(Visualizacao vis : visualizacoes) {
			texto += vis;
		}
		texto+=";]\n";
		return texto;
	}
}
