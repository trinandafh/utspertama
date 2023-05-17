import pengguna.User;
import pengguna.Mhs;

class Main {
    public static void main(String[] args) {

        Mhs mhs = new Mhs("ini_usename", "ini_password");

        mhs.setNama("Trinanda Fajri Hanifah");
        mhs.setNim("G.111.20.0014");
        mhs.setSmt(6);

        System.out.println("Nama Mahasiswa: " + mhs.getNama());
        System.out.println("Nim : " + mhs.getNim());
        System.out.println("Smt : " + mhs.getSmt());
        System.out.println("Username: " + mhs.getUsername());
        System.out.println("Password: " + mhs.getPassword());



    }
}