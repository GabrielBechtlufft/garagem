/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package local.gabriel.garagem.repository;

import java.util.List;
import local.gabriel.garagem.DTO.VeiculoMinDTO;
import local.gabriel.garagem.entities.Veiculo;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author ppjata
 */
public interface VeiculoRepository extends JpaRepository<Veiculo, Long> {
    
    List<Veiculo> findById(long id);
    
    List<VeiculoMinDTO> findByCor (String cor);
    
    List<VeiculoMinDTO> findByAno (int ano);
}
