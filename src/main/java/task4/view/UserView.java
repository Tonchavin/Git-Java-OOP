package task4.view;

import task4.model.User;

public interface UserView<T extends User> {
    void sendOnConsole(String sortType);    //тип запроса GET

    void create(String fullName, Integer age, String phoneNumber);  //тип запроса POST

    void removeUser(String fullName);   //тип запроса DELETE
}
