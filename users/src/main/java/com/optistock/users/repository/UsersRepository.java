package com.optistock.users.repository;

import com.optistock.users.commons.exceptions.AlreadyExistsException;
import com.optistock.users.models.User;

import java.util.Optional;

public interface UsersRepository extends BaseMongoRepository<User, String> {

    Optional<User> findById(String id);

    Optional<User> findByEmail(String email);


    default User findByEmailOrException(String email) {
        return findByElementOrThrow(findByEmail(email), "email", email);
    }

    default User findByIdOrException(String id) {
        return findByElementOrThrow(findById(id), "users", id);
    }

    default User saveIfNotExists(User user) {
        saveIfNotExists(findById(user.getId()), "users", user.getId());
        return save(user);
    }
}
