public class ShellShort{

    public static void main(String args[]){
        int[] intArray={22,-65,36,10,-34,67};

        for(int gap=intArray.length/2;gap>0;gap/=2){
            for(int i=gap;i<intArray.length;i++){
              int newElement=intArray[i];

              int j=i;
                while(j>=gap && intArray[j-gap]>newElement){
                    intArray[i]=intArray[j-gap];
                    j-=gap;

                }
              intArray[j]=newElement;

            }

        }

        for(int k=0; k < intArray.length;k++){

          System.out.println(intArray[k]);
        }


    }


}
