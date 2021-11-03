package br.com.conexao.conexao.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import br.com.conexao.conexao.beans.Usuario;
import br.com.conexao.conexao.dao.UsuarioDAO;

@RestController
public class UsuarioController {

	@Autowired
	private UsuarioDAO dao;
	
	@GetMapping("/Usuario")
	public ResponseEntity<List<Usuario>> getAll(){
		List<Usuario> list = (List<Usuario>)dao.findAll();
	
		if(list.size()==0) {
			return ResponseEntity.status(404).build();
		}
		
		return ResponseEntity.ok(list);
	}
	
	
}
