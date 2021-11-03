package br.com.conexao.conexao.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import br.com.conexao.conexao.beans.Usuario;
import br.com.conexao.conexao.dao.UsuarioDAO;

@RestController
public class UsuarioController {

	@Autowired
	private UsuarioDAO dao;
	
	public ResponseEntity<List<Usuario>> getAll(){
		List<Usuario> list = (List<Usuario>)dao.findAll();
		return ResponseEntity.ok(list);
	}
	
	
}
