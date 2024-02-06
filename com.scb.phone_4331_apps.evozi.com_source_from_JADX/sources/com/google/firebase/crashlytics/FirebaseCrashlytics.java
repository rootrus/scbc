package com.google.firebase.crashlytics;

import android.content.Context;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.FirebaseApp;
import com.google.firebase.analytics.connector.AnalyticsConnector;
import com.google.firebase.crashlytics.internal.CrashlyticsNativeComponent;
import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.MissingNativeComponent;
import com.google.firebase.crashlytics.internal.Onboarding;
import com.google.firebase.crashlytics.internal.common.CrashlyticsCore;
import com.google.firebase.crashlytics.internal.common.DataCollectionArbiter;
import com.google.firebase.crashlytics.internal.common.ExecutorUtils;
import com.google.firebase.crashlytics.internal.common.IdManager;
import com.google.firebase.crashlytics.internal.settings.SettingsController;
import com.google.firebase.iid.internal.FirebaseInstanceIdInternal;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;

public class FirebaseCrashlytics {
    private final CrashlyticsCore core;

    static FirebaseCrashlytics init(FirebaseApp firebaseApp, FirebaseInstanceIdInternal firebaseInstanceIdInternal, CrashlyticsNativeComponent crashlyticsNativeComponent, AnalyticsConnector analyticsConnector) {
        FirebaseApp firebaseApp2 = firebaseApp;
        Context applicationContext = firebaseApp.getApplicationContext();
        IdManager idManager = new IdManager(applicationContext, applicationContext.getPackageName(), firebaseInstanceIdInternal);
        DataCollectionArbiter dataCollectionArbiter = new DataCollectionArbiter(firebaseApp);
        MissingNativeComponent missingNativeComponent = crashlyticsNativeComponent == null ? new MissingNativeComponent() : crashlyticsNativeComponent;
        final Onboarding onboarding = new Onboarding(firebaseApp, applicationContext, idManager, dataCollectionArbiter);
        CrashlyticsCore crashlyticsCore = new CrashlyticsCore(firebaseApp, idManager, missingNativeComponent, dataCollectionArbiter, analyticsConnector);
        if (!onboarding.onPreExecute()) {
            Logger.getLogger().mo8868e("Unable to start Crashlytics.");
            return null;
        }
        ExecutorService buildSingleThreadExecutorService = ExecutorUtils.buildSingleThreadExecutorService("com.google.firebase.crashlytics.startup");
        final SettingsController retrieveSettingsData = onboarding.retrieveSettingsData(applicationContext, firebaseApp, buildSingleThreadExecutorService);
        final boolean onPreExecute = crashlyticsCore.onPreExecute(retrieveSettingsData);
        final ExecutorService executorService = buildSingleThreadExecutorService;
        final CrashlyticsCore crashlyticsCore2 = crashlyticsCore;
        Tasks.call(buildSingleThreadExecutorService, new Callable<Void>() {
            public Void call() throws Exception {
                Onboarding.this.doOnboarding(executorService, retrieveSettingsData);
                if (!onPreExecute) {
                    return null;
                }
                crashlyticsCore2.doBackgroundInitializationAsync(retrieveSettingsData);
                return null;
            }
        });
        return new FirebaseCrashlytics(crashlyticsCore);
    }

    private FirebaseCrashlytics(CrashlyticsCore crashlyticsCore) {
        this.core = crashlyticsCore;
    }

    public static FirebaseCrashlytics getInstance() {
        FirebaseCrashlytics firebaseCrashlytics = (FirebaseCrashlytics) FirebaseApp.getInstance().get(FirebaseCrashlytics.class);
        if (firebaseCrashlytics != null) {
            return firebaseCrashlytics;
        }
        throw new NullPointerException("FirebaseCrashlytics component is not present.");
    }

    public void recordException(Throwable th) {
        if (th == null) {
            Logger.getLogger().mo8872w("Crashlytics is ignoring a request to log a null exception.");
        } else {
            this.core.logException(th);
        }
    }

    public void log(String str) {
        this.core.log(str);
    }

    public void setUserId(String str) {
        this.core.setUserId(str);
    }

    public void setCrashlyticsCollectionEnabled(boolean z) {
        this.core.setCrashlyticsCollectionEnabled(z);
    }
}
