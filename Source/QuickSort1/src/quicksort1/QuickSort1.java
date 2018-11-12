/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quicksort1;

/**
 *
 * @author Hp
 */
public class QuickSort1 {
   
    public static void main(String[] args) {
       int nums[]={3,7,8,4,2,1,9,5,5};
       int low=0;
       int high=nums.length-1;
       quickSort(nums,low,high);
       System.out.println("Assending order");  
          for(int i=0;i<nums.length;i++)
              System.out.println(nums[i]);
       
    }
    public static void quickSort(int nums[],int low,int high)
    {
        if(nums==null||nums.length==0)
            return;
        if(low>=high)
            return;
        int middle=low+(high-low)/2;
        int pivot=nums[middle];
        int i=low,j=high;
        while(i<=j)
        {
            while (nums[i]<pivot)
            {
                i++;
                
            }
            while (nums[j]>pivot)
            {
                j--;
            }
            if(i<=j)
            {
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                i++;
                j--;
            }
        }
        if(low<j)
            quickSort(nums,low,j);
            if(high>i)
            
                quickSort(nums,i,high);
          
    }    
}
