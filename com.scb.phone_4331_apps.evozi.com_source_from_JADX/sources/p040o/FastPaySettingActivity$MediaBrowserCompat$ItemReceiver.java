package p040o;

import p040o.AlertController$RecycleListView;
import p040o.FastPaySettingActivity;

/* renamed from: o.FastPaySettingActivity$MediaBrowserCompat$ItemReceiver */
final class FastPaySettingActivity$MediaBrowserCompat$ItemReceiver<T, B> extends HmlETBBusinessInformationActivity<B> {
    private FastPaySettingActivity.write<T, B> IconCompatParcelizer;
    private boolean read;

    FastPaySettingActivity$MediaBrowserCompat$ItemReceiver(FastPaySettingActivity.write<T, B> write) {
        this.IconCompatParcelizer = write;
    }

    public final void onNext(B b) {
        if (!this.read) {
            FastPaySettingActivity.write<T, B> write = this.IconCompatParcelizer;
            write.read.IconCompatParcelizer(FastPaySettingActivity.write.write);
            write.MediaBrowserCompat$ItemReceiver();
        }
    }

    public final void onError(Throwable th) {
        if (this.read) {
            AlertController$RecycleListView.read.read(th);
            return;
        }
        this.read = true;
        FastPaySettingActivity.write<T, B> write = this.IconCompatParcelizer;
        HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.read(write.MediaDescriptionCompat);
        if (HmlBusinessOccupationInfoActivity_ViewBinding.IconCompatParcelizer(write.IconCompatParcelizer, th)) {
            write.MediaBrowserCompat$CustomActionResultReceiver = true;
            write.MediaBrowserCompat$ItemReceiver();
            return;
        }
        AlertController$RecycleListView.read.read(th);
    }

    public final void onComplete() {
        if (!this.read) {
            this.read = true;
            FastPaySettingActivity.write<T, B> write = this.IconCompatParcelizer;
            HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.read(write.MediaDescriptionCompat);
            write.MediaBrowserCompat$CustomActionResultReceiver = true;
            write.MediaBrowserCompat$ItemReceiver();
        }
    }
}
