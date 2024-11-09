package com.optistock.users.controllers.impl;

import com.optistock.users.controllers.IUsersController;
import com.optistock.users.dtos.UserEntryDTO;
import com.optistock.users.dtos.UserExitDTO;
import com.optistock.users.services.IUsersServices;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("users")
public class UsersController implements IUsersController {

    private final IUsersServices iUsersServices;

    public UsersController(IUsersServices iUsersServices) {
        this.iUsersServices = iUsersServices;
    }


    @Override
    @PostMapping("/access")
    public UserExitDTO loginUser(String email, String password) {
        return iUsersServices.loginUser(email, password);
    }

    @Override
    @PostMapping()
    public void createUser(UserEntryDTO userDTO) {
         iUsersServices.createUser(userDTO);
    }

    @Override
    @PutMapping()
    public UserExitDTO updateUser(UserEntryDTO userEntryDTO) {
        return iUsersServices.updateUser(userEntryDTO);
    }

    @Override
    @DeleteMapping
    public void deleteUser(String id) {
        iUsersServices.deleteUser(id);
    }
}
