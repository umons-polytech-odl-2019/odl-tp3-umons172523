package exercise1;

public class ExceptionThrower
{
	void throwACustomExceptionWhenValueIs42(int value)throws ExceptionValue42
	{
		if(value==42)
		{
			throw new ExceptionValue42();
		}


	}
}
