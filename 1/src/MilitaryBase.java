import java.util.ArrayList;
import java.util.List;

public class MilitaryBase {
    private List<String> genders = new ArrayList<>();
    public void writeGender(String gender){
        this.genders.add(gender);
    }
    public List<String> getGenders(){
        return this.genders;
    }
}
