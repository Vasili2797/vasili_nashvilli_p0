//package userService;
/*

public class UserService {

    private final AppUser userDAO ;
    private AppUser sessionUser;

    public UserService(AppUser userDAO) {
        this.userDAO = userDAO;
        this.sessionUser = null;
    }

    public AppUser getSessionUser() {
        return sessionUser;
    }

    public boolean registerNewUser(AppUser newUser) {

        if (!isUserValid(newUser)) {
            throw new InvalidRequestException("Invalid user data provided!");
        }

        boolean usernameAvailable = userDAO.findUserByUsername(newUser.getUsername()) == null;
        boolean emailAvailable = userDAO.findUserByEmail(newUser.getEmail()) == null;

        if (!usernameAvailable || !emailAvailable) {
//            if (!usernameAvailable && emailAvailable) {
//                throw new ResourcePersistenceException("The provided username was already taken in the datasource!");
//            } else if (usernameAvailable) {
//                throw new ResourcePersistenceException("The provided email was already taken in the datasource!");
//            } else {
//                throw new ResourcePersistenceException("The provided username and email was already taken in the datasource!");
//            }
            String msg = "The values provided for the following fields are already taken by other users:";
            if (!usernameAvailable) msg = msg + "\n\t- username";
            if (!emailAvailable) msg = msg + "\n\t- email";
            throw new ResourcePersistenceException(msg);
        }

        AppUser registeredUser = userDAO.save(newUser);

        if (registeredUser == null) {
            throw new ResourcePersistenceException("The user could not be persisted to the datasource!");
        }

        return true;

    }

    public void authenticateUser(String username, String password) {

        if (username == null || username.trim().equals("") || password == null || password.trim().equals("")) {
            throw new InvalidRequestException("Invalid credential values provided!");
        }

        AppUser authenticatedUser = userDAO.findUserByUsernameAndPassword(username, password);

        if (authenticatedUser == null) {
            throw new AuthenticationException();
        }

        sessionUser = authenticatedUser;

    }

    public void logout() {
        sessionUser = null;
    }

    public boolean isSessionActive() {
        return sessionUser != null;
    }

    public boolean isUserValid(AppUser user) {
        if (user == null) return false;
        if (user.getFirstName() == null || user.getFirstName().trim().equals("")) return false;
        if (user.getLastName() == null || user.getLastName().trim().equals("")) return false;
        if (user.getEmail() == null || user.getEmail().trim().equals("")) return false;
        if (user.getUsername() == null || user.getUsername().trim().equals("")) return false;
        return user.getPassword() != null && !user.getPassword().trim().equals("");
    }

}
*/