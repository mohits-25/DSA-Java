class Solution {
      static int countStudents(int[] arr, int pages) {

        int students = 1;
        long pagesStudent = 0;

        for (int book : arr) {

            if (pagesStudent + book <= pages) {
                pagesStudent += book;
            } else {
                students++;
                pagesStudent = book;
            }
        }

        return students;
    }

    public static int findPages(int[] arr, int n, int m) {

        // More students than books
        if (m > n) {
            return -1;
        }

        int low = Integer.MIN_VALUE;
        int high = 0;

        // Find maximum book and total pages
        for (int book : arr) {
            low = Math.max(low, book);
            high += book;
        }

        while (low <= high) {

            int mid = low + (high - low) / 2;

            int students = countStudents(arr, mid);

            if (students > m) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return low;
    }
    public int splitArray(int[] nums, int k) {
        return findPages(nums,nums.length,k);
    }
}