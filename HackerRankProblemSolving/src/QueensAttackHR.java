import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class QueensAttackHRResult {

    /*
     * Complete the 'queensAttack' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER k
     *  3. INTEGER r_q
     *  4. INTEGER c_q
     *  5. 2D_INTEGER_ARRAY obstacles
     */

    public static int queensAttack(int n, int k, int r_q, int c_q, List<List<Integer>> obstacles) {
    // Write your code here
        int count=0;
        int count_up=0;
        int count_down=0;
        int count_left=0;
        int count_right=0;
        int count_left_up=0;
        int count_right_up=0;
        int count_left_down=0;
        int count_right_down=0;
        int ob_left=0;
        int ob_right=n+1;
        int ob_up=n+1;
        int ob_down=0;
        List<Integer>obs_left_up= new ArrayList<Integer>();
        obs_left_up.add(n+1);
        obs_left_up.add(0);
        
        List<Integer>obs_right_up= new ArrayList<Integer>();
        obs_right_up.add(n+1);
        obs_right_up.add(n+1);
        
        List<Integer>obs_left_down= new ArrayList<Integer>();
        obs_left_down.add(0);
        obs_left_down.add(0);
        
        List<Integer>obs_right_down= new ArrayList<Integer>();
        obs_right_down.add(0);
        obs_right_down.add(n+1);
        
        //Limpiar las posiciones repetidas de los obstáculos.
        Set<List<Integer>> hashSet = new HashSet<List<Integer>>(obstacles);
        obstacles.clear();
        obstacles.addAll(hashSet);
        //Se cuentan todos los cuadros desde la posición de la reina
        //Horizontal hacia la izquierda
        
        count_left=c_q-1;
        
        //Horizontal hacia la derecha
        count_right=n-c_q;
        
        //De la reina hacia arriba
        count_up=n-r_q;
        //De la reina hacia abajo
        count_down=(r_q-1);
        //Diagonal izquierda arriba
        if(count_left<=count_up) {
        	count_left_up=count_left;
        }
        else if(count_up<=count_left) {
        	count_left_up=count_up;
        }
        //Diagonal derecha_arriba
        if(count_right<=count_up) {
        	count_right_up=count_right;
        }
        else if(count_up<=count_right) {
        	count_right_up=count_up;
        }
        //Diagonal izquierda abajo
        if(count_left<=count_down) {
        	count_left_down=count_left;
        }
        else if(count_down<=count_left) {
        	count_left_down=count_down;
        }
        
        //Diagonal derecha_abajo
        if(count_right<=count_down) {
        	count_right_down=count_right;
        }
        else if(count_down<=count_right) {
        	count_right_down=count_down;
        }
        
             
        for(int i=0; i<obstacles.size(); i++) {
        	List<Integer> obs_aux=obstacles.get(i);
        	if(count_left>0) {
        		if((int)obs_aux.get(0)==r_q) {
        			//System.out.println(ob_left+ " "+ (int)obs_aux.get(1)+ " "+ c_q);
        			if((int)obs_aux.get(1)<c_q) {
        				if((int)obs_aux.get(1)>=ob_left) {
        					ob_left=(int)obs_aux.get(1);
        				}
        			}
        		}
        	}
        	if(count_right>0) {
        		if((int)obs_aux.get(0)==r_q) {
        			if((int)obs_aux.get(1)>c_q) {
        				if((int)obs_aux.get(1)<=ob_right) {
        					ob_right=(int)obs_aux.get(1);
        				}
        			}
        		}
        	}
        	if(count_up>0) {
        		if((int)obs_aux.get(1)==c_q) {
        			if((int)obs_aux.get(0)>r_q) {
        				if((int)obs_aux.get(0)<=ob_up) {
        					ob_up=(int)obs_aux.get(0);
        				}
        			}
        		}
        	}
        	if(count_down>0) {
        		if((int)obs_aux.get(1)==c_q) {
        			if((int)obs_aux.get(0)<r_q) {
        				if((int)obs_aux.get(0)>=ob_down) {
        					ob_down=(int)obs_aux.get(0);
        				}
        			}
        		}
        	}
        	if(count_left_up>0) {
        		if((int)obs_aux.get(0)>r_q && (int)obs_aux.get(1)<c_q) {
        			if((int)Math.abs((c_q-(int)obs_aux.get(1)))+r_q==(int)obs_aux.get(0)) {
        				if((int)obs_aux.get(0)<=(int)obs_left_up.get(0) && (int)obs_aux.get(1)>=obs_left_up.get(1)) {
        					obs_left_up.set(0,(int)obs_aux.get(0));
        					obs_left_up.set(1,(int)obs_aux.get(1));
        				}
        				
        			}
        		}
        	}
        	if(count_right_up>0) {
        		if((int)obs_aux.get(0)>r_q && (int)obs_aux.get(1)>c_q) {
        			if((int)Math.abs(((int)obs_aux.get(1)-c_q)+r_q)==(int)obs_aux.get(0)) {
        				if((int)obs_aux.get(0)<=(int)obs_right_up.get(0) && (int)obs_aux.get(1)<=obs_right_up.get(1)) {
        					obs_right_up.set(0,(int)obs_aux.get(0));
        					obs_right_up.set(1,(int)obs_aux.get(1));
        				}
        				
        			}
        		}
        	}
        	if(count_left_down>0) {
        		if((int)obs_aux.get(0)<r_q && (int)obs_aux.get(1)<c_q) {
            		if((int)Math.abs((c_q-(int)obs_aux.get(1))-r_q)==(int)obs_aux.get(0)) {
        				if((int)obs_aux.get(0)>=(int)obs_left_down.get(0) && (int)obs_aux.get(1)>=obs_left_down.get(1)) {
        					obs_left_down.set(0,(int)obs_aux.get(0));
        					obs_left_down.set(1,(int)obs_aux.get(1));
        				}
        				
        			}
        		}
        	}
        	if(count_right_down>0) {
        		if((int)obs_aux.get(0)<r_q && (int)obs_aux.get(1)>c_q) {
        			if((int)Math.abs((r_q-(int)obs_aux.get(0)))+c_q==(int)obs_aux.get(1)) {
        				if((int)obs_aux.get(0)>=(int)obs_right_down.get(0) && (int)obs_aux.get(1)<=obs_right_down.get(1)) {
        					obs_right_down.set(0,(int)obs_aux.get(0));
        					obs_right_down.set(1,(int)obs_aux.get(1));
        				}
        				
        			}
        		}
        	}
        }
        
        System.out.println(obs_left_down);
        count_left=count_left-ob_left;
        if(ob_right!=n+1) {
        	count_right=count_right-(n-ob_right)-1;
        }
        if(ob_up!=n+1) {
        	count_up=count_up-(n-ob_up)-1;
        }
        count_down=count_down-ob_down;
        int ob_left_up=0;
        if(obs_left_up.get(0)!=n+1 && obs_left_up.get(1)!=0) {
        	int left=obs_left_up.get(1);
        	int up=(n-obs_left_up.get(0))+1;
        	if(left<=up) {
        		ob_left_up=left;
        	}
        	else if(up<=left){
        		ob_left_up=up;
        	}
        }
        count_left_up=count_left_up-ob_left_up;
        int ob_right_up=0;
        if(obs_right_up.get(0)!=n+1 && obs_right_up.get(1)!=n+1) {
        	int right=(n-obs_right_up.get(1))+1;
        	int up=(n-obs_right_up.get(0))+1;
        	if(right<=up) {
        		ob_right_up=right;
        	}
        	else if(up<=right){
        		ob_right_up=up;
        	}
        }
        count_right_up=count_right_up-ob_right_up;
        int ob_left_down=0;
        if(obs_left_down.get(0)!=0 && obs_left_down.get(1)!=0) {
        	int left=obs_left_down.get(1);
        	int down=obs_left_down.get(0);
        	if(left<=down) {
        		ob_left_down=left;
        	}
        	else if(down<=left){
        		ob_left_down=down;
        	}
        }
        count_left_down=count_left_down-ob_left_down;
        int ob_right_down=0;
        if(obs_right_down.get(0)!=0 && obs_right_down.get(1)!=n+1) {
        	int right=(n-obs_right_down.get(1))+1;
        	int down=obs_right_down.get(0);
        	if(right<=down) {
        		ob_right_down=right;
        	}
        	else if(down<=right){
        		ob_right_down=down;
        	}
        }
        count_right_down=count_right_down-ob_right_down;
        count=count_left+count_right+count_up+count_down+count_left_up+count_right_up+count_left_down+count_right_down;
        System.out.println(count);
        return count; 

    }

}

public class QueensAttackHR {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        
        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);

        int k = Integer.parseInt(firstMultipleInput[1]);

        String[] secondMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int r_q = Integer.parseInt(secondMultipleInput[0]);

        int c_q = Integer.parseInt(secondMultipleInput[1]);

        List<List<Integer>> obstacles = new ArrayList<>();

        for (int i = 0; i < k; i++) {
            String[] obstaclesRowTempItems = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

            List<Integer> obstaclesRowItems = new ArrayList<>();

            for (int j = 0; j < 2; j++) {
                int obstaclesItem = Integer.parseInt(obstaclesRowTempItems[j]);
                obstaclesRowItems.add(obstaclesItem);
            }

            obstacles.add(obstaclesRowItems);
        }

        int result = QueensAttackHRResult.queensAttack(n, k, r_q, c_q, obstacles);

        
        bufferedReader.close();
        
    }
}

