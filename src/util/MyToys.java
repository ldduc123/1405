/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

/**
 *
 * @author Duc
 */
public class MyToys {
    //chứa các hàm đồ chơi phụ kiện dùng cho mọi nơi, cho nên ko cần new
    //tức là static
    
    //hàm này tính n!=1.2.3...n, cF computer Factorial
    //0!=1, ko chơi giai thừa âm, giai thừa ko đc lớn quá, bùng nổ nhanh
    //để long 15! vượt nữa tràn đầy, kiểm tra lại sau
    public static long cF(int n){
        if(n<0 || n>15)
            throw new IllegalArgumentException("n must be between 0...15");
        if(n==0)
            return 1;
        //còn lại n hợp lệ, quất for hoặc đệ quy recursion
        long product =1;
        for (int i = 1; i <= n; i++) {
            product *=i;
        }
        return product;// bữa sau đệ quy vì keeys hợp CI continuous Integration
    }
}
