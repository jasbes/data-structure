package com.datastructure.datastructure;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

//@SpringBootApplication
public class DataStructureApplication {

    public static void main(String[] args) {
        // SpringApplication.run(DataStructureApplication.class, args);

        //merge(new int[] {1,2,3,0,0,0}, 3, new int[] {2, 5, 6}, 3);
        replaceElements(new int[]{17,18,5,4,6,1});
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = m - 1; j >= 0; j--) {
                if (nums2[i] < nums1[j]) {
                    nums1[j + 1] = nums1[j];
                    nums1[j] = nums2[i];
                    m++;
                } else {
                    nums1[m] = nums2[i];
                    m++;
                }
            }

        }

    }

    public static boolean validMountainArray(int[] arr) {
        if (arr == null || arr.length < 3) {
            return false;
        }

        int index = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] >= arr[i + 1]) {
                index = i;
                break;
            }

            if (i == arr.length - 1) {
                return false;
            }
        }

        while (index < arr.length - 1) {
            if (arr[index] <= arr[index + 1]) {
                return false;
            }
            index++;
        }

        return true;
    }

    public static boolean checkIfExist(int[] arr) {
        if (arr == null || arr.length == 0) {
            return false;
        }
        Set<Integer> doubles = new HashSet<>();

        for (int j : arr) {
            if (doubles.contains(2 * j) || (j % 2 == 0 && doubles.contains(j))) {
                return true;
            } else {
                doubles.add(j);
            }
        }

        return false;
    }

    // On each step of the loop check if we have seen the element 2 * arr[i] so far or arr[i] / 2 was seen if arr[i] % 2 == 0.
    public static int removeElement(int[] nums, int val) {
        int k = nums.length;
        for (int i = 0; i < k; i++) {
            if (nums[i] == val) {
                int j = k - 1;
                while (j > i) {
                    if (nums[j] != val) {
                        nums[i] = nums[j];
                        break;
                    }
                    j--;
                }
                i--;
                k--;
            }
        }
        System.out.println(Arrays.toString(nums));
        return k;
    }

    public static int[] replaceElements(int[] arr) {
        if(arr == null || arr.length == 0) {
            return arr;
        }

        if(arr.length == 1) {
            arr[0] = -1;
            return arr;
        }

        int max = -1;

        for(int i = arr.length - 1; i >= 0; i--) {
            int prev = arr[i];
            arr[i] = max;
            if(max < prev) {
                max = prev;
            }
        }

        arr[arr.length - 1] = -1;

        return arr;
    }
}
