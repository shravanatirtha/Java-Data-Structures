import java.util.*; 
public class countSort { 
	public static void main(String args[]) 
	{ 
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		List<Integer> list=new ArrayList<>();
		for(int i=0;i<n;i++)
		    list.add(sc.nextInt());
		List<Integer> second=new ArrayList<>();
		for(int i=0;i<n;i++){
		    if(second.contains(list.get(i)))
		        continue;
		    else second.add(list.get(i));
	    
	    }
	    List<Integer> count=new ArrayList<>();
		for(int i=0;i<second.size();i++){
		    int c=0;
		    for(int j=0;j<list.size();j++)
		        if(list.get(j)==second.get(i)) c++;
		  count.add(c);
		}
	    System.out.println(second);
	    System.out.println(count);
	    for(int i=Collections.min(count);i<=Collections.max(count);i++){
	        for(int j=0;j<count.size();j++){
	            if(i==count.get(j))
	                for(int k=0;k<i;k++)
	                    System.out.print(second.get(j));
	        }
	    }
	} 
}
