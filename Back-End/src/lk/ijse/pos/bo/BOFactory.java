package lk.ijse.pos.bo;

import lk.ijse.pos.bo.custom.impl.CustomerBOImpl;
import lk.ijse.pos.bo.custom.impl.ItemBOImpl;
import lk.ijse.pos.bo.custom.impl.OrderDetailsBOImpl;

public class BOFactory {
    private static BOFactory boFactory;

    private BOFactory() {

    }

    public static BOFactory getInstance() {
        return boFactory == null ? new BOFactory() : boFactory;
    }

    public enum BOTypes {
        CUSTOMER, ITEM, ORDER, ORDER_DETAILS
    }

    public SuperBO getBO(BOTypes types) {
        switch (types) {
            case CUSTOMER:
                return new CustomerBOImpl();
            case ITEM:
                return new ItemBOImpl();
            case ORDER:
                return new PurchaseOrderBOImpl();
            case ORDER_DETAILS:
                return new OrderDetailsBOImpl();
            default:
                return null;
        }
    }
}
