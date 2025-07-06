package Leevlup.API.C.Repository;

import Leevlup.API.C.Cadastro;

import java.util.List;

public class CadastroRepositoryImpl implements CadastroRepository {
    @Override
    public List<Cadastro> findAll() {
        return List.of();
    }

    @Override
    public Cadastro save(Cadastro cadastro) {
        return null;
    }

    @Override
    public ScopedValue<Object> findById(int id) {
        return null;
    }

    @Override
    public void deleteById(int id) {

    }
}
