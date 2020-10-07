package cPU;

public class HardDisk {

	private int amount;
	String brand;
	private int num;
	int getAmount(){
		return amount;
	}
	String getBrand(){
		return brand;
	}
	int getNum(){
		return num;
	}
	public void setAmount(int amount){
		if(amount>1&&amount<20000) {
			this.amount=amount;
		}
	}
	public void setNum(int num){
		if(num>0&&num<10000)
		this.num=num;
	}
}
