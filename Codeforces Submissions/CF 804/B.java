import java.util.*;
public class B
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        String sol[] = new String[t];
        for (int i = 0; i<t; ++i)
        {
            int n = Integer.parseInt(sc.next().trim());
            int m = Integer.parseInt(sc.next().trim());
            int [][]A = new int[n][m];
            boolean visited[][] = new boolean[n][m];
            for (int f = 0; f<n ; ++f)
            {
                if (f%2 == 0)
                {
                    A[f][0] = 1;
                    visited[f][0] = true;
                }
                if (f%2 == 1)
                {
                    A[f][0] = 0;
                    visited[f][0] = true;
                }
            }
            for (int j = 1; j<n; ++j)
            {
                for (int k = 0; k<m && !visited[j][k]; ++k)
                {
                    if (j == 0 && k ==0 && !(visited[0][0]))
                    {
                        A[0][0] = 1; visited[0][0] = true;
                        A[0][1] = 0; visited[0][1] = true;
                        A[1][0] = 0; visited[1][0] = true;
                    }
                    else
                    {
                        if (!visited[j][k])
                        {
                            if (j-1>=0 && j<n-1)
                            {
                                if (k-1>=0 && k<m-1)
                                {
                                    if ((A[j-1][k] == A[j][k-1]))
                                    {
                                        A[j][k] = A[j-1][k];
                                        if(A[j][k]==0)
                                        {
                                            if(j+1<n)
                                            {
                                                A[j+1][k] = 1;
                                                visited[j+1][k] = true;
                                            }
                                            if(k+1<m)
                                            {
                                                A[j][k+1] = 1;
                                                visited[j][k+1] = true;
                                            }                                            
                                        }
                                        if(A[j][k]==1)
                                        {
                                            if(j+1<n)
                                            {
                                                A[j+1][k] = 0;
                                                visited[j+1][k] = true;
                                            }
                                            if(k+1<m)
                                            {
                                                A[j][k+1] = 0;
                                                visited[j][k+1] = true;
                                            }                                            
                                        }
                                        visited[j][k] = true;                                        
                                    }
                                    if (A[j-1][k] != A[j][k-1])
                                    {
                                        A[j][k] = A[j-1][k];
                                        if(A[j][k]==0)
                                        {
                                            if(j+1<n)
                                            {
                                                A[j+1][k] = 0;
                                                visited[j+1][k] = true;
                                            }
                                            if(k+1<m)
                                            {
                                                A[j][k+1] = 1;
                                                visited[j][k+1] = true;
                                            }                                            
                                        }
                                        if(A[j][k]==1)
                                        {
                                            if(j+1<n)
                                            {
                                                A[j+1][k] = 1;
                                                visited[j+1][k] = true;
                                            }
                                            if(k+1<m)
                                            {
                                                A[j][k+1] = 0;
                                                visited[j][k+1] = true;
                                            }                                            
                                        }
                                        visited[j][k] = true;                                         
                                    }                                    
                                }
                                else
                                {
                                    visited[j][k] = true;
                                    if(k == 0  && !visited[j][k])
                                    {
                                        if (A[j-1][k] == 0)
                                        {
                                           A[j][k] = 1;
                                           A[j][k+1] = 0; visited[j][k+1] = true;
                                           A[j+1][k] = 1; visited[j+1][k] = true;
                                        }
                                        if (A[j-1][k] == 1)
                                        {
                                           A[j][k] = 1;
                                           A[j][k+1] = 0; visited[j][k+1] = true;
                                           A[j+1][k] = 0; visited[j+1][k] = true;
                                        }                                        
                                    }
                                    if (k==(m-1) && !visited[j][k])
                                    {
                                        if (A[j-1][k] == 0)
                                        {
                                           if (A[j][k-1] == 0){ 
                                           A[j][k] = 1;
                                           A[j+1][k] = 1; visited[j+1][k] = true;}
                                           if (A[j][k-1] == 1){ 
                                           A[j][k] = 1;
                                           A[j+1][k] = 0; visited[j+1][k] = true;}                                           
                                        }
                                        if (A[j-1][k] == 1)
                                        {
                                           if (A[j][k-1] == 0){ 
                                           A[j][k] = 1;
                                           A[j+1][k] = 0; visited[j+1][k] = true;}
                                           if (A[j][k-1] == 1){ 
                                           A[j][k] = 0;
                                           A[j+1][k] = 0; visited[j+1][k] = true;}                                           
                                        }                                        
                                    }
                                }
                            }
                            else
                            {
                                for (int k2 = 1; k2<m-1; ++k2)
                                {
                                  if (!visited[j][k2]){
                                    visited[j][k2] = true;
                                    if (j == 0 && (k2>0 && k2< (m-1)))
                                    {
                                        if (A[j][k2-1] == 0)
                                        {
                                           A[j][k2] = 1;
                                           A[j][k2+1] = 0; visited[j][k2+1] = true;
                                           A[j+1][k2] = 1; visited[j+1][k2] = true;
                                        }
                                        if (A[j][k2-1] == 1)
                                        {
                                           A[j][k2] = 1;
                                           A[j][k2+1] = 0; visited[j][k2+1] = true;
                                           A[j+1][k2] = 0; visited[j+1][k2] = true;
                                        }                                                                                
                                    }
                                    if (j == m-1 && (k2>0 && k2< (m-1)))
                                    {
                                        if (A[j][k2-1] == 0)
                                        {
                                           A[j][k2] = 1;
                                           A[j][k2+1] = 0; visited[j][k2+1] = true;
                                        }
                                        if (A[j][k2-1] == 1)
                                        {
                                           A[j][k2] = 0;
                                           A[j][k2+1] = 1; visited[j][k2+1] = true;
                                        }                                                                                
                                    }
                                }}                                        
                            }
                        }
                    }
                }
            }
            sol[i] = "";
            for (int j = 0; j<n; ++j)
            {
                for (int k = 0; k<m; ++k)
                {
                    if(k!=m-1)
                    {
                        sol[i] = sol[i] + A[j][k]+" ";
                    }
                    else 
                    {
                        sol[i] = sol[i] + A[j][k];
                    }
                }
                sol[i] = sol[i] + "\n";
            }
        }
        for (int i = 0; i<t; ++i)
        {
            System.out.print(sol[i]);
        }
    }
}    
             

