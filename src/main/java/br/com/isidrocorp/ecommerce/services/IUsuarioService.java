package br.com.isidrocorp.ecommerce.services;

import java.util.List;

import br.com.isidrocorp.ecommerce.dto.UsuarioLoginDTO;
import br.com.isidrocorp.ecommerce.model.Usuario;
import br.com.isidrocorp.ecommerce.security.Token;

public interface IUsuarioService {
	public Token gerarTokenDeUsuarioLogado(UsuarioLoginDTO dadosLogin);
	public Usuario criarUsuario(Usuario novo);
	public Usuario alterarDados(Usuario dados);
	
	public List<Usuario> recuperarTodos();
	public Usuario recuperarDetalhes(Integer id);

}
