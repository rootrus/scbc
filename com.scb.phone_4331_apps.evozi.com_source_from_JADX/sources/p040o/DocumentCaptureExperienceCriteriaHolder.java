package p040o;

import android.content.Context;
import com.scb.phone.domain.errors.RetrofitException;
import p040o.LinkedListMultimap;
import p040o.access$2300;
import p040o.writeUInt64NoTag;

/* renamed from: o.DocumentCaptureExperienceCriteriaHolder */
public final class DocumentCaptureExperienceCriteriaHolder extends writeUInt64NoTag<C7133hG> {
    public final LinkedListMultimap.AsMapEntries.C35791 IconCompatParcelizer;
    public final setUserPropertyInternal read;
    public final Context write;

    /* renamed from: o.DocumentCaptureExperienceCriteriaHolder$IconCompatParcelizer */
    public static final class IconCompatParcelizer extends CheckEligibilityActivity implements FundFactSheetActivity<String, HmlVerifyPhoneValidateOtpActivity> {
        private /* synthetic */ DocumentCaptureExperienceCriteriaHolder IconCompatParcelizer;
        private /* synthetic */ String MediaBrowserCompat$ItemReceiver;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public IconCompatParcelizer(DocumentCaptureExperienceCriteriaHolder documentCaptureExperienceCriteriaHolder, String str) {
            super(1);
            this.IconCompatParcelizer = documentCaptureExperienceCriteriaHolder;
            this.MediaBrowserCompat$ItemReceiver = str;
        }

        public final /* synthetic */ Object invoke(Object obj) {
            String str = (String) obj;
            onGetStartedClick.write((Object) str, "preregisterTokenId");
            DocumentCaptureExperienceCriteriaHolder.IconCompatParcelizer(this.IconCompatParcelizer, this.MediaBrowserCompat$ItemReceiver, str);
            return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
        }
    }

    /* renamed from: o.DocumentCaptureExperienceCriteriaHolder$read */
    static final class read<V> implements writeUInt64NoTag.IconCompatParcelizer<C7133hG> {
        private /* synthetic */ access$2200 read;

        read(access$2200 access_2200) {
            this.read = access_2200;
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            String str = this.read.IconCompatParcelizer;
            onGetStartedClick.IconCompatParcelizer((Object) str, "errorDisplay.message");
            ((C7133hG) obj).read(str);
        }
    }

    /* renamed from: o.DocumentCaptureExperienceCriteriaHolder$write */
    static final class write<V> implements writeUInt64NoTag.IconCompatParcelizer<C7133hG> {
        public static final write read = new write();

        write() {
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            ((C7133hG) obj).read();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @HmlPinActivity
    public DocumentCaptureExperienceCriteriaHolder(LinkedListMultimap.AsMapEntries.C35791 r2, setUserPropertyInternal setuserpropertyinternal, RegularImmutableBiMap regularImmutableBiMap, Context context) {
        super(regularImmutableBiMap);
        onGetStartedClick.write((Object) r2, "verifyOtpController");
        onGetStartedClick.write((Object) setuserpropertyinternal, "preLoadCheckCase");
        onGetStartedClick.write((Object) context, "context");
        this.IconCompatParcelizer = r2;
        this.read = setuserpropertyinternal;
        this.write = context;
    }

    public static final /* synthetic */ void MediaBrowserCompat$ItemReceiver(DocumentCaptureExperienceCriteriaHolder documentCaptureExperienceCriteriaHolder, Throwable th) {
        boolean z = true;
        if (documentCaptureExperienceCriteriaHolder.RatingCompat != null) {
            documentCaptureExperienceCriteriaHolder.RatingCompat.aj_();
        }
        if (removeIfFromRandomAccessList.IconCompatParcelizer(th, RetrofitException.read.OTP_FAILED, RetrofitException.read.OTP_REACH_MAX_LIMIT, RetrofitException.read.OTP_EXPIRED)) {
            access$2200 MediaBrowserCompat$ItemReceiver = documentCaptureExperienceCriteriaHolder.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.JUST_DISMISS);
            if (MediaBrowserCompat$ItemReceiver != null) {
                writeUInt64NoTag.IconCompatParcelizer read2 = new read(MediaBrowserCompat$ItemReceiver);
                if (documentCaptureExperienceCriteriaHolder.RatingCompat == null) {
                    z = false;
                }
                if (z) {
                    read2.IconCompatParcelizer(documentCaptureExperienceCriteriaHolder.RatingCompat);
                    return;
                }
                return;
            }
            return;
        }
        writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = write.read;
        if (documentCaptureExperienceCriteriaHolder.RatingCompat == null) {
            z = false;
        }
        if (z) {
            iconCompatParcelizer.IconCompatParcelizer(documentCaptureExperienceCriteriaHolder.RatingCompat);
        }
    }

    public static final /* synthetic */ void IconCompatParcelizer(DocumentCaptureExperienceCriteriaHolder documentCaptureExperienceCriteriaHolder, String str, String str2) {
        boolean z = true;
        if (documentCaptureExperienceCriteriaHolder.RatingCompat != null) {
            documentCaptureExperienceCriteriaHolder.RatingCompat.aj_();
        }
        int hashCode = str.hashCode();
        if (hashCode != -58979906) {
            if (hashCode == 233355415 && str.equals("DEVICE_NOT_REGISTERED")) {
                writeUInt64NoTag.IconCompatParcelizer documentCaptureExperienceCriteriaHolder$MediaBrowserCompat$CustomActionResultReceiver = new C9713x6f72a72d(str2);
                if (documentCaptureExperienceCriteriaHolder.RatingCompat == null) {
                    z = false;
                }
                if (z) {
                    documentCaptureExperienceCriteriaHolder$MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer(documentCaptureExperienceCriteriaHolder.RatingCompat);
                }
            }
        } else if (str.equals("PRE_REGISTERED")) {
            writeUInt64NoTag.IconCompatParcelizer documentCaptureExperienceCriteriaHolder$MediaBrowserCompat$ItemReceiver = new C9714x1ecdc8bc(str2);
            if (documentCaptureExperienceCriteriaHolder.RatingCompat == null) {
                z = false;
            }
            if (z) {
                documentCaptureExperienceCriteriaHolder$MediaBrowserCompat$ItemReceiver.IconCompatParcelizer(documentCaptureExperienceCriteriaHolder.RatingCompat);
            }
        }
    }
}
