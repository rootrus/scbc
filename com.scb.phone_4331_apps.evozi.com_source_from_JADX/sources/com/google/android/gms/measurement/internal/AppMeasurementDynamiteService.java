package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.measurement.zzab;
import com.google.android.gms.internal.measurement.zzac;
import com.google.android.gms.internal.measurement.zzae;
import com.google.android.gms.internal.measurement.zzu;
import com.google.android.gms.internal.measurement.zzw;
import java.util.Map;
import p040o.setTextAppearance;

public class AppMeasurementDynamiteService extends zzu {
    zzfy zza = null;
    private Map<Integer, zzha> zzb = new setTextAppearance();

    final class zza implements zzha {
        private zzab zza;

        zza(zzab zzab) {
            this.zza = zzab;
        }

        public final void onEvent(String str, String str2, Bundle bundle, long j) {
            try {
                this.zza.zza(str, str2, bundle, j);
            } catch (RemoteException e) {
                AppMeasurementDynamiteService.this.zza.zzr().zzi().zza("Event listener threw exception", e);
            }
        }
    }

    final class zzb implements zzhb {
        private zzab zza;

        zzb(zzab zzab) {
            this.zza = zzab;
        }

        public final void interceptEvent(String str, String str2, Bundle bundle, long j) {
            try {
                this.zza.zza(str, str2, bundle, j);
            } catch (RemoteException e) {
                AppMeasurementDynamiteService.this.zza.zzr().zzi().zza("Event interceptor threw exception", e);
            }
        }
    }

    private final void zza() {
        if (this.zza == null) {
            throw new IllegalStateException("Attempting to perform action before initialize.");
        }
    }

    public void initialize(IObjectWrapper iObjectWrapper, zzae zzae, long j) throws RemoteException {
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        zzfy zzfy = this.zza;
        if (zzfy == null) {
            this.zza = zzfy.zza(context, zzae, Long.valueOf(j));
        } else {
            zzfy.zzr().zzi().zza("Attempting to initialize multiple times");
        }
    }

    public void logEvent(String str, String str2, Bundle bundle, boolean z, boolean z2, long j) throws RemoteException {
        zza();
        this.zza.zzh().zza(str, str2, bundle, z, z2, j);
    }

    public void setUserProperty(String str, String str2, IObjectWrapper iObjectWrapper, boolean z, long j) throws RemoteException {
        zza();
        this.zza.zzh().zza(str, str2, ObjectWrapper.unwrap(iObjectWrapper), z, j);
    }

    public void setUserId(String str, long j) throws RemoteException {
        zza();
        this.zza.zzh().zza((String) null, "_id", str, true, j);
    }

    public void setCurrentScreen(IObjectWrapper iObjectWrapper, String str, String str2, long j) throws RemoteException {
        zza();
        this.zza.zzv().zza((Activity) ObjectWrapper.unwrap(iObjectWrapper), str, str2);
    }

    public void setMeasurementEnabled(boolean z, long j) throws RemoteException {
        zza();
        this.zza.zzh().zza(z);
    }

    public void resetAnalyticsData(long j) throws RemoteException {
        zza();
        zzhc zzh = this.zza.zzh();
        zzh.zza((String) null);
        zzh.zzq().zza((Runnable) new zzhk(zzh, j));
    }

    public void setMinimumSessionDuration(long j) throws RemoteException {
        zza();
        zzhc zzh = this.zza.zzh();
        zzh.zzb();
        zzh.zzq().zza((Runnable) new zzhz(zzh, j));
    }

    public void setSessionTimeoutDuration(long j) throws RemoteException {
        zza();
        zzhc zzh = this.zza.zzh();
        zzh.zzb();
        zzh.zzq().zza((Runnable) new zzhg(zzh, j));
    }

    public void getMaxUserProperties(String str, zzw zzw) throws RemoteException {
        zza();
        this.zza.zzh();
        Preconditions.checkNotEmpty(str);
        this.zza.zzi().zza(zzw, 25);
    }

    public void getCurrentScreenName(zzw zzw) throws RemoteException {
        zza();
        zza(zzw, this.zza.zzh().zzaj());
    }

    public void getCurrentScreenClass(zzw zzw) throws RemoteException {
        zza();
        zza(zzw, this.zza.zzh().zzak());
    }

    public void getCachedAppInstanceId(zzw zzw) throws RemoteException {
        zza();
        zza(zzw, this.zza.zzh().zzah());
    }

