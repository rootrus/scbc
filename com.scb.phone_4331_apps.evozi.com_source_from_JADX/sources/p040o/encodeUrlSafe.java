package p040o;

import com.scb.phone.data.entity.transfer.SingleDataEntity;
import java.util.List;
import p040o.Api;
import p040o.TreeTypeAdapter;
import p040o.zzm;

/* renamed from: o.encodeUrlSafe */
public final /* synthetic */ class encodeUrlSafe implements DirectDebitDeepLinkActivity {
    private final /* synthetic */ FragmentBuilder_BindDiscoverFragment MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ encodeUrlSafe(FragmentBuilder_BindDiscoverFragment fragmentBuilder_BindDiscoverFragment) {
        this.MediaBrowserCompat$ItemReceiver = fragmentBuilder_BindDiscoverFragment;
    }

    public final Object write(Object obj) {
        zzm.zzg zzg;
        int i;
        String str;
        findString findstring;
        FragmentBuilder_BindDiscoverFragment fragmentBuilder_BindDiscoverFragment = this.MediaBrowserCompat$ItemReceiver;
        Api.ApiOptions apiOptions = fragmentBuilder_BindDiscoverFragment.read;
        List<zzur> write = fragmentBuilder_BindDiscoverFragment.write();
        List<Model> list = ((isLiteral) ((SingleDataEntity) obj).getData()).MediaBrowserCompat$CustomActionResultReceiver;
        if (list == null || !(!list.isEmpty()) || write == null || !(!write.isEmpty())) {
            zzg = new zzm.zzg();
        } else {
            int i2 = 0;
            zzur zzur = write.get(0);
            peekKeyword peekkeyword = (peekKeyword) list.get(0);
            onGetStartedClick.write((Object) zzur, "merchant");
            zzg = new zzm.zzg();
            if (peekkeyword != null) {
                i = peekkeyword.IconCompatParcelizer;
            } else {
                i = 0;
            }
            zzg.MediaDescriptionCompat = i;
            zzg.MediaMetadataCompat = zzur.MediaBrowserCompat$SearchResultReceiver;
            zzg.MediaBrowserCompat$CustomActionResultReceiver = zzur.MediaBrowserCompat$ItemReceiver;
            zzrm zzrm = zzur.IconCompatParcelizer;
            List<Model> list2 = null;
            if (zzrm != null) {
                str = zzrm.MediaBrowserCompat$ItemReceiver;
            } else {
                str = null;
            }
            zzg.MediaBrowserCompat$SearchResultReceiver = str;
            zzg.write = zzur.write;
            zzg.IconCompatParcelizer = peekkeyword != null ? peekkeyword.read : null;
            zzg.read = peekkeyword != null ? peekkeyword.MediaBrowserCompat$CustomActionResultReceiver : null;
            if (peekkeyword != null) {
                findstring = peekkeyword.MediaBrowserCompat$ItemReceiver;
            } else {
                findstring = null;
            }
            zzm.zze zze = new zzm.zze();
            if (findstring != null) {
                i2 = findstring.MediaBrowserCompat$CustomActionResultReceiver;
            }
            zze.IconCompatParcelizer = i2;
            if (findstring != null) {
                list2 = findstring.read;
            }
            zze.write = Api.ApiOptions.write(list2, new TreeTypeAdapter.SingleTypeFactory.write(new Api$ApiOptions$MediaBrowserCompat$ItemReceiver(apiOptions)));
            zzg.MediaBrowserCompat$MediaItem = zze;
            zzg.MediaBrowserCompat$ItemReceiver = true;
        }
        return DebitCardResetOtpActivity.just(zzg);
    }
}
