package com.wmmalich.util;

import android.text.TextUtils;

import com.wmmalich.BuildConfig;


public final class Log {
    private static String TAG = "greg_log";

    public static void d(String tag, String msg) {
        if (BuildConfig.DEBUG)
            android.util.Log.d(TAG, tag + " " + getThreadName() + "-" + getThreadId() + "\t" + getLocation() + " " + msg);
    }

    public static void d(String msg) {
        if (BuildConfig.DEBUG)
            android.util.Log.d(TAG, getThreadName() + "-" + getThreadId() + "\t" + getLocation() + " " + msg);
    }

    public static void d() {
        if (BuildConfig.DEBUG)
            android.util.Log.d(TAG, getThreadName() + "-" + getThreadId() + "\t" + getLocation());
    }


    private static int getThreadId() {
        return android.os.Process.getThreadPriority(android.os.Process.myTid());
    }

    private static String getThreadName() {
        return Thread.currentThread().getName();
    }

    private static String getLocation() {
        final String className = Log.class.getName();
        final StackTraceElement[] traces = Thread.currentThread().getStackTrace();
        boolean found = false;
        for (int i = 0; i < traces.length; i++) {
            StackTraceElement trace = traces[i];
            try {
                if (found) {
                    if (!trace.getClassName().startsWith(className)) {
                        Class<?> clazz = Class.forName(trace.getClassName());
                        return "[" + getClassName(clazz) + ":" + trace.getMethodName() + ":" + trace.getLineNumber() + "]: ";
                    }
                } else if (trace.getClassName().startsWith(className)) {
                    found = true;
                    continue;
                }
            } catch (ClassNotFoundException e) {
            }
        }
        return "[]: ";
    }

    private static String getClassName(Class<?> clazz) {
        if (clazz != null) {
            if (!TextUtils.isEmpty(clazz.getSimpleName())) {
                return clazz.getSimpleName();
            }
            return getClassName(clazz.getEnclosingClass());
        }
        return "";
    }

    public static void e(Throwable e) {
        if (BuildConfig.DEBUG) {
            android.util.Log.e(TAG, getThreadName() + "-" + getThreadId() + "\t" + getLocation() + e.getMessage());
            e.printStackTrace();
        }
    }
}
