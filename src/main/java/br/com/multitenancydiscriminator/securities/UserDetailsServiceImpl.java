package br.com.multitenancydiscriminator.securities;

import br.com.multitenancydiscriminator.models.Usuario;
import br.com.multitenancydiscriminator.repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 *
 */

@Service
public class UserDetailsServiceImpl implements UserDetailsService {
  @Autowired
  UsuarioRepository usuarioRepository;

  @Override
  public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException{
    Optional<Usuario> usuario = usuarioRepository.findByEmail(s);
    return usuario.map(UserDetailsImpl::new).orElse(null);
  }
}
