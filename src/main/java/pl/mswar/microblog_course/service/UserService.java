package pl.mswar.microblog_course.service;

import com.google.common.base.Preconditions;
import pl.mswar.microblog_course.dao.UserDAO;
import pl.mswar.microblog_course.model.RegistrationResult;
import pl.mswar.microblog_course.model.User;

public class UserService {
    private UserDAO userDAO;

    public UserService(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    public UserService() {
        // empty
    }

    public RegistrationResult registerNewUser(User newUser) {
        Preconditions.checkNotNull(newUser, "null!!!!");

        RegistrationResult result = RegistrationResult.REG_SUCCESS;

        if (userDAO.checkIfUserExists(newUser)) {
            return RegistrationResult.REG_USER_ALREADY_EXISTS;
        }


        return result;
    }
}
