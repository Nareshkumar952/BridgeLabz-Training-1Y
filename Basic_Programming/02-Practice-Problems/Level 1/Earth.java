class Earth {
	public static void main(String args[]) {
	int a=6378;
	double b=1.6*a;
	double km=(4/3)*3.14*a*a*a;
	double mil=(4/3)*3.14*b*b*b;
	System.out.println("The volume of earth in cubic kilometers is"+ km + "and cubic miles is"+ mil);}}