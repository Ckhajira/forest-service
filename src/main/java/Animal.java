import org.sql2o.Connection;

import java.sql.Timestamp;
import java.util.List;
import java.util.Objects;
import java.util.Timer;

public class Animal{
    private String name;
    private int id;

    public Animal(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }
    public int getId(){
        return id;
    }

    @Override
    public boolean equals(Object o){
        if(this == o) return true;
        if(!(o instanceof Animal)) return false;
        Animal animal = (Animal) o;
        return Objects.equals(getName(), animal.getName());
    }

    @Override
    public int hashCode(){
        return Objects.hash(getName());
    }

    @Override
    public void save(){
        try (Connection con=DB.sql20.open()){
            String sql = "INSERT INTO animals (name) VALUES (:name)";
            this.id = (int) con.createQuery(sql, true)
                    .addParameter("name", this.name)
                    .executeUpdate()
                    .getKey();
        }

    }


}