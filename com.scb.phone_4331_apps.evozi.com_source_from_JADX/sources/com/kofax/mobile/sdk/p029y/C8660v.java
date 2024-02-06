package com.kofax.mobile.sdk.p029y;

import bolts.Continuation;
import bolts.Task;
import com.kofax.BuildConfig;
import com.kofax.mobile.sdk._internal.C0767k;
import p040o.PrepaidDetailsActivity_ViewBinding;

/* renamed from: com.kofax.mobile.sdk.y.v */
public class C8660v<T> {

    /* renamed from: com.kofax.mobile.sdk.y.v$a */
    public interface C8662a<T> {
        T run();
    }

    /* renamed from: a */
    public T mo55533a(String str, C8662a<T> aVar) {
        PrepaidDetailsActivity_ViewBinding prepaidDetailsActivity_ViewBinding = new PrepaidDetailsActivity_ViewBinding();
        try {
            prepaidDetailsActivity_ViewBinding.IconCompatParcelizer();
            return aVar.run();
        } finally {
            prepaidDetailsActivity_ViewBinding.MediaBrowserCompat$ItemReceiver();
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(": ");
            sb.append(prepaidDetailsActivity_ViewBinding.toString());
            C0767k.m1801b(BuildConfig.TIMING_TAG, sb.toString());
        }
    }

    /* renamed from: a */
    public Task<T> mo55532a(final String str, Task<T> task) {
        final PrepaidDetailsActivity_ViewBinding write = PrepaidDetailsActivity_ViewBinding.write();
        return task.continueWithTask(new Continuation<T, Task<T>>() {
            public Task<T> then(Task<T> task) throws Exception {
                write.MediaBrowserCompat$ItemReceiver();
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(": ");
                sb.append(write);
                C0767k.m1801b(BuildConfig.TIMING_TAG, sb.toString());
                return task;
            }
        });
    }
}
