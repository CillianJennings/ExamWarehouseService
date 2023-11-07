package ie.atu.labexamwarehouse;

import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class WarehouseService {
    ArrayList<Warehouse> warehouse = new ArrayList<warehouse>();
    public String addProduct(Warehouse warehouse) {
        String message = "ProductID: " + warehouse.getWarehouseID();
        warehouse.add(warehouse);
        return message;
    }
}
