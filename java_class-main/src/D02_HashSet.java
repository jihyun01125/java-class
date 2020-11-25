import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class D02_HashSet {
	
	// # Set
	//	- ������ �����س��� Ŭ����
	//	- ��ҷ� ���� ���� ������ ���� ������� �ʴ´� 
	
	// # Hash
	//	- � ���� �־��� �� ���� ������ �� ���� ���� �����Ǿ�� �ϴ� �˰�����
	//	- ������ �� ���� ���� �̿��ϹǷ� ������ �Ұ����ϴ�
	//	- ������ ������ ���� ���� ã�� ���� �Ұ��ɿ� ������ 
	//	- �ٽ� ���� ������ ���ư� �� ���� �ܹ��⼺ �˰����� 
	//	- �ӵ��� ������ ���ȼ��� �پ �˰����� 
		
	public static void main(String[] args) {
	
		HashSet<Integer> even = new HashSet<>();
		
		// Set���� �Ȱ��� �����͸� ������ �� ���� 
		even.add(2);
		even.add(2);
		even.add(2);
		even.add(4);
		even.add(6);
		even.add(8);
		even.add(10);
		even.add(12);
		even.add(14);
		even.add(16);
		even.add(18);	
		
		// Hash�� �̿��ϴ� Ŭ������ ���� �־��� ������� �������� �ʴ´�
		System.out.println(even);
				
		// HashSet�� index�� ���� ������ �ϳ��� ���� ���� ����
		for (int i : even) {
			System.out.println("�ϳ��� ������ ��� : " + i);
		}
		
		
		List<String> animal_list = new ArrayList<>();
		
		animal_list.add("zibra");
		animal_list.add("zibra");
		animal_list.add("lion");
		animal_list.add("lion");
		animal_list.add("lion");
		animal_list.add("tiger");
		animal_list.add("eagle");
		animal_list.add("eagle");
		
		Collections.shuffle(animal_list);		
		System.out.println(animal_list);
		
		// # �ٸ� ������ �÷����� Set���� �ս��� ������ �� �ִ�
		//   �ߺ��� ���ŵǴ� ȿ���� �ִ�
		Set<String> animal_set = new HashSet<>(animal_list);		
		System.out.println(animal_set);		
		
		// # �÷����� �迭�� ��ȯ�ϱ� 1
		//	- Object[]�� ��ȯ�޴� ���
		Object[] animal_arr = animal_list.toArray();
		
		// String���� ���� �� �ٿ�ĳ������ �ʿ��� 
		String first_animal = (String) animal_arr[0];		
		System.out.println(first_animal);
		
		// # �÷����� �迭�� ��ȯ�ϱ� 2
		//	- �̸� ������ �ش� ���׸� �迭�� �����ϴ� ��� 
		String[] animal_arr2 = new String[animal_set.size()];		
		animal_set.toArray(animal_arr2);
		
		first_animal = animal_arr2[0];
		System.out.println(first_animal);
		
		
		// contains : �÷��ǿ� �ش� ��Ұ� �ִ��� ���θ� ��ȯ 
		System.out.println(animal_list.contains("lion"));
		System.out.println(animal_set.contains("lion"));
		
		// size : �÷��� ũ�� ��ȯ
		System.out.println(animal_set.size());
		
		// remove : �÷��� ��� ���� (���� ������ true ��ȯ)
		System.out.println(animal_set.remove("lion"));
		
		
		// # �ٸ� �÷����� �̿��ϴ� �޼����
		Set<Character> alphabet01 = new HashSet<>();
		Set<Character> alphabet02 = new HashSet<>();
		
		Collections.addAll(alphabet01, 'A', 'B', 'C', 'D', 'E');
		Collections.addAll(alphabet02, 'D', 'E', 'F', 'G', 'H');
		
		System.out.println(alphabet01);
		System.out.println(alphabet02);
		
		// 1. addAll(collection) : ������ �÷����� ��� ���� �߰��Ѵ�
		List<Character> alpha_all = new ArrayList<>();
		
		alpha_all.addAll(alphabet01);
		alpha_all.addAll(alphabet02);
		
		System.out.println(alpha_all);
		
		// 2. removeAll(collection) 
		//	- ������ �÷��ǰ� ��ġ�ϴ� ��� ���� �����Ѵ�
		Set<Character> to_remove = new HashSet<>();		
		Collections.addAll(to_remove, 'A', 'D');
		
		alpha_all.removeAll(to_remove);		
		System.out.println(alpha_all);
		
		// 3. retainAll(collection) 
		//	- ������ �÷��ǰ� ��ġ�ϴ� ���� �����Ѵ�
		List<Character> to_retain = new ArrayList<>();
		
		to_retain.add('E');
		to_retain.add('G');
		
		alpha_all.retainAll(to_retain);		
		System.out.println(alpha_all);
		
		// 4. containsAll(collection) 
		//	- ������ �÷����� ��� ��Ұ� ���ԵǾ� �ִ��� Ȯ���Ѵ�
		Collections.addAll(alpha_all, 'A', 'B', 'C', 'D');		
		
		Set<Character> must_contain = new HashSet<>();
		
		must_contain.add('A');
		must_contain.add('B');
		must_contain.add('C');
		
		System.out.println(
				alpha_all + "�� " 
						+ must_contain + "�� ��� ���ԵǾ��ֳ���? " 
						+ alpha_all.containsAll(must_contain));

		
		
	}
}











