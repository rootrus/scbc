package p040o;

import p040o.LinkedListMultimap;
import p040o.writeUInt64NoTag;

/* renamed from: o.du */
public final class C4301du extends writeUInt64NoTag<getAboveMaxRearImageSize> {
    public final LinkedListMultimap.ValueForKeyIterator IconCompatParcelizer;

    /* renamed from: o.du$IconCompatParcelizer */
    public static final class IconCompatParcelizer extends CheckEligibilityActivity implements FundFactSheetActivity<setMinZoomPreference, HmlVerifyPhoneValidateOtpActivity> {
        private /* synthetic */ C4301du MediaBrowserCompat$CustomActionResultReceiver;
        final /* synthetic */ String MediaBrowserCompat$ItemReceiver;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public IconCompatParcelizer(C4301du duVar, String str) {
            super(1);
            this.MediaBrowserCompat$CustomActionResultReceiver = duVar;
            this.MediaBrowserCompat$ItemReceiver = str;
        }

        public final /* synthetic */ Object invoke(Object obj) {
            setMinZoomPreference setminzoompreference = (setMinZoomPreference) obj;
            onGetStartedClick.write((Object) setminzoompreference, "<name for destructuring parameter 0>");
            final String str = setminzoompreference.MediaBrowserCompat$CustomActionResultReceiver;
            C4301du duVar = this.MediaBrowserCompat$CustomActionResultReceiver;
            writeUInt64NoTag.IconCompatParcelizer r1 = new writeUInt64NoTag.IconCompatParcelizer<getAboveMaxRearImageSize>(this) {
                private /* synthetic */ IconCompatParcelizer MediaBrowserCompat$CustomActionResultReceiver;

                {
                    this.MediaBrowserCompat$CustomActionResultReceiver = r1;
                }

                public final /* synthetic */ void IconCompatParcelizer(Object obj) {
                    getAboveMaxRearImageSize getabovemaxrearimagesize = (getAboveMaxRearImageSize) obj;
                    getabovemaxrearimagesize.aj_();
                    getabovemaxrearimagesize.write(C4301du.MediaBrowserCompat$CustomActionResultReceiver(str, this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver));
                }
            };
            if (duVar.RatingCompat != null) {
                r1.IconCompatParcelizer(duVar.RatingCompat);
            }
            return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
        }
    }

    /* renamed from: o.du$write */
    public static final class write<V> implements writeUInt64NoTag.IconCompatParcelizer<getAboveMaxRearImageSize> {
        public static final write MediaBrowserCompat$CustomActionResultReceiver = new write();

        write() {
        }

        public final /* bridge */ /* synthetic */ void IconCompatParcelizer(Object obj) {
            ((getAboveMaxRearImageSize) obj).IconCompatParcelizer();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @HmlPinActivity
    public C4301du(RegularImmutableBiMap regularImmutableBiMap, LinkedListMultimap.ValueForKeyIterator valueForKeyIterator) {
        super(regularImmutableBiMap);
        onGetStartedClick.write((Object) regularImmutableBiMap, "errorDisplayMapper");
        onGetStartedClick.write((Object) valueForKeyIterator, "mPartnerAuthorizeController");
        this.IconCompatParcelizer = valueForKeyIterator;
    }

    public static String MediaBrowserCompat$CustomActionResultReceiver(String str, String str2) {
        if (str2 == null) {
            return str;
        }
        if (str == null) {
            return null;
        }
        if (GoodToKnowActivity.read((CharSequence) str, "?", 0, false) > 0) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append("&denyUrl=");
            sb.append(str2);
            return sb.toString();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append("?denyUrl=");
        sb2.append(str2);
        return sb2.toString();
    }
}
