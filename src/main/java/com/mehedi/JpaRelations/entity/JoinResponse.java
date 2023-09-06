package com.mehedi.JpaRelations.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class JoinResponse {

    private Integer cid;
    private String cName;
    private String pName;
    private Integer price;


}
