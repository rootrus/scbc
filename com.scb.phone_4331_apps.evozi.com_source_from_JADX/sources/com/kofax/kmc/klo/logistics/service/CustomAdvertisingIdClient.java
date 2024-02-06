package com.kofax.kmc.klo.logistics.service;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import java.io.IOException;
import java.util.concurrent.LinkedBlockingQueue;

public class CustomAdvertisingIdClient {

    /* renamed from: js */
    private static final String f3449js = "com.google.android.gms.ads.identifier.service.START";

    /* renamed from: jt */
    private static final String f3450jt = "com.google.android.gms";

    /* renamed from: ju */
    private static final String f3451ju = "com.google.android.gms.ads.identifier.internal.IAdvertisingIdService";

    public static String getAdvertisingIdInfo(Context context) throws Exception {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            C7875a aVar = new C7875a();
            Intent intent = new Intent(f3449js);
            intent.setPackage("com.google.android.gms");
            try {
                if (context.getApplicationContext().bindService(intent, aVar, 1)) {
                    String id = new C7876b(aVar.getBinder()).getId();
                    context.getApplicationContext().unbindService(aVar);
                    return id;
                }
                context.getApplicationContext().unbindService(aVar);
                throw new IOException("Google Play connection failed");
            } catch (Exception e) {
                throw e;
            } catch (Throwable th) {
                context.getApplicationContext().unbindService(aVar);
                throw th;
            }
        } else {
            throw new IllegalStateException("Cannot be called from the main thread");
        }
    }

    /* renamed from: com.kofax.kmc.klo.logistics.service.CustomAdvertisingIdClient$a */
    static class C7875a implements ServiceConnection {

        /* renamed from: jv */
        boolean f3452jv;

        /* renamed from: jw */
        private final LinkedBlockingQueue<IBinder> f3453jw;

        public void onServiceDisconnected(ComponentName componentName) {
        }

        private C7875a() {
            this.f3452jv = false;
            this.f3453jw = new LinkedBlockingQueue<>(1);
        }

        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            try {
                this.f3453jw.put(iBinder);
            } catch (InterruptedException unused) {
            }
        }

        public IBinder getBinder() throws InterruptedException {
            if (!this.f3452jv) {
                this.f3452jv = true;
                return this.f3453jw.take();
            }
            throw new IllegalStateException();
        }
    }

    /* renamed from: com.kofax.kmc.klo.logistics.service.CustomAdvertisingIdClient$b */
    static class C7876b implements IInterface {

        /* renamed from: jx */
        private IBinder f3454jx;

        public C7876b(IBinder iBinder) {
            this.f3454jx = iBinder;
        }

        public IBinder asBinder() {
            return this.f3454jx;
        }

        public String getId() throws RemoteException {
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInterfaceToken(CustomAdvertisingIdClient.f3451ju);
                this.f3454jx.transact(1, obtain, obtain2, 0);
                obtain2.readException();
                return obtain2.readString();
            } finally {
                obtain2.recycle();
                obtain.recycle();
            }
        }
    }
}
