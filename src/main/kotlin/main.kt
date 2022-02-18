fun main() {

    //https://app.patika.dev/moduller/veri-yapilari-ve-algoritmalar/insertion-sort-proje
    //[22,27,16,2,18,6] -> Insertion Sort
    //[7,3,5,8,2,9,4,15,6] -> Insertion Sort

    val myArray = mutableListOf(22,27,16,2,18,6)
    val myArray2 = mutableListOf(7,3,5,8,2,9,4,15,6)

    insertionSort(myArray)
    insertionSort(myArray2)

}

fun insertionSort(arr: MutableList<Int>){
    var temp: Int

    println("INSERTION SORT FOR THE ARRAY: $arr")

    for(i in 1 until arr.size){
        if(arr[i] < arr[i-1]){
            for(j in 0 until arr.size){
                if(arr[i] < arr[j]){
                    temp = arr[i]
                    arr.removeAt(i)
                    arr.add(j, temp)

                    println(arr)
                }
            }
        }

    }
}