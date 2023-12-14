package lk.ijse;

public class Boy  implements DI{
    Agreement agreement;
    public void chatWIthGirl() {
        agreement.chat();
    }

    @Override
    public void inject(Agreement a) {
    this.agreement=a;
    }


    public static void main(String[] args) {
        Boy boy= new Boy();
        boy.inject(new Girl());
        boy.chatWIthGirl();
    }


}
