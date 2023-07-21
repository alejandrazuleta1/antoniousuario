package co.com.reto.api;
import co.com.reto.api.dto.UsuarioDTO;
import co.com.reto.model.usuario.Usuario;
import co.com.reto.usecase.crearusuario.CrearUsuarioUseCase;
import co.com.reto.usecase.obtenerusuario.ObtenerUsuarioUseCase;
import lombok.AllArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/usuario", produces = MediaType.APPLICATION_JSON_VALUE)
@AllArgsConstructor
public class UsuarioApiRest {
    private final CrearUsuarioUseCase crearUsuarioUseCase;
    private final ObtenerUsuarioUseCase obtenerUsuarioUseCase;


    @PostMapping
    public Usuario crear(@RequestBody UsuarioDTO usuarioDTO) {
      return crearUsuarioUseCase.crear(usuarioDTO.getNombre(), usuarioDTO.getIdRol());
    }

    @GetMapping
    public List<Usuario> obtener() {
        return obtenerUsuarioUseCase.obtenerTodos();
    }
}
