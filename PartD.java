public class PartD {

        public static int findIndexCloseToTarget ( int[] arr, int target){
            if (arr==null||arr.length == 0) {
                throw new RuntimeException("array should not be empty or null");
            }
        if (target < arr[0]) return 0;
        if (target > arr[arr.length - 1]) return arr.length - 1;
        int low = 0;
        int high = arr.length - 1;
        while (low < high) {
            int mid = (low + high) / 2;
            if (target == arr[mid]) {
                return mid;
            }
            if (target > arr[mid]) {
                if (mid < arr.length - 1 && target < arr[mid + 1]) {
                    return getClosest(arr[mid], arr[mid + 1], target);
                }
                low = mid + 1;
            } else if (target < arr[mid]) {
                if (mid > 0 && target > arr[mid - 1]) {
                    return getClosest(arr[mid - 1], arr[mid], target);
                }
                high = mid - 1;
            }
        }
        return -1;
    }


    public static int getClosest(int val1, int val2, int target){
        if (val2-target>=target-val1){
            return val1;
        }
        else if(val2-target<target-val1){
            return val2;
        }
        return -1;
    }

    public static void main(String[] args){
        int arr[] = {1,3,3,4};
        int target = 2;
        System.out.println(findIndexCloseToTarget(arr, target));

    }
}
