package p040o;

import com.scb.phone.data.entity.transfer.SingleDataEntity;
import com.scb.phone.view.activity.cardmanagement.deejungtransfer.DeejungTermsAndConditionsActivity;
import com.scb.phone.view.activity.ccrredemption.ecoupon.C5572x5c6e7578;
import com.scb.phone.view.activity.debitcard.reset.DebitCardResetPinActivity;
import org.threeten.p041bp.OffsetDateTime;

/* renamed from: o.Clock$$CC */
public final /* synthetic */ class Clock$$CC implements DirectDebitDeepLinkActivity {
    private final /* synthetic */ FragmentBuilder_BindECouponQuantityFragment IconCompatParcelizer;

    public /* synthetic */ Clock$$CC(FragmentBuilder_BindECouponQuantityFragment fragmentBuilder_BindECouponQuantityFragment) {
        this.IconCompatParcelizer = fragmentBuilder_BindECouponQuantityFragment;
    }

    public final Object write(Object obj) {
        C5572x5c6e7578 eCouponDetailActivity$MediaBrowserCompat$CustomActionResultReceiver;
        getEndpointPackageName getendpointpackagename = this.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver;
        secondaryHash secondaryhash = (secondaryHash) ((SingleDataEntity) obj).getData();
        onGetStartedClick.write((Object) secondaryhash, "successEntity");
        String str = secondaryhash.write;
        String str2 = secondaryhash.IconCompatParcelizer;
        Boolean bool = null;
        OffsetDateTime write = FragmentBuilder_BindSummaryFragment.write(secondaryhash.MediaBrowserCompat$ItemReceiver, (OffsetDateTime) null);
        skipUnquotedValue skipunquotedvalue = secondaryhash.read;
        onGetStartedClick.write((Object) skipunquotedvalue, "entity");
        String str3 = skipunquotedvalue.MediaBrowserCompat$ItemReceiver;
        equal equal = skipunquotedvalue.write;
        if (equal != null) {
            eCouponDetailActivity$MediaBrowserCompat$CustomActionResultReceiver = new C5572x5c6e7578(equal.write, equal.read);
        } else {
            eCouponDetailActivity$MediaBrowserCompat$CustomActionResultReceiver = null;
        }
        String str4 = skipunquotedvalue.IconCompatParcelizer;
        String str5 = skipunquotedvalue.read;
        if (str5 != null) {
            onGetStartedClick.write((Object) str5, "$this$toBooleanFlag");
            int parseInt = Integer.parseInt(str5);
            boolean z = true;
            if (parseInt != 1) {
                z = false;
            }
            bool = Boolean.valueOf(z);
        }
        return new DebitCardResetPinActivity.read(str, str2, write, new DeejungTermsAndConditionsActivity.IconCompatParcelizer(str3, eCouponDetailActivity$MediaBrowserCompat$CustomActionResultReceiver, str4, bool, skipunquotedvalue.MediaBrowserCompat$CustomActionResultReceiver));
    }
}
