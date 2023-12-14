package lk.ijse;

public class Boy {
    public void chatWIthGirl() {
        Agreement agreement=new Girl();
        agreement.chat();
    }
    public void chat() {
        Agreement agreement=new Girl();
        agreement.chat();
    }


    public static void main(String[] args) {
        Boy boy= new Boy();
        boy.chatWIthGirl();
        boy.chat();
    }
}
