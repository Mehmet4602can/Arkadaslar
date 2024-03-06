package com.example.arkadaslar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.example.arkadaslar.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    int selectedRowNo;
    private ActivityMainBinding binding;
    ArrayList<Arkadaslar> arkadasList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);
        arkadasList = new ArrayList<>();

        Arkadaslar studnet0 = new Arkadaslar(25," Berkay ","Gedikli ","11/B",R.drawable.student0);
        Arkadaslar studnet1 = new Arkadaslar(30," Sansar ","Ünal ","11/B",R.drawable.student1);
        Arkadaslar studnet2 = new Arkadaslar(40," ulvi ","togg ","11/B",R.drawable.student2);
        Arkadaslar studnet3 = new Arkadaslar(35," Ahmete ","kork ","11/B",R.drawable.student3);
        Arkadaslar studnet4 = new Arkadaslar(45," Ahmets ","yıldır ","11/B",R.drawable.student4);
        Arkadaslar studnet5 = new Arkadaslar(50," Alperen ","kızak ","11/A",R.drawable.student5);
        Arkadaslar studnet6 = new Arkadaslar(55," İbo ","efe ","11/A",R.drawable.student6);
        Arkadaslar studnet7 = new Arkadaslar(60," mali ","ibici ","11/B",R.drawable.student7);
        Arkadaslar studnet8 = new Arkadaslar(65," selim ","yıldız ","11/B",R.drawable.student8);
        Arkadaslar studnet9 = new Arkadaslar(70," Emirhan ","kaplan ","11/B",R.drawable.student9);

        arkadasList.add(studnet0);
        arkadasList.add(studnet1);
        arkadasList.add(studnet2);
        arkadasList.add(studnet3);
        arkadasList.add(studnet4);
        arkadasList.add(studnet5);
        arkadasList.add(studnet6);
        arkadasList.add(studnet7);
        arkadasList.add(studnet8);
        arkadasList.add(studnet9);

        binding.imageView.setImageResource(arkadasList.get(0).img);
        binding.textView.setText(arkadasList.get(0).schoolNo+arkadasList.get(0).name+arkadasList.get(0).surname+arkadasList.get(0).classes);
        selectedRowNo=0;
    }
    public void geri(View view){
        if(selectedRowNo>0){
            selectedRowNo--;
            binding.imageView.setImageResource(arkadasList.get(selectedRowNo).img);
            binding.textView.setText(arkadasList.get(selectedRowNo).schoolNo+arkadasList.get(selectedRowNo).name+arkadasList.get(selectedRowNo).surname+arkadasList.get(selectedRowNo).classes);
        } else selectedRowNo = 10;

    }
    public void ileri(View view){
        if(selectedRowNo<arkadasList.size()-1){
            selectedRowNo++;
            binding.imageView.setImageResource(arkadasList.get(selectedRowNo).img);
            binding.textView.setText(arkadasList.get(selectedRowNo).schoolNo+arkadasList.get(selectedRowNo).name+arkadasList.get(selectedRowNo).surname+arkadasList.get(selectedRowNo).classes);
        } else selectedRowNo =-1;

    }

}