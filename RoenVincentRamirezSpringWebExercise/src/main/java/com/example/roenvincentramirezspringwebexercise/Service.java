package com.example.roenvincentramirezspringwebexercise;

@org.springframework.stereotype.Service
public class Service {

    public String getUser(User userParam){
        User user = new User();
        user.setFirstName(userParam.getFirstName());
        user.setLastName(userParam.getLastName());
        user.setEmail(userParam.getEmail());
        user.setAddress(userParam.getAddress());

        String returnValue = user.getFirstName() + user.getLastName() + user.getEmail() + user.getAddress();

        return returnValue;
    }
}
