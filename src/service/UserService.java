/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package service;

import dto.UserDto;

/**
 *
 * @author HP
 */
public interface UserService extends SuperService {
     UserDto login(String username, String password) throws Exception;
    
}
