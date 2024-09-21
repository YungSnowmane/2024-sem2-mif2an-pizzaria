package com.belval.pizzaria.repository;

import java.util.List;

import com.belval.pizzaria.entity.Produto;

import org.springframework.data.repository.CrudRepository;

public interface ProdutoRepository extends CrudRepository <Produto,Integer>{ 
    //Select * from Produto where descricao = <parametro>
    //List<Produto> findByDescricaoContains(String descricao);
    List<Produto> findByDescricao(String descricao);
}
