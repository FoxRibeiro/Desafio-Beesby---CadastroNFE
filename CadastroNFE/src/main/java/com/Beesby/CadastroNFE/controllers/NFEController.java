package com.Beesby.CadastroNFE.controllers;

import com.Beesby.CadastroNFE.models.NFE;
import com.Beesby.CadastroNFE.services.NFEService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/NFE")
public class NFEController {

    @Autowired
    private NFEService service;

    @GetMapping("/All")
    public List<NFE> todasNFEs() {
        return service.todasNFEs();
    }

    @GetMapping("/{numeroNota}")
    public NFE umaNFE(@PathVariable Integer numeroNota) {
        return service.umaNFE(numeroNota);
    }

    @PostMapping("/novo")
    public NFE insert(@RequestBody NFE nfe) {
        return service.insert(nfe);
    }

    @DeleteMapping("/delete/{numeroNota}")
    public ResponseEntity<String> excluirNFE(@PathVariable Integer numeroNota) {
        service.excluirNFE(numeroNota);
        return ResponseEntity.ok().body("Nota fiscal excluída com sucesso.");
    }

    @PutMapping("/alterar/{id}")
    public ResponseEntity<NFE> atualizarNFE(@PathVariable Integer numeroNota, @RequestBody NFE nfeAtualizada) {
        NFE nfe = service.atualizarNFE(numeroNota, nfeAtualizada);

        if (nfe == null) {
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(nfe);
    }

}
