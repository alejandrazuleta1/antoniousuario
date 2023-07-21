package co.com.reto.model.usuario;
import lombok.Builder;
import lombok.Data;

@Data
@Builder(toBuilder = true)
public class Usuario {
    private final String id;
    private final String nombre;
    private final String idRol;
}
