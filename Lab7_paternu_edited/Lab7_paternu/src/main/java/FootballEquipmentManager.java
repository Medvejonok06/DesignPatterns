import java.util.List;

public class FootballEquipmentManager {

    private List<FootballEquipment> equipmentList;

    //Конструктор
    public FootballEquipmentManager(List<FootballEquipment> equipmentList) {
        this.equipmentList = equipmentList;
    }

    public void addEquipment(FootballEquipment equipment) {
        equipmentList.add(equipment);
    }

    public void displayEquipment() {
        for (FootballEquipment equipment : equipmentList) {
            System.out.println(equipment); //Використовується toString() з FootballEquipment
        }
    }
}
