public class Main {
    public static void main(String[] args) {
        int number= Integer.MAX_VALUE;
        Mode mode=new Mode();

        while (number == 0){
//        scanner
            System.out.println("1. User Mode\n " +
                    "2. Admin Mode");
            if (number == 1){
                mode.userInit();
            }
            if (number == 2){
                mode.adminInit();
            } else {
                continue;
            }
        }
    }
}
class Mode{
    public void userInit() {
        System.out.println("1. User List\n" +
                "2. User Info" +
                "3. Change User PW");
    }

    public void adminInit() {
        System.out.println("1. Change admin PW\n" +
                "2. Remove User" +
                "3. Approve User Level");
    }
}
