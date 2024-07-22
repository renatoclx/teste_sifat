package br.com.api.cmv.teste_sifat.modules.cmv.services;

import br.com.api.cmv.teste_sifat.modules.cmv.DTO.BestSellingGroupDTO;
import br.com.api.cmv.teste_sifat.modules.cmv.entities.GroupEntity;
import br.com.api.cmv.teste_sifat.modules.cmv.projections.BestSellingGroupProjection;
import br.com.api.cmv.teste_sifat.modules.cmv.repository.GroupRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class GroupService {

    @Autowired
    private GroupRepository groupRepository;

    public List<GroupEntity> getAllGroups() {

        return groupRepository.findAll();
    }

    public List<BestSellingGroupDTO> getBestSellingProducts() {
        List<BestSellingGroupProjection> projections = groupRepository.findBestSellingGroups();

        return projections.stream().map(projection -> new BestSellingGroupDTO(
                projection.getGroupId(),
                projection.getGroupName(),
                projection.getTotalQuantity()
        )).collect(Collectors.toList());
    }

}
