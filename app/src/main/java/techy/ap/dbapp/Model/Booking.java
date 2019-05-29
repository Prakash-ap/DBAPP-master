package techy.ap.dbapp.Model;

public class Booking {
    private int id;
    private String docsname;
    private String patname;
    private String phonenumber;
    private String date;
    private String time;

    public Booking(int id, String docsname, String patname,String phonenumber, String date, String time) {
        this.id = id;
        this.docsname = docsname;
        this.patname = patname;
        this.phonenumber = phonenumber;
        this.date = date;
        this.time = time;
    }

    public Booking() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDocsname() {
        return docsname;
    }

    public void setDocsname(String docsname) {
        this.docsname = docsname;
    }

    public String getPatname() {
        return patname;
    }

    public void setPatname(String patname) {
        this.patname = patname;
    }


    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
