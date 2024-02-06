package com.google.android.gms.common.api.internal;

import android.app.Activity;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

public final class zaa extends ActivityLifecycleObserver {
    private final WeakReference<C10779zaa> zaco;

    public zaa(Activity activity) {
        this(C10779zaa.zaa(activity));
    }

    private zaa(C10779zaa zaa) {
        this.zaco = new WeakReference<>(zaa);
    }

    public final ActivityLifecycleObserver onStopCallOnce(Runnable runnable) {
        C10779zaa zaa = (C10779zaa) this.zaco.get();
        if (zaa != null) {
            zaa.zaa(runnable);
            return this;
        }
        throw new IllegalStateException("The target activity has already been GC'd");
    }

    /* renamed from: com.google.android.gms.common.api.internal.zaa$zaa  reason: collision with other inner class name */
    static class C10779zaa extends LifecycleCallback {
        private List<Runnable> zacn = new ArrayList();

        /* access modifiers changed from: private */
        public static C10779zaa zaa(Activity activity) {
            C10779zaa zaa;
            synchronized (activity) {
                LifecycleFragment fragment = getFragment(activity);
                zaa = (C10779zaa) fragment.getCallbackOrNull("LifecycleObserverOnStop", C10779zaa.class);
                if (zaa == null) {
                    zaa = new C10779zaa(fragment);
                }
            }
            return zaa;
        }

        private C10779zaa(LifecycleFragment lifecycleFragment) {
            super(lifecycleFragment);
            this.mLifecycleFragment.addCallback("LifecycleObserverOnStop", this);
        }

        /* access modifiers changed from: private */
        public final void zaa(Runnable runnable) {
            synchronized (this) {
                this.zacn.add(runnable);
            }
        }

        public void onStop() {
            List<Runnable> list;
            synchronized (this) {
                list = this.zacn;
                this.zacn = new ArrayList();
            }
            for (Runnable run : list) {
                run.run();
            }
        }
    }
}
