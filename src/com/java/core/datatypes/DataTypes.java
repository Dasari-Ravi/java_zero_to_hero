package com.java.core.datatypes;

public class DataTypes {
	int myvalue = 10000;
	int myminvalue = Integer.MIN_VALUE;
	int mymaxvalue = Integer.MAX_VALUE;
	static int mymaxvalueStatic = Integer.MAX_VALUE;

	public static void main(String[] args) {
		DataTypes dataTypes = new DataTypes();
		System.out.println("Static:" + mymaxvalueStatic);
		System.out.println("integer minimum value= " + dataTypes.myminvalue);
		System.out.println("integer maximum value = " + dataTypes.mymaxvalue);
		System.out.println("Busted max value = " + (dataTypes.mymaxvalue + 1));
		System.out.println("Busted min value = " + (dataTypes.myminvalue - 1));

	}

	public void processDataTypes() {
		byte myminbytevalue = Byte.MIN_VALUE;
		byte mymaxbytevalue = Byte.MAX_VALUE;
		System.out.println("Byte minium value= " + myminbytevalue);
		System.out.println("Byte maximum value= " + mymaxbytevalue);
		short myminshortvalue = Short.MIN_VALUE;
		short mymaxshortvalue = Short.MAX_VALUE;
		System.out.println("short minium value= " + myminshortvalue);
		System.out.println("short maximum value= " + mymaxshortvalue);
		long myminlongvalue = Long.MIN_VALUE;
		long mymaxlongvalue = Long.MAX_VALUE;
		System.out.println("long minium value= " + myminlongvalue);
		System.out.println("long maximum value= " + mymaxlongvalue);
		byte myNewbytevalue = (byte) (myminbytevalue / 2);

		short MyNewshortvalue = (byte) (mymaxbytevalue / 2);

	}
}