package com.kapcb.ccc.practice.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

/**
 * <a>Title: LinkedListTest </a>
 * <a>Author: kapcb <a>
 * <a>Description：<a>
 *
 * @author kapcb
 * @version 1.0.0
 * @date 2020/11/17-14:08
 */
public class LinkedListTest {
    public static void main(String[] args) {

        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("kapcb");
        linkedList.add("aaaaa");
        linkedList.add("ccccc");
        Iterator<String> iterator = linkedList.iterator();
        String first = iterator.next();
        String second = iterator.next();
        iterator.remove();
        for (String s : linkedList) {
            System.out.println(s);
        }

        List<String> list = new ArrayList<>();
        list.add("1111");
        list.add("2222");
        list.add("3333");
        list.add("4444");
        ListIterator<String> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            String previous = listIterator.next();
            System.out.println(previous);
        }
    }
}
