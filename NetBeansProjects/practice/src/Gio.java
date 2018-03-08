
public class Gio {

    public static void main(String[] args) {

        Gio start = new Gio();

    }

    int head;
    int[] A = {1, 1, 1, 2, 2};
    int[] E = {1, 2, 2, 3};

    public Gio() {

        System.out.println(getCount(A, E));

    }

    public int getCount(int[] A, int[] E) {
        int max = 0;

        if (E.length > 1) {

            int[] back = new int[E.length / 2];
            int[] count = new int[E.length / 2];
            int i = 0;
            int co = 0;
            int k = 0;

            //first back
            do {

                if (E.length >= 2) {
                    //if node has two child put a pointer
                    for (int p = i + 2; p <= E.length - 2; p += 2) {

                        if (E[p] == E[i]) {

                            back[k] = p;
                            count[k] = co;
                            ++k;
                            break;
                        }

                    }
                }

                //check for match- false - return
                if (A[E[i] - 1] == A[E[i + 1] - 1]) {

                    ++co;
                } else {
                    
                    max = (max < co) ? co : max;
                    --k;
                    if (k >= 0) {
                        i = back[k];
                        
                        co = count[k];
                    }

                    continue;
                }

                /*find the next node*/
              if( E.length > 2){
                  
                  for (int p = i + 2; p <= E.length - 2; p += 2) {

                    if (E[i + 1] == E[p]) {
                        i = p;
                        break;
                    } else if (p == E.length - 2) {
                        
                        max = (max < co) ? co : max;
                        --k;
                        
                        if(k >= 0){
                            
                            i = back[k];
                            co = count[k];
                        }
                       
                    }

                }
              }  
             
              else{
                  
                  --k;
              }
                
            } while (k >= 0);
        }

        return max;
    }

}
