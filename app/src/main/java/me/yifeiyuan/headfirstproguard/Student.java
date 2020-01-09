package me.yifeiyuan.headfirstproguard;

import android.util.Log;

/**
 * Created by 程序亦非猿 on 2020-01-09.
 */
public class Student extends Person implements Ability {

    private static final String TAG = "Student";

    public String name;
    public int age;

    public void hi(String there) {
        Log.d(TAG, "hi: " + there);
    }

    public int foo() {
        return 233;
    }

    @Override
    public void greeting() {
        Log.d(TAG, "greeting: " + this.getClass().getSimpleName());
    }
}
