package com.example.databasemvp.database.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.example.databasemvp.database.entity.Person;

import java.util.List;

@Dao
public interface PersonDao {
    @Insert
    Void insertperson(Person person);

    @Update
    Void update(Person person);

    @Delete
    Void delete(Person person);

    @Query("SELECT * FROM person")
    List<Person> getAll();

    @Query("SELECT * FROM person WHERE id=id")
    Person findperson(long id);
}
