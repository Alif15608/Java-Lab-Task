#include <iostream>
using namespace std;
class Person
{
private:
 int id;
 string name;
public:
 Person()
 {
 }
 Person(int i,string n)
 {
 id=i;
 name=n;
 }
 void displayInfo()
 {
 cout<<"Name is :"<<name<<endl;
 cout<<"Id is :"<<id<<endl;
 }
};
int main()
{
 Person p1(101,"Mashrafi");
 p1.displayInfo();
 return 0;
}
