package cl.curso.atenciones_service.model;

public class Patient {
    private final long idPatient;
    private final String namePatient;
    private final String lastNamePatient;
    private final String rutPatient;
    private final String emailPatient;
    private final String phonePatient;
    private final String addressPatient;
    private final String cityPatient;
    private final String regionPatient;
    private final String previsionPatient;
    private final String birthDatePatient;
    private final String emergencyContactPatient;

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
