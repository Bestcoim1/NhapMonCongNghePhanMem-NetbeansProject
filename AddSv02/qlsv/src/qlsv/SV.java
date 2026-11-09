package qlsv;

public class SV {

    private String masv;
    private String hodem;
    private String tensv;
    private String telsv;
    private String emailsv;

    public SV(String maSV, String hoDem, String tenSV,
              String telSV, String emailSV) {

        this.masv = maSV;
        this.hodem = hoDem;
        this.tensv = tenSV;
        this.telsv = telSV;
        this.emailsv = emailSV;
    }

    public String getMaSV() {
        return masv;
    }

    public String getHodem() {
        return hodem;
    }

    public String getTenSV() {
        return tensv;
    }

    public String getTelSV() {
        return telsv;
    }

    public String getEmailSV() {
        return emailsv;
    }

    public void setMaSV(String masv) {
        this.masv = masv;
    }

    public void setHodem(String hodem) {
        this.hodem = hodem;
    }

    public void setTenSV(String tensv) {
        this.tensv = tensv;
    }

    public void setTelSV(String telsv) {
        this.telsv = telsv;
    }

    public void setEmailSV(String emailsv) {
        this.emailsv = emailsv;
    }
}