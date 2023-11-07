package ie.atu.labexamwarehouse;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Warehouse {
    private String warehouseID;
    private String location;
    private String capacity;
}
