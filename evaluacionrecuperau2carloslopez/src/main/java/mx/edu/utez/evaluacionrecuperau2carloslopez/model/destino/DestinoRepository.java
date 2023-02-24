package mx.edu.utez.evaluacionrecuperau2carloslopez.model.destino;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;




@Repository
public interface  DestinoRepository extends
        JpaRepository<Destino, Long> {

}