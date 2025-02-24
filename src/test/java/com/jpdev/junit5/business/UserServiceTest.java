package com.jpdev.junit5.business;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class UserServiceTest {

    @InjectMocks
    private UserServiceImpl userService;

    @Mock
    private UserRepository userRepository;

    @DisplayName("Return User when password is right")
    @Test
    void returnUserWhenPasswordIsRight() {
        User userStub = new User("Hector");
        when(userRepository.getUser(Mockito.anyString())).thenReturn(userStub);

        User user = userService.getUserFromDataBase("Hector");

        assertEquals("abc123.", user.getPassword());
    }

    // verb + SUBJECT + when + Condition + And + ...
    @DisplayName("Throw Exception when user is not found")
    @Test
    void throwExceptionWhenUserIsNotFound() {
        User userStub = new User("Hector");
        when(userRepository.getUser(Mockito.anyString())).thenReturn(userStub);

        assertThrows(RuntimeException.class, () -> userService.getUserFromDataBase("Pepe"));
    }


}
