package DSA;
public class linearSearch {

   static int linearSearchExample (int[] data, int key) {
    for (int index = 0; index < data.length; index++) {
      if (data[index] == key){ return index;}

    }
    return -1;
  }
  
  //  this code has to be called in the mainclass by the linear search class like this because although it is a static function, it needs to be called by its own class in the main class as that is what runs everything: 
  // System.out.println (linearSearch.linearSearchExample (checker ,3 ));




  
}
