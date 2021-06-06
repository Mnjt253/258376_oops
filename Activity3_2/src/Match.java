import java.util.Scanner;

abstract class Match {
	private int currentscore;
	private float currentover;
	private int target;
	float calculateRunRate(int rs, int rb) {
		return 0;
	}
	int calculateBalls(int balls) {
		return 0;
	}
	void display(double reqRunrate, int balls, int rs) {
		
	}
}
class ODIMatch extends Match {
	int calculateBalls(int balls) {
		return (300-balls);
	}
	float calculateRunRate(int rs,int rb) {
		if (rs>rb) {
			float a=(float)rs/rb;
			return (6+a);
		}
		if (rs<rb) {
			float a=(float)rs/rb;
			return (6-a);
		}
		if (rs==rb) {
			return 6;
		}
		return 0;
	}
	void display(double reqRunrate, int balls,int rs) {
		System.out.println("Need "+rs+" runs in "+balls+" balls");
		System.out.println("Required Runrate: "+(float)reqRunrate);
	}
}
class TestMatch extends Match {
	int calculateBalls(int balls) {
		return (540-balls);
	}
	float calculateRunRate(int rs,int rb) {
		if (rs>rb) {
			float a=(float)rs/rb;
			return (6+a);
		}
		if (rs<rb) {
			float a=(float)rs/rb;
			return (6-a);
		}
		if (rs==rb) {
			return 6;
		}
		return 0;
	}
	void display(double reqRunrate, int balls,int rs) {
		System.out.println("Need "+rs+" runs in "+balls+" balls");
		System.out.println("Required Runrate: "+(float)reqRunrate);
	}
}
class T20Match extends Match {
	int calculateBalls(int balls) {
		return (120-balls);
	}
	float calculateRunRate(int rs,int rb) {
		if (rs>rb) {
			float a=(float)rs/rb;
			return (6+a);
		}
		if (rs<rb) {
			float a=(float)rs/rb;
			return (6-a);
		}
		if (rs==rb) {
			return 6;
		}
		return 0;
	}
	void display(double reqRunrate, int balls,int rs) {
		System.out.println("Need "+rs+" runs in "+balls+" balls");
		System.out.println("Required Runrate: "+(float)reqRunrate);
	}
}
public class MatchMain {
	public static void main(String[] args) {
		System.out.println("Enter the match format:");
		Scanner sc= new Scanner(System.in);
		String str= sc.nextLine();
		String str1= "ODI";
		String str2="Test";
		String str3="T20";
		System.out.println("Enter the current score:");
		int s= sc.nextInt();
		System.out.println("Enter the current over:");
		int o= sc.nextInt();
		int b= o*6;
		System.out.println("Enter the target score:");
		int tar= sc.nextInt();
		int rs=tar-s;
		if(str.equals(str1)) {
			ODIMatch t=new ODIMatch();
			int rb=t.calculateBalls(b);
			float rr=t.calculateRunRate(rs,rb);
			t.display(rr, rb, rs);
		}
		if(str.equals(str2)) {
			TestMatch t1=new TestMatch();
			int rb=t1.calculateBalls(b);
			float rr=t1.calculateRunRate(rs,rb);
			t1.display(rr, rb, rs);
		}
		if(str.equals(str3)) {
			T20Match t2=new T20Match();
			int rb=t2.calculateBalls(b);
			float rr=t2.calculateRunRate(rs,rb);
			t2.display(rr, rb, rs);
		}
	}
}
