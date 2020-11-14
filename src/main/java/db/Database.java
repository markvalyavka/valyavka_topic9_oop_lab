package db;

public class Database extends БазаДаних {
    private БазаДаних db;
    public Database(БазаДаних db) {
        this.db = db;
    }

    public String отриматиДаніКористувача() {
        return db.отриматиДаніКористувача();
    }

    public String отриматиСтатистичніДані() {
        return db.отриматиСтатистичніДані();
    }

    public String getUserData() {
        return db.отриматиДаніКористувача();
    }

    public String getStatisticalData() {
        return db.отриматиСтатистичніДані();
    }
}
