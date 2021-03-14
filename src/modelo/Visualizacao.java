package modelo;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Visualizacao {
	private int id;
	private LocalDateTime datahora = LocalDateTime.now();
	private int nota;
	private Usuario usuario;
	private Video video;
	
	public Visualizacao(int id, int nota, Usuario usuario, Video video) {
		this.id = id;
		this.nota = nota;
		this.usuario = usuario;
		this.video = video;
	}
	public Usuario getUsuario() {		//Method add
		return this.usuario;
	}
	public void setUsuario(Usuario usuario) { 		//Method add
		this.usuario = usuario;
	}
	
	public Video getVideo() { 	//Method add
		return this.video;
	}
	public void setVideo(Video video) { 	//Method add
		this.video= video;
	}
	
	public int getNota() {		//Method add
		return this.nota;
	}

	@Override
	public String toString() {
		return "\n    -> Visualizacao [id=" + id + 
				", datahora=" + datahora.format(DateTimeFormatter.ofPattern("dd/MM/yyy hh:mm:ss")) + 
				", nota=" + nota +
				"\n usuario=" + usuario.getEmail() + ", video=" + video.getNome() + "]\n";
	}
}
