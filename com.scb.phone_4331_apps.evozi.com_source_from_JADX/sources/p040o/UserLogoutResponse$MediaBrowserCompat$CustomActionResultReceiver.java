package p040o;

import p040o.LookAndFeelParameters;
import p040o.access$2300;
import p040o.onUncaughtException;
import p040o.writeUInt64NoTag;
import p040o.zzfe;

/* renamed from: o.UserLogoutResponse$MediaBrowserCompat$CustomActionResultReceiver */
public final class UserLogoutResponse$MediaBrowserCompat$CustomActionResultReceiver extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<String> {
    final /* synthetic */ UserLogoutResponse MediaBrowserCompat$ItemReceiver;

    /* renamed from: o.UserLogoutResponse$MediaBrowserCompat$CustomActionResultReceiver$IconCompatParcelizer */
    static final class IconCompatParcelizer<V> implements writeUInt64NoTag.IconCompatParcelizer<T> {
        private /* synthetic */ String MediaBrowserCompat$CustomActionResultReceiver;
        private /* synthetic */ UserLogoutResponse$MediaBrowserCompat$CustomActionResultReceiver MediaBrowserCompat$ItemReceiver;

        IconCompatParcelizer(UserLogoutResponse$MediaBrowserCompat$CustomActionResultReceiver userLogoutResponse$MediaBrowserCompat$CustomActionResultReceiver, String str) {
            this.MediaBrowserCompat$ItemReceiver = userLogoutResponse$MediaBrowserCompat$CustomActionResultReceiver;
            this.MediaBrowserCompat$CustomActionResultReceiver = str;
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            ((LookAndFeelParameters.TorchMode) obj).MediaBrowserCompat$CustomActionResultReceiver(this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver, ((onUncaughtException.IconCompatParcelizer.C10756IconCompatParcelizer) this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver.read.get(zzfe.zza.MODEL_CONSENT)) == onUncaughtException.IconCompatParcelizer.C10756IconCompatParcelizer.ACCEPTED, this.MediaBrowserCompat$CustomActionResultReceiver);
        }
    }

    public UserLogoutResponse$MediaBrowserCompat$CustomActionResultReceiver(UserLogoutResponse userLogoutResponse) {
        this.MediaBrowserCompat$ItemReceiver = userLogoutResponse;
    }

    public final /* synthetic */ void onNext(Object obj) {
        String str = (String) obj;
        onGetStartedClick.write((Object) str, "applicationUuid");
        super.onNext(str);
        UserLogoutResponse userLogoutResponse = this.MediaBrowserCompat$ItemReceiver;
        writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = new IconCompatParcelizer(this, str);
        if (userLogoutResponse.RatingCompat != null) {
            iconCompatParcelizer.IconCompatParcelizer(userLogoutResponse.RatingCompat);
        }
        UserLogoutResponse.write(this.MediaBrowserCompat$ItemReceiver);
    }

    public final void onError(Throwable th) {
        onGetStartedClick.write((Object) th, "e");
        super.onError(th);
        this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.JUST_DISMISS));
    }
}
