package com.anhdh.mathutil.core;

import junit.framework.Assert;
import org.junit.Test;

public class MathUtilTest {
    
    @Test(expected = IllegalArgumentException.class)
        public void testFactotialGivenWrongArgumentThrowsException(){
//          Test case #3: đưa data cà chớn, n âm, n quá lớn 
//                      hàm đc thiết kế ném về ngoại lệ !!!
//          Thấy ngoại lệ xuất hiện như kì vọng -> passed cái test -> màu xanh 
        System.out.println("Hope to see the Exeption Argument ");
        MathUtil.getFactorial(-5);
    }
    
    @Test
    public void testFactorialGivenRightArgumentReturnsWell() {

//        Test case #1 (tình huống kiểm thử hàm số 1)
//        input: n = 0;
//        gọi hàm getFactorial(1)
//        Hy vọng hàm trả về 1, thực tế?
        long expected = 1;
        long actual = MathUtil.getFactorial(0);// ??? hàm chạy mới biết
        //so sánh giữa expected vs actual, máy tự so, kh cần sout()   
        Assert.assertEquals(expected, actual);

//        Test case #2 (tình huống kiểm thử hàm số 1)
//        input: n = 1;
//        gọi hàm getFactorial(1)
//        Hy vọng hàm trả về 1, thực tế?
//        so sánh giữa expected vs actual, máy tự so, kh cần sout()   
        Assert.assertEquals(1, MathUtil.getFactorial(1));

//        Test case #3 (tình huống kiểm thử hàm số 1)
//        input: n = 2;
//        gọi hàm getFactorial(1)
//        Hy vọng hàm trả về 1, thực tế?
//        so sánh giữa expected vs actual, máy tự so, kh cần sout()   
        Assert.assertEquals(2, MathUtil.getFactorial(2));
    }
    
    
    
    
    
    
    
    
    @Test   //coding convention - quy tắc viết code
    //tên hàm kiểm thử/tên hàm của test script
    //phải nói lên ý nghĩa của việc kiểm thử 
    //tình huống này, ta muốn test hàm getF() tham số tử tế
    public void testFactorialGivenRightArgumentReturnsWell2() {
//        Test case #4 (tình huống kiểm thử hàm số 1)
//        input: n = 3;
//        gọi hàm getFactorial(1)
//        Hy vọng hàm trả về 6, thực tế?
//        so sánh giữa expected vs actual, máy tự so, kh cần sout()   
        Assert.assertEquals(6, MathUtil.getFactorial(3));

//        Test case #5 (tình huống kiểm thử hàm số 1)
//        input: n = 4;
//        gọi hàm getFactorial(1)
//        Hy vọng hàm trả về 24, thực tế?
//        so sánh giữa expected vs actual, máy tự so, kh cần sout()   
        Assert.assertEquals(24, MathUtil.getFactorial(4));
        
//        Test case #6 (tình huống kiểm thử hàm số 1)
//        input: n = 5;
//        gọi hàm getFactorial(1)
//        Hy vọng hàm trả về 120, thực tế?
//        so sánh giữa expected vs actual, máy tự so, kh cần sout()   
        Assert.assertEquals(120, MathUtil.getFactorial(5));
    }

    
    
    
    
    
    
    
//    @Test //ra lệnh cho thư viện JUnit mình đã add và import tự động generate ra hàm public static void main()
//    //tự biến hàm tryJUnitComparison thành hàm main và gửi hàm main() này chi JVM chạy
//    //kh @test -> kh main kh chạy đc 
//    public void tryJUnitComparison() {
//        //hàm này thử nghiệm việc so sánh expected vs actual 
//        //coi sai đúng ra màu ntn
//        //ta đang xài hàm của thư viện JUnit nhưng kh xài bừa bãi mà phải viết theo quy tắc định trc
//        //Quy tắc nằm ở @ -annotation 
//
//        Assert.assertEquals(100, 100);
//    }
}




//class này dev sẽ viết những câu lệnh dùng để test hàm 
//của code chính, test các hàm của class MathUtil
//trong class này sẽ có những lời gọi hàm getFactorial()
//có những lệnh so sánh giữa expected và actual
//giống mình đã làm test ở bên Main()
//nhưng khác ở chỗ hiển thị màu
//mắt kh cần nhìn các dòng output từ hàm System.out cho mất sức mắt
//Muốn có đc điều này ta sẽ dùng thên các UNIT TESTING FRAMEWORK
//vd: JUnit, TestNG (Java)
//    xUnit, MSTest, NUnit (C#)
//  PHPUnit(PHP)
//      ....
//việc viết code để test code thì gọi là Unit Testing
//Đoạn code trong class này dùng JUnit/Unit Testing Framework
//Để kiểm thử hàm của code chính
//đoạn code kiểm thử này đc gọi là: TEST SCRIPT
//Code dùng để test code (chính) gọi là test script
//test script: Để test code chính
//muốn test thì cần phải thao tác các TEST CASE
//Test script sẽ sử dụng các Test Case
//vd: viết code để test hàm getFactorial() với các case

//QUY TẮC XANH ĐỎ:
//*MÀU XANH KHI TẤT CẢ CÁC TEST CASE PHẢI CÙNG LÀ XANH, 
//TỨC LÀ EXPECTED == ACTUAL 
//CHO TẤT CẢ TÌNH HUỐNG TEST

//*MÀU ĐỎ: CHỈ CẦN MỘT TRONG NHỮNG TEST CASE BỊ SAI 
//1 CÁI EXPECTED != ACTUAL, KẾT LUẬN MẠNH TAY: HÀM SAI

//Ý nghĩa của quy tắc: nếu đã test, nếu đã liệt kê các test case, thì chúng phải đúng hết, 
//chỉ 1 hàm sai, hàm kh ổn định về việc return -> hàm sai 

//EXPECTED == ACTUAL -> CASE Đúng, test case passed
//EXPECTED != ACTUAL -> case failed
//expected chính xác -> hàm đã xử lí sai, bug
//có khi expected sai -> lỗi do QC