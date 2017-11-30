package com.wsh;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by wsh on 2017/11/30.
 * Girl Service层
 */
@Service
public class GirlService {

    @Autowired
    private GirlRepository girlRepository;

    //加上事务管理，要么一起成功，要么一起失败
    @Transactional
    void addTwoGirls() {
        Girl girlA = new Girl();
        girlA.setAge(22);
        girlA.setCupSize("F");
        girlRepository.save(girlA);

        Girl girlB = new Girl();
        girlB.setAge(23);
        girlB.setCupSize("E");
        girlRepository.save(girlB);
    }

}

