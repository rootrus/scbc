package com.google.android.gms.tagmanager;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.gtm.zzer;
import com.google.android.gms.internal.gtm.zzgl;

public class TagManagerServiceProviderImpl extends zzct {
    private static volatile zzgl zzalk;

    public zzer getService(IObjectWrapper iObjectWrapper, zzcm zzcm, zzcd zzcd) throws RemoteException {
        zzgl zzgl;
        zzgl zzgl2 = zzalk;
        if (zzgl2 != null) {
            return zzgl2;
        }
        synchronized (TagManagerServiceProviderImpl.class) {
            zzgl = zzalk;
            if (zzgl == null) {
                zzgl = new zzgl((Context) ObjectWrapper.unwrap(iObjectWrapper), zzcm, zzcd);
                zzalk = zzgl;
            }
        }
        return zzgl;
    }
}
