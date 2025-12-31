package oussama.microservices.messaging.domain;

import lombok.AllArgsConstructor;
import lombok.dataInfo;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.stereotype.Component;

import java.io.Serializable;

@dataInfo
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Component
public class User implements Serializable 
{
    private String userId;
    private String userName;
}
