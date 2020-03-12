package testMybatis.model;

import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;

@Data
@Accessors(chain = true)
public class Hero implements Serializable {
    private Integer Id;
    private String name;
    private Integer hp;
    private Integer damage;

}
