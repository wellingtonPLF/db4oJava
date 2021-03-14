package dao;

import java.util.List;

import com.db4o.query.Query;
import com.db4o.*;

import modelo.Usuario;

public class DAOUsuario extends DAO<Usuario>{
	public Usuario read (Object chave) {
		String email = (String) chave;
		Query q = manager.query();
		q.constrain(Usuario.class);
		q.descend("email").constrain(email);
		List<Usuario> resultados = q.execute();
		if (resultados.size()>0)
			return resultados.get(0);
		else
			return null;
	}
	
	//Query's
	
	public  List<Usuario> consultarPorVideo(String link) {
		Query q = manager.query();
		q.constrain(Usuario.class);
		q.descend("visualizacoes").descend("video").descend("link").constrain(link);
		List<Usuario> result = q.execute(); 
		return result;
	}
}
