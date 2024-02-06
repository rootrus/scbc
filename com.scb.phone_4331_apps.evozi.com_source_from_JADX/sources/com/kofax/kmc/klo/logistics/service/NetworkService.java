package com.kofax.kmc.klo.logistics.service;

import android.content.Context;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import bolts.Task;
import bolts.TaskCompletionSource;
import com.kofax.kmc.kut.utilities.AppContextProvider;
import com.kofax.mobile.sdk._internal.C0767k;
import java.util.UUID;
import java.util.concurrent.Callable;

public class NetworkService {
    private static final String TAG = NetworkService.class.getSimpleName();

    /* renamed from: jA */
    private static String f3455jA = null;

    /* renamed from: jB */
    private static String f3456jB = null;

    /* renamed from: jy */
    private static String f3457jy = null;

    /* renamed from: jz */
    private static String f3458jz = null;

    public static String getMacAddress() {
        return f3457jy;
    }

    public static String getSystemIdentifier() {
        return f3458jz;
    }

    public static String getIpAddress() {
        return f3455jA;
    }

    public static boolean initializeNetworkSettings(Context context) {
        try {
            WifiInfo connectionInfo = ((WifiManager) context.getApplicationContext().getSystemService("wifi")).getConnectionInfo();
            f3456jB = UUID.randomUUID().toString();
            String ag = m3760ag();
            f3457jy = ag;
            f3458jz = ag;
            int ipAddress = connectionInfo.getIpAddress();
            f3455jA = String.format("%d.%d.%d.%d", new Object[]{Integer.valueOf(ipAddress & 255), Integer.valueOf((ipAddress >> 8) & 255), Integer.valueOf((ipAddress >> 16) & 255), Integer.valueOf(ipAddress >>> 24)});
            return true;
        } catch (Exception e) {
            C0767k.m1821e(TAG, "Error getting macAddress", (Throwable) e);
            return false;
        }
    }

    /* renamed from: ag */
    private static String m3760ag() throws RuntimeException {
        Task<String> ah = m3761ah();
        try {
            ah.waitForCompletion();
            if (!ah.isFaulted()) {
                CharSequence charSequence = (CharSequence) ah.getResult();
                if (!(charSequence == null || charSequence.length() == 0)) {
                    return (String) ah.getResult();
                }
                throw new RuntimeException("Error getting macAddress");
            }
            throw new RuntimeException(ah.getError().getMessage());
        } catch (InterruptedException e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    /* renamed from: ah */
    private static Task<String> m3761ah() {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        Task.callInBackground(new Callable<Void>() {
            public final Void call() {
                try {
                    taskCompletionSource.setResult(CustomAdvertisingIdClient.getAdvertisingIdInfo(AppContextProvider.getContext()));
                    return null;
                } catch (Exception e) {
                    taskCompletionSource.setError(e);
                    return null;
                }
            }
        });
        return taskCompletionSource.getTask();
    }
}
