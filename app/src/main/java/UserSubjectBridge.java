import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.ForeignKey;

/**
 * Created by viabhav on 19/2/18.
 */

@Entity (foreignKeys = {
        @ForeignKey(
                entity = User.class,
                parentColumns = "id",
                childColumns = "student_ID"
        ),
        @ForeignKey(
                entity = Subject.class,
                parentColumns = "id",
                childColumns = "student_ID"
        )
})
public class UserSubjectBridge {
    @ColumnInfo (name = "student_ID")
    public int student_ID;
    @ColumnInfo (name = "subject_ID")
    public int subject_ID;
}
