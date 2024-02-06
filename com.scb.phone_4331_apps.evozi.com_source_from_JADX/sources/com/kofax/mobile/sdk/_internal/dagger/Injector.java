package com.kofax.mobile.sdk._internal.dagger;

import android.content.Context;
import com.kofax.mobile.sdk._internal.impl.ComponentsInitAndBusRegister;
import com.kofax.mobile.sdk.p012ah.C0844o;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

public class Injector {

    /* renamed from: vH */
    private static volatile WeakReference<C0524c> f1068vH;

    /* renamed from: vI */
    private static final WeakHashMap<Context, ISdkDaggerPerContextComponent> f1069vI = new WeakHashMap<>();

    public static C0524c getMainSingletonComponent() {
        C0524c cVar;
        synchronized (Injector.class) {
            if (f1068vH == null || f1068vH.get() == null) {
                f1068vH = new WeakReference<>(C0520b.m674bB().mo11403bE());
            }
            cVar = f1068vH.get();
        }
        return cVar;
    }

    public static ISdkDaggerPerContextComponent getInjector(Context context) {
        ISdkDaggerPerContextComponent iSdkDaggerPerContextComponent;
        synchronized (Injector.class) {
            Context applicationContext = context.getApplicationContext();
            if (f1069vI.get(applicationContext) == null) {
                ISdkDaggerPerContextComponent a = getMainSingletonComponent().mo11400a(new C0844o(applicationContext));
                f1069vI.put(applicationContext, a);
                a.inject(new ComponentsInitAndBusRegister());
            }
            iSdkDaggerPerContextComponent = f1069vI.get(applicationContext);
        }
        return iSdkDaggerPerContextComponent;
    }

    public static void destroyInjector() {
        synchronized (Injector.class) {
            f1068vH = null;
            f1069vI.clear();
        }
    }

    public static void putInjector(Context context, ISdkDaggerPerContextComponent iSdkDaggerPerContextComponent) {
        synchronized (Injector.class) {
            f1069vI.put(context.getApplicationContext(), iSdkDaggerPerContextComponent);
        }
    }
}
