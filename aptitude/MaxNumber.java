class MaxNumber {
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        
        int[] arr = {3, 5,7,2,8};
        int max = arr[0];
        //System.out.println("max "+max);
        for(int i =0; i<arr.length; i++){
            //System.out.println("arr "+i+" value "+arr[i]);
            //System.out.println(arr[0]);
            if(arr[i] > max ){
                max = arr[i];
            }
        }
        System.out.println("max == "+max);

    }
}
