import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Third {
    public static void main(String[] args) {
        int[] mainArr = new int[10];

        for (int i = 0; i < mainArr.length; i++) {
            mainArr[i] = (int) (Math.random() * 10);
        }
        System.out.println(Arrays.toString(mainArr));

        int[] dup = dublicate(mainArr);
        System.out.println(Arrays.toString(dup));

    }

    public static int[] dublicate(int[] arr) {
        List <Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length ; j++) {
                if (arr[i] == arr[j]) {
                    list.add(arr[i]);
                    break;
                }
            }
        }

        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i) == list.get(j)) {
                    list.remove(j);
                    break;
                }
            }
        }
        int[] dup = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            dup[i] = list.get(i);
        }

        return dup;
    }
}
