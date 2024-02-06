package com.google.android.gms.common.providers;

import java.util.concurrent.ScheduledExecutorService;

public class PooledExecutorsProvider {
    private static PooledExecutorFactory zzfm;

    public interface PooledExecutorFactory {
        ScheduledExecutorService newSingleThreadScheduledExecutor();
    }

    public static PooledExecutorFactory getInstance() {
        PooledExecutorFactory pooledExecutorFactory;
        synchronized (PooledExecutorsProvider.class) {
            if (zzfm == null) {
                zzfm = new zza();
            }
            pooledExecutorFactory = zzfm;
        }
        return pooledExecutorFactory;
    }

    private PooledExecutorsProvider() {
    }
}
