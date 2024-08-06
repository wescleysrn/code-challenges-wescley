package com.iamandu.codechallenger.problems.mgm.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Builder
@Getter
@Setter
public class ResultDTO implements Serializable {

    private int partitionKey;

    private float totalPrice;

}
