public class MergeSort {
	//DIVIDES THE ARRAY UP INTO PIECES, SORTS EACH PIECE, THEN MERGES THEM TOGETHER 
	public static Student[] sort(Student[] list){
		//todo: you should implement this method
		return null;
	}

	//MERGES TWO SORTED ARRAYS INTO A SINGLE SORTED ARRAY
	public static Student[] merge(Student[] list1, Student[] list2){
		int i = 0, j = 0, k = 0;
		Student[] merged = new Student[list1.length + list2.length];

		while(k < list1.length + list2.length){
			if(i == list1.length || j == list2.length){
				if(i == list1.length){
					for(; j < list2.length; j++, k++){
						merged[k] = list2[j];
					}
				}
				else if(j == list2.length){
					for(; i < list1.length; i++, k++){
						merged[k] = list1[i];
					}
				}
			}
			else{
				if(list1[i].compareTo(list2[j]) <= 0){
					merged[k] = list1[i];
					i++;
					k++;
				}
				else{
					merged[k] = list2[j];
					j++;
					k++;
				}
			}
		}
		return merged;
	}
}
