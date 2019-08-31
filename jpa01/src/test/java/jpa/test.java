package jpa;

import jpa.domain.Custom;
import org.junit.Test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class test {

    @Test
    public void demo1(){
        // 1.加载配置文件，创建工厂（实体对象管理工厂）对象
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("myJpa");
        // 2.通过工厂对象获得实体对象管理器
        EntityManager manager = factory.createEntityManager();
        // 3.获取事务对象，开启事务
        EntityTransaction transaction = manager.getTransaction();
        transaction.begin();
        // 4.完成增删改操作
        Custom custom = new Custom();
        custom.setCustName("wangwu");
        custom.setCustSource("南昌");
        manager.persist(custom);
        // 5.关闭事务
        transaction.commit();
        // 6.释放资源
        manager.close();
        factory.close();
    }
}
