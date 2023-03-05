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
        User user= new User();
        String id= "";

        int number= 0;
        while (number == 0){
            System.out.println("1. User List\n" +
                    "2. User Info" +
                    "3. Change User PW");

            if (number == 1){
                user.listUp();
            }
            if (number == 2){
                user.showInfo(id);
            }
            if (number == 3){
                user.changePW(id);
            }else {
                continue;
            }
        }
    }

    class User{
        public void listUp(){

        }

        public void showInfo(String id) {
        }

        public void changePW(String id) {
        }
    }

    public void adminInit() {
        System.out.println("1. Change admin PW\n" +
                "2. Remove User" +
                "3. Approve User");
    }
}
