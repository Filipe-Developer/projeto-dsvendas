package com.filipe.dsvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.filipe.dsvendas.entities.Seller;

public interface SellerRepository extends JpaRepository<Seller, Long> {

}
