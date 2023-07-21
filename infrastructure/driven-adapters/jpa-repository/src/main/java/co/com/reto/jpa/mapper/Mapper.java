package co.com.reto.jpa.mapper;

import co.com.reto.jpa.data.RolData;
import co.com.reto.jpa.data.UsuarioData;
import co.com.reto.model.usuario.Usuario;

public class Mapper {
    public UsuarioData toData(Usuario usuario){
        UsuarioData usuarioData = new UsuarioData();
        RolData rolData = new RolData();
        rolData.setId(usuario.getIdRol());
        usuarioData.setRolData(rolData);
        usuarioData.setNombre(usuario.getNombre());
        return usuarioData;
    }
}
