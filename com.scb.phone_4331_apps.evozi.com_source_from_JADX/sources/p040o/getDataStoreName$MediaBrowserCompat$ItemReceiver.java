package p040o;

import p040o.KtaJsonCheck;
import p040o.access$2300;
import p040o.writeUInt64NoTag;

/* renamed from: o.getDataStoreName$MediaBrowserCompat$ItemReceiver */
public final class getDataStoreName$MediaBrowserCompat$ItemReceiver extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<HmlVerifyPhoneValidateOtpActivity> {
    final /* synthetic */ getDataStoreName MediaBrowserCompat$ItemReceiver;

    /* renamed from: o.getDataStoreName$MediaBrowserCompat$ItemReceiver$IconCompatParcelizer */
    static final class IconCompatParcelizer<V> implements writeUInt64NoTag.IconCompatParcelizer<KtaJsonCheck.C6928a> {
        private /* synthetic */ getDataStoreName$MediaBrowserCompat$ItemReceiver IconCompatParcelizer;

        IconCompatParcelizer(getDataStoreName$MediaBrowserCompat$ItemReceiver getdatastorename_mediabrowsercompat_itemreceiver) {
            this.IconCompatParcelizer = getdatastorename_mediabrowsercompat_itemreceiver;
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            ((KtaJsonCheck.C6928a) obj).write(this.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver);
        }
    }

    getDataStoreName$MediaBrowserCompat$ItemReceiver(getDataStoreName getdatastorename) {
        this.MediaBrowserCompat$ItemReceiver = getdatastorename;
    }

    public final void onComplete() {
        super.onComplete();
        getDataStoreName.read(this.MediaBrowserCompat$ItemReceiver);
        getDataStoreName getdatastorename = this.MediaBrowserCompat$ItemReceiver;
        writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = new IconCompatParcelizer(this);
        if (getdatastorename.RatingCompat != null) {
            iconCompatParcelizer.IconCompatParcelizer(getdatastorename.RatingCompat);
        }
    }

    public final void onError(Throwable th) {
        onGetStartedClick.write((Object) th, "e");
        this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.JUST_DISMISS));
    }
}
