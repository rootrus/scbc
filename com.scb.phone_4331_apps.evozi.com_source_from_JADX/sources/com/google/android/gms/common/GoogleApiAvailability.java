package com.google.android.gms.common;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.os.Looper;
import android.os.Message;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.widget.ProgressBar;
import androidx.fragment.app.FragmentActivity;
import com.google.android.gms.base.C0152R;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.HasApiKey;
import com.google.android.gms.common.api.internal.ApiKey;
import com.google.android.gms.common.api.internal.GoogleApiManager;
import com.google.android.gms.common.api.internal.LifecycleFragment;
import com.google.android.gms.common.api.internal.zabp;
import com.google.android.gms.common.api.internal.zabq;
import com.google.android.gms.common.api.internal.zabt;
import com.google.android.gms.common.internal.ConnectionErrorMessages;
import com.google.android.gms.common.internal.DialogRedirect;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.DeviceProperties;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.internal.base.zar;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.kofax.mobile.sdk._internal.impl.extraction.kta.KtaJsonExactionHelper;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import p040o.C1479x17e19db7;
import p040o.setDropDownHorizontalOffset;

public class GoogleApiAvailability extends GoogleApiAvailabilityLight {
    public static final String GOOGLE_PLAY_SERVICES_PACKAGE = "com.google.android.gms";
    public static final int GOOGLE_PLAY_SERVICES_VERSION_CODE = GoogleApiAvailabilityLight.GOOGLE_PLAY_SERVICES_VERSION_CODE;
    private static final Object mLock = new Object();
    private static final GoogleApiAvailability zaao = new GoogleApiAvailability();
    private String zaap;

    public static GoogleApiAvailability getInstance() {
        return zaao;
    }

    public Task<Void> makeGooglePlayServicesAvailable(Activity activity) {
        int i = GOOGLE_PLAY_SERVICES_VERSION_CODE;
        Preconditions.checkMainThread("makeGooglePlayServicesAvailable must be called from the main thread");
        int isGooglePlayServicesAvailable = isGooglePlayServicesAvailable(activity, i);
        if (isGooglePlayServicesAvailable == 0) {
            return Tasks.forResult(null);
        }
        zabt zac = zabt.zac(activity);
        zac.zab(new ConnectionResult(isGooglePlayServicesAvailable, (PendingIntent) null), 0);
        return zac.getTask();
    }

    final class zaa extends zar {
        private final Context zaas;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public zaa(Context context) {
            super(Looper.myLooper() == null ? Looper.getMainLooper() : Looper.myLooper());
            this.zaas = context.getApplicationContext();
        }

        public final void handleMessage(Message message) {
            if (message.what != 1) {
                int i = message.what;
                StringBuilder sb = new StringBuilder(50);
                sb.append("Don't know how to handle this message: ");
                sb.append(i);
                Log.w("GoogleApiAvailability", sb.toString());
                return;
            }
            int isGooglePlayServicesAvailable = GoogleApiAvailability.this.isGooglePlayServicesAvailable(this.zaas);
            if (GoogleApiAvailability.this.isUserResolvableError(isGooglePlayServicesAvailable)) {
                GoogleApiAvailability.this.showErrorNotification(this.zaas, isGooglePlayServicesAvailable);
            }
        }
    }

    public Dialog getErrorDialog(Activity activity, int i, int i2) {
        return getErrorDialog(activity, i, i2, (DialogInterface.OnCancelListener) null);
    }

    public Dialog getErrorDialog(Activity activity, int i, int i2, DialogInterface.OnCancelListener onCancelListener) {
        return zaa((Context) activity, i, DialogRedirect.getInstance(activity, getErrorResolutionIntent(activity, i, KtaJsonExactionHelper.OBJECT), i2), onCancelListener);
    }

    public boolean showErrorDialogFragment(Activity activity, int i, int i2) {
        return showErrorDialogFragment(activity, i, i2, (DialogInterface.OnCancelListener) null);
    }

    public final boolean zaa(Activity activity, LifecycleFragment lifecycleFragment, int i, int i2, DialogInterface.OnCancelListener onCancelListener) {
        Dialog zaa2 = zaa((Context) activity, i, DialogRedirect.getInstance(lifecycleFragment, getErrorResolutionIntent(activity, i, KtaJsonExactionHelper.OBJECT), 2), onCancelListener);
        if (zaa2 == null) {
            return false;
        }
        zaa(activity, zaa2, GooglePlayServicesUtil.GMS_ERROR_DIALOG, onCancelListener);
        return true;
    }

    public boolean showErrorDialogFragment(Activity activity, int i, int i2, DialogInterface.OnCancelListener onCancelListener) {
        Dialog errorDialog = getErrorDialog(activity, i, i2, onCancelListener);
        if (errorDialog == null) {
            return false;
        }
        zaa(activity, errorDialog, GooglePlayServicesUtil.GMS_ERROR_DIALOG, onCancelListener);
        return true;
    }

