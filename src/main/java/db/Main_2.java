package db;

public class Main_2 {
    public static void main(String[] args) {
        Database db = new Database(new БазаДаних());
        Авторизація авторизація = new Авторизація();
        if (авторизація.авторизуватися(db)) {
            ReportBuilder br = new ReportBuilder(db);
        }
    }
}
