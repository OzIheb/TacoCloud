package tacos.TacoCloud;

import java.util.List;
import lombok.Data;

@Data
public class Taco {
 private String name;

 private List<Ingredient> ingredients;
}
