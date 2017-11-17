//멀티태스킹
// 기법
// 1) round-robin 방식
// 일정한 시간으로 쪼개서 프로세스를 돌아가면서 실행 // WindowsOS에서 사용하는 방식
// 2) priority 방식
// 우선순위가 높은 프로세스를 먼저 실행한다 우선순위가 낮아 실행 순서가 밀리는 프로세스는
// 한번 밀릴떄 마다 나이를 먹게하여 결국에는 실행할 수 있도록 한다 // Rinux Unix에서 사용하는 방식
package bitcamp.java100.ch16.ex1;

public class Test1 {
	public static void main(String[] args) {
		Thread t1 = Thread.currentThread();
		System.out.println(t1.getName());
		
		ThreadGroup g1 = t1.getThreadGroup();
		System.out.println(g1.getName());
		
		ThreadGroup g2 = g1.getParent();
		System.out.println(g2.getName());
		
		ThreadGroup g3 = g2.getParent();
		System.out.println(g3);
		
		System.out.println("--------------------------------------");
		ThreadGroup[] groups = new ThreadGroup[10];
		int len = g2.enumerate(groups, false);
		for(int i = 0; i < len; i++) {
			System.out.println(groups[i].getName());
		}
		
		System.out.println("--------------------------------------");
		len = g1.enumerate(groups, false);
		for(int i = 0; i < len; i++) {
			System.out.println(groups[i].getName());
		}
		
		System.out.println("--------------------------------------");
		Thread[] threads = new Thread[10];
		len = g2.enumerate(threads, false);
		for(int i = 0; i < len; i++) {
			System.out.println(threads[i].getName());
		}
		
		System.out.println("--------------------------------------");
		len = g1.enumerate(threads, false);
		for(int i = 0; i < len; i++) {
			System.out.println(threads[i].getName());
		}
		
		
	}
}
