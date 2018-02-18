import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

/**
 * Created by viabhav on 19/2/18.
 */

@Entity
public class Subject {
    @PrimaryKey
    public int id;

    public String subject_name;
    public String dept_name;
    public String subject_type;
}
