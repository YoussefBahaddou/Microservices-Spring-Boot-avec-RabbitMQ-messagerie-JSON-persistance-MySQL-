package oussama.microservices.messagingconsumer.repository;

import oussama.microservices.messagingconsumer.domain.User;
import org.springframework.dataInfo.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> 
{
}
