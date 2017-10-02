package com.example.phanvy.monngonviet;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<player> mLstContact= new  ArrayList<player>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        doCreateFakeData();
        // lấy listwiew từ layout xuống
        ListView listLegend = (ListView) findViewById(R.id.LV);
        //Tạo adapterr
        PlayerAdapter adapter=new PlayerAdapter(MainActivity.this,R.layout.layout,mLstContact);
        //Đỗ dữ liệu lên Listview
        listLegend.setAdapter(adapter);
    }
    private void doCreateFakeData(){
        player m1= new player();
        m1.setName("Mực Ống Xào Măng Trúc");
        m1.setGioithieu("Để khử mùi tanh của mực, bạn dùng ít rượu pha gừng đạp dập để rửa. Không thích mực, bạn có thể thay bằng tôm");
        m1.setAnh(R.drawable.muc);
        player m2= new player();
        m2.setName("Ếch Xào Hoa Hẹ");
        m2.setGioithieu("Để tăng hương vị cho món ăn, bạn có thẻ cho thêm 1 thìa cà phê dầu mè (vừng)");
        m2.setAnh(R.drawable.exhh);
        player m3= new player();
        m3.setName("Ếch Xào Cà Bát");
        m3.setGioithieu("Thịt ếch làm xong nên nấu ngay, nếu để lau ếch sẽ bị mất mùi và nhạt thịt");
        m3.setAnh(R.drawable.excb);
        player m4= new player();
        m4.setName("Ếch Xào Cà Bát");
        m4.setGioithieu("Để đậu không bị nát, bạn cho đậu vào đĩa, ráo bọt rán giòn và vừng lên ");
        m4.setAnh(R.drawable.dh);
        player m5= new player();
        m5.setName("Đậu Phụng Sốt Dưa Chua");
        m5.setGioithieu("Những trái dừa tươi, vừa chín tới sẽ không quá cứng cũng không quá mềm, nhấn ngón tay vào vỏ dừa sẽ không bị lõm vào. Phần vỏ có nấm mốc, rỉ nước hay bị nứt là những dấu hiệu cho thấy tría dừa đã bị hư ");
        m5.setAnh(R.drawable.dp);
        player m6= new player();
        m6.setName("Bí Ngòi Xào Thanh Cua");
        m6.setGioithieu("Bí ngòi không những là thực phẩm ngon, bổ mà còn có nhiều ích cho sức khỏe, đặc biệt biết cho mắt. Chúng ta hãy thực hiện những món ăn với loại bí này nhé ");
        m6.setAnh(R.drawable.bnx);
       player m7= new player();
        m7.setName("Bí Xào Thịt Bò");
        m7.setGioithieu("Bí ngòi không những là thực phẩm ngon, bổ mà còn có nhiều ích cho sức khỏe, đặc biệt biết cho mắt. Chúng ta hãy thực hiện những món ăn với loại bí này nhé  ");
        m7.setAnh(R.drawable.bx);
        player m8= new player();
        m8.setName("Lạp Xưởng Xào Nui");
        m8.setGioithieu(" Khi ăn, nếu thích bạn cho thêm dầu vừng vào cho thơm hơn");
        m8.setAnh(R.drawable.lx);
        mLstContact.add(m1);
        mLstContact.add(m2);
        mLstContact.add(m3);
        mLstContact.add(m4);
        mLstContact.add(m5);
        mLstContact.add(m6);
        mLstContact.add(m7);
        mLstContact.add(m8);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.mymenu, menu);
        return true;
    }
}
