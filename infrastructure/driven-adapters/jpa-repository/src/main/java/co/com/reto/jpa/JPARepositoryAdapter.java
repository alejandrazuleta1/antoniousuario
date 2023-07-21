package co.com.reto.jpa;

import co.com.reto.jpa.data.UsuarioData;
import co.com.reto.jpa.helper.AdapterOperations;
import co.com.reto.model.usuario.Usuario;
import co.com.reto.model.usuario.gateways.UsuarioRepository;
import org.reactivecommons.utils.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Repository
public class JPARepositoryAdapter extends AdapterOperations<Usuario, UsuarioData, String, JPARepository>
 implements UsuarioRepository
{

    public JPARepositoryAdapter(JPARepository repository, ObjectMapper mapper) {
        super(repository, mapper, d -> mapper.map(d, Usuario.class));
    }

    @Override
    public Usuario guardar(Usuario usuario) {
        return mapper.map(repository.save(mapper.map(usuario, UsuarioData.class)), Usuario.class);
    }

    @Override
    public List<Usuario> obtenerTodos() {
        return StreamSupport.stream(repository.findAll().spliterator(), false)
                .map(usuarioData -> mapper.map(usuarioData, Usuario.class))
                .collect(Collectors.toList());
    }
}
