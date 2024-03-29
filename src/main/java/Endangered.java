import org.sql2o.Connection;
import org.sql2o.Sql2oException;

import java.sql.Timestamp;
import java.util.List;
import java.util.Objects;
import java.util.Timer;



public class Endangered  implements DatabaseInterfaces{

        private int id;
        private String name;
        private String danger;
        private final String health;
        private final String age;
        private String location;
        private String ranger;
        private Timestamp created;


    public Endangered(String name, String danger, String health, String age, String location, String ranger) {
        this.name = name;
        this.danger = danger;
        this.health = health;
        this.age = age;
        this.location = location;
        this.ranger = ranger;
        created = getCreated();


    }

    public String getName() {
        return name;
    }

    public String getDanger() {
        return danger;
    }

    public String getHealth() {
        return health;
    }

    public String getAge() {
        return age;
    }

    public String getLocation() {
        return location;
    }

    public String getRanger() {
        return ranger;
    }

    public Timestamp getCreated(){ return created;}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Endangered)) return false;
        Endangered that = (Endangered) o;
        return getId() == that.getId() &&
                Objects.equals(getName(), that.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getId());
    }

    public int getId() {
        return id;
    }

    @Override
    public void save() {
        try (Connection con = DB.sql2o.open()) {
            String sql = "INSERT INTO animals (name, danger, health, age, location, ranger, created) VALUES (:name, :danger, :health, :age, :location, :ranger, now())";
            this.id = (int) con.createQuery(sql, true)
                    .addParameter("name", this.name)
                    .addParameter("danger", this.danger)
                    .addParameter("health", this.health)
                    .addParameter("age", this.age)
                    .addParameter("location", this.location)
                    .addParameter("ranger", this.ranger)

                    .executeUpdate()
                    .getKey();
        }
    }

    public static List<Endangered> all() {
        try (Connection con = DB.sql2o.open()) {
            String sql = "SELECT * FROM animals";
            return con.createQuery(sql)
                    .executeAndFetch(Endangered.class);
        }
    }

    public static Endangered find(int id) {
        try (Connection con = DB.sql2o.open()) {
            String sql = "SELECT * FROM animals WHERE id= :id";
            return con.createQuery(sql)
                    .addParameter("id", id)
                    .executeAndFetchFirst(Endangered.class);
        }
    }

    public List<Sighting> getSightings() {
        try (Connection con = DB.sql2o.open()) {
            String sql = "SELECT * FROM sightings WHERE animalId=:id";
            return con.createQuery(sql)
                    .addParameter("id", this.id)
                    .executeAndFetch(Sighting.class);
        }
    }

    public List<Endangered> getTime() {
        try (Connection con = DB.sql2o.open()) {
            String sql = "SELECT created FROM animals";
            return con.createQuery(sql)
                    .executeAndFetch(Endangered.class);
        }
    }


}