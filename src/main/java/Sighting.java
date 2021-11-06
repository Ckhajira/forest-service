import org.sql2o.Connection;

import java.sql.Timestamp;

import java.util.List;
import java.util.Objects;
public class Sighting{
    private int id;
    private int animalId;
    private String rangerName;
    private String location;
    private Timestamp lastSighting;

    public Sighting(int animalId, String location, String rangerName){
        this.animalId = animalId;
        this.location = location;
        this.rangerName = rangerName;
    }
}