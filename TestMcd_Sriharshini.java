//Sriharshini Addagudi
public class TestMcd_Sriharshini {

    // returns the minimmum common denominator
    public static int mcd(int a, int b) {
	if(a==b)
	    return a;
	else if (a>b) 
	    return mcd(a-b,b);
	else
	    return mcd(b-a,a);
    }

    public static int largest(int arr[]){
	assert(arr.length>0);
	int curLargest=arr[0];
	for(int i=1; i<arr.length; ++i) {
	    if(arr[i]>curLargest) 
		curLargest=arr[i];
	}
	return curLargest;
    }

    public static void main(String args[]) {
	int arr[]={1,3,4,5,6,7,15,13,2};

	System.out.println(largest(arr));
	
    }
}

