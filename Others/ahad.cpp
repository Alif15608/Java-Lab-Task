#include<iostream>
#include<math.h>
using namespace std;
bool Root(double a,double b,double c,double* root1,double* root2)
{
    /**root1=a*b;
    *root2=b*c;*/
    double discriminant;
    bool flag=true;
    discriminant=b*b-4*a*c;
    if(discriminant>0)
    {
        *root1=(-b + sqrt(discriminant)) / (2 * a);
        *root2=(-b - sqrt(discriminant)) / (2 * a);
        return flag;
    }
    else if(discriminant==0)
    {
        *root1=-b / (2 * a);
        *root2=-b / (2 * a);
        return flag;
    }
    else
    {
        *root1=-b/(2*a);
        *root2=sqrt(-discriminant) / (2 * a);
        flag=false;
        return flag;
    }
}
int main()
{
    double a,b,c,root1,root2;

    cout<<"Enter the value of a:";
    cin>>a;
    cout<<"Enter the value of b:";
    cin>>b;
    cout<<"Enter the value of c:";
    cin>>c;
    bool flag;
    flag=Root(a,b,c,&root1,&root2);
    if(flag==true)
    {
        cout<<"Roots are: "<<root1<<", "<<root2;
    }
    else
    {
        cout<<"Roots are: "<<root1<<"+"<<root2<<"i,"<<root1<<"+"<<root2<<"i"<<endl;;
    }

    return 0;
}

