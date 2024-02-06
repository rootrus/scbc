package p040o;

import java.util.concurrent.atomic.AtomicReference;
import p040o.AlertController$RecycleListView;

/* renamed from: o.HmlETBPersonalInfoActivity */
public final class HmlETBPersonalInfoActivity<T> extends HmlETBManageEmailVerificationActivity<T> {
    private static C6889x18706b56[] IconCompatParcelizer = new C6889x18706b56[0];
    private static C6889x18706b56[] write = new C6889x18706b56[0];
    private AtomicReference<C6889x18706b56<T>[]> MediaBrowserCompat$CustomActionResultReceiver = new AtomicReference<>(write);
    private Throwable MediaBrowserCompat$ItemReceiver;

    public static <T> HmlETBPersonalInfoActivity<T> MediaBrowserCompat$CustomActionResultReceiver() {
        return new HmlETBPersonalInfoActivity<>();
    }

    HmlETBPersonalInfoActivity() {
    }

    public final void subscribeActual(BankingAgentTransactionsDeepLinkActivity<? super T> bankingAgentTransactionsDeepLinkActivity) {
        boolean z;
        C6889x18706b56 hmlETBPersonalInfoActivity$MediaBrowserCompat$CustomActionResultReceiver = new C6889x18706b56(bankingAgentTransactionsDeepLinkActivity, this);
        bankingAgentTransactionsDeepLinkActivity.onSubscribe(hmlETBPersonalInfoActivity$MediaBrowserCompat$CustomActionResultReceiver);
        while (true) {
            C6889x18706b56[] hmlETBPersonalInfoActivity$MediaBrowserCompat$CustomActionResultReceiverArr = (C6889x18706b56[]) this.MediaBrowserCompat$CustomActionResultReceiver.get();
            z = false;
            if (hmlETBPersonalInfoActivity$MediaBrowserCompat$CustomActionResultReceiverArr != IconCompatParcelizer) {
                int length = hmlETBPersonalInfoActivity$MediaBrowserCompat$CustomActionResultReceiverArr.length;
                C6889x18706b56[] hmlETBPersonalInfoActivity$MediaBrowserCompat$CustomActionResultReceiverArr2 = new C6889x18706b56[(length + 1)];
                System.arraycopy(hmlETBPersonalInfoActivity$MediaBrowserCompat$CustomActionResultReceiverArr, 0, hmlETBPersonalInfoActivity$MediaBrowserCompat$CustomActionResultReceiverArr2, 0, length);
                hmlETBPersonalInfoActivity$MediaBrowserCompat$CustomActionResultReceiverArr2[length] = hmlETBPersonalInfoActivity$MediaBrowserCompat$CustomActionResultReceiver;
                if (this.MediaBrowserCompat$CustomActionResultReceiver.compareAndSet(hmlETBPersonalInfoActivity$MediaBrowserCompat$CustomActionResultReceiverArr, hmlETBPersonalInfoActivity$MediaBrowserCompat$CustomActionResultReceiverArr2)) {
                    z = true;
                    break;
                }
            } else {
                break;
            }
        }
        if (!z) {
            Throwable th = this.MediaBrowserCompat$ItemReceiver;
            if (th != null) {
                bankingAgentTransactionsDeepLinkActivity.onError(th);
            } else {
                bankingAgentTransactionsDeepLinkActivity.onComplete();
            }
        } else if (hmlETBPersonalInfoActivity$MediaBrowserCompat$CustomActionResultReceiver.isDisposed()) {
            read(hmlETBPersonalInfoActivity$MediaBrowserCompat$CustomActionResultReceiver);
        }
    }

