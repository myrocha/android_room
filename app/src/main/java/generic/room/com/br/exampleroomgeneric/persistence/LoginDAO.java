package generic.room.com.br.exampleroomgeneric.persistence;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Query;

import java.util.List;

import generic.room.com.br.exampleroomgeneric.entity.Login;

@Dao
public interface LoginDAO extends BasicDAO<Login> {
    @Query("SELECT * FROM Login")
    public abstract List<Login> getAll();

    @Query("SELECT * FROM Login WHERE id IN (:responseLoginId)")
    public abstract List<Login> getById(int[] responseLoginId);



}