    public void showErrorNotification(Context context, int i) {
        zaa(context, i, (String) null, getErrorResolutionPendingIntent(context, i, 0, "n"));
    }

    public void showErrorNotification(Context context, ConnectionResult connectionResult) {
        zaa(context, connectionResult.getErrorCode(), (String) null, getErrorResolutionPendingIntent(context, connectionResult));
    }

    public final boolean zaa(Context context, ConnectionResult connectionResult, int i) {
        PendingIntent errorResolutionPendingIntent = getErrorResolutionPendingIntent(context, connectionResult);
        if (errorResolutionPendingIntent == null) {
            return false;
        }
        zaa(context, connectionResult.getErrorCode(), (String) null, GoogleApiActivity.zaa(context, errorResolutionPendingIntent, i));
        return true;
    }

    public static Dialog zaa(Activity activity, DialogInterface.OnCancelListener onCancelListener) {
        ProgressBar progressBar = new ProgressBar(activity, (AttributeSet) null, 16842874);
        progressBar.setIndeterminate(true);
        progressBar.setVisibility(0);
        AlertDialog.Builder builder = new AlertDialog.Builder(activity);
        builder.setView(progressBar);
        builder.setMessage(ConnectionErrorMessages.getErrorMessage(activity, 18));
        builder.setPositiveButton("", (DialogInterface.OnClickListener) null);
        AlertDialog create = builder.create();
        zaa(activity, (Dialog) create, "GooglePlayServicesUpdatingDialog", onCancelListener);
        return create;
    }

    public final zabq zaa(Context context, zabp zabp) {
        IntentFilter intentFilter = new IntentFilter("android.intent.action.PACKAGE_ADDED");
        intentFilter.addDataScheme("package");
        zabq zabq = new zabq(zabp);
        context.registerReceiver(zabq, intentFilter);
        zabq.zac(context);
        if (isUninstalledAppPossiblyUpdating(context, "com.google.android.gms")) {
            return zabq;
        }
        zabp.zas();
        zabq.unregister();
        return null;
    }

    public Task<Void> checkApiAvailability(HasApiKey<?> hasApiKey, HasApiKey<?>... hasApiKeyArr) {
        return zaa(hasApiKey, hasApiKeyArr).onSuccessTask(zab.zaar);
    }

    public Task<Void> checkApiAvailability(GoogleApi<?> googleApi, GoogleApi<?>... googleApiArr) {
        return zaa((HasApiKey<?>) googleApi, (HasApiKey<?>[]) googleApiArr).continueWith(new zaa(this));
    }

    private static Task<Map<ApiKey<?>, String>> zaa(HasApiKey<?> hasApiKey, HasApiKey<?>... hasApiKeyArr) {
        Preconditions.checkNotNull(hasApiKey, "Requested API must not be null.");
        for (HasApiKey<?> checkNotNull : hasApiKeyArr) {
            Preconditions.checkNotNull(checkNotNull, "Requested API must not be null.");
        }
        ArrayList arrayList = new ArrayList(hasApiKeyArr.length + 1);
        arrayList.add(hasApiKey);
        arrayList.addAll(Arrays.asList(hasApiKeyArr));
        return GoogleApiManager.zaba().zaa((Iterable<? extends HasApiKey<?>>) arrayList);
    }

    private final String zag() {
        String str;
        synchronized (mLock) {
            str = this.zaap;
        }
        return str;
    }

    public void setDefaultNotificationChannelId(Context context, String str) {
        if (PlatformVersion.isAtLeastO()) {
            Preconditions.checkNotNull(((NotificationManager) context.getSystemService("notification")).getNotificationChannel(str));
        }
        synchronized (mLock) {
            this.zaap = str;
        }
    }

    public int isGooglePlayServicesAvailable(Context context) {
        return super.isGooglePlayServicesAvailable(context);
    }

    public int isGooglePlayServicesAvailable(Context context, int i) {
        return super.isGooglePlayServicesAvailable(context, i);
    }

    public final boolean isUserResolvableError(int i) {
        return super.isUserResolvableError(i);
    }

    public Intent getErrorResolutionIntent(Context context, int i, String str) {
        return super.getErrorResolutionIntent(context, i, str);
    }

    public PendingIntent getErrorResolutionPendingIntent(Context context, int i, int i2) {
        return super.getErrorResolutionPendingIntent(context, i, i2);
    }

    public PendingIntent getErrorResolutionPendingIntent(Context context, ConnectionResult connectionResult) {
        if (connectionResult.hasResolution()) {
            return connectionResult.getResolution();
        }
        return getErrorResolutionPendingIntent(context, connectionResult.getErrorCode(), 0);
    }

    public int getClientVersion(Context context) {
        return super.getClientVersion(context);
    }

    public final String getErrorString(int i) {
        return super.getErrorString(i);
    }

