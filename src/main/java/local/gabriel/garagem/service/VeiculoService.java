/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package local.gabriel.garagem.service;

import java.util.List;
import local.gabriel.garagem.DTO.VeiculoMinDTO;
import local.gabriel.garagem.entities.Veiculo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import local.gabriel.garagem.repository.VeiculoRepository;

/**
 *
 * @author ppjata
 */
@Service
public class VeiculoService {
    
    @Autowired
    private VeiculoRepository garagemRepository;
    
    public List<Veiculo> findAll() {
        
        List<Veiculo> result = garagemRepository.findAll();
        return result;
    }
    
    public List<Veiculo> findById(long id) {
        
        List<Veiculo> result = garagemRepository.findById(id);
        return result;
    }
    
    public List<VeiculoMinDTO> findByColor(String cor) {
        List<VeiculoMinDTO> result = garagemRepository.findByColor(cor);
        return result;
    }
    

}
