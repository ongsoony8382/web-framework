package yu.spring.ch1.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MemberRequestDTO {
    private String name;
    private String email;
    private int age;
}
