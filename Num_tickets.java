package logic;

public class Num_tickets {
	public int planetickets(String src,String des,int not1) {
		  int fare=0;
	if(src.equals("HYDERABAD") && des.equals("BANGALORE"))
	{
		fare=1000*not1;
	}
	if(src.equals("HYDERABAD") && des.equals("KOLKATA"))
	{
		fare=2000*not1;
	}
	if(src.equals("HYDERABAD") && des.equals("PURULIA"))
	{
		fare=3000*not1;
	}
	if(src.equals("BANGALORE") && des.equals("PURULIA"))
	{
		fare=2300*not1;
	}
	if(src.equals("BANGALORE") && des.equals("HYDERABAD"))
	{
		fare=2300*not1;
	}
	if(src.equals("BANGALORE") && des.equals("KOLKATA"))
	{
		fare=2400*not1;
	}
	if(src.equals("KOLKATA" )&& des.equals("BANGALORE"))
	{
		fare=1400*not1;
	}
	if(src.equals("KOLKATA") && des.equals("PURULIA"))
	{
		fare=1100*not1;
	}
	if(src.equals("KOLKATA") && des.equals("HYDERABAD"))
	{
		fare=2300*not1;
	}
	if(src.equals("PURULIA") && des.equals("HYDERABAD"))
	{
		fare=1200*not1;
	}
	if(src.equals("PURULIA") && des.equals("KOLKATA"))
	{
		fare=2000*not1;
	}
	if(src.equals("PURULIA")&& des.equals("BANGALORE"))
	{
		fare=1300*not1;
	}
	System.out.println(fare);
	return fare;
	
	}

}
