package p040o;

import com.scb.phone.domain.errors.RetrofitException;
import p040o.LinkedListMultimap;
import p040o.access$2300;
import p040o.writeUInt64NoTag;

/* renamed from: o.DocumentCaptureExperience_MembersInjector */
public final class DocumentCaptureExperience_MembersInjector extends writeUInt64NoTag<C7139ht> {
    public final LinkedListMultimap.AsMapEntries.C35791 write;

    /* renamed from: o.DocumentCaptureExperience_MembersInjector$IconCompatParcelizer */
    public static final class IconCompatParcelizer extends CheckEligibilityActivity implements FundFactSheetActivity<String, HmlVerifyPhoneValidateOtpActivity> {
        private /* synthetic */ DocumentCaptureExperience_MembersInjector MediaBrowserCompat$CustomActionResultReceiver;
        final /* synthetic */ String MediaBrowserCompat$ItemReceiver;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public IconCompatParcelizer(DocumentCaptureExperience_MembersInjector documentCaptureExperience_MembersInjector, String str) {
            super(1);
            this.MediaBrowserCompat$CustomActionResultReceiver = documentCaptureExperience_MembersInjector;
            this.MediaBrowserCompat$ItemReceiver = str;
        }

        public final /* synthetic */ Object invoke(Object obj) {
            onGetStartedClick.write((Object) (String) obj, "it");
            DocumentCaptureExperience_MembersInjector.IconCompatParcelizer(this.MediaBrowserCompat$CustomActionResultReceiver);
            DocumentCaptureExperience_MembersInjector documentCaptureExperience_MembersInjector = this.MediaBrowserCompat$CustomActionResultReceiver;
            writeUInt64NoTag.IconCompatParcelizer r0 = new writeUInt64NoTag.IconCompatParcelizer<C7139ht>(this) {
                private /* synthetic */ IconCompatParcelizer MediaBrowserCompat$ItemReceiver;

                {
                    this.MediaBrowserCompat$ItemReceiver = r1;
                }

                public final /* synthetic */ void IconCompatParcelizer(Object obj) {
                    ((C7139ht) obj).write(this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver);
                }
            };
            if (documentCaptureExperience_MembersInjector.RatingCompat != null) {
                r0.IconCompatParcelizer(documentCaptureExperience_MembersInjector.RatingCompat);
            }
            return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
        }
    }

    /* renamed from: o.DocumentCaptureExperience_MembersInjector$read */
    static final class read<V> implements writeUInt64NoTag.IconCompatParcelizer<C7139ht> {
        public static final read write = new read();

        read() {
        }

        public final /* bridge */ /* synthetic */ void IconCompatParcelizer(Object obj) {
            ((C7139ht) obj).IconCompatParcelizer();
        }
    }

    /* renamed from: o.DocumentCaptureExperience_MembersInjector$write */
    public static final class write extends CheckEligibilityActivity implements FundFactSheetActivity<Throwable, HmlVerifyPhoneValidateOtpActivity> {
        private /* synthetic */ DocumentCaptureExperience_MembersInjector read;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public write(DocumentCaptureExperience_MembersInjector documentCaptureExperience_MembersInjector) {
            super(1);
            this.read = documentCaptureExperience_MembersInjector;
        }

        public final /* synthetic */ Object invoke(Object obj) {
            Throwable th = (Throwable) obj;
            onGetStartedClick.write((Object) th, "throwable");
            DocumentCaptureExperience_MembersInjector.MediaBrowserCompat$ItemReceiver(this.read, th);
            return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @HmlPinActivity
    public DocumentCaptureExperience_MembersInjector(LinkedListMultimap.AsMapEntries.C35791 r2, RegularImmutableBiMap regularImmutableBiMap) {
        super(regularImmutableBiMap);
        onGetStartedClick.write((Object) r2, "verifyOtpController");
        this.write = r2;
    }

    public static final /* synthetic */ void IconCompatParcelizer(DocumentCaptureExperience_MembersInjector documentCaptureExperience_MembersInjector) {
        if (documentCaptureExperience_MembersInjector.RatingCompat != null) {
            documentCaptureExperience_MembersInjector.RatingCompat.aj_();
        }
    }

    public static final /* synthetic */ void MediaBrowserCompat$ItemReceiver(DocumentCaptureExperience_MembersInjector documentCaptureExperience_MembersInjector, Throwable th) {
        boolean z = true;
        if (documentCaptureExperience_MembersInjector.RatingCompat != null) {
            documentCaptureExperience_MembersInjector.RatingCompat.aj_();
        }
        if (removeIfFromRandomAccessList.IconCompatParcelizer(th, RetrofitException.read.OTP_FAILED, RetrofitException.read.OTP_REACH_MAX_LIMIT, RetrofitException.read.OTP_EXPIRED)) {
            access$2200 MediaBrowserCompat$ItemReceiver = documentCaptureExperience_MembersInjector.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.JUST_DISMISS);
            if (MediaBrowserCompat$ItemReceiver != null) {
                writeUInt64NoTag.IconCompatParcelizer documentCaptureExperience_MembersInjector$MediaBrowserCompat$ItemReceiver = new C9716xbae7b27f(MediaBrowserCompat$ItemReceiver);
                if (documentCaptureExperience_MembersInjector.RatingCompat == null) {
                    z = false;
                }
                if (z) {
                    documentCaptureExperience_MembersInjector$MediaBrowserCompat$ItemReceiver.IconCompatParcelizer(documentCaptureExperience_MembersInjector.RatingCompat);
                    return;
                }
                return;
            }
            return;
        }
        writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = read.write;
        if (documentCaptureExperience_MembersInjector.RatingCompat == null) {
            z = false;
        }
        if (z) {
            iconCompatParcelizer.IconCompatParcelizer(documentCaptureExperience_MembersInjector.RatingCompat);
        }
    }
}