    public void getAppInstanceId(zzw zzw) throws RemoteException {
        zza();
        this.zza.zzq().zza((Runnable) new zzh(this, zzw));
    }

    public void getGmpAppId(zzw zzw) throws RemoteException {
        zza();
        zza(zzw, this.zza.zzh().zzal());
    }

    public void generateEventId(zzw zzw) throws RemoteException {
        zza();
        this.zza.zzi().zza(zzw, this.zza.zzi().zzg());
    }

    public void beginAdUnitExposure(String str, long j) throws RemoteException {
        zza();
        this.zza.zzz().zza(str, j);
    }

    public void endAdUnitExposure(String str, long j) throws RemoteException {
        zza();
        this.zza.zzz().zzb(str, j);
    }

    public void initForTests(Map map) throws RemoteException {
        zza();
    }

    public void logEventAndBundle(String str, String str2, Bundle bundle, zzw zzw, long j) throws RemoteException {
        Bundle bundle2;
        zza();
        Preconditions.checkNotEmpty(str2);
        if (bundle == null) {
            bundle2 = new Bundle();
        }
        bundle2.putString("_o", "app");
        this.zza.zzq().zza((Runnable) new zzj(this, zzw, new zzao(str2, new zzan(bundle), "app", j), str));
    }

    public void onActivityStarted(IObjectWrapper iObjectWrapper, long j) throws RemoteException {
        zza();
        zzhy zzhy = this.zza.zzh().zza;
        if (zzhy != null) {
            this.zza.zzh().zzab();
            zzhy.onActivityStarted((Activity) ObjectWrapper.unwrap(iObjectWrapper));
        }
    }

    public void onActivityStopped(IObjectWrapper iObjectWrapper, long j) throws RemoteException {
        zza();
        zzhy zzhy = this.zza.zzh().zza;
        if (zzhy != null) {
            this.zza.zzh().zzab();
            zzhy.onActivityStopped((Activity) ObjectWrapper.unwrap(iObjectWrapper));
        }
    }

    public void onActivityCreated(IObjectWrapper iObjectWrapper, Bundle bundle, long j) throws RemoteException {
        zza();
        zzhy zzhy = this.zza.zzh().zza;
        if (zzhy != null) {
            this.zza.zzh().zzab();
            zzhy.onActivityCreated((Activity) ObjectWrapper.unwrap(iObjectWrapper), bundle);
        }
    }

    public void onActivityDestroyed(IObjectWrapper iObjectWrapper, long j) throws RemoteException {
        zza();
        zzhy zzhy = this.zza.zzh().zza;
        if (zzhy != null) {
            this.zza.zzh().zzab();
            zzhy.onActivityDestroyed((Activity) ObjectWrapper.unwrap(iObjectWrapper));
        }
    }

    public void onActivityPaused(IObjectWrapper iObjectWrapper, long j) throws RemoteException {
        zza();
        zzhy zzhy = this.zza.zzh().zza;
        if (zzhy != null) {
            this.zza.zzh().zzab();
            zzhy.onActivityPaused((Activity) ObjectWrapper.unwrap(iObjectWrapper));
        }
    }

    public void onActivityResumed(IObjectWrapper iObjectWrapper, long j) throws RemoteException {
        zza();
        zzhy zzhy = this.zza.zzh().zza;
        if (zzhy != null) {
            this.zza.zzh().zzab();
            zzhy.onActivityResumed((Activity) ObjectWrapper.unwrap(iObjectWrapper));
        }
    }

    public void onActivitySaveInstanceState(IObjectWrapper iObjectWrapper, zzw zzw, long j) throws RemoteException {
        zza();
        zzhy zzhy = this.zza.zzh().zza;
        Bundle bundle = new Bundle();
        if (zzhy != null) {
            this.zza.zzh().zzab();
            zzhy.onActivitySaveInstanceState((Activity) ObjectWrapper.unwrap(iObjectWrapper), bundle);
        }
        try {
            zzw.zza(bundle);
        } catch (RemoteException e) {
            this.zza.zzr().zzi().zza("Error returning bundle value to wrapper", e);
        }
    }

    public void performAction(Bundle bundle, zzw zzw, long j) throws RemoteException {
        zza();
        zzw.zza((Bundle) null);
    }

    public void getUserProperties(String str, String str2, boolean z, zzw zzw) throws RemoteException {
        zza();
        this.zza.zzq().zza((Runnable) new zzi(this, zzw, str, str2, z));
    }

