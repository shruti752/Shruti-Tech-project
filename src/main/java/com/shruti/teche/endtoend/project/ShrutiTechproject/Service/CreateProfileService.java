package com.shruti.teche.endtoend.project.ShrutiTechproject.Service;

import com.shruti.teche.endtoend.project.ShrutiTechproject.Model.CreateProfile;
import com.shruti.teche.endtoend.project.ShrutiTechproject.ProfileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CreateProfileService {
    @Autowired
    private ProfileRepository profileRepository;
//    private List<CreateProfile> profileList = new ArrayList<>(Arrays.asList(
//             new CreateProfile("shruti2345","fjjfgkj567@","shruti","shikha",997665677,"female","shrutishikha18@gmail.com"),
//             new CreateProfile("chhfghf56874","gfjhghj4342", "akash","singh",764467776,"male","shfdjf12gamil.com")
//        ));

    public List<CreateProfile> getAllData(){
        //return profileList;
        List<CreateProfile> profiles = new ArrayList<>();
        profileRepository.findAll()
                .forEach(profiles::add);
        return profiles;

    }

    public CreateProfile getProfile(String userName) {
        //return profileList.stream().filter(p->p.getUserName().equals(userName)).findFirst().get();
        CreateProfile createProfile = profileRepository.findById(userName).get();
        return createProfile;
    }

    public void addProfile(CreateProfile createProfile){
        //profileList.add(createProfile);
        profileRepository.save(createProfile);

    }

    public void updateProfile(String userName,CreateProfile createProfile){
//        for(int i = 0;i<profileList.size();i++){
//            CreateProfile createProfile1 = profileList.get(i);
//            if (createProfile1.getUserName().equals(userName)) {
//                profileList.set(i,createProfile);
//                return ;
//            }
//        }
        profileRepository.save(createProfile);
    }

    public void deleteProfile(String userName){
        //profileList.removeIf(p->p.getUserName().equals(userName));
        profileRepository.deleteById(userName);
    }
}
