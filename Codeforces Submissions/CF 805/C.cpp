#include <bits/stdc++.h>
using namespace std;
    int main()
    {
        long long t; cin >> t;
        string sol = "";
        for (long long ii = 0; ii<t; ++ii)
        {
            sol = "";
            long long n; cin >> n;
            long long k; cin >> k;
            vector<long long> u(n);
            vector<long long> a(n);
            vector<long long> b(n);
            for (long long i = 0; i<n; ++i)
            {
                cin >> u[i];
            }
            for (long long i = 0; i<k; ++i)
            {
                cin >> a[i];
                cin >> b[i];
                bool flagA = true; bool flagB = true;
                long long indexA = -1; long long indexB = -1;
                for (long long j = 0; j<n && flagA ; ++j)
                {
                    if (u[j] == a[i])
                    {
                        indexA = j;
                        flagA = false;
                    }
                }
                if (indexA == -1)
                    sol += "NO\n";
                else 
                {
                    for (long long j = indexA; j<n && flagB; ++j)
                    {
                        if (u[j] == b[i])
                        {
                            indexB = j;
                            flagB = false;
                        }
                    }
                    if (indexB == -1)
                        sol += "NO\n";
                    else 
                        sol += "YES\n";     
                }
            }
            cout<<sol;
        }  
    }      