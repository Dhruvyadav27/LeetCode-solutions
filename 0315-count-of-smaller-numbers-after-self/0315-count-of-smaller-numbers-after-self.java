import java.util.*;

class Solution {

    public List<Integer> countSmaller(int[] nums) {

        int n = nums.length;

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            list.add(0);
        }

        int[] indexes = new int[n];

        for (int i = 0; i < n; i++) {
            indexes[i] = i;
        }

        int[] temp = new int[n];

        mergeSort(nums, indexes, temp, list, 0, n - 1);

        return list;
    }

    public void mergeSort(int[] nums, int[] indexes, int[] temp,
                         List<Integer> list, int s, int e) {

        if (s >= e) {
            return;
        }

        int mid = s + (e - s) / 2;

        mergeSort(nums, indexes, temp, list, s, mid);

        mergeSort(nums, indexes, temp, list, mid + 1, e);

        merge(nums, indexes, temp, list, s, mid, e);
    }

    public void merge(int[] nums, int[] indexes, int[] temp,
                     List<Integer> list, int s, int mid, int e) {

        int i = s;
        int j = mid + 1;
        int k = s;

        int rightSmaller = 0;

        while (i <= mid && j <= e) {

            if (nums[indexes[j]] < nums[indexes[i]]) {

                temp[k] = indexes[j];

                rightSmaller++;

                j++;
                k++;

            } else {

                int originalIndex = indexes[i];

                list.set(originalIndex,
                    list.get(originalIndex) + rightSmaller);

                temp[k] = indexes[i];

                i++;
                k++;
            }
        }

        while (i <= mid) {

            int originalIndex = indexes[i];

            list.set(originalIndex,
                list.get(originalIndex) + rightSmaller);

            temp[k] = indexes[i];

            i++;
            k++;
        }

        while (j <= e) {

            temp[k] = indexes[j];

            j++;
            k++;
        }

        for (int x = s; x <= e; x++) {
            indexes[x] = temp[x];
        }
    }
}