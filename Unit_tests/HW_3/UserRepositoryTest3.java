package HW_3;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class UserRepositoryTest3 {
    @Test
    public void testLogoutNonAdminUsers() {
        UserRepository userRepository = new UserRepository();
        User adminUser = new User("admin", true);
        User nonAdminUser1 = new User("user1", false);
        User nonAdminUser2 = new User("user2", false);

        userRepository.addUser(adminUser);
        userRepository.addUser(nonAdminUser1);
        userRepository.addUser(nonAdminUser2);

        userRepository.logoutNonAdminUsers();

        assertTrue(adminUser.isLoggedIn());
        assertFalse(nonAdminUser1.isLoggedIn());
        assertFalse(nonAdminUser2.isLoggedIn());
    }
}
