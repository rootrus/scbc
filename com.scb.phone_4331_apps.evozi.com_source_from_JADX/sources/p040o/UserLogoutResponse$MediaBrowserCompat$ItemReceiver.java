package p040o;

import p040o.LookAndFeelParameters;
import p040o.access$2300;
import p040o.writeUInt64NoTag;

/* renamed from: o.UserLogoutResponse$MediaBrowserCompat$ItemReceiver */
public final class UserLogoutResponse$MediaBrowserCompat$ItemReceiver extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<String> {
    final /* synthetic */ UserLogoutResponse MediaBrowserCompat$ItemReceiver;

    /* renamed from: o.UserLogoutResponse$MediaBrowserCompat$ItemReceiver$IconCompatParcelizer */
    static final class IconCompatParcelizer<V> implements writeUInt64NoTag.IconCompatParcelizer<T> {
        private /* synthetic */ String IconCompatParcelizer;
        private /* synthetic */ UserLogoutResponse$MediaBrowserCompat$ItemReceiver MediaBrowserCompat$ItemReceiver;

        IconCompatParcelizer(UserLogoutResponse$MediaBrowserCompat$ItemReceiver userLogoutResponse$MediaBrowserCompat$ItemReceiver, String str) {
            this.MediaBrowserCompat$ItemReceiver = userLogoutResponse$MediaBrowserCompat$ItemReceiver;
            this.IconCompatParcelizer = str;
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            LookAndFeelParameters.TorchMode torchMode = (LookAndFeelParameters.TorchMode) obj;
            torchMode.read(this.IconCompatParcelizer, this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver.MediaMetadataCompat);
            torchMode.MediaBrowserCompat$ItemReceiver();
        }
    }

    public UserLogoutResponse$MediaBrowserCompat$ItemReceiver(UserLogoutResponse userLogoutResponse) {
        this.MediaBrowserCompat$ItemReceiver = userLogoutResponse;
    }

    public final /* synthetic */ void onNext(Object obj) {
        String str = (String) obj;
        onGetStartedClick.write((Object) str, "productType");
        super.onNext(str);
        UserLogoutResponse userLogoutResponse = this.MediaBrowserCompat$ItemReceiver;
        writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = new IconCompatParcelizer(this, str);
        if (userLogoutResponse.RatingCompat != null) {
            iconCompatParcelizer.IconCompatParcelizer(userLogoutResponse.RatingCompat);
        }
    }

    public final void onError(Throwable th) {
        onGetStartedClick.write((Object) th, "e");
        super.onError(th);
        this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.JUST_DISMISS));
    }
}