    /* access modifiers changed from: package-private */
    public final void read(C6889x18706b56<T> hmlETBPersonalInfoActivity$MediaBrowserCompat$CustomActionResultReceiver) {
        C6889x18706b56<T>[] hmlETBPersonalInfoActivity$MediaBrowserCompat$CustomActionResultReceiverArr;
        C6889x18706b56[] hmlETBPersonalInfoActivity$MediaBrowserCompat$CustomActionResultReceiverArr2;
        do {
            hmlETBPersonalInfoActivity$MediaBrowserCompat$CustomActionResultReceiverArr = (C6889x18706b56[]) this.MediaBrowserCompat$CustomActionResultReceiver.get();
            if (hmlETBPersonalInfoActivity$MediaBrowserCompat$CustomActionResultReceiverArr != IconCompatParcelizer && hmlETBPersonalInfoActivity$MediaBrowserCompat$CustomActionResultReceiverArr != write) {
                int length = hmlETBPersonalInfoActivity$MediaBrowserCompat$CustomActionResultReceiverArr.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        i = -1;
                        break;
                    } else if (hmlETBPersonalInfoActivity$MediaBrowserCompat$CustomActionResultReceiverArr[i] == hmlETBPersonalInfoActivity$MediaBrowserCompat$CustomActionResultReceiver) {
                        break;
                    } else {
                        i++;
                    }
                }
                if (i >= 0) {
                    if (length == 1) {
                        hmlETBPersonalInfoActivity$MediaBrowserCompat$CustomActionResultReceiverArr2 = write;
                    } else {
                        C6889x18706b56[] hmlETBPersonalInfoActivity$MediaBrowserCompat$CustomActionResultReceiverArr3 = new C6889x18706b56[(length - 1)];
                        System.arraycopy(hmlETBPersonalInfoActivity$MediaBrowserCompat$CustomActionResultReceiverArr, 0, hmlETBPersonalInfoActivity$MediaBrowserCompat$CustomActionResultReceiverArr3, 0, i);
                        System.arraycopy(hmlETBPersonalInfoActivity$MediaBrowserCompat$CustomActionResultReceiverArr, i + 1, hmlETBPersonalInfoActivity$MediaBrowserCompat$CustomActionResultReceiverArr3, i, (length - i) - 1);
                        hmlETBPersonalInfoActivity$MediaBrowserCompat$CustomActionResultReceiverArr2 = hmlETBPersonalInfoActivity$MediaBrowserCompat$CustomActionResultReceiverArr3;
                    }
                } else {
                    return;
                }
            } else {
                return;
            }
        } while (!this.MediaBrowserCompat$CustomActionResultReceiver.compareAndSet(hmlETBPersonalInfoActivity$MediaBrowserCompat$CustomActionResultReceiverArr, hmlETBPersonalInfoActivity$MediaBrowserCompat$CustomActionResultReceiverArr2));
    }

    public final void onSubscribe(BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity) {
        if (this.MediaBrowserCompat$CustomActionResultReceiver.get() == IconCompatParcelizer) {
            bulkTransferDeepLinkActivity.dispose();
        }
    }

    public final void onNext(T t) {
        HmlLatestPersonalInformationDeepLinkActivity.write(t, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        for (C6889x18706b56 hmlETBPersonalInfoActivity$MediaBrowserCompat$CustomActionResultReceiver : (C6889x18706b56[]) this.MediaBrowserCompat$CustomActionResultReceiver.get()) {
            if (!hmlETBPersonalInfoActivity$MediaBrowserCompat$CustomActionResultReceiver.get()) {
                hmlETBPersonalInfoActivity$MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver.onNext(t);
            }
        }
    }

    public final void onError(Throwable th) {
        HmlLatestPersonalInformationDeepLinkActivity.write(th, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        C6889x18706b56<T>[] hmlETBPersonalInfoActivity$MediaBrowserCompat$CustomActionResultReceiverArr = this.MediaBrowserCompat$CustomActionResultReceiver.get();
        C6889x18706b56<T>[] hmlETBPersonalInfoActivity$MediaBrowserCompat$CustomActionResultReceiverArr2 = IconCompatParcelizer;
        if (hmlETBPersonalInfoActivity$MediaBrowserCompat$CustomActionResultReceiverArr == hmlETBPersonalInfoActivity$MediaBrowserCompat$CustomActionResultReceiverArr2) {
            AlertController$RecycleListView.read.read(th);
            return;
        }
        this.MediaBrowserCompat$ItemReceiver = th;
        for (C6889x18706b56 hmlETBPersonalInfoActivity$MediaBrowserCompat$CustomActionResultReceiver : (C6889x18706b56[]) this.MediaBrowserCompat$CustomActionResultReceiver.getAndSet(hmlETBPersonalInfoActivity$MediaBrowserCompat$CustomActionResultReceiverArr2)) {
            if (hmlETBPersonalInfoActivity$MediaBrowserCompat$CustomActionResultReceiver.get()) {
                AlertController$RecycleListView.read.read(th);
            } else {
                hmlETBPersonalInfoActivity$MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver.onError(th);
            }
        }
    }

    public final void onComplete() {
        C6889x18706b56<T>[] hmlETBPersonalInfoActivity$MediaBrowserCompat$CustomActionResultReceiverArr = this.MediaBrowserCompat$CustomActionResultReceiver.get();
        C6889x18706b56<T>[] hmlETBPersonalInfoActivity$MediaBrowserCompat$CustomActionResultReceiverArr2 = IconCompatParcelizer;
        if (hmlETBPersonalInfoActivity$MediaBrowserCompat$CustomActionResultReceiverArr != hmlETBPersonalInfoActivity$MediaBrowserCompat$CustomActionResultReceiverArr2) {
            for (C6889x18706b56 hmlETBPersonalInfoActivity$MediaBrowserCompat$CustomActionResultReceiver : (C6889x18706b56[]) this.MediaBrowserCompat$CustomActionResultReceiver.getAndSet(hmlETBPersonalInfoActivity$MediaBrowserCompat$CustomActionResultReceiverArr2)) {
                if (!hmlETBPersonalInfoActivity$MediaBrowserCompat$CustomActionResultReceiver.get()) {
                    hmlETBPersonalInfoActivity$MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver.onComplete();
                }
            }
        }
    }
}
