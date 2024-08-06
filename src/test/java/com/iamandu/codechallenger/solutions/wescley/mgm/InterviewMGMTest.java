package com.iamandu.codechallenger.solutions.wescley.mgm;

import com.iamandu.codechallenger.problems.mgm.InterviewMGM;
import com.iamandu.codechallenger.problems.mgm.dto.ListDTO;
import com.iamandu.codechallenger.problems.mgm.dto.ResultDTO;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.List;

@SpringBootTest
public class InterviewMGMTest {

    @Autowired
    private InterviewMGM InterviewMGM;

    @Test
    public void executeTest() {
        List<ListDTO> listDataBase = Arrays.asList(
            ListDTO.builder().id(20).price(10.0f).build(),
            ListDTO.builder().id(21).price(1.39f).build(),
            ListDTO.builder().id(4).price(30.11f).build(),
            ListDTO.builder().id(11).price(4.68f).build()
        );
        List<ResultDTO> result2 = InterviewMGM.partitionListDataBase(listDataBase, 2);
        Assertions.assertThat(result2).isNotEmpty();
        Assertions.assertThat(result2.get(0).getTotalPrice()).isEqualTo(40.11f);
        Assertions.assertThat(result2.get(1).getTotalPrice()).isEqualTo(6.0699997f); // Not exact to 6.07

        List<ResultDTO> result3 = InterviewMGM.partitionListDataBase(listDataBase, 3);
        Assertions.assertThat(result3).isNotEmpty();
        Assertions.assertThat(result3.get(0).getTotalPrice()).isEqualTo(1.39f);
        Assertions.assertThat(result3.get(1).getTotalPrice()).isEqualTo(30.11f);
        Assertions.assertThat(result3.get(2).getTotalPrice()).isEqualTo(14.68f);

    }


}
