/*To search for a word in a dictionary, you don’t review all the words; you just check one word in the middle and thus narrow down the set of remaining words to check. The divide and conquer principle may be helpful to search for a given word in a dictionary.

Consider a sorted a list of numbers to apply the principle.

Implement java code to search for a given word in a dictionary. (Binary Search)*/



import java.util.Scanner;

class Experiment_05 {

  public static void main(String[] args) {
    int a[];   // only a array reference
    int n;

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of the array:");
    n = sc.nextInt();

    a = new int[n];
    
    // Take array input
    System.out.println("Enter values into array:");
    for (int i = 0; i < n; ++i) 
    {
        System.out.printf("Enter %d index elem:", i);
        a[i] = sc.nextInt();
    }

    System.out.print("Enter an element to search: ");
    int key = sc.nextInt();

    int position = binarySearch(a, a.length, key);

    if (position == -1) 
    {
        System.out.println("Key not found :(");
    }
    else{
        System.out.println("Key found at " + position + "position");
    }
  }

  public static int binarySearch(int a[], int n, int key)
  {
      int lb, ub, mid;
      lb = 0;
      ub = n - 1;
      
      while (lb <= ub)
      {
          mid = (lb + ub) / 2;
          if (a[mid] == key)
          {
              return key;
          }
          else {
            if (a[mid] < key)
            {
                lb = mid + 1;
            }
            else {
                ub = mid - 1;
            }
          }
      }
      return -1;
  }
}
