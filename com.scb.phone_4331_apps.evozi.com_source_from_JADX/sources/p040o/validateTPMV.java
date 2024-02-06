package p040o;

import android.app.Application;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: o.validateTPMV */
public final class validateTPMV {
    private static final AtomicBoolean MediaBrowserCompat$ItemReceiver = new AtomicBoolean();

    public static void MediaBrowserCompat$ItemReceiver(Application application) {
        if (!MediaBrowserCompat$ItemReceiver.getAndSet(true)) {
            FixedTransferDepositSuccessTransactionAdapter$DepositViewHolder.setInitializer(new validateTRMM(application, "org/threeten/bp/TZDB.dat"));
        }
    }
}
