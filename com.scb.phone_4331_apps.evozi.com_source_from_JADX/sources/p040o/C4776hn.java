package p040o;

import com.scb.phone.view.fragment.easycash.financialinformation.C5927x768fae8c;
import p040o.writeUInt64NoTag;

/* renamed from: o.hn */
public final class C4776hn extends writeUInt64NoTag<LocalProjectProvider$b$MediaBrowserCompat$ItemReceiver> {
    /* access modifiers changed from: private */
    public final getValueStrength IconCompatParcelizer;
    public final touch MediaBrowserCompat$ItemReceiver;
    public final listIteratorImpl read;
    public ForwardingService write;

    /* renamed from: o.hn$IconCompatParcelizer */
    public static final class IconCompatParcelizer<V> implements writeUInt64NoTag.IconCompatParcelizer<LocalProjectProvider$b$MediaBrowserCompat$ItemReceiver> {
        public static final IconCompatParcelizer read = new IconCompatParcelizer();

        IconCompatParcelizer() {
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            ((LocalProjectProvider$b$MediaBrowserCompat$ItemReceiver) obj).MediaBrowserCompat$CustomActionResultReceiver();
        }
    }

    /* renamed from: o.hn$MediaDescriptionCompat */
    public static final class MediaDescriptionCompat<V> implements writeUInt64NoTag.IconCompatParcelizer<LocalProjectProvider$b$MediaBrowserCompat$ItemReceiver> {
        public static final MediaDescriptionCompat MediaBrowserCompat$ItemReceiver = new MediaDescriptionCompat();

        MediaDescriptionCompat() {
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            ((LocalProjectProvider$b$MediaBrowserCompat$ItemReceiver) obj).read();
        }
    }

    /* renamed from: o.hn$write */
    public static final class write<V> implements writeUInt64NoTag.IconCompatParcelizer<LocalProjectProvider$b$MediaBrowserCompat$ItemReceiver> {
        private /* synthetic */ C4776hn MediaBrowserCompat$ItemReceiver;

        public write(C4776hn hnVar) {
            this.MediaBrowserCompat$ItemReceiver = hnVar;
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            ((LocalProjectProvider$b$MediaBrowserCompat$ItemReceiver) obj).write(C4776hn.IconCompatParcelizer(this.MediaBrowserCompat$ItemReceiver));
        }
    }

    /* renamed from: o.hn$read */
    public static final class read extends CheckEligibilityActivity implements FundFactSheetActivity<C5927x768fae8c, HmlVerifyPhoneValidateOtpActivity> {
        final /* synthetic */ C4776hn MediaBrowserCompat$ItemReceiver;
        final /* synthetic */ boolean read;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public read(C4776hn hnVar, boolean z) {
            super(1);
            this.MediaBrowserCompat$ItemReceiver = hnVar;
            this.read = z;
        }

        public final /* synthetic */ Object invoke(Object obj) {
            final C5927x768fae8c easycashBusinessAndMaritalInfoFragment$MediaBrowserCompat$ItemReceiver = (C5927x768fae8c) obj;
            onGetStartedClick.write((Object) easycashBusinessAndMaritalInfoFragment$MediaBrowserCompat$ItemReceiver, "confirm");
            C4776hn.MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$ItemReceiver);
            C4776hn hnVar = this.MediaBrowserCompat$ItemReceiver;
            writeUInt64NoTag.IconCompatParcelizer r1 = new writeUInt64NoTag.IconCompatParcelizer<LocalProjectProvider$b$MediaBrowserCompat$ItemReceiver>(this) {
                private /* synthetic */ read read;

                {
                    this.read = r1;
                }

                public final /* synthetic */ void IconCompatParcelizer(Object obj) {
                    ((LocalProjectProvider$b$MediaBrowserCompat$ItemReceiver) obj).write(this.read.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer.read(easycashBusinessAndMaritalInfoFragment$MediaBrowserCompat$ItemReceiver, C4776hn.IconCompatParcelizer(this.read.MediaBrowserCompat$ItemReceiver), this.read.read));
                }
            };
            if (hnVar.RatingCompat != null) {
                r1.IconCompatParcelizer(hnVar.RatingCompat);
            }
            return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
        }
    }

    public static final /* synthetic */ ForwardingService IconCompatParcelizer(C4776hn hnVar) {
        ForwardingService forwardingService = hnVar.write;
        if (forwardingService == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("purchaseReviewDisplay");
        }
        return forwardingService;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @HmlPinActivity
    public C4776hn(RegularImmutableBiMap regularImmutableBiMap, listIteratorImpl listiteratorimpl, touch touch, getValueStrength getvaluestrength) {
        super(regularImmutableBiMap);
        onGetStartedClick.write((Object) regularImmutableBiMap, "errorDisplayMapper");
        onGetStartedClick.write((Object) listiteratorimpl, "controller");
        onGetStartedClick.write((Object) touch, "reviewMapper");
        onGetStartedClick.write((Object) getvaluestrength, "successMapper");
        this.read = listiteratorimpl;
        this.MediaBrowserCompat$ItemReceiver = touch;
        this.IconCompatParcelizer = getvaluestrength;
    }

    public static final /* synthetic */ void MediaBrowserCompat$ItemReceiver(C4776hn hnVar) {
        if (hnVar.RatingCompat != null) {
            hnVar.RatingCompat.aj_();
        }
    }
}
