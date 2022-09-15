package Array;

public class BaseOnLength {

	public static void main(String[] args) {
        String a[] = { "developers", "all", "software", "are", "we", "human and living" };

for (int i = 0; i < a.length; i++) {
for (int j = i + 1; j < a.length; j++) {
                if (a[i].length() > a[j].length()) {

                 String temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
 }
 }
            System.out.println(a[i]);
 }
 }
}