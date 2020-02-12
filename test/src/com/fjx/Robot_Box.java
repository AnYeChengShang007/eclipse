package com.fjx;

public class Robot_Box {
	
	public static void main(String[] args) {
		System.out.println("ν��˵��");
		System.out.println("table(x):\tx������");
		System.out.println("EmptiHand(x):\tx�����ǿյ�");
		System.out.println("Beside(x��y):\tx��y���Ա�");
		System.out.println("Hold(x��y):\tx��������y");
		System.out.println("On(x��y):\tx��y������");
		System.out.println("EmptyTable(x):\t����x�ǿյ�");
		System.out.println("goto(x,y):\tx�ߵ�y");
		System.out.println("beside(robot,x)^goto(x,y)->beside(robot,y)");
		System.out.println("takeup(x):\t��x��������ӣ�����ν��Ϊ");
		System.out.println("on(box,x)^emptyhand(robot)->hold(robot,box)^EmptyTable(x)");
		System.out.println("putdown(x):\t��x�����º��ӣ�����ν��Ϊ");
		System.out.println("table(x)^hold(robot,box)->on(box,x)^Emptyhand(robot)");
		System.out.println("��ʼ״̬:");
		String robot = "ROBOT";
		String A = "A";
		String B = "B";
		String box = "BOX";
		Table TA = new Table(A);
		Table TB = new Table(B);
		Beside beside = new Beside(robot, A);
		EmptiHand emptiHand = new EmptiHand(robot);
		On on = new On(box, A);
		EmptyTable emptyTable = new EmptyTable(B);
		System.out.println(TA+"^"+TB+"^"+beside+"^"+emptiHand+"^"+on+"^"+emptyTable);
		System.out.println("Ŀ��״̬");
		emptyTable.setX(A);
		on.setY(B);
		System.out.println(TA+"^"+TB+"^"+beside+"^"+emptiHand+"^"+on+"^"+emptyTable);
		emptyTable.setX(B);
		on.setY(A);
		System.out.println();
		System.out.println("takeup(B)");
		EmptyTable e2 = new EmptyTable(null);
		Hold h = new Hold(null, null);
		takeup("ROBOT", on,h,e2);
		System.out.println("״̬:\t"+TA+"^"+TB+"^"+beside+"^"+h+"^"+emptyTable+e2);
		System.out.println("goto(A,B)");
		go("A", "B", beside);
		System.out.println("״̬:\t"+TA+"^"+TB+"^"+beside+"^"+h+"^"+emptyTable+e2);
		System.out.println("putdown(B)");
		putdown(on, beside);
		System.out.println("״̬:\t"+TA+"^"+TB+"^"+beside+"^"+emptiHand+"^"+on+"^"+e2);
		System.out.println("goto(B,A)");
		go("B","A",beside);
		System.out.println("״̬:\t"+TA+"^"+TB+"^"+beside+"^"+emptiHand+"^"+on+"^"+e2);
	}
	
	static class Table{
		private String x;
		public Table(String x) {
			this.x = x;}
		public String getX() {
			return x;}
		public void setX(String x) {
			this.x = x;}
		@Override
		public String toString() {
			return "Table("+x+")";}}
	static class EmptiHand{
		private String x;
		public String getX() {
			return x;}
		public void setX(String x) {
			this.x = x;}
		@Override
		public String toString() {
			return "EmptiHand(" + x + ")";}
		public EmptiHand(String x) {
			this.x = x;}}
	static class Beside{
		private String x;
		private String y;
		@Override
		public String toString() {
			return "Beside(" + x + "," + y + ")";}
		public String getX() {
			return x;}
		public void setX(String x) {
			this.x = x;}
		public String getY() {
			return y;}
		public void setY(String y) {
			this.y = y;}
		public Beside(String x, String y) {
			this.x = x;
			this.y = y;}
	}
	static class Hold{
		private String x;
		private String y;
		public Hold(String x, String y) {
			this.x = x;
			this.y = y;}
		public String getX() {return x;}
		public void setX(String x) {this.x = x;}
		public String getY() {return y;}
		public void setY(String y) {this.y = y;}
		@Override
		public String toString() {return "Hold(" + x + "," + y + ")";}}
	static class On{
		private String x;
		private String y;
		@Override
		public String toString() {return "On(" + x + "," + y + ")";}
		public String getX() {return x;}
		public void setX(String x) {this.x = x;}
		public String getY() {return y;}
		public void setY(String y) {this.y = y;}
		public On(String x, String y) {
			this.x = x;
			this.y = y;}}
	static class EmptyTable{
		private String x;
		public String getX() {return x;}
		public void setX(String x) {this.x = x;}
		@Override
		public String toString() {return "EmptyTable(" + x + ")";}
		public EmptyTable(String x) {this.x = x;}}
	
	static void go(String x,String y,Beside beside) {beside.setY(y);}
	
	static void takeup(String x,On on,Hold hold,EmptyTable e) {
		e.setX(on.y);
		hold.setX(x);
		hold.setY(on.x);}
	static void putdown(On on,Beside beside) {on.setY(beside.getY());}
}
