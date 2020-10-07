package cPU;

public class Test {
	public static void main(String[] args) {
		CPU cpu =new CPU();
		cpu.setSpeed(2200);
		cpu.brand="Intel";
		cpu.setOc(5.2);
		HardDisk disk=new HardDisk();
		disk.setAmount(200);
		disk.brand="SAMSUNG";
		disk.setNum(2);
		PC pc=new PC();
		pc.setCPU(cpu);
		pc.setHardDisk(disk);
		pc.show();
	}
}
