package mx.edu.utez.evaluacionrecuperau2carloslopez.model.usuario;

import mx.edu.utez.evaluacionrecuperau2carloslopez.model.destino.Destino;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;





@Repository
public interface  UsuarioRepository  extends
        JpaRepository<Usuario, Long> {
    boolean existsByNombre(String nombre);
}
