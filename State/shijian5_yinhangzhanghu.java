package State;

public class shijian5_yinhangzhanghu {
    public static void main(String[] args) {
        /*��������*/
        /* ��������  �˻����    ȡ����   ����
         * 1000 500     200     123
         * 1000 300     500     123
         * 0    500     200     123
         * */
        try {
            test(1000, 500, 200, "6300");
            System.out.println("------------------------------------------------------------");
            test(1000, 300, 1500, "6300");
            System.out.println("------------------------------------------------------------");
            test(-1500, 500, 200, "6300");
        } catch (Exception e) {
            System.out.println("�˻����С��-1000���˻�״̬Ϊ��ɫ͸֧״̬�����Ǯ����ȡ");
            //System.out.println("�������ϣ�ά�������Ѿ�������ά�޷�");
        }
    }
 
    private static void test(int totalAmount, int balance, int amount, String pwd)throws Exception{
        //����ATM
        ATM atm;
        atm = new ATM(totalAmount, balance, amount, pwd);
        //�����ʼ״̬
        System.out.println(atm.toString());
        System.out.println(atm.SKT());
        atm.insertCard();
        atm.submitPwd();
        atm.getCash();
        //�������״̬
        System.out.println(atm.toString());
    }
}