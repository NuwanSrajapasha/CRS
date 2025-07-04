/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dto;

/**
 *
 * @author HP
 */
public class UserDto {
    private String userId;
    private String userName;
    private String password;

    public UserDto(String userId, String userName, String password) {
        this.userId = userId;
        this.userName = userName;
        this.password = password;
    }

    public String getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public String getRole(){
        if(userId.startsWith("S")) return "student";
        if(userId.startsWith("F")) return "faculty";
        if(userId.startsWith("A")) return "admin";
        return "unknown";
    }
    
    
    
}
