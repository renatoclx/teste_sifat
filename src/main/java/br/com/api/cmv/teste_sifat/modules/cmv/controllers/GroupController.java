package br.com.api.cmv.teste_sifat.modules.cmv.controllers;

import br.com.api.cmv.teste_sifat.modules.cmv.DTO.BestSellingGroupDTO;
import br.com.api.cmv.teste_sifat.modules.cmv.entities.GroupEntity;
import br.com.api.cmv.teste_sifat.modules.cmv.services.GroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/groups")
public class GroupController {

    @Autowired
    private GroupService groupService;

    @GetMapping("/all")
    public List<GroupEntity> getAllGroups() {
        return groupService.getAllGroups();
    }

    @GetMapping("/best-sellers")
    public ResponseEntity<List<BestSellingGroupDTO>> getBestSellingGroups() {
        List<BestSellingGroupDTO> bestSellers = groupService.getBestSellingProducts();
        return ResponseEntity.ok(bestSellers);
    }

}
