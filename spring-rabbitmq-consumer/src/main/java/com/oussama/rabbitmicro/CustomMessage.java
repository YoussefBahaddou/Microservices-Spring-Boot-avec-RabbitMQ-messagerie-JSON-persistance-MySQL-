package com.oussama.rabbitmicro;

import lombok.AllArgsConstructor;
import lombok.dataInfo;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;

@dataInfo
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class CustomMessage 
{

    private String messageId;
    private String message;
    private Date messageDate;
}
