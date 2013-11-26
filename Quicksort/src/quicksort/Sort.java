package quicksort;

public class Sort {
    
    public void quicksort(int[] array){
        quicksort(array, 0, array.length-1);
    }
    
    private void quicksort(int[] array, int pivotIndex,int rangeIndex){
        int i, j, pivot, aux;
        i = pivotIndex;
        j = rangeIndex;
        pivot = array[(pivotIndex+rangeIndex)/2];
        while(i<j){
            while(array[i] < pivot){
                i++;
            }
            while(array[j] > pivot){
                j--;
            }
            if(i<=j){
                aux = array[i];
                array[i] = array[j];
                array[j] = aux;
                i++;
                j--;
            }
        }
        if(j>pivotIndex){
            quicksort(array, pivotIndex, j);
        }
        if(i<rangeIndex){
            quicksort(array, i, rangeIndex);
        }
// pseudocode:        
//        var
//   i, j, pivo, aux
//início
//   i <- IniVet
//   j <- FimVet
//   pivo <- X[(IniVet + FimVet) div 2]
//      enquanto(i < j)
//       |      enquanto (X[i] < pivo) faça
//       |        |   i <- i + 1
//       |      fimEnquanto
//       |      enquanto (X[j] > pivo) faça
//       |        |   j <- j - 1
//       |      fimEnquanto
//       |      se (i <= j) então 
//       |        |  aux  <- X[i]
//       |        |   X[i] <- X[j]
//       |        |   X[j] <- aux
//       |        |   i <- i + 1
//       |        |   j <- j - 1
//       |      fimSe
//       fimEnquanto       
//       se (j > IniVet) então
//          |   QuickSort(X, IniVet, j)
//       fimSe
//       se (i < FimVet) então
//       |  QuickSort(X, i, FimVet)
//       fimse
//fimprocedimento     
        
        
    }
    
}
