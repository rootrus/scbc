package com.scb.phone.view.fragment.investment.discover;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.activity.investment.discover.DiscoverFundFilterListActivity;
import com.scb.phone.view.activity.investment.discover.NtbDiscoverFundFilterListActivity;
import com.scb.phone.view.adapter.investment.discover.DiscoverFundFilterAdapter;
import com.scb.phone.view.fragment.BaseFragment;
import com.thunderhead.android.aspects.AndroidXSupportFragmentIntentTidInjectionAspect;
import java.util.ArrayList;
import java.util.List;
import p040o.FragmentBuilder_BindBaseRemittanceDetailsFragment;
import p040o.FragmentBuilder_BindBulkTransferReviewFragment;
import p040o.HmlPinActivity;
import p040o.Iterables$3$MediaBrowserCompat$MediaItem;
import p040o.MyECouponActivity_ViewBinding;
import p040o.PassportExtractorResponse;
import p040o.SortedLists;
import p040o.UserLogout;
import p040o.UserLogout$MediaBrowserCompat$ItemReceiver;
import p040o.ZTBSV;
import p040o.captureEventData;
import p040o.captureReportData;
import p040o.forEachSrcAtop;
import p040o.onGetStartedClick;
import p040o.populateFramesList;
import p040o.populateSessionOperatingSystemData;
import p040o.populateSignalData;
import p040o.setTapText;
import p040o.writeUInt64NoTag;

