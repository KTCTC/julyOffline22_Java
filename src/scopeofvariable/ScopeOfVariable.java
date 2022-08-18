package scopeofvariable;

public class ScopeOfVariable {
	int a = 90;
	static int b = 34;
	
	public static void staticMethod()
	{
		int aa = 7;
		
		if (aa>2)
		{
			int bb = 90;
			System.out.println(aa);
			System.out.println(bb);
			
			for (int i=0;i<2;i++)
			{
				int cc = 78;
				System.out.println(aa);
				System.out.println(bb);
				System.out.println(cc);
				System.out.println(i);
				
				while(j>2)
				{
					int j = 0;
					System.out.println("sdfsf");
					j++;
				}
				
			}
			
			System.out.println(cc);
			
		}
		System.out.println(bb);
		System.out.println(a);
		System.out.println(b);
	}
	
	
	public void nonStaticMethod()
	{
		int ghj =90;
		
		if (ghj>2)
		{
			System.out.println(ghj);
			System.out.println(zzz);
		}
       
   int zzz =8;
		System.out.println(a);
		System.out.println(b);
	}

}
