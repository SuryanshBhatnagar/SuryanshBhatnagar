#include <iostream>
#include <vector>
using namespace std;
typedef string String;
typedef bool boolean;
    int main()
    {
        ios_base::sync_with_stdio(false);
        cin.tie(NULL);        
        int t ; cin>>t;
        String sol = "";
        for (int i = 0; i<t; ++i)
        {
            sol = "";
            int n ; cin>>n;
            vector<String> a(n); String a1 = ""; int aa = 0;
            vector<String> b(n); String b1 = ""; int bb = 0;
            vector<String> c(n); String c1 = ""; int cc = 0;
            for (int j = 0; j<n ; ++j)
            {
                cin>>a[j];
                if (j!=n-1)
                   a1 = a1 + a[j] + " ";
               else 
                   a1 = a1 + a[j];
            }
            for (int j = 0; j<n ; ++j)
            {
                cin>>b[j];
                if (j!=n-1)
                   b1 = b1 + b[j] + " ";
                else 
                    b1 = b1 + b[j];
            }
            for (int j = 0; j<n ; ++j)
            {
                cin>>c[j];
                c1 = c1 + c[j] + " ";
            }
            for (int j = 0; j<n ; ++j)
            {
                boolean ba = b1.find(a[j]);
                boolean ca = c1.find(a[j]);
                boolean ab = a1.find(b[j]);
                boolean cb = c1.find(b[j]);
                boolean ac = a1.find(c[j]);
                boolean bc = b1.find(c[j]);
                if (ba+ca == 2)
                {
                    aa+=0;
                }
                else if (ba+ca ==1)
                {
                    aa+=1;
                }
                else
                {
                    aa+=3;
                }
                ;
                if (ab+cb==2)
                {
                    bb+=0;
                }
                else if (ab+cb==1)
                {
                    bb+=1;
                }
                else
                {
                    bb+=3;
                }
                ;
                if (bc+ac==2)
                {
                    cc+=0;
                }
                else if (bc+ac==1)
                {
                    cc+=1;
                }
                else
                {
                    cc+=3;
                }
            }
            cout<<aa<<" "<<bb<<" "<<cc<<"\n";
        }
        return 0;  
    }
