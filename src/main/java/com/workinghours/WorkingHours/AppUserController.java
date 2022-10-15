package com.workinghours.WorkingHours;

import com.workinghours.WorkingHours.model.AppUser;
import com.workinghours.WorkingHours.model.AppUserRepository;
import com.workinghours.WorkingHours.model.WorkingDay;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AppUserController {
    @Autowired
    AppUserRepository appUserRepository;

    @GetMapping("/listAppUsers")
    @ResponseBody
    String listAllUsers() {
        AppUser user1 = new AppUser();
        user1.setFirstName("Dario");
        user1.setLastName("Marić");
        user1.setEmail("dario.maric@gmail.com");
        appUserRepository.save(user1);

        AppUser user2 = new AppUser();
        user2.setFirstName("Ivica");
        user2.setLastName("Ivić");
        user2.setEmail("ivica.ivic@gmail.com");
        appUserRepository.save(user2);


        return appUserRepository.findAll().toString();
    }

    @GetMapping("/listWorkingDays")
    @ResponseBody
    String listAllWorknigDays(long appUserId) {
        WorkingDay day1 = new WorkingDay();

        return "";
    }
}
