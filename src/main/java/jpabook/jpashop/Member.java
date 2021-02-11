package jpabook.jpashop;

import lombok.Getter;
import lombok.Setter;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.Entity;

@Entity
@Getter @Setter
public class Member{

    @Id @GeneratedValue
    private Long id;
    private String name;
}

