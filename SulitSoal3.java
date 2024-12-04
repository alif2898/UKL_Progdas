class SulitSoal3 {
  public static void main(String[] args) {

     System.out.println("Array tidak memiliki elemen duplikat.");
    
     int[] array = {1, 2, 2, 3, 3, 3, 4, 1,1,4,5};
    int n = array.length;
               
      // Array untuk menyimpan elemen yang sudah dihitung
        boolean[] sudahDihitung = new boolean[n];
               
       for (int i = 0; i < n; i++) {
      if (sudahDihitung[i]) {
      continue;
      }
               
         int count = 1;
          for (int j = i + 1; j < n; j++) {
           if (array[i] == array[j]) {
          sudahDihitung[j] = true;
           count++;
           }
       }
             System.out.println(array[i] + " muncul " + count + " kali");
               
       }
    }
}