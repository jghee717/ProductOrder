package jpabook.jpashop.domain;

import jpabook.jpashop.domain.Order;
import lombok.Getter;
import lombok.Setter;
import org.apache.tomcat.jni.Address;
import org.springframework.data.annotation.Id;

import javax.persistence.*;
import java.util.ArrayList;

@Entity
@Getter
@Setter
public class Member {
    @Id @GeneratedValue
    @Column(name = "member_id")
    private Long id;
    private String name;

    @Embedded
    private Address address;

    @OneToMany(mappedBy = "member")
    private List<Order> orders = new ArrayList<>();
}
>
}
