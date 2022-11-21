package com.luv2code.springdemo.mvc;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Getter
@Setter
@NoArgsConstructor
public class Customer
{
    private String firstName;

    @NotNull(message="is required")
    @Size(min=1,message="is required")
    private String lastName;

}
