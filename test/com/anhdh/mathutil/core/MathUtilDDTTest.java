/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.anhdh.mathutil.core;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import static com.anhdh.mathutil.core.MathUtil.getFactorial;

/**
 *
 * @author dangh
 */

@RunWith(value = Parameterized.class)
public class MathUtilDDTTest {
    //1. chuẩn bị bộ data là mảng 2 chiều ứng với 2 cột expected và n 
    //mảng object, số thì dùng wrapper class - class gói các primitive
    @Parameterized.Parameters
    public static Object[][] initData(){
//        int a[] = {5, 10, 15, 20, 25};
//        int b[][] = {{1, 0}, {1, 1}, {2, 2}, {6, 3}, {24, 4}, {120, 5}, {720, 6}};
//        int c[][] = {
//                     {1, 0}, 
//                     {1, 1}, 
//                     {2, 2}, 
//                     {6, 3}, 
//                     {24, 4}, 
//                     {120, 5}, 
//                     {720, 6}
//                            };
        
        return new Integer[][] {
                     {1, 0}, 
                     {1, 1}, 
                     {2, 2}, 
                     {6, 3}, 
                     {24, 4}, 
                     {120, 5}, 
                     {720, 6}
                            };

    }
    //ta sẽ map/ánh xạ các cột của mỗi dòng, vd dòng đầu tiên 
    //có 2 cột là 1  0 -> ta sẽ ánh xạ 1 vào biến expected, 0 vào biến n 
//    tương tự cho các dòng còn lại 
    @Parameterized.Parameter(value = 0)
    public long expected;//map vào cột 0 của mảng
    @Parameterized.Parameter(value = 1)
    public int n;//map vào cột 1 của mảng

    @Test //kiểm thử các test case với data đc trích ra từ mảng map vào 2 biến tương ứng
    public void testFactorialGivenRightArgumentReturnWell(){
        assertEquals(expected, getFactorial(n));
    }
}

//Phân tích cách ta viết code test hàm getF() 
//Assert.assertEquals(1, MathUtil.getFactorial(1));
//hàm/method. lệnh này lặp đi lặp lại chi các data đưa vào 
//để ta kiểm tra các tình huống xài hàm/test case
//lát hồi ta thay data 1 0 thành các data tương ứng khác 
//vd:
//Expexted        n!
//1               0 
//1               1
//2               2
//6               3
//...
//nếu ta có đc cách nào đó mà tách đám data ra riêng 1 chỗ 
//sau đó từ từ nhồi/feed data này vào câu lệnh test hàm ở trên
//coi như chỉ cần 1 lệnh gọi test hàm, data cứ thế tuần tự đẩy vào
//kĩ thuật đẩy tách data ra khỏi câu lệnh test sau đó nhồi nó vào 
//1 câu lệnh test giúp rút gọn số câu lệnh test, và giúp dễ dàng kiểm tra tính thiếu đủ của các test case
//kĩ thuật này đc gọi tên là DDT - DATA DRIVEN TESTING
//viết code kiểm thử hường theo tách data
//còn gọi 1 tên khác là: kiểm thử theo kiểu tham số hóa - PARAMETERIZED
//dấu ??? ở câu lệnh gọi hàm chính là tên biến sẽ dùng để nhận data
//từ tập data đã tách ra - CONVERT DATA THÀNH BIẾN 


//chơi với DDT ta cần  
//bộ data test - tách riêng
//các tham số ứng với bộ data - chính là các biến dùng trích data ra
//gọi hàm kiểm thử xài các tham số 

//toàn bộ code trong class này đc viết ra dùng để test code chính ở 
//bên src packages 
//code viết ra dùng để test code khác đc gọi là test script
//1 test script sẽ chứa nhiều code để test hàm chính 
//1 test script sẽ chứa nhiều test case
//                            test case: các tình huống xài hàm 
//
//1 test script có thể xài DDT để dẽ bảo trì code test
//việc viết code chính có thể xài TDD