    public void logHealthData(int i, String str, IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3) throws RemoteException {
        Object obj;
        Object obj2;
        zza();
        Object obj3 = null;
        if (iObjectWrapper == null) {
            obj = null;
        } else {
            obj = ObjectWrapper.unwrap(iObjectWrapper);
        }
        if (iObjectWrapper2 == null) {
            obj2 = null;
        } else {
            obj2 = ObjectWrapper.unwrap(iObjectWrapper2);
        }
        if (iObjectWrapper3 != null) {
            obj3 = ObjectWrapper.unwrap(iObjectWrapper3);
        }
        this.zza.zzr().zza(i, true, false, str, obj, obj2, obj3);
    }

    public void setEventInterceptor(zzab zzab) throws RemoteException {
        zza();
        zzhc zzh = this.zza.zzh();
        zzb zzb2 = new zzb(zzab);
        zzh.zzb();
        zzh.zzw();
        zzh.zzq().zza((Runnable) new zzhn(zzh, zzb2));
    }

    public void registerOnMeasurementEventListener(zzab zzab) throws RemoteException {
        zza();
        zzha zzha = this.zzb.get(Integer.valueOf(zzab.zza()));
        if (zzha == null) {
            zzha = new zza(zzab);
            this.zzb.put(Integer.valueOf(zzab.zza()), zzha);
        }
        this.zza.zzh().zza(zzha);
    }

    public void unregisterOnMeasurementEventListener(zzab zzab) throws RemoteException {
        zza();
        zzha remove = this.zzb.remove(Integer.valueOf(zzab.zza()));
        if (remove == null) {
            remove = new zza(zzab);
        }
        this.zza.zzh().zzb(remove);
    }

    public void setInstanceIdProvider(zzac zzac) throws RemoteException {
        zza();
    }

    public void setConditionalUserProperty(Bundle bundle, long j) throws RemoteException {
        zza();
        if (bundle == null) {
            this.zza.zzr().zzf().zza("Conditional user property must not be null");
        } else {
            this.zza.zzh().zza(bundle, j);
        }
    }

    public void clearConditionalUserProperty(String str, String str2, Bundle bundle) throws RemoteException {
        zza();
        this.zza.zzh().zzc(str, str2, bundle);
    }

    public void getConditionalUserProperties(String str, String str2, zzw zzw) throws RemoteException {
        zza();
        this.zza.zzq().zza((Runnable) new zzl(this, zzw, str, str2));
    }

    public void getTestFlag(zzw zzw, int i) throws RemoteException {
        zza();
        if (i == 0) {
            this.zza.zzi().zza(zzw, this.zza.zzh().zzad());
        } else if (i == 1) {
            this.zza.zzi().zza(zzw, this.zza.zzh().zzae().longValue());
        } else if (i == 2) {
            zzkr zzi = this.zza.zzi();
            double doubleValue = this.zza.zzh().zzag().doubleValue();
            Bundle bundle = new Bundle();
            bundle.putDouble("r", doubleValue);
            try {
                zzw.zza(bundle);
            } catch (RemoteException e) {
                zzi.zzy.zzr().zzi().zza("Error returning double value to wrapper", e);
            }
        } else if (i == 3) {
            this.zza.zzi().zza(zzw, this.zza.zzh().zzaf().intValue());
        } else if (i == 4) {
            this.zza.zzi().zza(zzw, this.zza.zzh().zzac().booleanValue());
        }
    }

    private final void zza(zzw zzw, String str) {
        this.zza.zzi().zza(zzw, str);
    }

    public void setDataCollectionEnabled(boolean z) throws RemoteException {
        zza();
        zzhc zzh = this.zza.zzh();
        zzh.zzw();
        zzh.zzb();
        zzh.zzq().zza((Runnable) new zzhx(zzh, z));
    }

    public void isDataCollectionEnabled(zzw zzw) throws RemoteException {
        zza();
        this.zza.zzq().zza((Runnable) new zzk(this, zzw));
    }

    public void setDefaultEventParameters(Bundle bundle) {
        Bundle bundle2;
        zza();
        zzhc zzh = this.zza.zzh();
        if (bundle == null) {
            bundle2 = null;
        } else {
            bundle2 = new Bundle(bundle);
        }
        zzh.zzq().zza((Runnable) new zzhf(zzh, bundle2));
    }
}
