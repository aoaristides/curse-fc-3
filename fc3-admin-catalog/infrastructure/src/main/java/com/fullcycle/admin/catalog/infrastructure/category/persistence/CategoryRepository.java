package com.fullcycle.admin.catalog.infrastructure.category.persistence;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author aaristides
 */
public interface CategoryRepository extends JpaRepository<CategoryJpaEntity, String> {
}