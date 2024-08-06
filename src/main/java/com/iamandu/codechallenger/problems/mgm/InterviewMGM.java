package com.iamandu.codechallenger.problems.mgm;

import com.iamandu.codechallenger.problems.mgm.dto.ListDTO;
import com.iamandu.codechallenger.problems.mgm.dto.ResultDTO;

import java.util.List;

public interface InterviewMGM {

    /**
     A database is partitioned by the id field mod n, where n is a configurable positive non-zero integer and id is a positive non-zero integer.

     A batch of items is retrieved from the database. Given this data as a list/array of objects in the format: {id: int, price: float},

     create a list/array of the sum of prices from each partition where the objects in this list are in this format:

     { partitionKey: int, totalPrice: float }.
     Example: Given

//     [{id: 20, price: 10.0}, {id: 21, price: 1.39}, {id: 4, price: 30.11}, {id: 11, price: 4.68}]

     where n = 2, the result should be:

     [{partitionKey: 0, totalPrice: 40.11}, {partitionKey: 1, totalPrice: 6.07}].

     If n = 3 then the result should be:

     [{partitionKey: 0, totalPrice: 1.39 }, {partitionKey: 1, totalPrice: 30.11 }, {partitionKey: 2, totalPrice: 14.68 }]
     */

    List<ResultDTO> partitionListDataBase(List<ListDTO> listDataBase, int dividor);

}
