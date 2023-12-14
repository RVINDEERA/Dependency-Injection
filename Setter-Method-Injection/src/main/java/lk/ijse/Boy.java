package lk.ijse;

public class Boy {
    Agreement agreement;

    public void setter(Agreement a){
        this.agreement=a;

    }
    public void chatWIthGirl() {
        agreement.chat();
    }

    public static void main(String[] args) {
        Boy boy= new Boy();
        boy.setter(new Girl());
        boy.chatWIthGirl();
    }
}
