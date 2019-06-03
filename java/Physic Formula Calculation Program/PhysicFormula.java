public class PhysicFormula{
	final private double g=9.81;
	final private double G=6.67*Math.pow(10,-11);
	private double pressure1;
	private double f;
	private double area;
	private double pressure2;
	private double q;
	private double h;
	private double force;
	private double m1;
	private double m2;
	private double r;
	private double surface;
	private double M;
	private double radius;
	private double resistance1;
	private double resistance2;
	private double[] resistor;
	private double q1;
	private double m;
	private double c;
	private double t1;
	private double t2;
	private double q2;
	private double l;

	//method for choice constant
	public double getGravity(){
		return g;
	}
	public double getGravitational(){
		return G;
	}
//---------------------------------------------------------------------------------
	//method for choice pressure
	public void calPressureGravity(double f, double area){
		this.f=f;
		this.area=area;
		pressure1 = f/area;
	}
	public double getPressure1(){
		return pressure1;
	}
	public double getFpressure(){
		return f;
	}
	public double getArea(){
		return area;
	}
	public void calPressureFluid(double q,double h){
		this.q=q;
		this.h=h;
		pressure2 = q*g*h;
	}
	public double getPressure2(){
		return pressure2;
	}
	public double get_q(){
		return q;
	}
	public double get_height(){
		return h;
	}
//---------------------------------------------------------------------------------
	//method for choice gravity force
	public void calGravityForce(double m1,double m2,double r){
		this.m1=m1;
		this.m2=m2;
		this.r=r;
		force = (G*m1*m2)/Math.pow(r,2);
	}
	public double getGravityForce(){
		return force;
	}
	public double get_m1(){
		return m1;
	}
	public double get_m2(){
		return m2;
	}
	public double get_r(){
		return r;
	}

	public void calGravitySurface(double M,double r){
		this.M=M;
		this.r=r;
		surface = (G*M)/Math.pow(r,2);
	}
	public double getGravitySurface(){
		return surface;
	}
	public double get_M(){
		return M;
	}
//---------------------------------------------------------------------------------	
	//method for choice electronic resistance
	public void calSerialResistance(double[] resistor){
		this.resistor = resistor;
		resistance1 = 0;
		for(int i=0;i<resistor.length;i++){
			resistance1 = resistor[i]+resistance1;
		} 
	}
	public double getResistance1(){
		return resistance1;
	}
	public double[] get_Resistor(){
		return resistor;
	}

	public void calParallelResistance(double[] resistor){
		this.resistor = resistor;
		resistance2 = 0;
		for(int j=0;j<resistor.length;j++){
			resistance2 = resistance2+(1/resistor[j]);
		}
		resistance2 = 1/resistance2;
	}
	public double getResistance2(){
		return resistance2;
	}
//---------------------------------------------------------------------------------
	//method for choice heat energy
	public void calQCMT(double m, double c, double t1, double t2){
		this.m=m;
		this.c=c;
		this.t1=t1;
		this.t2=t2;
		q1 = m*c*(t2-t1);
	}
	public double getQ1(){
		return q1;
	}
	public double get_m(){
		return m;
	}
	public double get_c(){
		return c;
	}
	public double get_t1(){
		return t1;
	}
	public double get_t2(){
		return t2;
	}

	public void calQML(double m, double l){
		this.m=m;
		this.l=l;
		q2 = m*l;
	}
	public double getQ2(){
		return q2;
	}
	public double get_l(){
		return l;
	}
//----------------------------------------------------------------------------------
}