package pengguna;

public class Mhs {
    private String Nama ;
    private String Nim ;
    private int Smt ;
    public String Username ;
    public String Password ;

    public Mhs (String arg_Username, String arg_Password){
        this.Username = arg_Username;
        this.Password = arg_Password;

    }
    
    public void setNama(String Nama){
        this.Nama = Nama;
    }

    public String getNama(){
        return this.Nama;
    }

    public void setNim(String Nim){
        this.Nim = Nim;
    }
    
    public String getNim(){
        return this.Nim;
    }

    public void setSmt(int Smt){
        this.Smt = Smt;
    }

    public int getSmt(){
        return this.Smt;
    }

    public String getUsername(){
        return this.Username;
    }

    public String getPassword(){
        return this.Password;
}
}
