import javax.inject.Inject;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        //Створення списку обладнання
        List<FootballEquipment> equipmentList = new ArrayList<>();

        //Створення менеджера для обробки обладнання
        FootballEquipmentManager manager = new FootballEquipmentManager(equipmentList);

        //Додавання нового обладнання
        manager.addEquipment(new FootballEquipment("Football", "Ball", 25.99));
        manager.addEquipment(new FootballEquipment("Shin Guards", "Protection", 15.49));

        //Виведення всього обладнання
        manager.displayEquipment();

        //Ініціалізація компонента Dagger
        AppComponent component = DaggerAppComponent.create();
        ApiService apiService = component.getApiService();
        apiService.fetchData();
    }
}
