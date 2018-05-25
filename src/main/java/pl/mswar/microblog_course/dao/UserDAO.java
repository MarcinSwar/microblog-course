package pl.mswar.microblog_course.dao;

import pl.mswar.microblog_course.model.User;

public interface UserDAO {
    void saveNewUser(User user);
    boolean checkIfUserExists(User user);
    void deleteUser(User user);
    void updateUser(User user);
}
