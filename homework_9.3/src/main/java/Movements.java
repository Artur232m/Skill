import java.util.ArrayList;
import java.util.List;

public class Movements {
   private String nameCompany;
   private double coming;
   private double costs;

    public String getNameCompany() {
        return nameCompany;
    }

    public void setNameCompany(String nameCompany) {
        this.nameCompany = nameCompany;
    }

    public double getComing() {
        return coming;
    }

    public void setComing(ArrayList<Double> com) {
        List<Double> list = new ArrayList<>(com);
        coming = 0;

        for (int i = 0; i < list.size(); i++) {
           coming += list.get(i);
        }
    }

    public double getCosts() {
        return costs;
    }

    public void setCosts(ArrayList<String> com) {
        List<String> list = new ArrayList<>(com);
        coming = 0;

        for (int i = 0; i < list.size(); i++) {

            coming += Double.valueOf(list.get(i).replace(',','.'));
        }
    }

    public   String toString(){
        return "Расходы :" + getCosts() + "\nДоходы :" + getComing()+
                "\nНомер счета :" + getNameCompany();
    }
}
