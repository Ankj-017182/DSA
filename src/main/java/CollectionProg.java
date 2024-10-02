import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollectionProg {
    public static class employee{
        int id;
        int age;
        double salary;
        String name;
        public employee(int id,int age,double salary,String name){
            this.id = id;
            this.age =age;
            this.salary=salary;
            this.name = name;
        }
        @Override
        public String toString(){
            return "employee [id="+id+", age="+age+",salary="+salary+",name="+name+"]";
        }
        public static void main(String[] args){
            List<employee> employees=new ArrayList<>();
            employees.add(new employee(10,20,30000,"Ankit"));
            employees.add(new employee(15,30,12000,"Atul"));

            Collections.sort(employees, new Comparator<employee>() {
                @Override
                public int compare(employee o1, employee o2) {
                    int compare = o2.name.compareTo(o1.name);
                    if ((compare==0)){
                        return Double.compare(o1.salary, o2.salary);
                    }

                    return compare;
                }
            });
            for (employee e : employees) {
                System.out.println(e);
            }
        }
    }
}
