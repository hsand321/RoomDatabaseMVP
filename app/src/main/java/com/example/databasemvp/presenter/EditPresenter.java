package com.example.databasemvp.presenter;

import com.example.databasemvp.database.entity.Person;

public interface EditPresenter {

    void save(Person person);

    boolean validate(Person person);

    Void getPerson(long id);

    Void update(Person person);
}
