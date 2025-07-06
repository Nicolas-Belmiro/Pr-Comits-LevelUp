package Leevlup.API.C.Controller;


import Leevlup.API.C.Cadastro;
import Leevlup.API.C.Repository.CadastroRepository;
import Leevlup.API.U.AtualizacaoUsuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/cadastros")
public class CadastroController {

    @Autowired
    private CadastroRepository repository;

    @GetMapping
    public List<Cadastro> listarTodos() {
        return repository.findAll();
    }

    @PostMapping
    public Cadastro criar(@RequestBody Cadastro cadastro) {
        return repository.save(cadastro);
    }

    @PutMapping("/{id}")
    public Cadastro atualizar(@PathVariable int id, @RequestBody AtualizacaoUsuario dados) {
        Cadastro cadastro = (Cadastro)  repository.findById(id).orElseThrow();
        cadastro.setNome(dados.getNome());
        cadastro.setTelefone(dados.getTelefone());
        cadastro.setEmail(dados.getEmail());
        cadastro.setSenha(dados.getSenha());
        return repository.save(cadastro);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable int id) {
        repository.deleteById(id);
    }
}
