#include <iostream>
#include <math.h>
#include <vector>
using namespace std;

    int main()
    {
        ios_base::sync_with_stdio(false);
        cin.tie(NULL);
        int t; cin >> t;
        for (int i = 0; i<t; ++i)
        {
            int n;
            cin >> n;
            vector<int> c(n);
            vector<int> d(n);
            vector<int> e(n);
            vector<int> ff(n);
            for (int j = 0; j<n; ++j)
            {
                cin >> c[j];
                c[j]--;
                if (e[c[j]] == 0)
                {
                    ff[c[j]] = j;
                }
                //f[c[j]][e[c[j]]] = j;
                //for (int k = 0; k<=e[c[j]]; ++k)
                //{
                    int temp = j - ff[c[j]];
                    if ((temp%2 == 1) && (d[c[j]]%2 == 0))
                    {
                        d[c[j]]++;
                    }
                    else if ((temp%2 == 0) && (d[c[j]]%2 == 1))
                    {
                        d[c[j]]++;
                    }
                //}
                e[c[j]]++;
            }
            if (e[0] != 0)
            {
                cout << ((d[0])+(1));
            }
            else
            {
                cout << 0;
            }
            for (int j = 1; j<n; ++j)
            {
                int ans = 0;
                if (e[j] != 0)
                {
                    ans = d[j];
                    ans = ans + 1;
                    /*for(int k = 0; k<=e[c[j]]; ++k)
                    {
                        if (ans<(d[j][k]+1))
                            ans = d[j][k]+1;
                    }*/
                }
                cout << " " << ans;
            }
            cout << "\n";
        }
        /*for (int i = 0; i<t; ++i)
        {
            cout <<sol[i]);
        }*/   
    }       