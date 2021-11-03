package br.com.conexao.conexao.dao;

import org.springframework.data.repository.CrudRepository;

import br.com.conexao.conexao.beans.Usuario;

public interface UsuarioDAO extends CrudRepository<Usuario, Integer>{ 

}
