package p040o;

import android.view.View;
import com.scb.phone.data.network.service.RewardRedemptionService;
import com.scb.phone.view.activity.hml.C5613x13cfb373;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p040o.AbstractMultimap;
import p040o.Constraints;
import p040o.zzge;
import p040o.zzqj;
import p040o.zzrc;
import p040o.zztx;

/* renamed from: o.BulkTransferSuccessActivity */
public final class BulkTransferSuccessActivity implements AbstractMultimap.MultisetEntryIterator {
    private final zzai IconCompatParcelizer;
    private final ProductAction MediaBrowserCompat$CustomActionResultReceiver;
    private final FragmentBuilder_BindSetupScheduleOnceFragment MediaBrowserCompat$ItemReceiver;
    private final setCheckoutOptions MediaBrowserCompat$MediaItem;
    private final setTransactionTax MediaBrowserCompat$SearchResultReceiver;
    private final zzam MediaDescriptionCompat;
    private C5613x13cfb373 MediaMetadataCompat;
    private final zzo read;
    public final FragmentBuilder_BindSlipFragment write;

    public BulkTransferSuccessActivity() {
    }

    public static View MediaBrowserCompat$ItemReceiver(Object obj) {
        try {
            Field declaredField = Class.forName("se.emilsjolander.stickylistheaders.WrapperView").getDeclaredField("mItem");
            if (declaredField == null) {
                return null;
            }
            declaredField.setAccessible(true);
            return (View) declaredField.get(obj);
        } catch (NoSuchFieldException e) {
            StringBuilder sb = new StringBuilder();
            sb.append("OneOnMenuItemClickListener - Reflection: No Such Field. ");
            sb.append(e.getMessage());
            MyECouponActivity_ViewBinding.write(sb.toString());
            return null;
        } catch (IllegalAccessException e2) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("OneOnMenuItemClickListener - Reflection: Illegal Access. ");
            sb2.append(e2.getMessage());
            MyECouponActivity_ViewBinding.write(sb2.toString());
            return null;
        } catch (ClassNotFoundException e3) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("OneOnMenuItemClickListener - Reflection: Class Not Found. ");
            sb3.append(e3.getMessage());
            MyECouponActivity_ViewBinding.write(sb3.toString());
            return null;
        }
    }

    @HmlPinActivity
    public BulkTransferSuccessActivity(C5613x13cfb373 hmlNTBAdditionalDocumentActivity$MediaBrowserCompat$CustomActionResultReceiver, ProductAction productAction, setCheckoutOptions setcheckoutoptions, setTransactionTax settransactiontax, zzo zzo, zzam zzam, zzai zzai, FragmentBuilder_BindSlipFragment fragmentBuilder_BindSlipFragment, FragmentBuilder_BindSetupScheduleOnceFragment fragmentBuilder_BindSetupScheduleOnceFragment) {
        this.MediaMetadataCompat = hmlNTBAdditionalDocumentActivity$MediaBrowserCompat$CustomActionResultReceiver;
        this.MediaBrowserCompat$CustomActionResultReceiver = productAction;
        this.MediaBrowserCompat$MediaItem = setcheckoutoptions;
        this.MediaBrowserCompat$SearchResultReceiver = settransactiontax;
        this.read = zzo;
        this.MediaDescriptionCompat = zzam;
        this.IconCompatParcelizer = zzai;
        this.write = fragmentBuilder_BindSlipFragment;
        this.MediaBrowserCompat$ItemReceiver = fragmentBuilder_BindSetupScheduleOnceFragment;
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver.clear();
    }

    public final void write() {
        this.write.IconCompatParcelizer.clear();
    }

    public final DebitCardResetOtpActivity<zzqj.zzb> MediaBrowserCompat$CustomActionResultReceiver(Constraints.NotNullConstraint notNullConstraint) {
        return this.MediaMetadataCompat.IconCompatParcelizer.confirmRedemption(notNullConstraint).map(new zzgi(this.MediaBrowserCompat$SearchResultReceiver));
    }

    public final DebitCardResetOtpActivity<C5111open> MediaBrowserCompat$CustomActionResultReceiver(String str) {
        return this.MediaMetadataCompat.IconCompatParcelizer.getRewardCategories(str).map(new zzgl(this.MediaBrowserCompat$CustomActionResultReceiver));
    }

    public final DebitCardResetOtpActivity<zztx.zzb> MediaBrowserCompat$ItemReceiver(String str, int i) {
        return this.MediaMetadataCompat.IconCompatParcelizer.getOPRRewards(str, i).map(new zzgf(this.read));
    }

    public final DebitCardResetOtpActivity<zzrc.zze> MediaBrowserCompat$CustomActionResultReceiver(String str, int i, readStringList readstringlist) {
        DebitCardResetOtpActivity<LottieAnimationView> debitCardResetOtpActivity;
        String format = String.format("%s+%d+%s", new Object[]{str, Integer.valueOf(i), readstringlist});
        synchronized (this.MediaBrowserCompat$ItemReceiver) {
            FragmentBuilder_BindSetupScheduleOnceFragment fragmentBuilder_BindSetupScheduleOnceFragment = this.MediaBrowserCompat$ItemReceiver;
            debitCardResetOtpActivity = fragmentBuilder_BindSetupScheduleOnceFragment.MediaBrowserCompat$ItemReceiver.containsKey(format) ? fragmentBuilder_BindSetupScheduleOnceFragment.MediaBrowserCompat$ItemReceiver.get(format) : null;
            if (debitCardResetOtpActivity == null) {
                debitCardResetOtpActivity = this.MediaMetadataCompat.IconCompatParcelizer.getOprDetails(str, i, readstringlist).cache();
                this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver.put(format, debitCardResetOtpActivity);
            }
        }
        return debitCardResetOtpActivity.map(new zzgm(this.IconCompatParcelizer));
    }

    public final DebitCardResetOtpActivity<zzqj.zza> IconCompatParcelizer(Constraints.ConstrainedSortedSet constrainedSortedSet, boolean z) {
        int i;
        getFontPath getfontpath;
        String str;
        if (constrainedSortedSet.MediaBrowserCompat$CustomActionResultReceiver == null) {
            i = -1;
        } else {
            i = constrainedSortedSet.MediaBrowserCompat$CustomActionResultReceiver.intValue();
        }
        FragmentBuilder_BindSlipFragment fragmentBuilder_BindSlipFragment = this.write;
        int i2 = constrainedSortedSet.write;
        Map map = fragmentBuilder_BindSlipFragment.IconCompatParcelizer.get(Integer.valueOf(i));
        String str2 = null;
        if (map != null) {
            getfontpath = null;
            for (Map.Entry entry : map.entrySet()) {
                if (((Integer) entry.getKey()).intValue() >= i2) {
                    if (getfontpath == null) {
                        getfontpath = new getFontPath();
                        getfontpath.MediaBrowserCompat$ItemReceiver = new ArrayList();
                    }
                    getFontPath getfontpath2 = (getFontPath) entry.getValue();
                    getfontpath.MediaBrowserCompat$ItemReceiver.addAll(getfontpath2.MediaBrowserCompat$ItemReceiver);
                    getfontpath.write = getfontpath2.write;
                }
            }
        } else {
            getfontpath = null;
        }
        if (getfontpath != null && z) {
            return DebitCardResetOtpActivity.just(setCheckoutOptions.read(getfontpath));
        }
        RewardRedemptionService rewardRedemptionService = this.MediaMetadataCompat.IconCompatParcelizer;
        Integer num = constrainedSortedSet.MediaBrowserCompat$CustomActionResultReceiver;
        int i3 = constrainedSortedSet.write;
        if (constrainedSortedSet.MediaDescriptionCompat != null) {
            str = constrainedSortedSet.MediaDescriptionCompat.value;
        } else {
            str = null;
        }
        Integer num2 = constrainedSortedSet.MediaBrowserCompat$ItemReceiver;
        String str3 = constrainedSortedSet.IconCompatParcelizer;
        String str4 = constrainedSortedSet.MediaBrowserCompat$SearchResultReceiver;
        String replaceAll = str4 == null ? null : str4.replaceAll("[#&']", "_");
        if (constrainedSortedSet.read != null) {
            str2 = constrainedSortedSet.read.name();
        }
        return rewardRedemptionService.getProducts(num, i3, str, num2, str3, replaceAll, str2).doOnNext(new zzge.zzx.zza(this, z, i, constrainedSortedSet)).flatMap(new zzge.zzx(this));
    }

    public final BScanCNotificationDeepLinkActivity<List<zzrc.zza>> IconCompatParcelizer(String str, readString readstring) {
        return BScanCNotificationDeepLinkActivity.read(this.MediaMetadataCompat.IconCompatParcelizer.getSearchSuggestionList(str, readstring != null ? readstring.name() : null).map(zay.IconCompatParcelizer));
    }

    public final DebitCardResetOtpActivity<GiftingActivity_ViewBinding> IconCompatParcelizer(int i, readStringList readstringlist) {
        return this.MediaMetadataCompat.IconCompatParcelizer.getTiers(i, readstringlist).map(new zzgh(this.MediaDescriptionCompat));
    }
}
