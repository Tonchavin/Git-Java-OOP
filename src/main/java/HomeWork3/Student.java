package HomeWork3;

import lombok.Data;

//@Getter
//@AllArgsConstructor
//@Setter
//@ToString
//@EqualsAndHashCode
@Data
public class Student implements Comparable<Student> {

    private final Long id;
    private final String fullName;

    @Override
    public int compareTo(Student o) {
        return fullName.compareTo(o.fullName);
    }
//    @Override
//    public int compareTo(Student a) {
//        if (this.fullName < a.fullName){
//            return -1;
//        } else if (this.fullName > a.fullName) {
//            return 1;
//        }else return 0;
//    }
}
