package br.com.devmedia.curso.dao;

import java.util.List;

import br.com.devmedia.curso.domain.Usuario;

public interface UsuarioDao {
	
	public void salvar(Usuario usuario);
	public void editar(Usuario usuario);
	public void excluir(Long id);
	public Usuario getId(Long id);
	public List<Usuario>getTodos();

}
