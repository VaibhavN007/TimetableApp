import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.OnConflictStrategy;

/**
 * Created by viabhav on 19/2/18.
 */

@Dao
public interface UserDao {
    @Insert(onConflict = OnConflictStrategy.FAIL)
    public void addUser(User user);

}
