#include <iostream>
#include <math.h>
using namespace std;
	int main()
	{
		int t ;
		cin >> t;
		bool sol[t];
		for (int i = 0; i<t; ++i)
		{
			sol[i] = false;
			int n ; cin >> n;
			int a[n]; int b[10];
			for (int j = 0; j<n ; ++j)
			{
				cin >> a[j];
				b[a[j]%10]++;
			}
			int nn = 10;
			for (int j = 0; j<nn && !sol[i] ; ++j)
			{
				for (int k = 0; k<nn && !sol[i] ; ++k)
				{
					for (int l = 0; l<nn && !sol[i] ; ++l)
					{
						for (int jj = 0; jj<=b[j] && jj<4; ++jj)
						{
							for (int kk = 3-jj; kk<=b[k] && kk<4; ++kk)
							{
								for (int ll = 3-jj-kk; ll<=b[l] && ll<4; ++ll)
								{
									if ((j*jj + k*kk + l*ll)%10 == 3)
										sol[i] = true;
								}
							}
						}
					}
				}
			}
		}
		for (int i = 0; i<t; ++i)
		{
			if (sol[i])
				cout << "YES" <<"\n";
			else 
				cout << "NO" <<"\n";
		}
		return 0;
	}