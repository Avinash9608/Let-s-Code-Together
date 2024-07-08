package CodeToGether;

import java.util.LinkedHashMap;
import java.util.Map;

public class OddColorBallonIdentify {

        public static void main(String args[])
        {
//            char colorArr[]={'a','b','b','b','c','c','c','a','f','c'};
            char colorArr[]={'a','b','b','b','c','c','c','a','b','c'};
            LinkedHashMap<Character,Integer> res=new LinkedHashMap<>();
            for (int i=0;i< colorArr.length;i++)
            {
                res.put(colorArr[i],res.getOrDefault(colorArr[i],0)+1);
            }
            for (Map.Entry<Character,Integer> entry: res.entrySet())
            {

                if(entry.getValue()%2!=0) {
                    System.out.println("Output is " + entry.getKey());
                    break;
                }else
                {
                    System.out.println("All are even");
                    break;
                }
            }
        }

        
}
