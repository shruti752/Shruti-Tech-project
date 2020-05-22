package com.shruti.teche.endtoend.project.ShrutiTechproject.Service;

import com.shruti.teche.endtoend.project.ShrutiTechproject.LoginRepository;
import com.shruti.teche.endtoend.project.ShrutiTechproject.Model.LoginData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class LoginService {
    @Autowired
    private LoginRepository loginRepository;
//    private List<LoginData> loginDataList =Arrays.asList(new LoginData("shruti2356","jfdhskj@t65"),
//                                                         new LoginData("sdfjsd764","hgddZ@865"));

    public List<LoginData> getAllLogin(){
        //return loginDataList;
        List<LoginData> logins = new ArrayList<>();
        loginRepository.findAll()
                .forEach(logins::add);
        return logins;
    }

    public LoginData getLogin(String userName){
       // return loginDataList.stream().filter(p->p.getUserName().equals(userName)).findFirst().get();
        return  loginRepository.findById(userName).get();
    }

    public void addData(LoginData loginData){
        loginRepository.save(loginData);
    }
    public void deleteData(String userName){
        loginRepository.deleteById(userName);
    }


}

