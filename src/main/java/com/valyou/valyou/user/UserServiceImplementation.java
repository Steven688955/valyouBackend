package com.valyou.valyou.user;

import com.valyou.valyou.DTO.ResponseMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Service
public class UserServiceImplementation implements UserService {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    RoleRepository roleRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public ResponseEntity<?> createUser(CreateAccountRequest createAccountRequest) {

        Role role = roleRepository.findByRoleName(createAccountRequest.getRole().getRoleName());
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime dateCreated = LocalDateTime.now();
        String formattedDate = dateCreated.format(formatter);

        Users tempUser = new Users();
        Address address = new Address();
        tempUser.setUsername(createAccountRequest.getEmail());
        tempUser.setEmail(createAccountRequest.getEmail());
        tempUser.setCreatedAt(formattedDate);
        tempUser.setIsEnabled(true);
        tempUser.setImageUrl("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTKX4w51erNda2FGdWgY97ERaEC7kJBD88xvg&usqp=CAU");
        tempUser.setCoverImgUrl(createAccountRequest.getRole().getRoleName().equals("Investor") ? "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSSjodkbnbtmjZL-RBZIG7BGKOBS35BRL2g_Q&usqp=CAU" : "https://ibec.int/frontend/build/images/products/product-bg.jpg");
        tempUser.setPassword(new BCryptPasswordEncoder().encode(createAccountRequest.getPassword()));
        tempUser.setPhoneNumber(createAccountRequest.getPhoneNumber());
        tempUser.setRole(role);
        tempUser.setAddress(address);
        userRepository.save(tempUser);
        return new ResponseEntity<>(new ResponseMessage("success", "created"), HttpStatus.OK);
    }
}
