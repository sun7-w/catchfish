package com.bzxy.fish;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.io.File;
import java.io.IOException;

public class Start {

    //main方法
    public static void main(String[] args) throws IOException {
        //创建窗体界面 -- JFrame--墙
        JFrame f = new JFrame();

//      JPanel面板的一种方法：往JPanel面板中add添加组件
        //创建面板 --JPanel -- 小板子
        //JPanel p = new JPanel();
        //创建标签--JLabel
        //JLabel label = new JLabel("HelloWorld");
        //创建标签 -- JLabel --显示图片(以图标ImageIcon的方式显示)
        //JLabel label1 = new JLabel(new ImageIcon("images/bg.jpg"));
        //p.add(label);//将带文字的标签放入面板中
        //p.add(label1);//将图片放入面板
        //f.add(p);//将面板放到窗体中


        f.setVisible(true);//设置窗体可见
        f.setSize(1000, 700);//设置窗体大小
        f.setLocation(400, 100);//设置窗体位置
        f.setTitle("我的捕鱼达人");//设置窗体标题
        f.setResizable(false);//设置窗体不可改变
        //关闭窗体后台
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //使用ImageIO工具类读取某张图片,图片要以flie文件的方式去读取
        f.setIconImage(ImageIO.read(new File("images/fish02_00.png")));//设置窗体图标


    }
}
