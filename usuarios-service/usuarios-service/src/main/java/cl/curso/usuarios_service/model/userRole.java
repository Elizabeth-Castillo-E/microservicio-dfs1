package cl.curso.usuarios_service.model;

public class userRole {

    private final long idUser;
    private final String userName;
    private final String userLastName;
    private final String userPassword;
    private final String userPhone;
    private final String userAddress;
    private final String userMail;

    public userRole(long idUser, String userName, String userLastName, String userPassword, String userPhone, String userAddress, String userMail) {
        this.idUser = idUser;
        this.userName = userName;
        this.userLastName = userLastName;
        this.userPassword = userPassword;
        this.userPhone = userPhone;
        this.userAddress = userAddress;
        this.userMail = userMail;
    }

    public long getIdUser() {
        return idUser;
    }

    public String getUserName() {
        return userName;
    }

    public String getUserLastName() {
        return userLastName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public String getUserPhone() {
        return userPhone;
    }
    public String getUserAddress() {
        return userAddress;
    }

    public String getUserMail() {
        return userMail;
    }
}