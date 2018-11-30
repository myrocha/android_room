package generic.room.com.br.exampleroomgeneric.persistence;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.Room;
import android.arch.persistence.room.RoomDatabase;
import android.content.Context;

import generic.room.com.br.exampleroomgeneric.entity.Login;


@Database(entities = {Login.class}, version = 1, exportSchema = false)
public abstract class AppDatabase extends RoomDatabase {
    private static AppDatabase mAppDatabase;

    public abstract LoginDAO loginDAO();

    public static AppDatabase getAppDatabase(Context context) {
        if (mAppDatabase == null) {
            mAppDatabase =
                    Room.databaseBuilder(context.getApplicationContext(), AppDatabase.class, "database_room")
                            .fallbackToDestructiveMigration()
                            .build();
        }
        return mAppDatabase;
    }


}


