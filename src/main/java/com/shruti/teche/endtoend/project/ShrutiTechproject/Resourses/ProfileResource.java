package com.shruti.teche.endtoend.project.ShrutiTechproject.Resourses;

import com.shruti.teche.endtoend.project.ShrutiTechproject.DataNotFoundException;
import com.shruti.teche.endtoend.project.ShrutiTechproject.Model.CreateProfile;
import com.shruti.teche.endtoend.project.ShrutiTechproject.Service.CreateProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@ControllerAdvice
public class ProfileResource {
    @Autowired
    private CreateProfileService createProfileService;

    @RequestMapping("/createprofile")
    public List<CreateProfile> getAllData(){
        return createProfileService.getAllData();
    }

    @RequestMapping("/createprofile/{username}")
    public CreateProfile getProfile(@PathVariable("username") String userName) {
      //  CreateProfile profile = createProfileService.getProfile(userName);
        return createProfileService.getProfile(userName);
    }

    @RequestMapping(method = RequestMethod.POST,value = "/createprofile")
    public void addProfile(@RequestBody CreateProfile createProfile){
        createProfileService.addProfile(createProfile);
    }

    @RequestMapping(method=RequestMethod.PUT,value = "/createprofile/{username}")
    public void  updateProfile(@PathVariable("username") String userName, @RequestBody CreateProfile createProfile){
        if(createProfile.getUserName().equals(userName)) {
            createProfileService.updateProfile(userName, createProfile);
        }
        else{
            throw new DataNotFoundException("username not exist " + userName);
        }
    }

    @RequestMapping(method = RequestMethod.DELETE,value = "/createprofile/{username}")
    public void deleteProfile(@PathVariable("username") String userName){
            createProfileService.deleteProfile(userName);
        }


}
