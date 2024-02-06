package p040o;

import com.scb.phone.domain.interactor.emailverification.EmailMeVerificationCodeUseCase;
import p040o.access$2300;
import p040o.writeUInt64NoTag;
import p040o.zzfy;

/* renamed from: o.setJobId$MediaBrowserCompat$CustomActionResultReceiver */
public final class setJobId$MediaBrowserCompat$CustomActionResultReceiver extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<zzfy.zze> {
    final /* synthetic */ setJobId write;

    /* renamed from: o.setJobId$MediaBrowserCompat$CustomActionResultReceiver$IconCompatParcelizer */
    static final class IconCompatParcelizer<V> implements writeUInt64NoTag.IconCompatParcelizer<C6980x2ace65f3> {
        private /* synthetic */ Throwable MediaBrowserCompat$ItemReceiver;
        private /* synthetic */ setJobId$MediaBrowserCompat$CustomActionResultReceiver read;

        IconCompatParcelizer(setJobId$MediaBrowserCompat$CustomActionResultReceiver setjobid_mediabrowsercompat_customactionresultreceiver, Throwable th) {
            this.read = setjobid_mediabrowsercompat_customactionresultreceiver;
            this.MediaBrowserCompat$ItemReceiver = th;
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            ((C6980x2ace65f3) obj).write(this.read.write.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$ItemReceiver, access$2300.write.JUST_DISMISS));
        }
    }

    /* renamed from: o.setJobId$MediaBrowserCompat$CustomActionResultReceiver$write */
    static final class write<V> implements writeUInt64NoTag.IconCompatParcelizer<C6980x2ace65f3> {
        private /* synthetic */ setJobId$MediaBrowserCompat$CustomActionResultReceiver IconCompatParcelizer;

        write(setJobId$MediaBrowserCompat$CustomActionResultReceiver setjobid_mediabrowsercompat_customactionresultreceiver) {
            this.IconCompatParcelizer = setjobid_mediabrowsercompat_customactionresultreceiver;
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            access$2200 MediaBrowserCompat$CustomActionResultReceiver = this.IconCompatParcelizer.write.MediaDescriptionCompat.MediaBrowserCompat$CustomActionResultReceiver();
            onGetStartedClick.IconCompatParcelizer((Object) MediaBrowserCompat$CustomActionResultReceiver, "manageEmailCommonDisplay…createOtpNotSentDisplay()");
            ((C6980x2ace65f3) obj).IconCompatParcelizer(MediaBrowserCompat$CustomActionResultReceiver);
        }
    }

    public setJobId$MediaBrowserCompat$CustomActionResultReceiver(setJobId setjobid) {
        this.write = setjobid;
    }

    public final /* synthetic */ void onNext(Object obj) {
        zzfy.zze zze = (zzfy.zze) obj;
        onGetStartedClick.write((Object) zze, "otp");
        super.onNext(zze);
        setJobId.MediaBrowserCompat$SearchResultReceiver(this.write);
        setJobId setjobid = this.write;
        writeUInt64NoTag.IconCompatParcelizer setjobid_mediabrowsercompat_customactionresultreceiver_mediabrowsercompat_itemreceiver = new C10148x89632a9f(this, zze);
        if (setjobid.RatingCompat != null) {
            setjobid_mediabrowsercompat_customactionresultreceiver_mediabrowsercompat_itemreceiver.IconCompatParcelizer(setjobid.RatingCompat);
        }
    }

    public final void onError(Throwable th) {
        onGetStartedClick.write((Object) th, "e");
        super.onError(th);
        boolean z = true;
        if (th instanceof EmailMeVerificationCodeUseCase.EmailVerificationCodeNotSendException) {
            setJobId setjobid = this.write;
            writeUInt64NoTag.IconCompatParcelizer write2 = new write(this);
            if (setjobid.RatingCompat == null) {
                z = false;
            }
            if (z) {
                write2.IconCompatParcelizer(setjobid.RatingCompat);
            }
        } else {
            setJobId setjobid2 = this.write;
            writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = new IconCompatParcelizer(this, th);
            if (setjobid2.RatingCompat == null) {
                z = false;
            }
            if (z) {
                iconCompatParcelizer.IconCompatParcelizer(setjobid2.RatingCompat);
            }
        }
        setJobId.MediaBrowserCompat$SearchResultReceiver(this.write);
    }
}
