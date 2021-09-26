package com.rahul.codingchallenges;

final class SearchInRotatedSortedArray {

    static int searchInRotatedSortedArray(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        int mid;
        boolean leftSide, rightSide;

        while (left <= right) {
            leftSide = false;
            rightSide = false;
            mid = (left + right) / 2;

            if (nums[mid] == target) {
                return mid;
            }
            if (nums[mid] >= nums[left]) {
                leftSide = true;
            } else {
                rightSide = true;
            }
            if ((leftSide && target > nums[mid]) ||
                    (leftSide && target < nums[mid] && target < nums[left]) ||
                    (rightSide && target > nums[mid] && target <= nums[right])) {
                left = mid + 1;
            } else if ((rightSide && target < nums[mid]) ||
                    (rightSide && target > nums[mid] && target > nums[right]) ||
                    (leftSide && target < nums[mid] && target >= nums[left])) {
                right = mid - 1;
            }
        }
        return -1;
    }

}
