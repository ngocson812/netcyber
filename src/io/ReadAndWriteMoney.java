package io;

import java.io.*;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReadAndWriteMoney {
    public static void writeMoney(int m) {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("doanhthu.txt", true));
            bw.write("Ngày " + new Date().getDate() + "/" + (new Date().getMonth() + 1) + ": " + m + " VNĐ");
            bw.newLine();
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void getDoanhThu() {
        Pattern p = Pattern.compile("^Ngày [0-9]+/[0-9]+: (.*?) VNĐ$");
        String line = "";
        Matcher m;
        long turnOver = 0;
        try {
            BufferedReader br = new BufferedReader(new FileReader("doanhthu.txt"));
            while ((line = br.readLine()) != null) {
                m = p.matcher(line);
                while (m.find()) {
                    turnOver += Long.parseLong(m.group(1).trim());
                }
            }
            System.out.println("\n*********************************************************");
            System.out.println("        Tổng doanh thu là : " + turnOver + " VNĐ      ");
            System.out.println("*******************************************************");
        } catch (IOException e) {
            System.out.println("Lỗi File");
        }
    }
}
