package com.sh.timeslot.model.request;

import lombok.*;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class BranchRequest {
    private Long id ;
    private String name ;
}
