/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.anhdh.mathutil.main;

import com.anhdh.mathutil.core.MathUtil;

/**
 *
 * @author dangh
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("This statement comes from the main() method");
        tryTDDFirst();
//        testFactotialGivenWrongArgumentThrowsException();
    }
    
    public static void testFactotialGivenWrongArgumentThrowsException(){
//          Test case #3: đưa data cà chớn, n âm, n quá lớn 
//                      hàm đc thiết kế ném về ngoại lệ !!!
//          Thấy ngoại lệ xuất hiện như kì vọng -> passed cái test -> màu xanh 
        System.out.println("Hope to see the Exeption Argument ");
        MathUtil.getFactorial(-5);
    }
    
//  hàm này đc viết ra để dùng thử kĩ thuật viết code kiểu TDD
//  gọi thử /dùng thử hàm chính bên core
//  xem nó sai đúng ra sao, ở ngay mức khởi đầu viết hàm
    public static void tryTDDFirst(){
//        Test case #1 (tình huống kiểm thử hàm số 1)
//        input: n = 1;
//        gọi hàm getFactorial(1)
//        Hy vọng hàm trả về 1, vì 1! = 1
        long expected = 1;
        long actual = MathUtil.getFactorial(1);
        //so sánh expected vs actual coi chúng nó giống nhau kh?
//        giống -> hàm đúng 
//        sai -> bug r 
        System.out.println("Test 1! | status: " +
                                  "   Expected: " + expected + 
                                  " | Actual: " + actual);
        
//        Test case #2 (tình huống kiểm thử hàm số 2)
//        input: n = 2;
//        gọi hàm getFactorial(2)
//        Hy vọng hàm trả về 2, vì 1! = 2
        System.out.println("Test 2! | status: " +
                                  "   Expected: 2"  + 
                                  " | Actual: " + MathUtil.getFactorial(2));
        
        
    }
}
//TEST CASE là gì
//Là 1 tình huống xài app/kiểm thử app/kiểm thử tính năng/màn hình
//chức năng, xử lí của app
//Test case là tình huống kiểm thử app/chức năng mà khi đó ta phải 
// - đưa vào data giả/mẫu/test,
// - đưa ra giá trị kì vọng ta mong chờ app trả ra 
//sau đó chờ hàm/tính năng xử lí xong trả ra kết quả!!
//và ta nhìn kết quả và ta so sánh với kì vọng trc đó!!
//để kết luận hàm ổn/tính năng ổn, TEST CASE PASSED
//                                 TEST CASE FAILED             
//