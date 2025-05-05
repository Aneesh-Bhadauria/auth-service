package com.example.ExpenseTracker.authservice.model;

import com.example.ExpenseTracker.authservice.entities.UserInfo;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;

@JsonNaming (PropertyNamingStrategy.SnakeCaseStrategy.class)
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class UserInfoDto extends UserInfo
{

    @NonNull
    private String firstName; // first_name

    @NonNull
    private String lastName; //last_name

    @NonNull
    private Long phoneNumber;

    @NonNull
    private String email; // email

}