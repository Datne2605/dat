package main;

import shapes.Hinhchunhat;
import shapes.Hinhtron;
import shapes.Hinhtru;
import shapes.Hinhvuong;

public class MainClass {
    public static void main(String[] args) {
        Hinhtron hinhtron = new Hinhtron();
        hinhtron.xuatTen();
        hinhtron.Nhapbankinh();
        hinhtron.Tinhchuvi();
        hinhtron.Tinhdientich();
        hinhtron.inchuvi();
        hinhtron.indientich();

        Hinhtru hinhtru = new Hinhtru();
        hinhtru.xuatTen();
        hinhtru.Nhapchieucao();
        hinhtru.Tinhdientich();
        hinhtru.inthetich();

        Hinhchunhat hinhchunhat = new Hinhchunhat();
        hinhchunhat.xuatTen();
        hinhchunhat.Nhapchieudai();
        hinhchunhat.Nhapchieurong();
        hinhchunhat.tinhchuvi();
        hinhchunhat.tinhdientich();
        hinhchunhat.inchuvi();
        hinhchunhat.indientich();

        Hinhvuong hinhvuong = new Hinhvuong();
        hinhvuong.xuatTen();
        hinhvuong.nhapcanh();
        hinhvuong.tinhchuvi();
        hinhvuong.tinhdientich();
        hinhvuong.inchuvi();
        hinhvuong.indientich();

    }

}
