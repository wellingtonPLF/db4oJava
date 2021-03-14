package dao;

import java.util.List;

import com.db4o.query.Query;
import com.db4o.*;

import modelo.Video;

public class DAOVideo extends DAO<Video>{
	public Video read (Object chave) {
		String nome = (String) chave;
		Query q = manager.query();
		q.constrain(Video.class);
		q.descend("nome").constrain(nome);
		List<Video> resultados = q.execute();
		if (resultados.size()>0)
			return resultados.get(0);
		else
			return null;
	}
	
	public Video readLink (Object chave) {
		String link = (String) chave;
		Query q = manager.query();
		q.constrain(Video.class);
		q.descend("link").constrain(link);
		List<Video> resultados = q.execute();
		if (resultados.size()>0)
			return resultados.get(0);
		else
			return null;
	}
	
	//Query's
	
	public  List<Video> consultarPorUsuario(String email) {
		Query q = manager.query();
		q.constrain(Video.class);
		q.descend("visualizacoes").descend("usuario").descend("email").constrain(email);
		List<Video> result = q.execute(); 
		return result;
	}
	
	public  List<Video> consultarPorAssunto(String palavra) {
		Query q = manager.query();
		q.constrain(Video.class);
		q.descend("assuntos").descend("palavra").constrain(palavra);
		List<Video> result = q.execute(); 
		return result;
	}
}
