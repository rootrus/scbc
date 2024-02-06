package p040o;

import android.view.View;
import com.thunderhead.android.infrastructure.server.entitys.Captures;
import com.thunderhead.android.infrastructure.server.entitys.Trackers;
import com.thunderhead.android.infrastructure.server.requests.BaseRequest;
import com.thunderhead.android.infrastructure.server.responses.BaseResponse;
import java.lang.reflect.Field;
import java.util.ArrayList;
import p040o.MyECouponActivity_ViewBinding;

/* renamed from: o.onSaveClick */
public abstract class onSaveClick {
    protected DeejungTransferLandingActivity MediaBrowserCompat$CustomActionResultReceiver;

    /* access modifiers changed from: package-private */
    public abstract void MediaBrowserCompat$ItemReceiver(View view) throws ClassCastException;

    /* access modifiers changed from: protected */
    public final void read(DeejungTransferLandingActivity deejungTransferLandingActivity) {
        this.MediaBrowserCompat$CustomActionResultReceiver = deejungTransferLandingActivity;
    }

    protected static void MediaBrowserCompat$CustomActionResultReceiver(DeejungTransferLandingActivity deejungTransferLandingActivity) {
        BaseResponse IconCompatParcelizer;
        if (!FragmentBuilder_BindTransferToOthersStep1Fragment.IconCompatParcelizer(FragmentBuilder_BindHmlIssuerLandingFragment.setCustomView().MediaBrowserCompat$ItemReceiver()) && (IconCompatParcelizer = FragmentBuilder_BindHmlIssuerLandingFragment.IconCompatParcelizer(deejungTransferLandingActivity.MediaBrowserCompat$MediaItem)) != null) {
            Captures[] captures = IconCompatParcelizer.getCaptures();
            if (captures != null) {
                setTextAppearance settextappearance = new setTextAppearance();
                int length = captures.length;
                for (int i = 0; i < length; i++) {
                    DeejungTransferLandingActivity MediaBrowserCompat$ItemReceiver = FragmentBuilder_BindHmlExternalAuthenticationFragment.MediaBrowserCompat$ItemReceiver(captures[i].getPath(), deejungTransferLandingActivity);
                    if (MediaBrowserCompat$ItemReceiver != null) {
                        try {
                            settextappearance.put(captures[i].getId(), BankingAgentReviewActivity.write(MediaBrowserCompat$ItemReceiver.IconCompatParcelizer));
                        } catch (Exception e) {
                            MyECouponActivity_ViewBinding.MediaBrowserCompat$ItemReceiver(e);
                        }
                    }
                }
                if (!settextappearance.isEmpty()) {
                    FragmentBuilder_BindHmlIssuerLandingFragment.setTabContainer().write(deejungTransferLandingActivity.MediaBrowserCompat$MediaItem, settextappearance);
                }
            }
            Trackers[] trackers = IconCompatParcelizer.getTrackers();
            if (trackers != null) {
                ArrayList arrayList = new ArrayList();
                for (int i2 = 0; i2 < trackers.length; i2++) {
                    if (trackers[i2].getPattern().matcher(deejungTransferLandingActivity.ParcelableVolumeInfo).matches() || trackers[i2].getPath().equals(deejungTransferLandingActivity.ParcelableVolumeInfo) || (trackers[i2].isRepeating() && DeejungTransferMinFullConfirmationActivity_ViewBinding.write(trackers[i2].getPath(), deejungTransferLandingActivity.ParcelableVolumeInfo))) {
                        arrayList.add(trackers[i2].getId());
                    }
                }
                if (arrayList.size() != 0) {
                    FragmentBuilder_BindHmlNTBApplyLoanEntryFragment tabContainer = FragmentBuilder_BindHmlIssuerLandingFragment.setTabContainer();
                    String str = deejungTransferLandingActivity.MediaBrowserCompat$MediaItem;
                    StringBuilder sb = new StringBuilder();
                    sb.append("Sending tracking events: Interaction: ");
                    sb.append(str);
                    sb.append(", id's:");
                    sb.append(arrayList.toString());
                    MyECouponActivity_ViewBinding.IconCompatParcelizer(MyECouponActivity_ViewBinding.write, sb.toString());
                    BaseRequest baseRequest = new BaseRequest(str);
                    if (!baseRequest.getUri().matches(".+://\\S+")) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(tabContainer.MediaSessionCompat$Token);
                        sb2.append(baseRequest.getUri());
                        baseRequest.setUri(sb2.toString());
                    }
                    baseRequest.setEmptyProperties(arrayList);
                    if (Boolean.FALSE.equals(tabContainer.IconCompatParcelizer)) {
                        tabContainer.read.MediaBrowserCompat$ItemReceiver(false, baseRequest);
                        return;
                    }
                    tabContainer.MediaDescriptionCompat.read(new C6437x1b3a90a2(tabContainer.MediaBrowserCompat$SearchResultReceiver, baseRequest, new AmortizationActivity_ViewBinding(str, tabContainer.MediaDescriptionCompat, tabContainer.RatingCompat), 10));
                }
            }
        }
    }

    public static void IconCompatParcelizer(View view) {
        onSaveClick read;
        if (BankingAgentSuccessActivity_ViewBinding.MediaBrowserCompat$ItemReceiver(view) && (read = BankingAgentSuccessActivity_ViewBinding.read(view)) != null) {
            try {
                read.MediaBrowserCompat$ItemReceiver(view);
            } catch (ClassCastException unused) {
                MyECouponActivity_ViewBinding.write("Error while ejecting tracking from view");
            }
            BankingAgentSuccessActivity_ViewBinding.write(view, false, (onSaveClick) null);
        }
    }

    protected static Field MediaBrowserCompat$CustomActionResultReceiver(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Exception e) {
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder();
            sb.append(cls.getSimpleName());
            sb.append(" - Reflection: Field not found ");
            sb.append(e.getMessage());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            return null;
        }
    }
}
