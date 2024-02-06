package p040o;

import com.scb.phone.domain.errors.RetrofitException;
import p040o.ILocationSourceDelegate;
import p040o.access$2300;
import p040o.writeUInt64NoTag;

/* renamed from: o.isUserLoggedIn$MediaBrowserCompat$CustomActionResultReceiver */
public final class isUserLoggedIn$MediaBrowserCompat$CustomActionResultReceiver extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<HmlVerifyPhoneValidateOtpActivity> {
    final /* synthetic */ isUserLoggedIn MediaBrowserCompat$ItemReceiver;

    /* renamed from: o.isUserLoggedIn$MediaBrowserCompat$CustomActionResultReceiver$IconCompatParcelizer */
    static final class IconCompatParcelizer<V> implements writeUInt64NoTag.IconCompatParcelizer<proxyGetIPassportDetector> {
        public static final IconCompatParcelizer MediaBrowserCompat$CustomActionResultReceiver = new IconCompatParcelizer();

        IconCompatParcelizer() {
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            ((proxyGetIPassportDetector) obj).MediaBrowserCompat$ItemReceiver();
        }
    }

    /* renamed from: o.isUserLoggedIn$MediaBrowserCompat$CustomActionResultReceiver$write */
    static final class write<V> implements writeUInt64NoTag.IconCompatParcelizer<proxyGetIPassportDetector> {
        private /* synthetic */ isUserLoggedIn$MediaBrowserCompat$CustomActionResultReceiver MediaBrowserCompat$CustomActionResultReceiver;
        private /* synthetic */ Throwable MediaBrowserCompat$ItemReceiver;

        write(isUserLoggedIn$MediaBrowserCompat$CustomActionResultReceiver isuserloggedin_mediabrowsercompat_customactionresultreceiver, Throwable th) {
            this.MediaBrowserCompat$CustomActionResultReceiver = isuserloggedin_mediabrowsercompat_customactionresultreceiver;
            this.MediaBrowserCompat$ItemReceiver = th;
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            proxyGetIPassportDetector proxygetipassportdetector = (proxyGetIPassportDetector) obj;
            access$2200 MediaBrowserCompat$ItemReceiver2 = this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$ItemReceiver, access$2300.write.JUST_DISMISS);
            onGetStartedClick.IconCompatParcelizer((Object) MediaBrowserCompat$ItemReceiver2, "errorDisplayMapper.transform(e)");
            String str = MediaBrowserCompat$ItemReceiver2.IconCompatParcelizer;
            onGetStartedClick.IconCompatParcelizer((Object) str, "errorDisplayMapper.transform(e).message");
            proxygetipassportdetector.IconCompatParcelizer(str);
            proxygetipassportdetector.read();
        }
    }

    isUserLoggedIn$MediaBrowserCompat$CustomActionResultReceiver(isUserLoggedIn isuserloggedin) {
        this.MediaBrowserCompat$ItemReceiver = isuserloggedin;
    }

    public final void onComplete() {
        super.onComplete();
        isUserLoggedIn.MediaBrowserCompat$CustomActionResultReceiver(this.MediaBrowserCompat$ItemReceiver);
        isUserLoggedIn isuserloggedin = this.MediaBrowserCompat$ItemReceiver;
        writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = C10018x1887add6.IconCompatParcelizer;
        if (isuserloggedin.RatingCompat != null) {
            iconCompatParcelizer.IconCompatParcelizer(isuserloggedin.RatingCompat);
        }
    }

    public final void onError(Throwable th) {
        String str;
        ILocationSourceDelegate.zza zza;
        onGetStartedClick.write((Object) th, "e");
        super.onError(th);
        isUserLoggedIn.MediaBrowserCompat$CustomActionResultReceiver(this.MediaBrowserCompat$ItemReceiver);
        if (th instanceof RetrofitException) {
            ILocationSourceDelegate iLocationSourceDelegate = ((RetrofitException) th).IconCompatParcelizer;
            if (iLocationSourceDelegate == null || (zza = iLocationSourceDelegate.write) == null) {
                str = null;
            } else {
                str = zza.IconCompatParcelizer;
            }
            boolean z = true;
            if (onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) str, (Object) "1087") || onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) str, (Object) "1089")) {
                isUserLoggedIn isuserloggedin = this.MediaBrowserCompat$ItemReceiver;
                writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver;
                if (isuserloggedin.RatingCompat == null) {
                    z = false;
                }
                if (z) {
                    iconCompatParcelizer.IconCompatParcelizer(isuserloggedin.RatingCompat);
                    return;
                }
                return;
            }
            isUserLoggedIn isuserloggedin2 = this.MediaBrowserCompat$ItemReceiver;
            writeUInt64NoTag.IconCompatParcelizer write2 = new write(this, th);
            if (isuserloggedin2.RatingCompat == null) {
                z = false;
            }
            if (z) {
                write2.IconCompatParcelizer(isuserloggedin2.RatingCompat);
            }
        }
    }
}