public final class DiscoverFundFilterFragment extends BaseFragment implements PassportExtractorResponse {
    public static final DiscoverFundFilterFragment$MediaBrowserCompat$ItemReceiver MediaBrowserCompat$CustomActionResultReceiver = new DiscoverFundFilterFragment$MediaBrowserCompat$ItemReceiver((byte) 0);
    /* access modifiers changed from: private */
    public FragmentBuilder_BindBaseRemittanceDetailsFragment IconCompatParcelizer;
    private final IconCompatParcelizer MediaBrowserCompat$MediaItem = new IconCompatParcelizer(this);
    private forEachSrcAtop MediaDescriptionCompat;
    private DiscoverFundFilterAdapter MediaMetadataCompat;
    @BindView
    public Button btApply;
    @BindView
    public Button btResetToDefault;
    @HmlPinActivity
    public UserLogout presenter;
    @BindView
    public RecyclerView rvFundDiscover;

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
    }

    public static final /* synthetic */ forEachSrcAtop MediaBrowserCompat$CustomActionResultReceiver(DiscoverFundFilterFragment discoverFundFilterFragment) {
        forEachSrcAtop foreachsrcatop = discoverFundFilterFragment.MediaDescriptionCompat;
        if (foreachsrcatop == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("mutualFundDiscoveryTracker");
        }
        return foreachsrcatop;
    }

    public static final class IconCompatParcelizer implements FragmentBuilder_BindBulkTransferReviewFragment {
        private /* synthetic */ DiscoverFundFilterFragment read;

        IconCompatParcelizer(DiscoverFundFilterFragment discoverFundFilterFragment) {
            this.read = discoverFundFilterFragment;
        }

        public final void write() {
            String str;
            List<String> list;
            List<captureReportData> list2;
            populateSignalData populatesignaldata;
            populateSignalData populatesignaldata2;
            DiscoverFundFilterFragment discoverFundFilterFragment = this.read;
            ZTBSV MediaBrowserCompat$CustomActionResultReceiver = DiscoverFundFilterFragment.MediaBrowserCompat$CustomActionResultReceiver(discoverFundFilterFragment);
            String str2 = forEachSrcAtop.read.MediaSessionCompat$ResultReceiverWrapper;
            if (discoverFundFilterFragment.getActivity() != null) {
                MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(((BaseActivity) discoverFundFilterFragment.getActivity()).scbAnalytics, str2);
            }
            UserLogout userLogout = this.read.presenter;
            if (userLogout == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
            }
            UserLogout userLogout2 = this.read.presenter;
            if (userLogout2 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
            }
            SortedLists.Relation.C37994 r1 = userLogout2.read;
            populateFramesList populateframeslist = userLogout2.IconCompatParcelizer;
            captureEventData captureeventdata = userLogout2.write;
            if (populateframeslist == null || (populatesignaldata2 = populateframeslist.write) == null) {
                str = null;
            } else {
                str = populatesignaldata2.IconCompatParcelizer;
            }
            String string = r1.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.investment_discover_types_of_fund_hint);
            if (captureeventdata == null || (list = captureeventdata.write) == null) {
                list = new ArrayList<>();
            }
            if (populateframeslist == null || (populatesignaldata = populateframeslist.write) == null || (list2 = populatesignaldata.read) == null) {
                list2 = new ArrayList<>();
            }
            populateSessionOperatingSystemData populatesessionoperatingsystemdata = new populateSessionOperatingSystemData(str, string, list, list2);
            onGetStartedClick.write((Object) populatesessionoperatingsystemdata, "display");
            writeUInt64NoTag.IconCompatParcelizer write = new UserLogout.write(userLogout, populatesessionoperatingsystemdata, 888);
            if (userLogout.RatingCompat != null) {
                write.IconCompatParcelizer(userLogout.RatingCompat);
            }
        }

        public final void IconCompatParcelizer() {
            String str;
            List<String> list;
            List<captureReportData> list2;
            populateSignalData populatesignaldata;
            populateSignalData populatesignaldata2;
            DiscoverFundFilterFragment discoverFundFilterFragment = this.read;
            ZTBSV MediaBrowserCompat$CustomActionResultReceiver = DiscoverFundFilterFragment.MediaBrowserCompat$CustomActionResultReceiver(discoverFundFilterFragment);
            String str2 = forEachSrcAtop.read.MediaMetadataCompat;
            if (discoverFundFilterFragment.getActivity() != null) {
                MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(((BaseActivity) discoverFundFilterFragment.getActivity()).scbAnalytics, str2);
            }
            UserLogout userLogout = this.read.presenter;
            if (userLogout == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
            }
            UserLogout userLogout2 = this.read.presenter;
            if (userLogout2 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
            }
            SortedLists.Relation.C37994 r1 = userLogout2.read;
            populateFramesList populateframeslist = userLogout2.IconCompatParcelizer;
            captureEventData captureeventdata = userLogout2.write;
            if (populateframeslist == null || (populatesignaldata2 = populateframeslist.MediaBrowserCompat$ItemReceiver) == null) {
                str = null;
            } else {
                str = populatesignaldata2.IconCompatParcelizer;
            }
            String string = r1.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.investment_discover_broker_hint);
            if (captureeventdata == null || (list = captureeventdata.MediaBrowserCompat$CustomActionResultReceiver) == null) {
                list = new ArrayList<>();
            }
            if (populateframeslist == null || (populatesignaldata = populateframeslist.MediaBrowserCompat$ItemReceiver) == null || (list2 = populatesignaldata.read) == null) {
                list2 = new ArrayList<>();
            }
            populateSessionOperatingSystemData populatesessionoperatingsystemdata = new populateSessionOperatingSystemData(str, string, list, list2);
            onGetStartedClick.write((Object) populatesessionoperatingsystemdata, "display");
            writeUInt64NoTag.IconCompatParcelizer write = new UserLogout.write(userLogout, populatesessionoperatingsystemdata, 999);
            if (userLogout.RatingCompat != null) {
                write.IconCompatParcelizer(userLogout.RatingCompat);
            }
        }

        public final void IconCompatParcelizer(String str, boolean z) {
            onGetStartedClick.write((Object) str, Name.MARK);
            UserLogout userLogout = this.read.presenter;
            if (userLogout == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
            }
            onGetStartedClick.write((Object) str, Name.MARK);
            captureEventData captureeventdata = userLogout.write;
            if (captureeventdata == null) {
                captureeventdata = new captureEventData((byte) 0);
            }
            List<String> list = captureeventdata.MediaBrowserCompat$ItemReceiver;
            if (list == null) {
                list = new ArrayList<>();
            }
            if (z) {
                if (!list.contains(str)) {
                    list.add(str);
                }
            } else if (list.contains(str)) {
                list.remove(str);
            }
            captureeventdata.MediaBrowserCompat$ItemReceiver = list;
            userLogout.write = captureeventdata;
        }
    }

    public final void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof FragmentBuilder_BindBaseRemittanceDetailsFragment) {
            this.IconCompatParcelizer = (FragmentBuilder_BindBaseRemittanceDetailsFragment) context;
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.MediaDescriptionCompat = new forEachSrcAtop();
        Bundle arguments = getArguments();
        if (arguments != null) {
            UserLogout userLogout = this.presenter;
            if (userLogout == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
            }
            userLogout.IconCompatParcelizer = (populateFramesList) arguments.getParcelable("FUND_FILTER_DISPLAY");
            UserLogout userLogout2 = this.presenter;
            if (userLogout2 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
            }
            userLogout2.write = (captureEventData) arguments.getParcelable("FUND_FILTER_SELECTED_DISPLAY");
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        onGetStartedClick.write((Object) layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(R.layout.f87592131493986, viewGroup, false);
        this.read = ButterKnife.IconCompatParcelizer(this, inflate);
        return inflate;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        onGetStartedClick.write((Object) view, Promotion.ACTION_VIEW);
        super.onViewCreated(view, bundle);
        UserLogout userLogout = this.presenter;
        if (userLogout == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        userLogout.MediaBrowserCompat$ItemReceiver(this);
        UserLogout userLogout2 = this.presenter;
        if (userLogout2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        populateFramesList populateframeslist = userLogout2.IconCompatParcelizer;
        UserLogout userLogout3 = this.presenter;
        if (userLogout3 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        this.MediaMetadataCompat = new DiscoverFundFilterAdapter(populateframeslist, userLogout3.write, this.MediaBrowserCompat$MediaItem);
        RecyclerView recyclerView = this.rvFundDiscover;
        if (recyclerView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("rvFundDiscover");
        }
        recyclerView.setNestedScrollingEnabled(false);
        RecyclerView recyclerView2 = this.rvFundDiscover;
        if (recyclerView2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("rvFundDiscover");
        }
        recyclerView2.setAdapter(this.MediaMetadataCompat);
        Button button = this.btResetToDefault;
        if (button == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("btResetToDefault");
        }
        button.setOnClickListener(new C6030xf91b8603(this));
        Button button2 = this.btApply;
        if (button2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("btApply");
        }
        button2.setOnClickListener(new read(this));
        forEachSrcAtop foreachsrcatop = new forEachSrcAtop();
        this.MediaDescriptionCompat = foreachsrcatop;
        ZTBSV ztbsv = foreachsrcatop;
        String str = forEachSrcAtop.read.MediaDescriptionCompat;
        if (getActivity() != null) {
            ztbsv.MediaBrowserCompat$ItemReceiver(((BaseActivity) getActivity()).scbAnalytics, str);
        }
    }

    static final class read implements View.OnClickListener {
        private /* synthetic */ DiscoverFundFilterFragment MediaBrowserCompat$ItemReceiver;

        read(DiscoverFundFilterFragment discoverFundFilterFragment) {
            this.MediaBrowserCompat$ItemReceiver = discoverFundFilterFragment;
        }

        public final void onClick(View view) {
            FragmentBuilder_BindBaseRemittanceDetailsFragment IconCompatParcelizer = this.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer;
            if (IconCompatParcelizer != null) {
                UserLogout userLogout = this.MediaBrowserCompat$ItemReceiver.presenter;
                if (userLogout == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
                }
                IconCompatParcelizer.IconCompatParcelizer(userLogout.write);
            }
        }
    }

    public final void read() {
        DiscoverFundFilterAdapter discoverFundFilterAdapter = this.MediaMetadataCompat;
        if (discoverFundFilterAdapter != null) {
            UserLogout userLogout = this.presenter;
            if (userLogout == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
            }
            discoverFundFilterAdapter.read = userLogout.write;
            discoverFundFilterAdapter.write();
            discoverFundFilterAdapter.IconCompatParcelizer.write();
        }
    }

    public final void MediaBrowserCompat$ItemReceiver(populateSessionOperatingSystemData populatesessionoperatingsystemdata, int i) {
        onGetStartedClick.write((Object) populatesessionoperatingsystemdata, "display");
        DiscoverFundFilterListActivity.write write = DiscoverFundFilterListActivity.MediaBrowserCompat$MediaItem;
        Context context = getContext();
        onGetStartedClick.write((Object) populatesessionoperatingsystemdata, "display");
        Intent intent = new Intent(context, DiscoverFundFilterListActivity.class);
        intent.setFlags(603979776);
        intent.putExtra("EXTRA_FUND_FILTER_LIST_DISPLAY", populatesessionoperatingsystemdata);
        AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
        try {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                intent = setTapText.write(activity, intent).read();
            }
            MyECouponActivity_ViewBinding.write write2 = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivityForResult(Intent, int), modified: ");
            sb.append(intent.getData());
            sb.append("\n with context ");
            sb.append(activity.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write2, sb.toString());
            startActivityForResult(intent, i);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final void write(populateSessionOperatingSystemData populatesessionoperatingsystemdata, int i) {
        onGetStartedClick.write((Object) populatesessionoperatingsystemdata, "display");
        NtbDiscoverFundFilterListActivity.write write = NtbDiscoverFundFilterListActivity.MediaMetadataCompat;
        Context context = getContext();
        onGetStartedClick.write((Object) populatesessionoperatingsystemdata, "display");
        Intent intent = new Intent(context, NtbDiscoverFundFilterListActivity.class);
        intent.setFlags(603979776);
        intent.putExtra("EXTRA_FUND_FILTER_LIST_DISPLAY", populatesessionoperatingsystemdata);
        AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
        try {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                intent = setTapText.write(activity, intent).read();
            }
            MyECouponActivity_ViewBinding.write write2 = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivityForResult(Intent, int), modified: ");
            sb.append(intent.getData());
            sb.append("\n with context ");
            sb.append(activity.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write2, sb.toString());
            startActivityForResult(intent, i);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        boolean z = true;
        if (i == 888 && i2 == -1) {
            if (intent != null) {
                UserLogout userLogout = this.presenter;
                if (userLogout == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
                }
                ArrayList<String> stringArrayListExtra = intent.getStringArrayListExtra("EXTRA_FILTER_IDS_SELECTED");
                onGetStartedClick.IconCompatParcelizer((Object) stringArrayListExtra, "it.getStringArrayListExt…XTRA_FILTER_IDS_SELECTED)");
                onGetStartedClick.write((Object) stringArrayListExtra, "selectedTypeOfFund");
                captureEventData captureeventdata = userLogout.write;
                if (captureeventdata == null) {
                    captureeventdata = new captureEventData((byte) 0);
                }
                captureeventdata.write = stringArrayListExtra;
                userLogout.write = captureeventdata;
                writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = UserLogout$MediaBrowserCompat$ItemReceiver.write;
                if (userLogout.RatingCompat == null) {
                    z = false;
                }
                if (z) {
                    iconCompatParcelizer.IconCompatParcelizer(userLogout.RatingCompat);
                }
            }
        } else if (i == 999 && i2 == -1 && intent != null) {
            UserLogout userLogout2 = this.presenter;
            if (userLogout2 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
            }
            ArrayList<String> stringArrayListExtra2 = intent.getStringArrayListExtra("EXTRA_FILTER_IDS_SELECTED");
            onGetStartedClick.IconCompatParcelizer((Object) stringArrayListExtra2, "it.getStringArrayListExt…XTRA_FILTER_IDS_SELECTED)");
            onGetStartedClick.write((Object) stringArrayListExtra2, "selectedBroker");
            captureEventData captureeventdata2 = userLogout2.write;
            if (captureeventdata2 == null) {
                captureeventdata2 = new captureEventData((byte) 0);
            }
            captureeventdata2.MediaBrowserCompat$CustomActionResultReceiver = stringArrayListExtra2;
            userLogout2.write = captureeventdata2;
            writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer2 = UserLogout.IconCompatParcelizer.write;
            if (userLogout2.RatingCompat == null) {
                z = false;
            }
            if (z) {
                iconCompatParcelizer2.IconCompatParcelizer(userLogout2.RatingCompat);
            }
        }
    }
}
