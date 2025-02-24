package com.jpdev.junit5.business;

public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User getUserFromDataBase(String userId) {
        User userDetail = userRepository.getUser(userId);
        if (userDetail.getUserId().equals(userId)) {
            return userDetail;
        }
        throw new RuntimeException("User is not found");
    }
}
