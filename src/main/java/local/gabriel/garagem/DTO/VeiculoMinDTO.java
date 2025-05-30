/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package local.gabriel.garagem.DTO;

import local.gabriel.garagem.entities.Veiculo;

/**
 *
 * @author ppjata
 */
public class VeiculoMinDTO {
    private long id;
    private String marca;
    private String modelo;
    private String cor;
    private int km;
    private int ano;
    private String linkImage;

    public VeiculoMinDTO() {
    }
    
    public VeiculoMinDTO(Veiculo veiculo) {
        this.id = veiculo.getId();
        this.marca = veiculo.getMarca();
        this.modelo = veiculo.getModelo();
        this.cor = veiculo.getCor();
        this.km = veiculo.getKm();
        this.ano = veiculo.getAno();
        this.linkImage = veiculo.getLinkImage();
    }

    public long getId() {
        return id;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getCor() {
        return cor;
    }

    public int getKm() {
        return km;
    }

    public String getLinkImage() {
        return linkImage;
    }

    public int getAno() {
        return ano;
    }
    

}
