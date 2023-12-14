package lk.ijse;

public class Boy {
    Agreement agreement;
    public Boy(Agreement a){
        this.agreement=a;
    }
    public Boy(){

    }
    public void chatWIthGirl() {
        Agreement agreement=new Girl();
        agreement.chat();
    }
    public void chat() {
        Agreement agreement=new Girl();
        agreement.chat();
    }


    public static void main(String[] args) {
        Boy boy= new Boy(new Girl());
        boy.chatWIthGirl();
        boy.chat();
        Boy boy1 =new Boy();

    }
}
