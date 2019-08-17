package com.bridgelab.algorithm;

public class MergeSort {
	int [] array;
	int[]tempMergeArr;
	int length; 
	public void sort(int inputArray[]) {
		this.array=inputArray;
		this.length=inputArray.length;
		this.tempMergeArr=new int [length];
		divideArray(0,length-1);
	}
	public void divideArray(int lowerIndex,int higherIndex) {
		if(lowerIndex < higherIndex) {
			int middle=lowerIndex+(higherIndex-lowerIndex)/2;
			divideArray(lowerIndex,middle);
			divideArray(middle+1,higherIndex);
			mergeArray(lowerIndex,middle,higherIndex);
			
		}
	}
	public void mergeArray(int lowerIndex,int middle,int higherIndex) {
		for(int i=lowerIndex;i<=higherIndex;i++) {
			tempMergeArr[i]=array[i];
		}
		int i=lowerIndex;
		int j=middle;
		int k=lowerIndex;
		while(i<=middle && j<=higherIndex) {
			if(tempMergeArr[i]<=tempMergeArr[j]) {
				array[k]=tempMergeArr[i];
				i++;
				
				
			}else {
				array[k]=tempMergeArr[j];
				j++;
			}
			k++;
			}
		while(i<=middle) {
				array[k]=tempMergeArr[i];
				k++;
				i++;
			}
		}
	public static void main(String args[]) {
		int[]inputArr= {21,65,87,52,33,74,65,69,47,26};
		MergeSort ms=new MergeSort();
		ms.sort(inputArr);
		for(int i=0;i<=inputArr.length;i++) {
			System.out.print(i +" ");
		}
	}
	}



