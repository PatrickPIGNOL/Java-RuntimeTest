package tests.runtime;
import static org.junit.Assert.assertEquals;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class RuntimeTest 
{ 
	public static void mRuntimeTest(Class<?> pClass)
	{
		Result vResult = JUnitCore.runClasses(pClass);
		for (Failure vFailure : vResult.getFailures()) 
		{
			System.out.println(vFailure.toString());
		}		
		System.out.println("Validation tests passed : " + vResult.wasSuccessful());
		assertEquals(true, vResult.wasSuccessful());
	}
}
