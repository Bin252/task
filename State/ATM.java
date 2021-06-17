package State;


public class ATM {
    /*����״̬*/
    private ATMState readyState;
    private ATMState noCashState;
    private ATMState noServiceState;
 
    private ATMState currState;//��ǰ״̬
    private int totalAmount;//�˻��ֳ�����
 
    /*�����õ���ʱ����*/
    private String pwd;//����
    private int balance;//���
    private int amount;//ȡ����
 
    public ATM(int totalAmount, int balance, int amount, String pwd) throws Exception{
        //��ʼ������״̬
        readyState = new ReadyState(this);
        noCashState = new NoCashState(this);
        noServiceState = new NoServiceState(this);
 
        if(totalAmount > 0){
            currState = readyState;
        }
        else if(totalAmount == 0){
            currState = noCashState;
        }
        else{
            throw new Exception();
        }
 
        //��ʼ����������
        this.totalAmount = totalAmount;
        this.balance = balance;
        this.amount = amount;
        this.pwd = pwd;
    }
 
    /*�Ѿ�����Ϊί�и�״̬����*/
    /**
     * �忨
     */
    public void insertCard(){
        currState.insertCard();
    }
 
    /**
     * �ύ����
     */
    public void submitPwd(){
        currState.submitPwd();
    }
 
    /**
     * ȡ��
     */
    public void getCash(){
        currState.getCash();
    }
 
    /**
     * ��ѯ���
     */
    public void queryBalance(){
        currState.queryBalance();
    }
 
    /**
     * ȡ��
     */
    public void ejectCard(){
        currState.ejectCard();
    }
    public String toString(){
        return "�˻��ܶ" + totalAmount;
    }
    public String SKT() {
        if(totalAmount >= 0) {
            return  "�˻�״̬Ϊ��ɫ����״̬���ȿ��Դ棬Ҳ����ȡ��";
        }
        if(totalAmount >= -1000 && totalAmount < 0) {
            return "�˻�״̬Ϊ��ɫǷ��״̬���ȿ��Դ棬Ҳ����ȡ��";
        }
        if(totalAmount < -1000) {
            return "�˻�״̬Ϊ��ɫ͸֧״̬��ֻ�ܴ��";
        }
        return "";
    }
 
    /*�˴���ȥ����getter and setter*/
 
    public String getPwd(){
        return pwd;
    }
    public int getBalance() {
        return balance;
    }
    public int getTotalAmount() {
        return totalAmount;
    }
    public int getAmount() {
        return amount;
    }
 
    public void setTotalAmount(int totalAmount) {
        this.totalAmount = totalAmount;
    }
 
    public void setBalance(int balance) {
        this.balance = balance;
    }
 
    public ATMState getNoCashState() {
        return noCashState;
    }
 
    public void setCurrState(ATMState currState) {
        this.currState = currState;
    }
}