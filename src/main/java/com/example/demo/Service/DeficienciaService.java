package com.example.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.Deficiencia;
import com.example.demo.Repository.DeficienciaRepository;

import java.util.List;
import java.util.Optional;

@Service
public class DeficienciaService {
    
     @Autowired
    private DeficienciaRepository repository;

    public Deficiencia criarDeficiencia(Deficiencia deficiencia) {
        return repository.save(deficiencia);
    }

    public Deficiencia atualizarDeficiencia(Deficiencia deficiencia) {
        return repository.save(deficiencia);
    }

    public void deletarDeficiencia(Long id) {
        repository.deleteById(id);
    }

    public Deficiencia buscarDeficienciaPorId(Long id) {
        Optional<Deficiencia> optional = repository.findById(id);
        return optional.orElse(null);
    }

    public List<Deficiencia> listarTodasAsDeficiencias() {
        return repository.findAll();
    }
   

}