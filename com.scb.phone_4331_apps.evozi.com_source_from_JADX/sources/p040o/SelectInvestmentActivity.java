package p040o;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.TypeCastException;

/* renamed from: o.SelectInvestmentActivity */
public final class SelectInvestmentActivity<T> implements BaseJuristicPinActivity_ViewBinding<T> {
    final FundActionsSuccessActivity<T> MediaBrowserCompat$ItemReceiver;
    final FundFactSheetActivity<T, T> write;

    /* renamed from: o.SelectInvestmentActivity$read */
    public static final class read implements Iterator<T>, FundOnboardingSuccessActivity_ViewBinding {
        private /* synthetic */ SelectInvestmentActivity IconCompatParcelizer;
        private int MediaBrowserCompat$CustomActionResultReceiver = -2;
        private T read;

        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        read(SelectInvestmentActivity selectInvestmentActivity) {
            this.IconCompatParcelizer = selectInvestmentActivity;
        }

        private final void read() {
            T t;
            if (this.MediaBrowserCompat$CustomActionResultReceiver == -2) {
                t = this.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver.invoke();
            } else {
                FundFactSheetActivity<T, T> fundFactSheetActivity = this.IconCompatParcelizer.write;
                T t2 = this.read;
                if (t2 == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver();
                }
                t = fundFactSheetActivity.invoke(t2);
            }
            this.read = t;
            this.MediaBrowserCompat$CustomActionResultReceiver = t == null ? 0 : 1;
        }

        public final T next() {
            if (this.MediaBrowserCompat$CustomActionResultReceiver < 0) {
                read();
            }
            if (this.MediaBrowserCompat$CustomActionResultReceiver != 0) {
                T t = this.read;
                if (t != null) {
                    this.MediaBrowserCompat$CustomActionResultReceiver = -1;
                    return t;
                }
                throw new TypeCastException("null cannot be cast to non-null type T");
            }
            throw new NoSuchElementException();
        }

        public final boolean hasNext() {
            if (this.MediaBrowserCompat$CustomActionResultReceiver < 0) {
                read();
            }
            return this.MediaBrowserCompat$CustomActionResultReceiver == 1;
        }
    }

    public SelectInvestmentActivity(FundActionsSuccessActivity<? extends T> fundActionsSuccessActivity, FundFactSheetActivity<? super T, ? extends T> fundFactSheetActivity) {
        onGetStartedClick.write((Object) fundActionsSuccessActivity, "getInitialValue");
        onGetStartedClick.write((Object) fundFactSheetActivity, "getNextValue");
        this.MediaBrowserCompat$ItemReceiver = fundActionsSuccessActivity;
        this.write = fundFactSheetActivity;
    }

    public final Iterator<T> read() {
        return new read(this);
    }
}
