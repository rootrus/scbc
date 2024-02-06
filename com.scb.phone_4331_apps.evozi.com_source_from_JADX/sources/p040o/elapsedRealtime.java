package p040o;

import com.scb.phone.domain.entity.mwpartner.EntityMappingException;
import com.scb.phone.view.activity.csent.MarketingCSentWebViewActivity;
import java.util.Arrays;
import java.util.List;
import p040o.Api;

/* renamed from: o.elapsedRealtime */
public final /* synthetic */ class elapsedRealtime implements DebitCardMarketConductDeepLinkActivity {
    private final /* synthetic */ FragmentBuilder_BindECouponQuantityFragment read;

    public /* synthetic */ elapsedRealtime(FragmentBuilder_BindECouponQuantityFragment fragmentBuilder_BindECouponQuantityFragment) {
        this.read = fragmentBuilder_BindECouponQuantityFragment;
    }

    public final void IconCompatParcelizer(Object obj) {
        String str;
        FragmentBuilder_BindECouponQuantityFragment fragmentBuilder_BindECouponQuantityFragment = this.read;
        MarketingCSentWebViewActivity.IconCompatParcelizer iconCompatParcelizer = (MarketingCSentWebViewActivity.IconCompatParcelizer) obj;
        onGetStartedClick.write((Object) iconCompatParcelizer, "merchantLanding");
        String[] strArr = {"LANDING", "LINKWALLET", "ONBOARD"};
        onGetStartedClick.write((Object) strArr, "elements");
        onGetStartedClick.write((Object) strArr, "$this$asList");
        List asList = Arrays.asList(strArr);
        onGetStartedClick.IconCompatParcelizer((Object) asList, "ArraysUtilJVM.asList(this)");
        if (asList.contains(iconCompatParcelizer.read)) {
            boolean z = false;
            Integer[] numArr = {0, 1};
            onGetStartedClick.write((Object) numArr, "elements");
            onGetStartedClick.write((Object) numArr, "$this$asList");
            List asList2 = Arrays.asList(numArr);
            onGetStartedClick.IconCompatParcelizer((Object) asList2, "ArraysUtilJVM.asList(this)");
            if (asList2.contains(Integer.valueOf(iconCompatParcelizer.MediaDescriptionCompat))) {
                String[] strArr2 = {"LANDING", "ONBOARD"};
                onGetStartedClick.write((Object) strArr2, "elements");
                onGetStartedClick.write((Object) strArr2, "$this$asList");
                List asList3 = Arrays.asList(strArr2);
                onGetStartedClick.IconCompatParcelizer((Object) asList3, "ArraysUtilJVM.asList(this)");
                if (asList3.contains(iconCompatParcelizer.read)) {
                    if (iconCompatParcelizer.MediaSessionCompat$QueueItem == null) {
                        throw new EntityMappingException("MerchantLanding.urlTH can't be null when function is ONBOARD or LANDING");
                    } else if (iconCompatParcelizer.MediaMetadataCompat == null) {
                        throw new EntityMappingException("MerchantLanding.urlEN can't be null when function is ONBOARD or LANDING");
                    } else if (iconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver != null) {
                        String str2 = iconCompatParcelizer.read;
                        int hashCode = str2.hashCode();
                        if (hashCode != -605208505) {
                            if (hashCode == 665830903 && str2.equals("LANDING") && iconCompatParcelizer.MediaBrowserCompat$ItemReceiver == null) {
                                throw new EntityMappingException(Api.ApiOptions.Optional.MediaBrowserCompat$ItemReceiver);
                            }
                        } else if (str2.equals("ONBOARD")) {
                            CharSequence charSequence = iconCompatParcelizer.RatingCompat;
                            if (charSequence == null || charSequence.length() == 0) {
                                z = true;
                            }
                            if (z) {
                                throw new EntityMappingException(Api.ApiOptions.Optional.read);
                            }
                        }
                    } else {
                        throw new EntityMappingException("MerchantLanding.applicationURL can't be null when function is ONBOARD or LANDING");
                    }
                }
                fragmentBuilder_BindECouponQuantityFragment.IconCompatParcelizer.IconCompatParcelizer = iconCompatParcelizer;
                FragmentBuilder_BindPurchaseFromTabSelectionFragment fragmentBuilder_BindPurchaseFromTabSelectionFragment = fragmentBuilder_BindECouponQuantityFragment.MediaBrowserCompat$ItemReceiver;
                if (iconCompatParcelizer.IconCompatParcelizer != null) {
                    str = iconCompatParcelizer.IconCompatParcelizer.write;
                } else {
                    str = null;
                }
                fragmentBuilder_BindPurchaseFromTabSelectionFragment.IconCompatParcelizer = str;
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("MerchantLanding.tncFlag ");
            sb.append(iconCompatParcelizer.MediaDescriptionCompat);
            sb.append(" must be 0 or 1");
            throw new EntityMappingException(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("MerchantLanding.function ");
        sb2.append(iconCompatParcelizer.read);
        sb2.append(" must be one of ");
        sb2.append(asList);
        throw new EntityMappingException(sb2.toString());
    }
}
