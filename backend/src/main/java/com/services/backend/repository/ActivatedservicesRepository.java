package com.services.backend.repository;

import com.services.backend.entity.Activatedservices;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

public interface ActivatedservicesRepository extends JpaRepository<Activatedservices,Integer> {

    @Modifying
    @Transactional
    @Query(value = "DELETE FROM activatedservices WHERE userId = :userId AND serviceId = :serviceId", nativeQuery = true)
    void deactivateService(byte[] userId, Integer serviceId);
}
