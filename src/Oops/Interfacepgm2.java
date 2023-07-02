package Oops;

interface Tvremote
{
	public void Poweron();
	public void Poweroff();
	public void Changechannel();
	public void volumeup();
	public void Volumedown();
	
	
}
interface smartTv
{
	public void Openapp();
	public void Browserinternate();
	
}
class LG implements Tvremote,smartTv
{

	@Override
	public void Openapp() {
		// TODO Auto-generated method stub
		System.out.println("LG Open App");
	}

	@Override
	public void Browserinternate() {
		// TODO Auto-generated method stub
		System.out.println("LG Browser Internet");
	}

	@Override
	public void Poweron() {
		// TODO Auto-generated method stub
		System.out.println("LG Power On");
	}

	@Override
	public void Poweroff() {
		// TODO Auto-generated method stub
		System.out.println("LG Power Off");
	}

	@Override
	public void Changechannel() {
		// TODO Auto-generated method stub
		System.out.println("LG Channel Change");
	}

	@Override
	public void volumeup() {
		// TODO Auto-generated method stub
		System.out.println("LG Volume UP");
	}

	@Override
	public void Volumedown() {
		// TODO Auto-generated method stub
		System.out.println("LG Volume Down");
	}
	
}



class MI implements Tvremote ,smartTv
{

	@Override
	public void Openapp() {
		// TODO Auto-generated method stub
		System.out.println("MI Open App");
	}

	@Override
	public void Browserinternate() {
		// TODO Auto-generated method stub
		System.out.println(" MI Browser Internet");
	}

	@Override
	public void Poweron() {
		// TODO Auto-generated method stub
		System.out.println("MI Power On");
	}

	@Override
	public void Poweroff() {
		// TODO Auto-generated method stub
		System.out.println("MI Power Off");
	}

	@Override
	public void Changechannel() {
		// TODO Auto-generated method stub
		System.out.println("MI Channel Change");
	}

	@Override
	public void volumeup() {
		// TODO Auto-generated method stub
		System.out.println("MI Volume UP");
	}

	@Override
	public void Volumedown() {
		// TODO Auto-generated method stub
		System.out.println("MI Volume Down");	
	}
	
}
public class  Interfacepgm2 
{

	public static void main(String[] args) {
	 LG ob=new LG();
	 ob.Poweron();
	 ob.Poweroff();
	 ob.Changechannel();
	 ob.volumeup();
	 ob.Volumedown();
	 ob.Openapp();
	 ob.Browserinternate();
	 
	 
	 MI oh=new MI();
	 oh.Poweron();
	 oh.Poweroff();
	 oh.Changechannel();
	 oh.volumeup();
	 oh.Volumedown();
	 oh.Openapp();
	 oh.Browserinternate();
	}

}
