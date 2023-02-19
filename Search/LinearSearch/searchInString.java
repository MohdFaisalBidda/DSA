package Search.LinearSearch;

public class searchInString {
  public static void main(String[] args) {
    System.out.println(search("Faisal", 'i'));
    System.out.println(search1("Faisal", 'z'));
  }

  public static boolean search1(String name, char target) {
    if (name.length() == 0) {
      return false;
    }
    // forEach loop
    for (char ch : name.toCharArray()) {
      if (ch == target) {
        return true;
      }
    }
    return false;

  }

  public static boolean search(String name, char target) {
    if (name.length() == 0) {
      return false;
    }
    // normal for loop
    for (int j = 0; j < name.length(); j++) {
      if (name.charAt(j) == target) {
        return true;
      }
    }
    return false;

  }
}