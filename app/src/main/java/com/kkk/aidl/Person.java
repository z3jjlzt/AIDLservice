package com.kkk.aidl;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by kkk on 2016/4/7.
 */
public final class Person implements Parcelable {
    int age;
    String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person() {
    }

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    protected Person(Parcel in) {
        age = in.readInt();
        name = in.readString();

    }

    public static final Creator<Person> CREATOR = new Creator<Person>() {
        @Override
        public Person createFromParcel(Parcel in) {
            return new Person(in);
        }

        @Override
        public Person[] newArray(int size) {
            return new Person[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(age);
        dest.writeString(name);
    }
    public void readFromParcel(Parcel in) {
        age = in.readInt();
        name = in.readString();

    }
}
