import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

/**
 * Created by viabhav on 19/2/18.
 */

@Entity
public class User {
    @PrimaryKey
    public int rollno;

    public String dept;
    public String yearOfStudy;
    public String collegeName;
    public String password;
}
