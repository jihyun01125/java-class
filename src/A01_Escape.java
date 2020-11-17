
public class A01_Escape {
	public static void main(String[] args) {
	
	//#Escape문자 
	//-특수한 기능을 가진 문자 
	//-그냥 출력하려고 하면 문제가 생기는 문자들
	//-앞에 \(역슬래쉬)가 붙은 문자는 이스케이프 문자로 간주한다
	//-두문자가 합쳐져 하나의 문자로 인식된다
	
	// \n:줄바꿈의 기능을 가진 특수 문자(linebreak,linefeed,newline..)
	System.out.println("안녕하세요!\n반갑습니다");
	
	// \t:tab키의 기능을 가진 특수 문자
	System.out.println("안녕하세요!\t반갑습니다");
	System.out.println("이름\t혈액형\t최근헌혈여부");
	System.out.println("홍길동\tA형\tNO");
	System.out.println("임꺽정\tO형\tYES");
	
	// \\:그냥 역슬래쉬를 출력하고싶을때 사용한다 
	//EX>C:\ProgramFiles\java\jdk를 출력하고 싶은 경우
	System.out.println("C:\\ProgramFiles\\java\\jdk");
	
	// \" : 그냥 큰 따옴표를 출력하고 싶을때 사용한다 
	//EX> 저녁은 "지옥"에서 먹는다
	System.out.println("저녁은 \"지옥\"에서 먹는다");
	// \' : 그냥 작은 따옴표흫 출력하고 싶을때 사용한다
	System.out.println("아침을 \'든든\'하게 먹어둬라");
	System.out.println("아침을 '든든'하게 먹어둬라");
	System.out.println('\'');
	}
}
