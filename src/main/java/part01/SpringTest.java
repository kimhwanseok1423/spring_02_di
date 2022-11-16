package part01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*������ ����(Dependency Injection)
 * DI�����̳ʸ� ���� ���� ���ϰ� ���Ϻ���� �ִ� �� Ŭ������ �и��ϰ� �� ��ä���� ���踦
 * ������ �����ν� ���յ��� ���߰� ������ Ȯ���� �ϱ� ���ؼ���.
 * 
 */
public class SpringTest {

	public static void main(String[] args) {
		
		//ApplicationContext: bean�� ������ ����Ŭ�� �������ִ� �����̳� �̴�.
    String path="part01/di.xml";
    ApplicationContext context=new ClassPathXmlApplicationContext(path);
	 	MessageBean bean=(MessageBean)context.getBean("mb");
	display(bean,"Spring"); 	
	 	
	 	
		
	}
public static void display(MessageBean bean,String subject) {
	bean.sayHello(subject);
}
}
