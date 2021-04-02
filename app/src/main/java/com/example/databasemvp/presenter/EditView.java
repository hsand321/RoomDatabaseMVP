package com.example.databasemvp.presenter;

import com.example.databasemvp.database.entity.Person;

public interface EditView {

    Void showErrorMassage(int id);

    Void clearPreError();

    Void populate(Person person);
}
