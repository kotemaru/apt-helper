package test.master;

public class TestMain {

	public static void main(String[] args) throws Exception  {
		SimpleAnnoTestImpl simpleAnnoTest = new SimpleAnnoTestImpl();
		System.out.println("simpleAnnoTest.hogehoge(10)="+simpleAnnoTest.hogehoge(10));
		System.out.println("simpleAnnoTest.hogehoge(20)="+simpleAnnoTest.hogehoge(20));
		
		TraceDelegateTest traceDelegateTest = new TraceDelegateTestTrace();
		traceDelegateTest.println("==>"+traceDelegateTest.getString(traceDelegateTest));
	}

}
