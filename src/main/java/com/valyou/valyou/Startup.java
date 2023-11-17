package com.valyou.valyou;

import com.valyou.valyou.user.Address;
import com.valyou.valyou.user.Role;
import com.valyou.valyou.user.Users;
import com.valyou.valyou.user.AddressRepository;
import com.valyou.valyou.user.RoleRepository;
import com.valyou.valyou.user.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.Collection;

@Slf4j
@Configuration
@ConditionalOnProperty(prefix = "database", name = "seed", havingValue = "true")
public class Startup {

    Role investorRole = new Role("Investor", "Investor account");
    Role artistRole = new Role("Artist", "Artist account");
    Role businessRole = new Role("Business", "Business account");
    Role adminRole = new Role("Admin", "Admin account");
    Address adminAddress = new Address("+251947736471", "emanaeyasu77@gmail.com", "Addis Ababa", "Bole Mechael", "03", "457");
    Users adminUser = new Users("@admin", "admin@gmail.com", "@admin123", "+251947736471", investorRole);
    Collection<Role> roles = new ArrayList<>();

    void setUp() {
        roles.add(investorRole);
        roles.add(artistRole);
        roles.add(businessRole);
        roles.add(adminRole);
        adminUser.setRole(adminRole);
        adminUser.setAddress(adminAddress);
    }

    @Bean
    CommandLineRunner initDatabase(UserRepository userRepository, RoleRepository roleRepository, AddressRepository addressRepository) {
        setUp();
        return args -> {
            log.info("Preloading " + roleRepository.saveAll(roles));
            log.info("Preloading " + userRepository.save(adminUser));
        };
    }
}
