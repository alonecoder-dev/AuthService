package org.authservice.model;

import org.authservice.entities.UserInfo;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

import lombok.Builder;

@JsonNaming (PropertyNamingStrategy.SnakeCaseStrategy.class)
@Builder
@lombok.NoArgsConstructor
@lombok.AllArgsConstructor
public class UserInfoDto extends UserInfo
{

    private String firstName; // first_name

    private String lastName; //last_name

    private Long phoneNumber;

    private String email; // email


}
