public class Lasagna {
  
    public int expectedMinutesInOven(){
        return 40;
    }


    public int remainingMinutesInOven(int minInOven){
        int result = expectedMinutesInOven() - minInOven;
        return result;
    }

    
    public int preparationTimeInMinutes(int numLayers){
        int result = numLayers * 2;
        return result;
    }

  
    public int totalTimeInMinutes(int numLayers, int minInOven){
        return preparationTimeInMinutes(numLayers) +  minInOven;
    }
}
