import java.util.ArrayList;
import java.util.List;

public class ParkingLot {
    String parkingLotId;
    List<List<Slot>> slots;

    ParkingLot(String parkingLotId, int nfloors, int noOfSlotsPerFlr) {
        this.parkingLotId = parkingLotId;
        slots = new ArrayList<>();
        for (int i = 0; i < nfloors; i++) {
            slots.add(new ArrayList<>());
            List<Slot> floorSlots = slots.get(i);
            floorSlots.add(new Slot("truck"));
            floorSlots.add(new Slot("bike"));
            floorSlots.add(new Slot("bike"));

            for (int j = 3; j < noOfSlotsPerFlr; j++) {
                slots.get(i).add(new Slot("car"));
            }

        }
    }
}
