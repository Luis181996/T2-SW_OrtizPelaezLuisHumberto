package pe.edu.cibertec.T2_SW_OrtizPelaezLuisHumberto.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public class PublicacionRepository extends JpaRepository<Publicacion, Integer> {
}
