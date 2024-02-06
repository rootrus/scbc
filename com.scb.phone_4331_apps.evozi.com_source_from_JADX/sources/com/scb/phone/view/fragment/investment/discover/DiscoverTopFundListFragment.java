package com.scb.phone.view.fragment.investment.discover;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$MediaSessionCompat$QueueItem;
import androidx.recyclerview.widget.RecyclerView$MediaSessionCompat$ResultReceiverWrapper;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.activity.partner.PartnerAuthorizationActivity;
import com.scb.phone.view.activity.partner.PartnerAuthorizationActivity$MediaBrowserCompat$ItemReceiver;
import com.scb.phone.view.adapter.investment.discover.DiscoverTopListRecyclerAdapter;
import com.scb.phone.view.custom.common.CustomDialog;
import com.scb.phone.view.fragment.BaseFragment;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p040o.CheckEligibilityActivity;
import p040o.FundFactSheetActivity;
import p040o.HmlVerifyPhoneValidateOtpActivity;
import p040o.MyECouponActivity_ViewBinding;
import p040o.ZTBSV;
import p040o.forEachSrcAtop;
import p040o.onGetStartedClick;
import p040o.setCrashlyticsDataCollectionEnabled;
import p040o.setTapText;
import p040o.zzmd;

public final class DiscoverTopFundListFragment extends BaseFragment {
    public static final write IconCompatParcelizer = new write((byte) 0);
    private String MediaBrowserCompat$CustomActionResultReceiver;
    private forEachSrcAtop MediaDescriptionCompat;
    @BindView
    public RecyclerView recyclerView;
    @BindView
    public TextView tvAsOfDateTitle;

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
    }

    static final class IconCompatParcelizer extends CheckEligibilityActivity implements FundFactSheetActivity<setCrashlyticsDataCollectionEnabled, HmlVerifyPhoneValidateOtpActivity> {
        private /* synthetic */ DiscoverTopFundListFragment MediaBrowserCompat$CustomActionResultReceiver;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        IconCompatParcelizer(DiscoverTopFundListFragment discoverTopFundListFragment) {
            super(1);
            this.MediaBrowserCompat$CustomActionResultReceiver = discoverTopFundListFragment;
        }

        public final /* synthetic */ Object invoke(Object obj) {
            setCrashlyticsDataCollectionEnabled setcrashlyticsdatacollectionenabled = (setCrashlyticsDataCollectionEnabled) obj;
            onGetStartedClick.write((Object) setcrashlyticsdatacollectionenabled, "it");
            DiscoverTopFundListFragment.MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$CustomActionResultReceiver, setcrashlyticsdatacollectionenabled);
            return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
        }
    }

    public static final class write {
        private write() {
        }

        public /* synthetic */ write(byte b) {
            this();
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        onGetStartedClick.write((Object) layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(R.layout.f86752131493902, viewGroup, false);
        this.read = ButterKnife.IconCompatParcelizer(this, inflate);
        return inflate;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        onGetStartedClick.write((Object) view, Promotion.ACTION_VIEW);
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.MediaBrowserCompat$CustomActionResultReceiver = arguments.getString("com.scb.phone.view.fragment.investment.discover.DiscoverTopFundListFragment.applicationId", "");
            List parcelableArrayList = arguments.getParcelableArrayList("com.scb.phone.EXTRA_LIST");
            FragmentActivity activity = getActivity();
            TextView textView = this.tvAsOfDateTitle;
            if (textView == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvAsOfDateTitle");
            }
            textView.setText(getString(R.string.investment_as_of_date, arguments.getString("com.scb.phone.EXTRA_TRANSACTION_DATE")));
            if (!(parcelableArrayList == null || activity == null)) {
                DiscoverTopListRecyclerAdapter discoverTopListRecyclerAdapter = new DiscoverTopListRecyclerAdapter(parcelableArrayList, new IconCompatParcelizer(this));
                RecyclerView recyclerView2 = this.recyclerView;
                if (recyclerView2 == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver("recyclerView");
                }
                RecyclerView$MediaSessionCompat$ResultReceiverWrapper recyclerView$MediaSessionCompat$ResultReceiverWrapper = recyclerView2.setPadding;
                if (recyclerView$MediaSessionCompat$ResultReceiverWrapper.MediaBrowserCompat$ItemReceiver == null) {
                    recyclerView$MediaSessionCompat$ResultReceiverWrapper.MediaBrowserCompat$ItemReceiver = new RecyclerView$MediaSessionCompat$QueueItem();
                }
                discoverTopListRecyclerAdapter.write = recyclerView$MediaSessionCompat$ResultReceiverWrapper.MediaBrowserCompat$ItemReceiver;
                RecyclerView recyclerView3 = this.recyclerView;
                if (recyclerView3 == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver("recyclerView");
                }
                recyclerView3.setNestedScrollingEnabled(false);
                RecyclerView recyclerView4 = this.recyclerView;
                if (recyclerView4 == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver("recyclerView");
                }
                recyclerView4.setAdapter(discoverTopListRecyclerAdapter);
            }
        }
        this.MediaDescriptionCompat = new forEachSrcAtop();
    }

    public static final /* synthetic */ void MediaBrowserCompat$ItemReceiver(DiscoverTopFundListFragment discoverTopFundListFragment, setCrashlyticsDataCollectionEnabled setcrashlyticsdatacollectionenabled) {
        Bundle arguments = discoverTopFundListFragment.getArguments();
        if (arguments == null || !arguments.getBoolean("com.scb.phone.EXTRA_IS_NTB_USER", false)) {
            forEachSrcAtop foreachsrcatop = discoverTopFundListFragment.MediaDescriptionCompat;
            if (foreachsrcatop == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("mutualFundDiscoveryTracker");
            }
            foreachsrcatop.read(forEachSrcAtop.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer, setcrashlyticsdatacollectionenabled.MediaBrowserCompat$CustomActionResultReceiver);
            forEachSrcAtop foreachsrcatop2 = discoverTopFundListFragment.MediaDescriptionCompat;
            if (foreachsrcatop2 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("mutualFundDiscoveryTracker");
            }
            foreachsrcatop2.read(forEachSrcAtop.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver, setcrashlyticsdatacollectionenabled.IconCompatParcelizer);
            forEachSrcAtop foreachsrcatop3 = discoverTopFundListFragment.MediaDescriptionCompat;
            if (foreachsrcatop3 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("mutualFundDiscoveryTracker");
            }
            ZTBSV ztbsv = foreachsrcatop3;
            String str = forEachSrcAtop.read.f2582x50fd9e4a;
            if (discoverTopFundListFragment.getActivity() != null) {
                ztbsv.MediaBrowserCompat$ItemReceiver(((BaseActivity) discoverTopFundListFragment.getActivity()).scbAnalytics, str);
            }
            Context context = discoverTopFundListFragment.getContext();
            if (context != null) {
                HashMap hashMap = new HashMap();
                Map map = hashMap;
                map.put(zzmd.zzm.zza.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver, discoverTopFundListFragment.MediaBrowserCompat$CustomActionResultReceiver);
                map.put(zzmd.zzm.zza.MediaBrowserCompat$ItemReceiver.MediaMetadataCompat, setcrashlyticsdatacollectionenabled.IconCompatParcelizer);
                PartnerAuthorizationActivity$MediaBrowserCompat$ItemReceiver partnerAuthorizationActivity$MediaBrowserCompat$ItemReceiver = PartnerAuthorizationActivity.MediaDescriptionCompat;
                onGetStartedClick.IconCompatParcelizer((Object) context, "this");
                Intent MediaBrowserCompat$CustomActionResultReceiver2 = PartnerAuthorizationActivity$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver(context, hashMap, true, (Intent) null);
                IntentTidInjectionContextAspect.aspectOf();
                try {
                    Intent read = setTapText.write(context, MediaBrowserCompat$CustomActionResultReceiver2).read();
                    MyECouponActivity_ViewBinding.write write2 = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
                    StringBuilder sb = new StringBuilder("Uri intercepted on Context.startActivity(Intent), modified: ");
                    sb.append(read.getData());
                    sb.append("\n with context ");
                    sb.append(context.hashCode());
                    MyECouponActivity_ViewBinding.IconCompatParcelizer(write2, sb.toString());
                    context.startActivity(read);
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        } else {
            FragmentActivity activity = discoverTopFundListFragment.getActivity();
            if (activity != null) {
                CustomDialog IconCompatParcelizer2 = CustomDialog.IconCompatParcelizer((Context) activity).MediaBrowserCompat$ItemReceiver((int) R.string.investment_ntb_does_not_support_title).IconCompatParcelizer((int) R.string.investment_ntb_does_not_support_text);
                IconCompatParcelizer2.IconCompatParcelizer(IconCompatParcelizer2.read.getString(R.string.ok), C6031xbf2c336c.MediaBrowserCompat$CustomActionResultReceiver).show();
            }
        }
    }
}
