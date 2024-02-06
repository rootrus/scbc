package p040o;

import java.util.Collection;
import java.util.List;
import p040o.access$2300;
import p040o.onNotNowClick;
import p040o.writeUInt64NoTag;

/* renamed from: o.nativeProcessPage$MediaBrowserCompat$ItemReceiver */
public final class nativeProcessPage$MediaBrowserCompat$ItemReceiver extends CheckEligibilityActivity implements FundFactSheetActivity<getDefaultLevelIndex, HmlVerifyPhoneValidateOtpActivity> {
    final /* synthetic */ nativeProcessPage MediaBrowserCompat$ItemReceiver;
    final /* synthetic */ onNotNowClick.read read;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public nativeProcessPage$MediaBrowserCompat$ItemReceiver(nativeProcessPage nativeprocesspage, onNotNowClick.read read2) {
        super(1);
        this.MediaBrowserCompat$ItemReceiver = nativeprocesspage;
        this.read = read2;
    }

    public final /* synthetic */ Object invoke(Object obj) {
        final getDefaultLevelIndex getdefaultlevelindex = (getDefaultLevelIndex) obj;
        onGetStartedClick.write((Object) getdefaultlevelindex, "it");
        nativeProcessPage nativeprocesspage = this.MediaBrowserCompat$ItemReceiver;
        writeUInt64NoTag.IconCompatParcelizer r1 = new writeUInt64NoTag.IconCompatParcelizer<newIdParameters>(this) {
            private /* synthetic */ nativeProcessPage$MediaBrowserCompat$ItemReceiver read;

            {
                this.read = r1;
            }

            public final /* synthetic */ void IconCompatParcelizer(Object obj) {
                newIdParameters newidparameters = (newIdParameters) obj;
                nativeProcessPage.MediaBrowserCompat$ItemReceiver(this.read.MediaBrowserCompat$ItemReceiver);
                this.read.read.MediaBrowserCompat$ItemReceiver = nativeProcessPage.MediaBrowserCompat$ItemReceiver(this.read.MediaBrowserCompat$ItemReceiver, getdefaultlevelindex).IconCompatParcelizer;
                Collection collection = (List) this.read.read.MediaBrowserCompat$ItemReceiver;
                if (collection == null || collection.isEmpty()) {
                    nativeProcessPage nativeprocesspage = this.read.MediaBrowserCompat$ItemReceiver;
                    RegularImmutableBiMap read2 = this.read.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver;
                    nativeprocesspage.MediaBrowserCompat$ItemReceiver(read2.read((String) null, read2.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.error_generic_resource), access$2300.write.JUST_DISMISS));
                    return;
                }
                List list = (List) this.read.read.MediaBrowserCompat$ItemReceiver;
                if (list != null) {
                    newidparameters.IconCompatParcelizer(list);
                }
            }
        };
        if (nativeprocesspage.RatingCompat != null) {
            r1.IconCompatParcelizer(nativeprocesspage.RatingCompat);
        }
        return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
    }
}
