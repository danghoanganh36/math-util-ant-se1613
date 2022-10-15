/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.anhdh.mathutil.core;

/**
 *
 * @author dangh
 */
//đây là class mô phỏng lại các hàm tiện ích/dùng chung cho mọi class khác
//mô phỏng lại class tiện ích java.Math của JDK
//Phàm cái gì là đồ dùng chung , thường đc thiết kế là static
public class MathUtil {
    
    public static final double PI = 3.14;
    
//    hàm tiện ích tính n! = 1.2.3....n
//    lưu ý/quy ước:
//    - không tính giai thừa số âm
//    0! = 1! =1
//    Vì giai thừa tăng cực nhanh, nên 21! đã vượt 18 số 0 tràn kiểu long
//    Ta không tính 21! trở lên
    
    //SỬA HÀM TÍNH GIAI THỪA = CÁCH XÀI ĐỆ QUY
//    n! = 1.2.3.4.5...n
//    n! = n . (n-1)!
//    n! = return n . (n-1)!
//    ĐỆ QUY: GỌI LẠI CHÍNH MÌNH VỚI 1 QUY MÔ KHÁC/NHỎ HƠN 
    public static long getFactorial(int n){
        if (n < 0 || n > 20) {
            throw new IllegalArgumentException("Invalid n. n must be between 0..20 (ngu vãi lồn)");
        }
        
        return n*getFactorial(n-1);
    }
    
//    public static long getFactorial(int n){
//        if (n < 0 || n > 20) {
//            throw new IllegalArgumentException("Invalid n. n must be between 0..20 (ngu vãi lồn)");
//        }
//        if (n == 0 || n == 1) {
//            return 1;
//        }
//        //sống sót đến dòng này, sure n = 2...20!!!
//        //cấm ko xài else nữa khi hàm đã có return phía trước
//        long product = 1; //biến cộng dồn, nhân dồn, biến con heo đất
//                                //acc/accumulation/gửi góp
//        for (int i = 2; i <= n; i++) 
//            product *= i;
//        
//        return product;
//    }
    
//    Ta sẽ học sơ về khái niệm TDD - TEST DRIVEN DEVELOPMENT (Green - Refactor - Red)
//    là một kỹ thuật lập trình/áp dụng cho dân dev để gia 
//    tăng chất lượng code/giảm thiểu công sức tìm bug/phát hiện bug sớm
//    TDD yêu cầu dev khi viết code /viết hàm/viết class phải viết luôn 
//    các bộ kiểm thử/ viết luôn các test cases/viết luôn các đoạn 
//    code dùng thử hàm/class để kiểm tra tính đúnsg đắn của hàm /class

//    Viết code kèm theo viết test cases
//    Viết code có ý thức luôn phần kiểm thử code/hàm/class
//    development driven                        test
//    Sau khi có đc tên hàm (chỉ tên hàm mà thoi)
//    ta viết luôn các tình huốnsg xài hàm
//    chấp nhận khi hàm chạy sai do code chưa xong
//    Sau đó ta tối ưu/chỉnh sửa code để đảm bảo code chạy đúng
//    Quá trình sai - đúng - sai -đúng diễn ra liên tục (cycle)
    
//    Refactor: chỉnh sửa và tối ưu code cho phù hợp 
}
