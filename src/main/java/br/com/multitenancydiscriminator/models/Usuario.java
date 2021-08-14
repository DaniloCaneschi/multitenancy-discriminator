package br.com.multitenancydiscriminator.models;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 */

@Entity
public class Usuario {

  @Id
  private long codigo;

  private String email;
  private String senha;

  public long getCodigo(){
    return codigo;
  }

  public void setCodigo(long codigo){
    this.codigo = codigo;
  }

  public String getEmail(){
    return email;
  }

  public void setEmail(String email){
    this.email = email;
  }

  public String getSenha(){
    return senha;
  }

  public void setSenha(String senha){
    this.senha = senha;
  }
}
