package com.springrestdatabase2.Repositry;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RestController;

import com.springrestdatabase2.entity.product;
@Repository
public interface productRepositry extends JpaRepository<product, Integer> {

}
