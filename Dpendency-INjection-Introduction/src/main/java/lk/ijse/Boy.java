package lk.ijse;

public class Boy {
    Agreement agreement=new Girl();

    public void chatWIthGirl() {
        agreement.chat();
    }
    public void chat() {
        agreement.chat();
    }

    public static void main(String[] args) {
        Boy boy= new Boy();
        boy.chatWIthGirl();
        boy.chat();
    }
}
