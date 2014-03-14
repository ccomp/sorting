public class sorting {
	
	public static void main(String[] args) {
		int[] arrayGen = new int[n];
		Random numGen = new Random();
		for (int i = 0; i < n; i++) {
			arrayGen[i] = numGen.nextInt() * 6
		}
	}


	public int[] selectionSort(int[] data){
	  int lenD = data.length;
	  int j = 0;
	  int tmp = 0;
	  for(int i=0; i<lenD; i++){
	    j = i;

	    for(int k = i; k<lenD; k++){

	      if(data[j]>data[k]){
	        j = k;
	      }
	    }
	    tmp = data[i];
	    data[i] = data[j];
	    data[j] = tmp;
	  }
	  return data;
	}

	public int[] shellSort(int[] data){
	  int lenD = data.length;
	  int inc = lenD/2;
	  while(inc>0){
	    for(int i=inc;i<lenD;i++){
	      int tmp = data[i];
	      int j = i;
	      while(j>=inc && data[j-inc]>tmp){
	        data[j] = data[j-inc];
	        j = j-inc;
	      }
	      data[j] = tmp;
	    }
	    inc = (inc /2);
	  }
	  return data;
	}

	public int[] insertionSort(int[] data){
	  int len = data.length;
	  int key = 0;
	  int i = 0;

	  for(int j = 1;j<len;j++){
	    key = data[j];
	    i = j-1;

	    while(i>=0 && data[i]>key){	    	
	      data[i+1] = data[i];
	      i = i-1;
	      data[i+1]=key;
	    }
	  }
	  return data;
	}

	public int[] bubbleSort(int[] data){
	  int lenD = data.length;
	  int tmp = 0;

	  for(int i = 0;i<lenD;i++)	{

	    for(int j = (lenD-1);j>=(i+1);j--)	{
	      
	      if(data[j]<data[j-1]){
	        tmp = data[j];
	        data[j]=data[j-1];
	        data[j-1]=tmp;
	      }
	    }
	  }
	  return data;
	}



}