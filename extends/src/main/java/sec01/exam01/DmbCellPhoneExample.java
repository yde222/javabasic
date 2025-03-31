package sec01.exam01;

public class DmbCellPhoneExample {
    public static void main(String[] args) {
        //DmbCellPhone 객체 생성
        DmbCellPhone dmbCellPhone = new DmbCellPhone("피쳐폰","화이트",10);


        //CellPhone으로부터 상속 받은 멤버
        //필드
        System.out.println("모델 : " + dmbCellPhone.model);
        System.out.println("색상 : " + dmbCellPhone.color);

        //DmbCellPhone의 필드
        System.out.println("채널 : " + dmbCellPhone.channel);

        //CellPhone으로부터 상속 받은 메소드 호출
        dmbCellPhone.powerOn();
        dmbCellPhone.bell();
        dmbCellPhone.sendVoice("여보세요.");
        dmbCellPhone.receiveVoice("안녕하세요. 저는 홍길동입니다.");
        dmbCellPhone.sendVoice("반갑습니다.");
        dmbCellPhone.hangUp();

        //DmbCellPhone의 메소드 호출
        dmbCellPhone.turnOnDmb();
        dmbCellPhone.changeChannelDmb(6);
        dmbCellPhone.turnOffDmb();
    }
}
