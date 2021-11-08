import org.sql2o.Connection;
import org.sql2o.Sql2oException;

public interface DatabaseInterfaces{
    boolean equals(Object otherObject);

    void save();

    public static void clearAllAnimals() {
        String sql = "DELETE FROM animals";
        try (Connection con = DB.sql2o.open()) {
            con.createQuery(sql)
                    .executeUpdate();
        } catch (Sql2oException ex) {
            System.out.println(ex);
        }
    }
}