package mx.edu.utez.evaluacionrecuperau2carloslopez.model.viaje;

import mx.edu.utez.evaluacionrecuperau2carloslopez.model.usuario.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ViajeRepository  extends
        JpaRepository<Viaje, Long> {
}
