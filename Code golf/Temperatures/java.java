import java.util.*;import java.io.*;import java.math.*;
class Solution{static void main(String args[]){
Scanner i=new Scanner(System.in);int n=i.nextInt(),r=0;i.nextLine();int[] t=new int[n];
try{t=Arrays.stream(i.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();r=t[0];}catch(Exception e){}
for(int j=0;j<n;j++){int k=t[j],l=Math.abs(k),m=Math.abs(r);if(m>l||m==l&&r<k) r=k;}System.out.println(r);}}
