package com.tech.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tech.model.AppImage;

public interface ImageRepository extends JpaRepository<AppImage, Long> {
	Optional<AppImage> findByName(String name);
}