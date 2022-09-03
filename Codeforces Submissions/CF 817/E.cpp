
#include <iostream>
#include <vector>
using namespace std;
typedef string String;
typedef bool boolean;
typedef long long ll;
    int main()
    {
        ios_base::sync_with_stdio(false);
        cin.tie(NULL); 
        int t ; cin>>t;
        ll sol = 0;
        for (int i = 0; i<t; ++i)
        {
            sol = 0;
            int n ;cin>>n;
            int q ;cin>>q;
            vector<int> h(n);
            vector<int> w(n);
            vector<int> hs(q);
            vector<int> ws(q);
            vector<int> hb(q);
            vector<int> wb(q);            
            for (int j = 0; j<n; ++j)
            {
                cin>>h[j];
                cin>>w[j];
            }
            for (int j = 0; j<q; ++j)
            {
                cin>>hs[j];
                cin>>ws[j];
                cin>>hb[j];
                cin>>wb[j];                
                sol = 0;
                for (int k = 0; k<n; ++k)
                {
                    if (h[k]>hs[j] && w[k]>ws[j] && h[k]<hb[j] && w[k]<wb[j])
                        sol = sol + h[k]*w[k];
                }
                ;
                cout<<sol<<"\n";
            }            
            ;
        } 
        return 0; 
    }
