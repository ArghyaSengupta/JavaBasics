package com.importantkeywords;

public class TestStatic extends ImportantKeywords{
	
	public static void main(String a[]) {
		ImportantKeywords imp= new ImportantKeywords();
		imp.const2=30;//access via object
		ImportantKeywords.const2=30;//access without an object: static
	}

}
