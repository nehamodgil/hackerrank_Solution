#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;
class Person{
    public:
    string name;

    public:
    int age;

    virtual void getdata(){};
    virtual void putdata(){};
    virtual int getID(){return 0;}

};

class Professor:public Person{
    int publications;
    static int id;
    int getID(){return id;}

    public:
    void getdata(){
        cin>>name;
        cin>>age;
        cin>>publications;
    }

    public:
    void putdata(){
        id++;
        cout<<name + " "<<age <<" "<<publications <<" "<<getID()<<"\n";
    }
};

int Professor::id=0;

class Student:public Person{

    float marks[6];
    static int id;
    int getID(){return id;}
    public:
      void getdata () {
          cin >> name;
          cin >> age;
          for(int i =0 ; i< 6; i++){
              cin >> marks[i];
          }
      }

      public:
        void putdata(){
             id++;
             float totalMarks = 0;
            for(int i =0 ; i < 6; i++){
                totalMarks += marks[i];
            }
            cout << name + " "<< age<<" "<<totalMarks<<" "<<getID()<<"\n";
        }
};

int Student::id=0;

int main(){

    int n, val;
    cin>>n; //The number of objects that is going to be created.
    Person *per[n];

    for(int i = 0;i < n;i++){

        cin>>val;
        if(val == 1){
            // If val is 1 current object is of type Professor
            per[i] = new Professor;

        }
        else per[i] = new Student; // Else the current object is of type Student

        per[i]->getdata(); // Get the data from the user.

    }

    for(int i=0;i<n;i++)
        per[i]->putdata(); // Print the required output for each object.

    return 0;

}
