package androidx.core.app;

import android.app.Activity;
import android.app.AppComponentFactory;
import android.app.Application;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.ContentProvider;
import android.content.Intent;

public class CoreComponentFactory extends AppComponentFactory {

    public interface read {
        Object MediaBrowserCompat$ItemReceiver();
    }

    public Activity instantiateActivity(ClassLoader classLoader, String str, Intent intent) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        Object MediaBrowserCompat$ItemReceiver;
        Object instantiateActivity = super.instantiateActivity(classLoader, str, intent);
        if ((instantiateActivity instanceof read) && (MediaBrowserCompat$ItemReceiver = ((read) instantiateActivity).MediaBrowserCompat$ItemReceiver()) != null) {
            instantiateActivity = MediaBrowserCompat$ItemReceiver;
        }
        return (Activity) instantiateActivity;
    }

    public Application instantiateApplication(ClassLoader classLoader, String str) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        Object MediaBrowserCompat$ItemReceiver;
        Object instantiateApplication = super.instantiateApplication(classLoader, str);
        if ((instantiateApplication instanceof read) && (MediaBrowserCompat$ItemReceiver = ((read) instantiateApplication).MediaBrowserCompat$ItemReceiver()) != null) {
            instantiateApplication = MediaBrowserCompat$ItemReceiver;
        }
        return (Application) instantiateApplication;
    }

    public BroadcastReceiver instantiateReceiver(ClassLoader classLoader, String str, Intent intent) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        Object MediaBrowserCompat$ItemReceiver;
        Object instantiateReceiver = super.instantiateReceiver(classLoader, str, intent);
        if ((instantiateReceiver instanceof read) && (MediaBrowserCompat$ItemReceiver = ((read) instantiateReceiver).MediaBrowserCompat$ItemReceiver()) != null) {
            instantiateReceiver = MediaBrowserCompat$ItemReceiver;
        }
        return (BroadcastReceiver) instantiateReceiver;
    }

    public ContentProvider instantiateProvider(ClassLoader classLoader, String str) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        Object MediaBrowserCompat$ItemReceiver;
        Object instantiateProvider = super.instantiateProvider(classLoader, str);
        if ((instantiateProvider instanceof read) && (MediaBrowserCompat$ItemReceiver = ((read) instantiateProvider).MediaBrowserCompat$ItemReceiver()) != null) {
            instantiateProvider = MediaBrowserCompat$ItemReceiver;
        }
        return (ContentProvider) instantiateProvider;
    }

    public Service instantiateService(ClassLoader classLoader, String str, Intent intent) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        Object MediaBrowserCompat$ItemReceiver;
        Object instantiateService = super.instantiateService(classLoader, str, intent);
        if ((instantiateService instanceof read) && (MediaBrowserCompat$ItemReceiver = ((read) instantiateService).MediaBrowserCompat$ItemReceiver()) != null) {
            instantiateService = MediaBrowserCompat$ItemReceiver;
        }
        return (Service) instantiateService;
    }
}
