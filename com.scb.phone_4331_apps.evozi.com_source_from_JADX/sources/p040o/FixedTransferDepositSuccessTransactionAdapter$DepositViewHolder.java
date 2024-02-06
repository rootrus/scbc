package p040o;

import java.util.Iterator;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: o.FixedTransferDepositSuccessTransactionAdapter$DepositViewHolder */
public abstract class FixedTransferDepositSuccessTransactionAdapter$DepositViewHolder {
    public static final FixedTransferDepositSuccessTransactionAdapter$DepositViewHolder DO_NOTHING = new IconCompatParcelizer();
    private static final AtomicBoolean INITIALIZED = new AtomicBoolean(false);
    private static final AtomicReference<FixedTransferDepositSuccessTransactionAdapter$DepositViewHolder> INITIALIZER = new AtomicReference<>();

    /* access modifiers changed from: protected */
    public abstract void initializeProviders();

    public static void setInitializer(FixedTransferDepositSuccessTransactionAdapter$DepositViewHolder fixedTransferDepositSuccessTransactionAdapter$DepositViewHolder) {
        if (INITIALIZED.get()) {
            throw new IllegalStateException("Already initialized");
        } else if (!INITIALIZER.compareAndSet((Object) null, fixedTransferDepositSuccessTransactionAdapter$DepositViewHolder)) {
            throw new IllegalStateException("Initializer was already set, possibly with a default during initialization");
        }
    }

    static void initialize() {
        if (!INITIALIZED.getAndSet(true)) {
            INITIALIZER.compareAndSet((Object) null, new write());
            INITIALIZER.get().initializeProviders();
            return;
        }
        throw new IllegalStateException("Already initialized");
    }

    /* renamed from: o.FixedTransferDepositSuccessTransactionAdapter$DepositViewHolder$IconCompatParcelizer */
    static class IconCompatParcelizer extends FixedTransferDepositSuccessTransactionAdapter$DepositViewHolder {
        /* access modifiers changed from: protected */
        public final void initializeProviders() {
        }

        IconCompatParcelizer() {
        }
    }

    /* renamed from: o.FixedTransferDepositSuccessTransactionAdapter$DepositViewHolder$write */
    static class write extends FixedTransferDepositSuccessTransactionAdapter$DepositViewHolder {
        write() {
        }

        /* access modifiers changed from: protected */
        public final void initializeProviders() {
            Iterator<S> it = ServiceLoader.load(HistoryAdapter$GroupItemViewHolder.class, HistoryAdapter$GroupItemViewHolder.class.getClassLoader()).iterator();
            while (it.hasNext()) {
                try {
                    HistoryAdapter$GroupItemViewHolder.registerProvider((HistoryAdapter$GroupItemViewHolder) it.next());
                } catch (ServiceConfigurationError e) {
                    if (!(e.getCause() instanceof SecurityException)) {
                        throw e;
                    }
                }
            }
        }
    }
}
