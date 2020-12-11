package com.kapcb.ccc.practice.stream.optional;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * <a>Title: OptionalToStream </a>
 * <a>Author: kapcb <a>
 * <a>Description：<a>
 *
 * @author kapcb
 * @version 1.0.0
 * @date 2020/12/11-11:07
 */
public class OptionalToStream {

    public static void main(String[] args) {
        List<UserBean> userList = new ArrayList<>();
        userList.add(new UserBean(123, "kapcb", LocalDateTime.MIN, 14));
        userList.add(new UserBean(1233, "nb", LocalDateTime.MIN, 15));
        userList.add(new UserBean(1235, "!", LocalDateTime.MIN, 16));
        userList.add(new UserBean(1234, "aaa", LocalDateTime.MIN, 17));
        userList.add(new UserBean(1234, "bbb", LocalDateTime.MIN, 54));
        userList.add(new UserBean(1234, "ddd", LocalDateTime.MIN, 32));

        List<String> userBeanStream = userList.stream().map(UserBean::lookup).filter(Optional::isPresent).map(Optional::get).map(UserBean::getName).collect(Collectors.toList());
        System.out.println(userBeanStream);

        /**
         * JDK 9
         */
        // userList.stream().map(UserBean::lookup).flatMap(Optional::stream);
    }
}
