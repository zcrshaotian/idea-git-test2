package jpa.domain;

import lombok.Data;

import javax.persistence.*;

//   Entity   声明此类是一个实体类

@Entity
@Data
@Table(name = "cst_customer")
public class Custom {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cust_id")
    private Long cusId; //客户的主键

    @Column(name = "cust_name")
    private String custName; //客户名称

    @Column(name = "cust_source")
    private String custSource; //客户来源

    @Column(name = "cust_level")
    private String custLevel; //客户级别

    @Column(name = "cust_industry")
    private String custIndustry; //客户所属行业

    @Column(name = "cust_phone")
    private String custPhone; //客户联系方式

    @Column(name = "cust_address")
    private String custAddress; //客户地址
}
