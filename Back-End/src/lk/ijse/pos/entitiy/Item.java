package lk.ijse.pos.entitiy;

import com.sun.jdi.request.StepRequest;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Item {
    private String code;
    private String name;
    private int qty;
    private double price;
}
