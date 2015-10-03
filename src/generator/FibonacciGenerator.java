package generator;

import java.util.List;

import com.google.common.collect.Lists;

/**
 * Dynamic Programming based solution to the Fibonacci Number Generator. This program returns the List of 'n' fibonacci numbers where
 * 'n' is the input.
 *
 */
public class FibonacciGenerator 
{
	List<Long> fibonacciSequence;
	
	public static void main(String[] args)
	{
		FibonacciGenerator fg = new FibonacciGenerator();
		List<Long> generatedNos = fg.generate(70);
		generatedNos.forEach(no -> System.out.println(no));
	}
	
	public List<Long> generate(int n)
	{
		fibonacciSequence = Lists.newArrayListWithCapacity(n);
		
		for(int i = 1;i<=n;i++)
		{
			if(i>2)
			{
				fibonacciSequence.add(fibonacciSequence.get(i-2)+fibonacciSequence.get(i-3));
			}
			else
			{
			  fibonacciSequence.add(generateNumber(i));
			}
		}
		
		
		return fibonacciSequence;
	}
	
	private long generateNumber(long n)
	{
		if(n==0 || n==1)
		{
			return 0;
		}
		
		if(n==2)
		{
			return 1;
		}
		
		return generateNumber(n-1) + generateNumber(n-2);
	}
}
