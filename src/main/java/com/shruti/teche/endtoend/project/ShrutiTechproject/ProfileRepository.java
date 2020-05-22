package com.shruti.teche.endtoend.project.ShrutiTechproject;

import com.shruti.teche.endtoend.project.ShrutiTechproject.Model.CreateProfile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface ProfileRepository extends CrudRepository<CreateProfile,String> {
}
