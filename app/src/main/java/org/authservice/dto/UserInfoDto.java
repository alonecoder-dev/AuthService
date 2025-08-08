package org.authservice.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;
import java.util.UUID;

// This is the correct blueprint for the message we will send to Kafka
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserInfoDto {
    private UUID userId;
    private String username; // This will be the user's email
    private String password; // The encrypted password
    private Set<Role> roles;
}