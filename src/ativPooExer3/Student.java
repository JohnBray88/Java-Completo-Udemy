package ativPooExer3;

public class Student {	
	String name;
	private float n1,n2,n3;
	private final float noteMaxTrim1=30,noteMaxTrim2=35,noteMaxTrim3=35;
	private final float noteMaxYear = noteMaxTrim1+noteMaxTrim2+noteMaxTrim3;
	private final float avgNoteYear = (noteMaxYear * 60) / 100 ;
	
	public float getAvgNoteYear() {
		return avgNoteYear;
	}
	public float getNoteMaxYear() {
		return noteMaxYear;
	}
	public float getNoteMaxTrim1() {
		return noteMaxTrim1;
	}
	public float getnoteMaxTrim2() {
		return noteMaxTrim2;
	}
	public float getnoteMaxTrim3() {
		return noteMaxTrim3;
	}
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getN1() {
		return n1;
	}
	public void setN1(float n1) {
		this.n1 = n1;
	}
	public float getN2() {
		return n2;
	}
	public void setN2(float n2) {
		this.n2 =n2;
	}
	public float getN3() {
		return n3;
	}
	public void setN3(float n3) {
		this.n3 = n3;
	}
	public float avgNoteStudentYear() {
		return ((this.n1+this.n2+this.n3));
	}
	public float missingPoint() {
		if(avgNoteStudentYear() < getAvgNoteYear()) {
			return (getAvgNoteYear()-avgNoteStudentYear());
		}else {
			System.out.println("You Pass. Congratulations.");
			return 0.0f;
		}
	}
	public String toString() {
		return "Studen: " + this.name
				+ "\nThe final note: " + avgNoteStudentYear();
	}
	
}
