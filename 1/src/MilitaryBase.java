import java.util.ArrayList;
import java.util.List;

public class MilitaryBase {
    private final List<String> genders = new ArrayList<>();
    public void writeGender(Employee employee){
        this.genders.add(employee.getGender());
    }
    public List<String> getGenders(){
        return this.genders;
    }
}
