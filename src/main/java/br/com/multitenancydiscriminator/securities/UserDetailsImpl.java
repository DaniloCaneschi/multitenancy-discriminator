package br.com.multitenancydiscriminator.securities;

import br.com.multitenancydiscriminator.models.Usuario;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;

/**
 *
 */
public class UserDetailsImpl implements UserDetails {
  private Usuario usuario;

  public UserDetailsImpl(Usuario usuario){
    this.usuario = usuario;
  }

  public Usuario getUsuario(){
    return usuario;
  }

  @Override
  public Collection<? extends GrantedAuthority> getAuthorities(){
    return null;
  }

  @Override
  public String getPassword(){
    return usuario.getSenha();
  }

  @Override
  public String getUsername(){
    return usuario.getEmail();
  }

  @Override
  public boolean isAccountNonExpired(){
    return true;
  }

  @Override
  public boolean isAccountNonLocked(){
    return true;
  }

  @Override
  public boolean isCredentialsNonExpired(){
    return true;
  }

  @Override
  public boolean isEnabled(){
    return true;
  }
}
