package generic.room.com.br.exampleroomgeneric.persistence;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.OnConflictStrategy;
import android.arch.persistence.room.Update;

@Dao
public interface BasicDAO<T> {
    @Insert(onConflict = OnConflictStrategy.REPLACE)

    void insertAll(T object);

    @Update
    void update(T object);


    @Delete
    void delete(T object);
}
