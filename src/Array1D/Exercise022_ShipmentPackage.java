package Array1D;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Exercise022_ShipmentPackage {
    static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];
        int s = Integer.parseInt(st.nextToken());

        StringTokenizer st2 = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++){
            arr[i] = Integer.parseInt(st2.nextToken());
        }

        int sum = 0;
        int container = 0;

        for(int i = 0; i < n; i++){
            sum += arr[i];
            if(sum > s){
                container++;
                sum = arr[i];
            }
        }
        container++;
        System.out.println(container);

        br.close();
    }
}
