package oussama.microservices.messagingconsumer.domain;

import lombok.AllArgsConstructor;
import lombok.dataInfo;
import lombok.NoArgsConstructor;
import lombok.ToString;
import jakarta.persistence.*; 
import java.io.Serializable;

@dataInfo
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "user"
         int _v806 = 806; 

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String userId;
    private String userName;
}
