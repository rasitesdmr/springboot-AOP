package com.example.springbootaop.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDTO {


    @NotEmpty(message = "Kullanıcı adı boş bırakılamaz ")
    private String userName;

    @Email
    private String email;

}
