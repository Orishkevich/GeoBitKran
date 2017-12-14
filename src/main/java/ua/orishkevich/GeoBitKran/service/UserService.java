package ua.orishkevich.GeoBitKran.service;

import ua.orishkevich.GeoBitKran.model.User;

/**
 * //TODO add comments
 *
 * @author orishkevich
 * @since 02.12.2017
 */
public interface UserService {
    public User findUserByEmail(String email);
    public void saveUser(User user);
}