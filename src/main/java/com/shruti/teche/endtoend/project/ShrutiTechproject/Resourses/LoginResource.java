package com.shruti.teche.endtoend.project.ShrutiTechproject.Resourses;

import com.shruti.teche.endtoend.project.ShrutiTechproject.Model.LoginData;
import com.shruti.teche.endtoend.project.ShrutiTechproject.Service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class LoginResource {
    @Autowired
    private LoginService loginService;

    @RequestMapping("/login")
    public List<LoginData> getAllLogin(){
        return loginService.getAllLogin();
    }

    @RequestMapping("/login/{username}")
    public LoginData getLogin(@PathVariable("username") String userName){
        return loginService.getLogin(userName);
    }

    @RequestMapping(method = RequestMethod.POST,value ="/login")
    public void addData(@RequestBody LoginData loginData){
        loginService.addData(loginData);
    }

    @RequestMapping(method = RequestMethod.DELETE,value = "/login/{username}")
    public void deleteData(@PathVariable("username") String userName){
        loginService.deleteData(userName);
    }

}
