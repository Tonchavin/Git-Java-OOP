package HomeWork5.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class User {
    private  Long id;
    private  String fullName;
    private  Integer age;
    private  String phoneNumber;
}
