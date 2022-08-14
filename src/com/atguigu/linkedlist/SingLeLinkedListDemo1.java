package com.atguigu.linkedlist;

public  class SingLeLinkedListDemo1 {
    public static void main(String[] args) {
        HeroNode1 heroNode1 = new HeroNode1(1, "sj", "jsy");
        HeroNode1 heroNode2 = new HeroNode1(2, "ljy", "wql");
        HeroNode1 heroNode3 = new HeroNode1(3, "wy", "zdx");
        HeroNode1 heroNode4 = new HeroNode1(4, "lc", "bzt");
        SingleLinkedList1 list1 = new SingleLinkedList1();
        list1.addByOrder(heroNode1);
        list1.addByOrder(heroNode3);
        list1.addByOrder(heroNode2);
        list1.addByOrder(heroNode3);
        list1.addByOrder(heroNode4);
        list1.addByOrder(heroNode1);
        list1.list();
    }


}