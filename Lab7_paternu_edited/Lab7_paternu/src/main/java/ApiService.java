import com.google.gson.Gson;
import javax.inject.Inject;

public class ApiService {

    private final Gson gson;

    @Inject //Позначаємо конструктор як той, що підтримує ін’єкцію залежностей через Dagger
    public ApiService(Gson gson) {
        this.gson = gson; //Призначаємо переданий об'єкт Gson у приватне поле
    }

    public void fetchData() {
        String json = "{\"name\":\"Max\", \"age\":18}"; //JSON-рядок, який будемо десереалізовувати
        Person person = gson.fromJson(json, Person.class); //Перетворюємо JSON у Java-об'єкт типу Person
        System.out.println(person);
    }

    public static class Person { //Вкладений клас, який представляє модель даних з JSON
        String name;
        int age;

        @Override
        public String toString() {
            //Перевизначаємо метод toString для гарного виведення інформації про об'єкт
            return "Person{name='" + name + "', age=" + age + "}";
        }
    }
}
