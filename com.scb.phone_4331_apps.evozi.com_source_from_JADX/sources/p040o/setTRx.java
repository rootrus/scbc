package p040o;

import java.util.List;
import org.bouncycastle.i18n.ErrorBundle;
import p040o.CrashlyticsController;
import p040o.writeUInt64NoTag;
import p040o.zzct;

/* renamed from: o.setTRx */
public final /* synthetic */ class setTRx implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ List IconCompatParcelizer;
    private final /* synthetic */ CrashlyticsController.C322317 MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ addImage read;

    public /* synthetic */ setTRx(addImage addimage, List list, CrashlyticsController.C322317 r3) {
        this.read = addimage;
        this.IconCompatParcelizer = list;
        this.MediaBrowserCompat$CustomActionResultReceiver = r3;
    }

    public final void IconCompatParcelizer(Object obj) {
        String str;
        String str2;
        addImage addimage = this.read;
        List list = this.IconCompatParcelizer;
        CrashlyticsController.C322317 r1 = this.MediaBrowserCompat$CustomActionResultReceiver;
        KtaPassportExtractor ktaPassportExtractor = (KtaPassportExtractor) obj;
        List<ForwardingFuture> MediaBrowserCompat$ItemReceiver = addimage.read.MediaBrowserCompat$ItemReceiver(r1);
        List<ForwardingFuture> IconCompatParcelizer2 = addimage.read.IconCompatParcelizer(r1);
        String str3 = r1.MediaBrowserCompat$MediaItem;
        String str4 = r1.AlertController$RecycleListView;
        String str5 = r1.PlaybackStateCompat;
        if (r1.MediaBrowserCompat$SearchResultReceiver != null) {
            str = r1.MediaBrowserCompat$SearchResultReceiver;
        } else {
            str = "";
        }
        newHashSet newhashset = addimage.read;
        onGetStartedClick.write((Object) r1, ErrorBundle.DETAIL_ENTRY);
        if (r1.MediaBrowserCompat$CustomActionResultReceiver == null) {
            str2 = newhashset.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.hml_review_confirmation_attention_message);
            onGetStartedClick.IconCompatParcelizer((Object) str2, "getString(R.string.hml_r…mation_attention_message)");
        } else {
            str2 = r1.MediaBrowserCompat$CustomActionResultReceiver;
        }
        ktaPassportExtractor.MediaBrowserCompat$CustomActionResultReceiver(new writeSessionPartFile(list, MediaBrowserCompat$ItemReceiver, IconCompatParcelizer2, str3, str4, str5, str, str2));
        ktaPassportExtractor.read(Boolean.valueOf(zzct.zza.BUSINESS_OWNER == addimage.MediaBrowserCompat$ItemReceiver.read.MediaBrowserCompat$SearchResultReceiver()));
    }
}
