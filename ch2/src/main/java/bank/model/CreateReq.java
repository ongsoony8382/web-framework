package bank.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CreateReq {
    private String owner;
    private String name;
    private int balance;
}
