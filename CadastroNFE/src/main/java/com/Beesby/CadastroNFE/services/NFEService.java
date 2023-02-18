package com.Beesby.CadastroNFE.services;

import com.Beesby.CadastroNFE.models.NFE;
import com.Beesby.CadastroNFE.repository.NFERepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;

@Service
public class NFEService {

    @Autowired
    private NFERepository repository;

    public List<NFE> todasNFEs() {
        return repository.findAll();
    }

    public NFE umaNFE(@PathVariable Integer numeroNota) {
        return repository.findById(numeroNota).get();
    }

    public NFE insert(@RequestBody NFE nfe) {
        return repository.save(nfe);
    }

    public void excluirNFE(@PathVariable Integer numeroNota) {
        repository.deleteById(numeroNota);
    }

    public NFE atualizarNFE(Integer numeroNota, NFE nfeAtualizada) {
        NFE nfe = repository.findById(numeroNota).orElse(null);

        if (nfe == null) {
            return null;
        }

        nfe.setCnpj(nfeAtualizada.getCnpj());
        nfe.setEndereco(nfeAtualizada.getEndereco());
        nfe.setRazaoSocial(nfeAtualizada.getRazaoSocial());
        nfe.setValor(nfeAtualizada.getValor());
        nfe.setNumeroSerie(nfeAtualizada.getNumeroSerie());

        return repository.save(nfe);
    }

}

