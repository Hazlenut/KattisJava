import java.util.*;
public class DoctorKattis {
	private static ArrayList<Cats> cats = new ArrayList<Cats>();
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		for(int i = 0; i < n; i++) {
			String line = sc.nextLine();
			//System.out.println(line);
			int command = (int) line.charAt(0) - 48;
			//System.out.println(command);
			if(command == 0) {
				arriveAtClinic(line.split(" ")[1], Integer.parseInt(line.split(" ")[2]));
			}else if(command == 1) {
				updateInfectionLevel(line.split(" ")[1], Integer.parseInt(line.split(" ")[2]));
			}else if(command == 2) {
				treated(line.split(" ")[1]);
			}else{
				System.out.println(query());;
			}
		}

	}
	public static void arriveAtClinic(String name, int level) {
		cats.add(new Cats(name,level));
	}
	public static void updateInfectionLevel(String name, int level) {
		for(int i = 0; i < cats.size(); i++) {
			if(cats.get(i).getName().equals(name)) {
				int newLevel = cats.get(i).getLevel() + level;
				cats.get(i).setLevel(newLevel);
				break;
			}
		}		
	}
	public static void treated(String name) {
		for(int i = 0;i < cats.size(); i++) {
			if(cats.get(i).getName().equals(name)) {
				cats.remove(i);
				break;
			}
		}
	}
	public static String query() {
		if(cats.size() == 0) {
			return "The clinic is empty";
		}
		int max = 0;
		int index = 0;
		for(int i = 0; i < cats.size(); i++) {
			if(cats.get(i).getLevel() > max) {
				max = cats.get(i).getLevel();
				index = i;
			}
		}
		return cats.get(index).getName();
	}
	
}
class Cats {
	private String name;
	private int level;
	public String getName() {
		return name;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public Cats(String name, int level) {
		this.name = name;
		this.level = level;
	}


}
