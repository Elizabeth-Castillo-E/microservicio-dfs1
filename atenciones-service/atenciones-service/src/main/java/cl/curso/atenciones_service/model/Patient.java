package cl.curso.atenciones_service.model;

public class Patient {
    private long idPatient;
    private String namePatient;
    private String lastNamePatient;
    private String rutPatient;
    private String emailPatient;
    private String phonePatient;
    private String addressPatient;
    private String cityPatient;
    private String regionPatient;
    private String previsionPatient;
    private String birthDatePatient;
    private String emergencyContactPatient;

    public Patient(long idPatient, String namePatient, String lastNamePatient, String rutPatient, String emailPatient, String phonePatient, String addressPatient, String cityPatient, String regionPatient, String previsionPatient, String birthDatePatient, String emergencyContactPatient) {
        this.idPatient = idPatient;
        this.namePatient = namePatient;
        this.lastNamePatient = lastNamePatient;
        this.rutPatient = rutPatient;
        this.emailPatient = emailPatient;
        this.phonePatient = phonePatient;
        this.addressPatient = addressPatient;
        this.cityPatient = cityPatient;
        this.regionPatient = regionPatient;
        this.previsionPatient = previsionPatient;
        this.birthDatePatient = birthDatePatient;
        this.emergencyContactPatient = emergencyContactPatient;
    }

    public long getIdPatient() {
        return idPatient;
    }

    public String getNamePatient() {
        return namePatient;
    }
    public String getLastNamePatient() {
        return lastNamePatient;
    }
    public String getRutPatient() {
        return rutPatient;
    }
    public String getEmailPatient() {
        return emailPatient;
    }
    public String getPhonePatient() {
        return phonePatient;
    }
    public String getAddressPatient() {
        return addressPatient;
    }
    public String getCityPatient() {
        return cityPatient;
    }
    public String getRegionPatient() {
        return regionPatient;
    }
    public String getPrevisionPatient() {
        return previsionPatient;
    }
    public String getBirthDatePatient() {
        return birthDatePatient;
    }
    public String getEmergencyContactPatient() {
        return emergencyContactPatient;
    }
    

}
