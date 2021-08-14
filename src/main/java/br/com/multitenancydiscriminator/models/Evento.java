package br.com.multitenancydiscriminator.models;

import org.hibernate.annotations.Filter;
import org.hibernate.annotations.FilterDef;
import org.hibernate.annotations.ParamDef;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.time.LocalDateTime;

/**
 *
 */

@Entity
@FilterDef(name = "usuario", parameters = {@ParamDef(name = "codigousuario", type = "long")})
@Filter(name = "usuario", condition = "usuario_codigo = :codigousuario")
public class Evento {

  @Id
  private long codigo;

  private String        descricao;
  private LocalDateTime data;

  @ManyToOne
  @JoinColumn(name = "usuario_codigo")
  private Usuario usuario;

  public long getCodigo(){
    return codigo;
  }

  public void setCodigo(long codigo){
    this.codigo = codigo;
  }

  public String getDescricao(){
    return descricao;
  }

  public void setDescricao(String descricao){
    this.descricao = descricao;
  }

  public LocalDateTime getData(){
    return data;
  }

  public void setData(LocalDateTime data){
    this.data = data;
  }

  public Usuario getUsuario(){
    return usuario;
  }

  public void setUsuario(Usuario usuario){
    this.usuario = usuario;
  }
}