    static Dialog zaa(Context context, int i, DialogRedirect dialogRedirect, DialogInterface.OnCancelListener onCancelListener) {
        AlertDialog.Builder builder = null;
        if (i == 0) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(16843529, typedValue, true);
        if ("Theme.Dialog.Alert".equals(context.getResources().getResourceEntryName(typedValue.resourceId))) {
            builder = new AlertDialog.Builder(context, 5);
        }
        if (builder == null) {
            builder = new AlertDialog.Builder(context);
        }
        builder.setMessage(ConnectionErrorMessages.getErrorMessage(context, i));
        if (onCancelListener != null) {
            builder.setOnCancelListener(onCancelListener);
        }
        String errorDialogButtonMessage = ConnectionErrorMessages.getErrorDialogButtonMessage(context, i);
        if (errorDialogButtonMessage != null) {
            builder.setPositiveButton(errorDialogButtonMessage, dialogRedirect);
        }
        String errorTitle = ConnectionErrorMessages.getErrorTitle(context, i);
        if (errorTitle != null) {
            builder.setTitle(errorTitle);
        }
        return builder.create();
    }

    static void zaa(Activity activity, Dialog dialog, String str, DialogInterface.OnCancelListener onCancelListener) {
        if (activity instanceof FragmentActivity) {
            SupportErrorDialogFragment.newInstance(dialog, onCancelListener).show(((FragmentActivity) activity).getSupportFragmentManager(), str);
            return;
        }
        ErrorDialogFragment.newInstance(dialog, onCancelListener).show(activity.getFragmentManager(), str);
    }

    private final void zaa(Context context, int i, String str, PendingIntent pendingIntent) {
        int i2;
        if (i == 18) {
            zaa(context);
        } else if (pendingIntent != null) {
            String errorNotificationTitle = ConnectionErrorMessages.getErrorNotificationTitle(context, i);
            String errorNotificationMessage = ConnectionErrorMessages.getErrorNotificationMessage(context, i);
            Resources resources = context.getResources();
            NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
            setDropDownHorizontalOffset.IconCompatParcelizer write = new setDropDownHorizontalOffset.IconCompatParcelizer(context).IconCompatParcelizer(true).MediaBrowserCompat$CustomActionResultReceiver(true).IconCompatParcelizer((CharSequence) errorNotificationTitle).write((C1479x17e19db7) new setDropDownHorizontalOffset.read().write(errorNotificationMessage));
            if (DeviceProperties.isWearable(context)) {
                Preconditions.checkState(PlatformVersion.isAtLeastKitKatWatch());
                write.MediaBrowserCompat$CustomActionResultReceiver(context.getApplicationInfo().icon).MediaBrowserCompat$ItemReceiver(2);
                if (DeviceProperties.isWearableWithoutPlayStore(context)) {
                    write.MediaBrowserCompat$ItemReceiver(C0152R.C0153drawable.common_full_open_on_phone, (CharSequence) resources.getString(C0152R.string.common_open_on_phone), pendingIntent);
                } else {
                    write.IconCompatParcelizer(pendingIntent);
                }
            } else {
                write.MediaBrowserCompat$CustomActionResultReceiver(17301642).read((CharSequence) resources.getString(C0152R.string.common_google_play_services_notification_ticker)).IconCompatParcelizer(System.currentTimeMillis()).IconCompatParcelizer(pendingIntent).MediaBrowserCompat$ItemReceiver((CharSequence) errorNotificationMessage);
            }
            if (PlatformVersion.isAtLeastO()) {
                Preconditions.checkState(PlatformVersion.isAtLeastO());
                String zag = zag();
                if (zag == null) {
                    NotificationChannel notificationChannel = notificationManager.getNotificationChannel("com.google.android.gms.availability");
                    String defaultNotificationChannelName = ConnectionErrorMessages.getDefaultNotificationChannelName(context);
                    if (notificationChannel == null) {
                        notificationManager.createNotificationChannel(new NotificationChannel("com.google.android.gms.availability", defaultNotificationChannelName, 4));
                    } else if (!defaultNotificationChannelName.contentEquals(notificationChannel.getName())) {
                        notificationChannel.setName(defaultNotificationChannelName);
                        notificationManager.createNotificationChannel(notificationChannel);
                    }
                    zag = "com.google.android.gms.availability";
                }
                write.MediaBrowserCompat$ItemReceiver(zag);
            }
            Notification MediaBrowserCompat$ItemReceiver = write.MediaBrowserCompat$ItemReceiver();
            if (i == 1 || i == 2 || i == 3) {
                i2 = 10436;
                GooglePlayServicesUtilLight.sCanceledAvailabilityNotification.set(false);
            } else {
                i2 = 39789;
            }
            notificationManager.notify(i2, MediaBrowserCompat$ItemReceiver);
        } else if (i == 6) {
            Log.w("GoogleApiAvailability", "Missing resolution for ConnectionResult.RESOLUTION_REQUIRED. Call GoogleApiAvailability#showErrorNotification(Context, ConnectionResult) instead.");
        }
    }

    /* access modifiers changed from: package-private */
    public final void zaa(Context context) {
        new zaa(context).sendEmptyMessageDelayed(1, 120000);
    }
}
