// IcaculateAIDL.aidl
package com.kkk.aidl;
import com.kkk.aidl.Person;
interface IcaculateAIDL {
    int add(int num1,int num2);
    Person getPerson();
    void setPerson( in Person person);
}
