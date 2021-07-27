import java.util.ArrayList;

public class Equipment {
        private final int id;
        private String equipmentDetails;

    public Equipment(int id, String equipmentDetails) {
        this.id = id;
        this.equipmentDetails = equipmentDetails;
    }

    public int getId() {
        return id;
    }



    public String getEquipmentDetails() {
        return equipmentDetails;
    }

    public void setEquipmentDetails(String equipmentDetails) {
        this.equipmentDetails = equipmentDetails;
    }

    @Override
    public String toString(){
        return "equipment id. " + this.id + ". " + "equipment detail:" + " " + this.equipmentDetails;
    }

}

