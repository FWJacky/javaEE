package com.liu.vo;

/**
 * @ClassName Items
 * @Description TODO
 * @Author L
 * @Date 2019/8/3 20:10
 * @Version 1.0
 **/
public class Items {
    private int ItemsId;

    private String ItemsName;

    private int ItemsPrice;

    public Items(){

    }

    public int getItemsId() {
        return ItemsId;
    }

    public void setItemsId(int itemsId) {
        ItemsId = itemsId;
    }

    public String getItemsName() {
        return ItemsName;
    }

    public void setItemsName(String itemsName) {
        ItemsName = itemsName;
    }

    public int getItemsPrice() {
        return ItemsPrice;
    }

    public void setItemsPrice(int itemsPrice) {
        ItemsPrice = itemsPrice;
    }
}
