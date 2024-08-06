package com.iamandu.codechallenger.solutions.wescley.mgm;

import com.iamandu.codechallenger.problems.mgm.InterviewMGM;
import com.iamandu.codechallenger.problems.mgm.dto.ListDTO;
import com.iamandu.codechallenger.problems.mgm.dto.ResultDTO;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class InterviewMGMImpl implements InterviewMGM {

    @Override
    public List<ResultDTO> partitionListDataBase(List<ListDTO> listDataBase, int dividor) {

        Map<Integer, Float> mapResult = new HashMap<>();

        // Calculate the total Price per Key partition
        listDataBase.forEach(
            item -> {
                int partitionKey = item.getId() % dividor;
                mapResult.merge(partitionKey, item.getPrice(), Float::sum); // Better
                /*
                First approach
                if(mapResult.containsKey(partitionKey)) {
                    float newValue = mapResult.get(partitionKey) + item.getPrice();
                    mapResult.replace(partitionKey, newValue);
                } else {
                    mapResult.put(partitionKey, item.getPrice());
                }
                */
            }
        );

        // Transforms the map into a list of ResultDTO
        List<ResultDTO> result = new ArrayList<>();
        for (Map.Entry<Integer, Float> entry : mapResult.entrySet()) {
            ResultDTO dto = ResultDTO.builder()
                    .partitionKey(entry.getKey())
                    .totalPrice(entry.getValue())
                    .build();
            result.add(dto);
        }

        return result;
    }

}
