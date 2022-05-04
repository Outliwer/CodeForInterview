## 笔试模板

* 谷歌`Java`笔试

    ```
    import java.util.*;
    import java.io.*;
    import java.text.DecimalFormat;
    
    public class Main {
        public static void main(String[] args) {
            Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
            int numCases = sc.nextInt();
    
            for (int caseId = 1; caseId <= numCases; caseId++) {
                // Inputs
                int N = sc.nextInt();
                int M = sc.nextInt();
    
                // Processing
                double num = N - M;
                double den = N + M;
                double ans = num / den;
                String result = new DecimalFormat("#0.00000000").format(ans);
    
                // Print results
                p("Case #" + caseId + ": " + result);
            }
        }
    
        private static void p() {
            p("");
        }
    
        private static void p(String s) {
            System.out.println(s);
        }
    }
    
    ```
    

