package p040o;

import com.scb.phone.domain.errors.RetrofitException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p040o.ILocationSourceDelegate;
import p040o.RegularImmutableMap;
import p040o.access$2300;
import p040o.writeUInt64NoTag;
import p040o.zzca;

/* renamed from: o.W */
public final class C3949W extends writeUInt64NoTag<getExpirationMonth> {
    /* access modifiers changed from: private */
    public final RegularImmutableMap.EntrySet read;
    public final getLandmarks write;

    /* renamed from: o.W$IconCompatParcelizer */
    public static final /* synthetic */ class IconCompatParcelizer extends InvestmentFundDetailsActivity implements FundFactSheetActivity<Throwable, HmlVerifyPhoneValidateOtpActivity> {
        public IconCompatParcelizer(C3949W w) {
            super(1, w);
        }

        public final String getName() {
            return "onGetProductDetailError";
        }

        public final CheckSCBSEligibilityActivity getOwner() {
            return FundOnboardingLandingActivity_ViewBinding.write(C3949W.class);
        }

        public final String getSignature() {
            return "onGetProductDetailError(Ljava/lang/Throwable;)V";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            Throwable th = (Throwable) obj;
            onGetStartedClick.write((Object) th, "p1");
            ((C3949W) this.receiver).MediaBrowserCompat$ItemReceiver(((C3949W) this.receiver).MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.NAVIGATE_BACK));
            return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
        }
    }

    /* renamed from: o.W$read */
    static final class read<V> implements writeUInt64NoTag.IconCompatParcelizer<getExpirationMonth> {
        private /* synthetic */ C3949W IconCompatParcelizer;
        private /* synthetic */ zzca.zza.C10763zza MediaBrowserCompat$CustomActionResultReceiver;

        read(C3949W w, zzca.zza.C10763zza zza) {
            this.IconCompatParcelizer = w;
            this.MediaBrowserCompat$CustomActionResultReceiver = zza;
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            getExpirationMonth getexpirationmonth = (getExpirationMonth) obj;
            RegularImmutableMap.EntrySet MediaBrowserCompat$CustomActionResultReceiver2 = this.IconCompatParcelizer.read;
            zzca.zza.C10763zza zza = this.MediaBrowserCompat$CustomActionResultReceiver;
            onGetStartedClick.write((Object) zza, "domain");
            String str = zza.read;
            String str2 = zza.MediaBrowserCompat$CustomActionResultReceiver;
            String str3 = zza.write;
            String c_ = MediaBrowserCompat$CustomActionResultReceiver2.mo26549c_(zza.IconCompatParcelizer);
            onGetStartedClick.IconCompatParcelizer((Object) c_, "transformAssetUrl(domain.detailImageURL)");
            Iterable<zzca.zzb.zzc> iterable = zza.MediaBrowserCompat$ItemReceiver;
            onGetStartedClick.write((Object) iterable, "$this$collectionSizeOrDefault");
            Collection arrayList = new ArrayList(iterable instanceof Collection ? ((Collection) iterable).size() : 10);
            for (zzca.zzb.zzc zzc : iterable) {
                arrayList.add(new deleteSessionPartFilesFor(zzc.MediaDescriptionCompat, zzc.RatingCompat, zzc.MediaBrowserCompat$MediaItem, zzc.read, zzc.write, zzc.MediaBrowserCompat$CustomActionResultReceiver, zzc.IconCompatParcelizer, RegularImmutableMap.EntrySet.MediaBrowserCompat$CustomActionResultReceiver(zzc.MediaBrowserCompat$ItemReceiver)));
            }
            getexpirationmonth.read(new access$900(str, str2, str3, c_, HmlNTBBusinessURLInformationActivity.write((List) arrayList, new RegularImmutableMap$EntrySet$MediaBrowserCompat$ItemReceiver())));
        }
    }

    /* renamed from: o.W$write */
    public static final /* synthetic */ class write extends InvestmentFundDetailsActivity implements FundFactSheetActivity<zzca.zza.C10763zza, HmlVerifyPhoneValidateOtpActivity> {
        public write(C3949W w) {
            super(1, w);
        }

        public final String getName() {
            return "onGetProductDetailSuccess";
        }

        public final CheckSCBSEligibilityActivity getOwner() {
            return FundOnboardingLandingActivity_ViewBinding.write(C3949W.class);
        }

        public final String getSignature() {
            return "onGetProductDetailSuccess(Lcom/scb/phone/domain/entity/etb/ETBProductDetailResponse;)V";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            zzca.zza.C10763zza zza = (zzca.zza.C10763zza) obj;
            onGetStartedClick.write((Object) zza, "p1");
            C3949W.MediaBrowserCompat$ItemReceiver((C3949W) this.receiver, zza);
            return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
        }
    }

    /* renamed from: o.W$MediaDescriptionCompat */
    public static final /* synthetic */ class MediaDescriptionCompat extends InvestmentFundDetailsActivity implements FundFactSheetActivity<Boolean, HmlVerifyPhoneValidateOtpActivity> {
        public MediaDescriptionCompat(C3949W w) {
            super(1, w);
        }

        public final String getName() {
            return "onValidateSuccess";
        }

        public final CheckSCBSEligibilityActivity getOwner() {
            return FundOnboardingLandingActivity_ViewBinding.write(C3949W.class);
        }

        public final String getSignature() {
            return "onValidateSuccess(Z)V";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            C3949W.read((C3949W) this.receiver);
            return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
        }
    }

    /* renamed from: o.W$RatingCompat */
    public static final /* synthetic */ class RatingCompat extends InvestmentFundDetailsActivity implements FundFactSheetActivity<Throwable, HmlVerifyPhoneValidateOtpActivity> {
        public RatingCompat(C3949W w) {
            super(1, w);
        }

        public final String getName() {
            return "onValidateError";
        }

        public final CheckSCBSEligibilityActivity getOwner() {
            return FundOnboardingLandingActivity_ViewBinding.write(C3949W.class);
        }

        public final String getSignature() {
            return "onValidateError(Ljava/lang/Throwable;)V";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            Throwable th = (Throwable) obj;
            onGetStartedClick.write((Object) th, "p1");
            C3949W.read((C3949W) this.receiver, th);
            return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @HmlPinActivity
    public C3949W(getLandmarks getlandmarks, RegularImmutableMap.EntrySet entrySet, RegularImmutableBiMap regularImmutableBiMap) {
        super(regularImmutableBiMap);
        onGetStartedClick.write((Object) getlandmarks, "productDetailCase");
        onGetStartedClick.write((Object) entrySet, "productDetailMapper");
        onGetStartedClick.write((Object) regularImmutableBiMap, "errorDisplayMapper");
        this.write = getlandmarks;
        this.read = entrySet;
    }

    public final void onDestroy() {
        getLandmarks getlandmarks = this.write;
        if (!getlandmarks.MediaBrowserCompat$MediaItem.isDisposed()) {
            getlandmarks.MediaBrowserCompat$MediaItem.dispose();
        }
        super.onDestroy();
    }

    public static deleteSessionPartFilesFor read(String str, List<deleteSessionPartFilesFor> list) {
        Object obj;
        onGetStartedClick.write((Object) list, "productList");
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) str, (Object) ((deleteSessionPartFilesFor) obj).MediaBrowserCompat$CustomActionResultReceiver)) {
                break;
            }
        }
        return (deleteSessionPartFilesFor) obj;
    }

    /* renamed from: o.W$MediaMetadataCompat */
    static final class MediaMetadataCompat implements Runnable {
        private /* synthetic */ C3949W write;

        MediaMetadataCompat(C3949W w) {
            this.write = w;
        }

        public final void run() {
            C3949W w = this.write;
            writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = C39505.MediaBrowserCompat$ItemReceiver;
            if (w.RatingCompat != null) {
                iconCompatParcelizer.IconCompatParcelizer(w.RatingCompat);
            }
        }
    }

    public static final /* synthetic */ void MediaBrowserCompat$ItemReceiver(C3949W w, zzca.zza.C10763zza zza) {
        boolean z = true;
        if (w.RatingCompat != null) {
            w.RatingCompat.aj_();
        }
        writeUInt64NoTag.IconCompatParcelizer read2 = new read(w, zza);
        if (w.RatingCompat == null) {
            z = false;
        }
        if (z) {
            read2.IconCompatParcelizer(w.RatingCompat);
        }
    }

    public static final /* synthetic */ void read(C3949W w, Throwable th) {
        ILocationSourceDelegate iLocationSourceDelegate;
        ILocationSourceDelegate.zza zza;
        String str = null;
        RetrofitException retrofitException = (RetrofitException) (!(th instanceof RetrofitException) ? null : th);
        if (!(retrofitException == null || (iLocationSourceDelegate = retrofitException.IconCompatParcelizer) == null || (zza = iLocationSourceDelegate.write) == null)) {
            str = zza.IconCompatParcelizer;
        }
        if (onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) "3010", (Object) str)) {
            access$2200 MediaBrowserCompat$ItemReceiver = w.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.JUST_DISMISS);
            onGetStartedClick.IconCompatParcelizer((Object) MediaBrowserCompat$ItemReceiver, "errorDisplay");
            w.MediaBrowserCompat$ItemReceiver(w.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver, MediaBrowserCompat$ItemReceiver.IconCompatParcelizer, Iterables$3$MediaBrowserCompat$MediaItem.auto_change_mailing_address_error_verify_email_verify, Iterables$3$MediaBrowserCompat$MediaItem.auto_change_mailing_address_error_verify_email_not_now, new W$MediaBrowserCompat$ItemReceiver(w), new MediaMetadataCompat(w)));
            return;
        }
        w.MediaBrowserCompat$ItemReceiver(w.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, (Runnable) new W$MediaBrowserCompat$SearchResultReceiver(w)));
    }

    public static final /* synthetic */ void read(C3949W w) {
        boolean z = true;
        if (w.RatingCompat != null) {
            w.RatingCompat.aj_();
        }
        writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = W$MediaBrowserCompat$MediaItem.write;
        if (w.RatingCompat == null) {
            z = false;
        }
        if (z) {
            iconCompatParcelizer.IconCompatParcelizer(w.RatingCompat);
        }
    }
}
