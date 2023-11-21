package com.valyou.valyou.repositories;

import com.valyou.valyou.models.Artist;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArtistRepository extends JpaRepository<Artist, Long> {
}
