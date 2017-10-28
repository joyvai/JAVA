class TestArray{
	static void minimum(int arr[] ){
		int size = arr.length;
		int min = arr[0];
		for (int i = 1; i<size; i++){
			if (min>arr[i]){
				min = arr[i];
			}
		}
		System.out.println (min);
	}	
	public static void main(String[] args){
		TestArray  t = new TestArray();
		int a[] = {33,4,16};
		t.minimum(a);
	}
}