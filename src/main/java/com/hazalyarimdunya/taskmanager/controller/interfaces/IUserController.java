package com.hazalyarimdunya.taskmanager.controller.interfaces;

import com.hazalyarimdunya.taskmanager.entity.User;

import java.util.List;

public interface IUserController {
    public User saveUser(User user); //Dışarıdan bir User alıyor (yeni kayıt edilmek istenen kullanıcı bilgileriyle).Onu DB’ye kaydedip, responseta geri User nesnesi döndürüyor (genellikle id veya createdAt gibi ek bilgilerle).
    public List<User> getAllUsers();
    public User getUserById(Integer userId);

}
