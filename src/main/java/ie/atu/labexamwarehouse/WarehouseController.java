package ie.atu.labexamwarehouse;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WarehouseController {

    @PostMapping("/capacity-check")
    public String something(@RequestBody WarehouseService warehouseService){
        String capacityMessage = String.format("There is space for %s with ID %s",
                warehouseService.getProductName(), warehouseService.getProductID());
        return capacityMessage;
    }
}
