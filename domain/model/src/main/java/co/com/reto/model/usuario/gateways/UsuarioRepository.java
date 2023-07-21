package co.com.reto.model.usuario.gateways;

import co.com.reto.model.usuario.Usuario;

import java.util.List;

public interface UsuarioRepository {
    Usuario guardar(Usuario usuario);

    List<Usuario> obtenerTodos();
}
