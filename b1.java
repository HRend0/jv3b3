import java.util.Scanner;

public class b1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("========= NHẬP THÔNG TIN HÓA ĐƠN ========= ");
        System.out.print("\nNhập tên khách hàng: ");
        String kh = sc.nextLine();
        System.out.print("Nhập tên sản phẩm: ");
        String sp = sc.nextLine();
        System.out.print("Nhập giá sản phẩm: ");
        double gia = sc.nextDouble();
        System.out.print("Nhập số lượng mua: ");
        int sl = sc.nextInt();
        System.out.print("Khách có thẻ thành viên? (true/false): ");
        boolean tv = sc.nextBoolean();

        double thanhtien = gia * sl;
        double giamgia = tv ? thanhtien * 0.1 : 0;
        double vat = (thanhtien - giamgia) * 0.08;
        double thanhtoan = thanhtien - giamgia + vat;

        System.out.println("================== HÓA ĐƠN ===================");
        System.out.printf("Khách hàng:      %s\n", kh);
        System.out.printf("Sản phẩm:        %s\n", sp);
        System.out.printf("Số lượng:        %d\n", sl);
        System.out.printf("Đơn giá:         %,.2f\n", gia);
        System.out.printf("Thành tiền:      %,.2f\n", thanhtien);
        System.out.printf("Giảm giá (10%%):  %,.2f\n", giamgia);
        System.out.printf("Tiền VAT (8%%):   %,.2f\n", vat);
        System.out.printf("Tổng thanh toán: %,.2f\n", thanhtoan);
        System.out.println("====================================");

        sc.close();
    }
}