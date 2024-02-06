package p040o;

import p040o.AlertController$RecycleListView;
import p040o.onClickDetailLayout;

/* renamed from: o.onClickDetailLayout$MediaBrowserCompat$CustomActionResultReceiver */
final class C10093xc60239f1<T, B> extends HmlETBBusinessInformationActivity<B> {
    private boolean MediaBrowserCompat$CustomActionResultReceiver;
    private onClickDetailLayout.write<T, B> read;

    C10093xc60239f1(onClickDetailLayout.write<T, B> write) {
        this.read = write;
    }

    public final void onNext(B b) {
        if (!this.MediaBrowserCompat$CustomActionResultReceiver) {
            this.MediaBrowserCompat$CustomActionResultReceiver = true;
            dispose();
            onClickDetailLayout.write<T, B> write = this.read;
            write.write.compareAndSet(this, (Object) null);
            write.read.IconCompatParcelizer(onClickDetailLayout.write.IconCompatParcelizer);
            write.read();
        }
    }

    public final void onError(Throwable th) {
        if (this.MediaBrowserCompat$CustomActionResultReceiver) {
            AlertController$RecycleListView.read.read(th);
            return;
        }
        this.MediaBrowserCompat$CustomActionResultReceiver = true;
        onClickDetailLayout.write<T, B> write = this.read;
        write.MediaMetadataCompat.dispose();
        if (HmlBusinessOccupationInfoActivity_ViewBinding.IconCompatParcelizer(write.MediaBrowserCompat$CustomActionResultReceiver, th)) {
            write.MediaBrowserCompat$ItemReceiver = true;
            write.read();
            return;
        }
        AlertController$RecycleListView.read.read(th);
    }

    public final void onComplete() {
        if (!this.MediaBrowserCompat$CustomActionResultReceiver) {
            this.MediaBrowserCompat$CustomActionResultReceiver = true;
            onClickDetailLayout.write<T, B> write = this.read;
            write.MediaMetadataCompat.dispose();
            write.MediaBrowserCompat$ItemReceiver = true;
            write.read();
        }
    }
}
