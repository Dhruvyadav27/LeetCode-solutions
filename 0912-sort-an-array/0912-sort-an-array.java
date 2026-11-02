class Solution {
    public int[] sortArray(int[] nums) {

        int s = 0 ;
        int e = nums.length - 1;
        if(s >= e){
            return nums;
        }
        return mergeSort(nums, s, e);
    }

    public int[] mergeSort(int arr[], int l, int r) {
        
        if (l >= r) {
           return arr;
        }
        //devide
        int mid = (l+r)/2;
        
        //sort left half
        mergeSort(arr, l, mid);
        
        //sort right half
        mergeSort(arr, mid+1, r);
        
        //merge
        return merge(arr, mid, l, r);
        
    }
    public int[] merge(int [] arr, int mid, int s, int e){
        int [] rightArr = new int[e - mid];
        int [] leftArr = new int [mid - s + 1];
        int k = 0;
        for(int i = (mid + 1); i <= e; i++){
            rightArr[k++] = arr[i];
        }
        for(int i = 0; i < leftArr.length; i++){
            leftArr[i] = arr[s + i];
        }
        
        int index = s;
        int i = 0;
        int j = 0;
        while(i < leftArr.length && j < rightArr.length){
            if(leftArr[i] <= rightArr[j]){
                arr[index] = leftArr[i++];
                
            }
            else{
                arr[index] = rightArr[j++];
               
            }
            index++;
        }
        
           while (i < leftArr.length) {
               arr[index++] = leftArr[i++];
           }

           while (j < rightArr.length) {
               arr[index++] = rightArr[j++];
           }
        return arr;
    }
}