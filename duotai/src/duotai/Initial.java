package duotai;

public class Initial {
	public static void main(String[] args) {
		Transport tra=new Transport();
		Transport tra2=new Transport();
		Car car=new Car();
		Steamship ship=new Steamship();
	    Transport air=new Aircraft();
	   car.tra();
	   ship.tra();
	   air.tra();
	   tra=car;
	   Car car2=new Car();
	   Steamship ship2=new Steamship();
	   tra2=car;
	   if(tra instanceof Car)//如果tra对象有Car类型的元素
	   {
		   car2=(Car)tra;
		   System.out.println("转换成功");
	   }
	   else{
		   System.out.println("无法进行类型转换，转成Car类型");
	   }
	   if(tra2 instanceof Steamship)
	   {
		   ship2=(Steamship)tra2;
	   }
	   else{
		   System.out.println("无法进行类型转换，转成Steamship类型");
	   }
	   
	   
	}

}
