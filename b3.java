import java.util.Scanner;

public class b3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int dem = 0;
        double tongluong = 0;
        double thuong = 0;
        double luongmax = -1;
        double luongmin = 500000001;
        int chon;

        do {
            System.out.println("\n*********** MENU NHẬP LƯƠNG ************");
            System.out.println("1. Nhập lương nhân viên");
            System.out.println("2. Hiển thị thống kê");
            System.out.println("3. Tính tổng số tiền thưởng cho nhân viên");
            System.out.println("4. Thoát");
            System.out.print("Lựa chọn của bạn: ");
            chon = sc.nextInt();

            switch (chon) {
                case 1:
                    System.out.print("----Nhập lương nhân viên (nhập -1 để kết thúc)----\n");
                    while (true) {
                        System.out.println("Nhập lương: ");
                        double luong = sc.nextDouble();

                        if (luong == -1) break;

                        if (luong < 0 || luong > 500000000) {
                            System.out.println("Lương không hợp lệ. Nhập lại.");
                            continue;
                        }

                        String loai = "";
                        if (luong < 5000000) loai = "Thấp";
                        else if (luong <= 15000000) loai = "Trung bình";
                        else if (luong <= 50000000) loai = "Khá";
                        else loai = "Cao";

                        double bonusRate = 0;
                        if (luong <= 5000000) bonusRate = 0.05;
                        else if (luong <= 15000000) bonusRate = 0.10;
                        else if (luong <= 50000000) bonusRate = 0.15;
                        else if (luong <= 100000000) bonusRate = 0.20;
                        else bonusRate = 0.25;

                        dem++;
                        tongluong += luong;
                        thuong += (luong * bonusRate);
                        if (luong > luongmax) luongmax = luong;
                        if (luong < luongmin) luongmin = luong;

                        System.out.println("-> Phân loại: " + loai);
                    }
                    break;
                case 2:
                    if (dem == 0) {
                        System.out.println("Chưa có dữ liệu!");
                    } else {
                        System.out.println("\n--- THỐNG KÊ ---");
                        System.out.println("Số nhân viên:    " + dem);
                        System.out.printf("Tổng lương:  %,.0f VNĐ\n", tongluong);
                        System.out.printf("Lương trung bình: %,.0f VNĐ\n", (tongluong / dem));
                        System.out.printf("Lương cao nhất:  %,.0f VNĐ\n", luongmax);
                        System.out.printf("Lương thấp nhất: %,.0f VNĐ\n", luongmin);
                    }
                    break;
                case 3:
                    if (dem == 0) {
                        System.out.println("Chưa có dữ liệu để tính thưởng!");
                    } else {
                        System.out.println("--- TÍNH TỔNG SỐ TIỀN THƯỞNG NHÂN VIÊN---");
                        System.out.printf("Tổng tiền thưởng cho toàn bộ nhân viên: %,.0f VNĐ\n", thuong);
                    }
                    break;
                case 4:
                    System.out.println("Kết thúc chương trình.");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Vui lòng chọn từ 1 đến 4!");
            }
        } while (chon != 4);
        sc.close();
    }
}