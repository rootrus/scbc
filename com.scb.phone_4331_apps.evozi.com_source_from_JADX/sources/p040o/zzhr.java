package p040o;

import java.util.List;
import org.threeten.p041bp.OffsetDateTime;
import p040o.zzcz;

/* renamed from: o.zzhr */
public final /* synthetic */ class zzhr implements DirectDebitDeepLinkActivity {
    private final /* synthetic */ zzjv MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ zzhr(zzjv zzjv) {
        this.MediaBrowserCompat$CustomActionResultReceiver = zzjv;
    }

    public final Object write(Object obj) {
        ValueCallbackKeyframeAnimation valueCallbackKeyframeAnimation = (ValueCallbackKeyframeAnimation) obj;
        SmsRetrieverApi smsRetrieverApi = this.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer;
        onGetStartedClick.write((Object) valueCallbackKeyframeAnimation, "entity");
        double d = valueCallbackKeyframeAnimation.IconCompatParcelizer;
        String str = valueCallbackKeyframeAnimation.MediaBrowserCompat$CustomActionResultReceiver;
        zzcz.zzg.write IconCompatParcelizer = SmsRetrieverApi.IconCompatParcelizer(valueCallbackKeyframeAnimation.read);
        double d2 = valueCallbackKeyframeAnimation.write;
        OffsetDateTime write = FragmentBuilder_BindSummaryFragment.write(valueCallbackKeyframeAnimation.MediaBrowserCompat$ItemReceiver, OffsetDateTime.now());
        if (write == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver();
        }
        onGetStartedClick.IconCompatParcelizer((Object) write, "transformStringToDateTim…, OffsetDateTime.now())!!");
        return new zzcz.zzg((String) null, d, str, IconCompatParcelizer, d2, write, (Integer) null, (List) null, (zzcz.zzb) null, 129);
    }
}
