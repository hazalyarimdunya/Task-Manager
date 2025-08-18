package com.hazalyarimdunya.taskmanager.repository;

import com.hazalyarimdunya.taskmanager.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserRepository extends JpaRepository<User, Integer> { //User:Uzerinde calisilacak entity class.Integer:Entitydeki @Id type.
    //JpaRepository = Hibernet ile geliyor. Crud islemlerini yapan metotlari iceriyor. bu metotlar extend edildi.
}
