//The program is a simple Bubble Sort but I am getting an index.outOfBounds exception when trying to run the program.I put 7 for array.length but it can be any number.Here is my program

public class BubbleSort{
public static void bubbleSort( int b[] )
{
for(int pass = 1; pass < b.length; pass++) // passes
for(int i = 0; i < b.length - 1; i++) // one pass
if( b[i] > b[i + 1] ) // one comparison
swap(b, i, i + 1); // one swap
}

// swap two elements of the array
public static void swap( int c[], int first, int second )
{
int hold; // temp holding area for swap
hold = c[first];
c[first] = c[second];
c[second] = hold;
}
public static void main(String[] args){
int s = Integer.parseInt(args[7]);
int d[] = new int [s];
bubbleSort(d);
for(int i = 0; i < d.length; i++){
System.out.println(d[i]);
}
}
}