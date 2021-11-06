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
}