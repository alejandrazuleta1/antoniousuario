package co.com.reto.usecase.obtenerusuario;

import co.com.reto.model.usuario.Usuario;
import co.com.reto.model.usuario.gateways.UsuarioRepository;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public class ObtenerUsuarioUseCase {
    private final UsuarioRepository usuarioRepository;

    public List<Usuario> obtenerTodos() {
        return usuarioRepository.obtenerTodos();
    }
}
