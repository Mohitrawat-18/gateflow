package com.gateflow.control.repository;

import com.gateflow.control.entity.ApiRoute;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface ApiRouteRepository extends JpaRepository<ApiRoute, Long> {

    List<ApiRoute> findAllByOrganizationId(Long organizationId);

    List<ApiRoute> findAllByActiveTrueAndOrganizationStatus(com.gateflow.control.entity.OrganizationStatus status);

    Optional<ApiRoute> findByIdAndOrganizationId(Long id, Long organizationId);

    boolean existsByOrganizationIdAndRouteId(Long organizationId, String routeId);
}