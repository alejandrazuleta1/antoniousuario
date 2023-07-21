package co.com.reto.jpa;

import co.com.reto.jpa.data.UsuarioData;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.QueryByExampleExecutor;

public interface JPARepository extends CrudRepository<UsuarioData, String>, QueryByExampleExecutor<UsuarioData> {
}
