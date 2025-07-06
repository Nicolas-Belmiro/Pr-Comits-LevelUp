package Leevlup.API.C.Repository;

import Leevlup.API.C.Cadastro;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CadastroRepository extends JpaRepository<Cadastro, Integer>{

    public List<Cadastro> findAll() {
        return List.of();
    }

    public Cadastro save(Cadastro cadastro) {
        return cadastro;
    }

    public ScopedValue<Object> findById(int id) {
        return null;
    }

    public void deleteById(int id) {
    }
}
