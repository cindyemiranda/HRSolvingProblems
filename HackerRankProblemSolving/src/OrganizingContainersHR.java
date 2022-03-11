import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class OrganizingContainersResult {

    /*
     * Complete the 'organizingContainers' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts 2D_INTEGER_ARRAY container as parameter.
     */

    public static String organizingContainers(List<List<Integer>> container) {
    // Write your code here
    	// Write your code here
        String result="Possible";
        int size_containers=container.size();
        long min_sum=0;
        int max=0;
        int index_min=0;
        int index_max=0;
        List<Long>SumTypes= new ArrayList<Long>();
        //Suma las cantidades de bolas por tipo;
        for(int i=0; i<size_containers; i++) {
            long sum=0;
            for(int j=0; j<size_containers; j++){
            	if(i!=j) {
            		sum=sum+(long)container.get(j).get(i);
            	}
                
            }
            SumTypes.add(sum);
                        
        }
        min_sum=Collections.min(SumTypes);
        for(int i=0; i<SumTypes.size(); i++) {
        	if(min_sum==SumTypes.get(i)) {
        		index_min=i;
        		break;
        	}
        }
        //Obtener de la columna index_min el numero más grande;
        for(int i=0; i<container.size(); i++) {
        	if(i!=index_min) {
        		if(container.get(i).get(index_min)>=max) {
        			max=container.get(i).get(index_min);
        		}
        	}
        }
        //Restar el numero más grande de todas las filas y columnas
        for(int i=0; i<size_containers; i++) {
        	int max_aux=max;
        	for(int j=0; j<size_containers; j++){
        		if(i!=j) {
        			if(container.get(j).get(i)>=max_aux) {
                		container.get(j).set(i,container.get(j).get(i)-max_aux);
                		break;
                	}
                	else {
                		container.get(j).set(i,0);
                		max_aux=max_aux-container.get(j).get(i);
                	}
        		}
            }
            container.get(i).set(i,container.get(i).get(i)+max);
            
        }
    	System.out.println(SumTypes);
    	System.out.println(min_sum);
    	System.out.println(index_min);
    	System.out.println(max);
    	System.out.println(container);
    	System.out.println(result);
    	return result;

    }

}

public class OrganizingContainersHR {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        
        int q = Integer.parseInt(bufferedReader.readLine().trim());

        for (int qItr = 0; qItr < q; qItr++) {
            int n = Integer.parseInt(bufferedReader.readLine().trim());

            List<List<Integer>> container = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                String[] containerRowTempItems = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

                List<Integer> containerRowItems = new ArrayList<>();

                for (int j = 0; j < n; j++) {
                    int containerItem = Integer.parseInt(containerRowTempItems[j]);
                    containerRowItems.add(containerItem);
                }

                container.add(containerRowItems);
            }

            String result = OrganizingContainersResult.organizingContainers(container);

           
        }

        bufferedReader.close();
        
    }
}
