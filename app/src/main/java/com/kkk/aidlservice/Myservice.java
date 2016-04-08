package com.kkk.aidlservice;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;
import android.support.annotation.Nullable;

import com.kkk.aidl.Person;
import com.kkk.aidl.IcaculateAIDL;
/**
 * Created by kkk on 2016/4/6.
 */
public class Myservice extends Service {
    private Person mperson=null;
    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return mBinder;
    }

    private final IcaculateAIDL.Stub mBinder = new IcaculateAIDL.Stub() {
        @Override
        public int add(int num1, int num2) throws RemoteException {
            return num1 + num2;
        }

        @Override
        public Person getPerson() throws RemoteException {
            return mperson;
        }

        @Override
        public void setPerson(Person person) throws RemoteException {
            mperson=person;
        }

    };

}
