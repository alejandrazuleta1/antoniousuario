package co.com.reto.jpa.data;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@NoArgsConstructor
@Table(name = "USUARIO")
public class UsuarioData {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    @Column
    private String nombre;

    @ManyToOne
    @JoinColumn(name = "ID_ROL", insertable = false)
    private RolData rolData;
}
