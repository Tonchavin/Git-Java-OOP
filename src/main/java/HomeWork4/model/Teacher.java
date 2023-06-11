package HomeWork4.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;


@Getter
//@AllArgsConstructor
//@Setter
//@ToString
@EqualsAndHashCode(callSuper = true)
//@Data
public class Teacher extends User implements Comparable<Teacher> {

    private Double gpa;   //средний балл
    private String advosor;   //руководитель

    public Teacher(Long id, String fullName, Integer age, String phoneNumber) {
        super(id, fullName, age, phoneNumber);
    }

    @Override
    public int compareTo(Teacher o) {
        return getFullName().compareTo(o.getFullName());
    }

    public String toString() {
        return String.format("%s\t%s\t%s\t%s", getId(), getFullName(), getAge(), getPhoneNumber());
    }
}
