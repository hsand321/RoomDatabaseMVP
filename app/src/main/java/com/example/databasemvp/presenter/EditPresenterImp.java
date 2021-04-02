package com.example.databasemvp.presenter;

import android.view.View;

import com.example.databasemvp.database.dao.PersonDao;
import com.example.databasemvp.database.entity.Person;
import com.example.databasemvp.utils.Constants;
import com.example.databasemvp.utils.Util;

public class EditPresenterImp implements EditPresenter{

    private final EditView view;
    private final PersonDao personDao;

    public EditPresenterImp(EditView view, PersonDao personDao) {
        this.view = view;
        this.personDao = personDao;
    }

    @Override
    public void save(Person person) {
        this.personDao.insertperson(person);
    }

    @Override
    public boolean validate(Person person) {
        if(person.getName().isEmpty()|| !Util.isValidName(person.getName())){
            view.showErrorMassage(Constants.ID_NAME);
            return false;
        }
        if(person.getAddress().isEmpty()){
            view.showErrorMassage(Constants.ID_ADDRESS);
            return false;
        }
        if(person.getPhone().isEmpty()|| !Util.isValidPhone(person.getPhone())){
            view.showErrorMassage(Constants.ID_PHONE);
            return false;
        }
        if(person.getEmail().isEmpty()|| !Util.isValidEmail(person.getEmail())){
            view.showErrorMassage(Constants.ID_EMAIL);
            return false;
        }
        return true;
    }

    @Override
    public Void getPerson(long id) {
        return null;
    }

    @Override
    public Void update(Person person) {
        return null;
    }
}
