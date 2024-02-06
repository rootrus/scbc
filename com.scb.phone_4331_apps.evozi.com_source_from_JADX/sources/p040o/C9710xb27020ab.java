package p040o;

import java.util.Collection;
import p040o.AlertController$RecycleListView;
import p040o.DepositDetailActivity;

/* renamed from: o.DepositDetailActivity$MediaBrowserCompat$CustomActionResultReceiver */
final class C9710xb27020ab<T, U extends Collection<? super T>, B> extends HmlETBBusinessInformationActivity<B> {
    private DepositDetailActivity.IconCompatParcelizer<T, U, B> read;
    private boolean write;

    C9710xb27020ab(DepositDetailActivity.IconCompatParcelizer<T, U, B> iconCompatParcelizer) {
        this.read = iconCompatParcelizer;
    }

    public final void onNext(B b) {
        if (!this.write) {
            this.write = true;
            dispose();
            this.read.MediaBrowserCompat$ItemReceiver();
        }
    }

    public final void onError(Throwable th) {
        if (this.write) {
            AlertController$RecycleListView.read.read(th);
            return;
        }
        this.write = true;
        this.read.onError(th);
    }

    public final void onComplete() {
        if (!this.write) {
            this.write = true;
            this.read.MediaBrowserCompat$ItemReceiver();
        }
    }
}
