package com.Beesby.CadastroNFE.repository;

import com.Beesby.CadastroNFE.models.NFE;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NFERepository extends JpaRepository<NFE, Integer> {


}
