package com.argentinaP.PortafolioAP.Repository;

import com.argentinaP.PortafolioAP.Model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario,Integer>{
    
}
