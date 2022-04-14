/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifsul.pw2022_1_model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

/**
 *
 * @author 20192PF.CC0170
 */
@Entity
@Table(name = "jogador")
public class Jogador extends Pessoa implements Serializable {

    @NotNull(message = "O peso deve ser informado")
    @Column(name = "peso", nullable = false, columnDefinition = "numeric(6,3)")
    private Double peso;
    @NotNull(message = "A altura deve ser informada")
    @Column(name = "altura", nullable = false, columnDefinition = "numeric(4,2)")
    private Double altura;
    @NotNull(message = "A posição deve ser informada")
    @ManyToOne
    @JoinColumn(name = "posicao", referencedColumnName = "id", nullable = false)
    private Posicao posicao;
    @NotNull(message = "O time deve ser informado")
    @ManyToOne
    @JoinColumn(name = "time", referencedColumnName = "id", nullable = false)
    private Time time;

    public Jogador() {

    }

    /**
     * @return the peso
     */
    public Double getPeso() {
        return peso;
    }

    /**
     * @param peso the peso to set
     */
    public void setPeso(Double peso) {
        this.peso = peso;
    }

    /**
     * @return the altura
     */
    public Double getAltura() {
        return altura;
    }

    /**
     * @param altura the altura to set
     */
    public void setAltura(Double altura) {
        this.altura = altura;
    }

    /**
     * @return the posicao
     */
    public Posicao getPosicao() {
        return posicao;
    }

    /**
     * @param posicao the posicao to set
     */
    public void setPosicao(Posicao posicao) {
        this.posicao = posicao;
    }

    /**
     * @return the time
     */
    public Time getTime() {
        return time;
    }

    /**
     * @param time the time to set
     */
    public void setTime(Time time) {
        this.time = time;
    }

}
