

public class MinMaxSum {
    private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
        int[] arr = new int[5];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < 5; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        miniMaxSum(arr);

        scanner.close();
    }
	
	static void miniMaxSum(int[] arr) {
		Arrays.sort(arr);
		long min = 0;
		long max = 0;
		
		for(int i = 0; i < arr.length - 1; i++){
			if(i != arr.length - 2){
				min = min + arr[i];
			}
			
			if(i != 0){
				max = max + arr[i];
			}
		}
		
		System.out.println(min + " " + max);
    }
}