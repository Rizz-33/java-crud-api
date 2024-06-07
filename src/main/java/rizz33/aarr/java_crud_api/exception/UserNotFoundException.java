package rizz33.aarr.java_crud_api.exception;

public class UserNotFoundException extends RuntimeException{
    public UserNotFoundException(Long id){
        super("Could not found the user with this id" + id);
    }
}
