package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private List<Fruit> fruitList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //调用装数据的方法
        initFruits();
        //找到recyclerView对象
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        //创建LinearLayoutManager对象并且加入到recyclerView中
        StaggeredGridLayoutManager staggeredGridLayoutManager = new StaggeredGridLayoutManager(3, StaggeredGridLayoutManager.VERTICAL);
//        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
//        linearLayoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
          recyclerView.setLayoutManager(staggeredGridLayoutManager);
//        recyclerView.setLayoutManager(linearLayoutManager);
        //创建fruitAdpter实例,并且将fruitList数据传入到FruitAdapter的构造函数中
        FruitAdpater fruitAdpater = new FruitAdpater(fruitList);
        recyclerView.setAdapter(fruitAdpater);

    }

    //装数据
//    private void initFruits(){
//        for(int i=1;i<=2;i++){
//            Fruit apple = new Fruit("apple", R.drawable.apple_pic);
//            fruitList.add(apple);
//            Fruit banana = new Fruit("banana", R.drawable.banana_pic);
//            fruitList.add(banana);
//            Fruit cherry = new Fruit("cherry", R.drawable.cherry_pic);
//            fruitList.add(cherry);
//            Fruit grape = new Fruit("grape", R.drawable.grape_pic);
//            fruitList.add(grape);
//            Fruit pineapple = new Fruit("Pineapple", R.drawable.pineapple_pic);
//            fruitList.add(pineapple);
//            Fruit strawberry = new Fruit("Strawberry", R.drawable.strawberry_pic);
//            fruitList.add(strawberry);
//            Fruit mango = new Fruit("Mango", R.drawable.mango_pic);
//            fruitList.add(mango);
//            Fruit orange = new Fruit("Orange", R.drawable.orange_pic);
//            fruitList.add(orange);
//            Fruit watermelon = new Fruit("Watermelon", R.drawable.watermelon_pic);
//            fruitList.add(watermelon);
//            Fruit pear = new Fruit("Pear", R.drawable.pear_pic);
//            fruitList.add(pear);
//        }
//
//    }

    private void initFruits(){
        for(int i=0;i<2;i++){
            Fruit apple = new Fruit(getRandomLengthName("apple"), R.drawable.apple_pic);
            fruitList.add(apple);
            Fruit banana = new Fruit(getRandomLengthName("banana"), R.drawable.banana_pic);
            fruitList.add(banana);
            Fruit cherry = new Fruit(getRandomLengthName("cherry"), R.drawable.cherry_pic);
            fruitList.add(cherry);
            Fruit grape = new Fruit(getRandomLengthName("grape"), R.drawable.grape_pic);
            fruitList.add(grape);
            Fruit pineapple = new Fruit(getRandomLengthName("Pineapple"), R.drawable.pineapple_pic);
            fruitList.add(pineapple);
            Fruit strawberry = new Fruit(getRandomLengthName("Strawberry"), R.drawable.strawberry_pic);
            fruitList.add(strawberry);
            Fruit mango = new Fruit(getRandomLengthName("Mango"), R.drawable.mango_pic);
            fruitList.add(mango);
            Fruit orange = new Fruit(getRandomLengthName("orange"), R.drawable.orange_pic);
            fruitList.add(orange);
            Fruit watermelon = new Fruit(getRandomLengthName("Watermelon"), R.drawable.watermelon_pic);
            fruitList.add(watermelon);
            Fruit pear = new Fruit(getRandomLengthName("Pear"), R.drawable.pear_pic);
            fruitList.add(pear);
        }
    }
    private String getRandomLengthName(String name){
        Random random = new Random();
        int length = random.nextInt(20) + 1;
        StringBuilder builder = new StringBuilder();
        for(int i = 0;i<length;i++){
            builder.append(name);
        }
        return builder.toString();
    }
}
