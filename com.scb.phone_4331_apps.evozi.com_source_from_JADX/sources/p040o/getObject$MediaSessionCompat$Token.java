package p040o;

import p040o.getObject;
import p040o.writeUInt64NoTag;

/* renamed from: o.getObject$MediaSessionCompat$Token */
final class getObject$MediaSessionCompat$Token extends CheckEligibilityActivity implements FundFactSheetActivity<onMarkerClick, HmlVerifyPhoneValidateOtpActivity> {
    final /* synthetic */ getObject IconCompatParcelizer;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    getObject$MediaSessionCompat$Token(getObject getobject) {
        super(1);
        this.IconCompatParcelizer = getobject;
    }

    public final /* synthetic */ Object invoke(Object obj) {
        onMarkerClick onmarkerclick = (onMarkerClick) obj;
        onGetStartedClick.write((Object) onmarkerclick, "verifyMethod");
        this.IconCompatParcelizer.MediaBrowserCompat$SearchResultReceiver = onmarkerclick;
        getObject getobject = this.IconCompatParcelizer;
        writeUInt64NoTag.IconCompatParcelizer r0 = new writeUInt64NoTag.IconCompatParcelizer<QuickExtractorAgentListener>(this) {
            private /* synthetic */ getObject$MediaSessionCompat$Token write;

            {
                this.write = r1;
            }

            public final /* synthetic */ void IconCompatParcelizer(Object obj) {
                QuickExtractorAgentListener quickExtractorAgentListener = (QuickExtractorAgentListener) obj;
                quickExtractorAgentListener.aj_();
                if (this.write.IconCompatParcelizer.MediaBrowserCompat$MediaItem.MediaBrowserCompat$ItemReceiver()) {
                    quickExtractorAgentListener.MediaBrowserCompat$CustomActionResultReceiver();
                    return;
                }
                getObject getobject = this.write.IconCompatParcelizer;
                onMarkerClick onmarkerclick = getobject.MediaBrowserCompat$SearchResultReceiver;
                if (onmarkerclick != null) {
                    writeUInt64NoTag.IconCompatParcelizer write2 = new getObject.write(onmarkerclick, getobject);
                    if (getobject.RatingCompat != null) {
                        write2.IconCompatParcelizer(getobject.RatingCompat);
                    }
                }
            }
        };
        if (getobject.RatingCompat != null) {
            r0.IconCompatParcelizer(getobject.RatingCompat);
        }
        return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
    }
}
