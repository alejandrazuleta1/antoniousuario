package co.com.reto.usecase.crearusuario;

import co.com.reto.model.usuario.Usuario;
import co.com.reto.model.usuario.gateways.UsuarioRepository;
import lombok.RequiredArgsConstructor;
@RequiredArgsConstructor
public class CrearUsuarioUseCase {
    private final UsuarioRepository usuarioRepository;
    public Usuario crear(String nombre, String idRol){

        // consulta por rol y validacion antes de guardar

        return usuarioRepository.guardar(Usuario.builder().nombre(nombre).idRol(idRol).build());
    }
}
