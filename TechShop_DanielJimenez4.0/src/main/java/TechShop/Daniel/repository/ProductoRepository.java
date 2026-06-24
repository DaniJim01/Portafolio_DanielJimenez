package TechShop.Daniel.repository;
import TechShop.Daniel.domain.Producto;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductoRepository extends JpaRepository<Producto, Integer> {

    // ← Reemplaza findByActivoTrue() por esto:
    @Query("SELECT p FROM Producto p LEFT JOIN FETCH p.categoria WHERE p.activo = true")
    public List<Producto> findByActivoTrue();
}