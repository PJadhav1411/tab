
public class SocketClassAdapterImpement extends Socket implements SocketAdapter{

	@Override
	public  Volt get120Volt() {	
	 return this.getVolt();
	}

	@Override
	public Volt get12Volt() {
		Volt v= getVolt();		// 120 volts
		return convertVolt(v,10);
	}

	

	@Override
	public Volt get3Volt() {
		Volt v= getVolt();		// 120 volts
		return convertVolt(v,40);
	}
	
	private Volt convertVolt(Volt v, int i) {
		return new Volt(v.getVolts()/i);
	}
}

