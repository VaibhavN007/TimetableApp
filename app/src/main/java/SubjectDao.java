import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

/**
 * Created by viabhav on 19/2/18.
 */

@Dao
public interface SubjectDao {
    @Query("SELECT * FROM Subject WHERE dept_name = dept")
    public Subject[] getDeptWiseSubjects(String dept);

    @Insert
    public void insertSubject(Subject subject);
}
