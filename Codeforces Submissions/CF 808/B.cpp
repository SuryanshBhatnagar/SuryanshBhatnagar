#define ll long long
#include <iostream>
#include <math.h>
using namespace std;
    int main()
    {
        ios_base::sync_with_stdio(false);
        cin.tie(NULL);        
        ll t;
        cin >> t;
        string sol = "";
        for (int i = 0; i<t; ++i)
        {
            sol = ""; bool flag = true;
            int n;
            cin >> n;
            ll l;
            cin >> l;
            ll r;
            cin >> r;
            flag = (l<=r); ll p = l;
            if ((p%n != 0) && flag)
            {
                ll zz = p+n-(p%n);
                if (zz>r || zz%n!=0)
                    flag = false;                
            }
            for (int j = 0; j<n && flag && p<=r; ++j)
            {
                ll tt = j+1;
                p = l;
                if (p%tt != 0 && flag)
                {
                    ll x = p%tt;
                    p = p+tt-x;
                    if (p>r || p%tt!=0)
                        flag = false;
                }
                sol = sol + "" + to_string(p) + " ";
            }
            if (!flag)
                sol = "NO";
            else 
            {
                sol = "YES\n"+sol;
            } 
            cout<< sol << "\n";           
        }
    }        