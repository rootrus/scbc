package com.scb.phone.view.fragment.deposit;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.activity.deposit.C5593x7d741dc4;
import com.scb.phone.view.activity.deposit.DepositProductCatalogActivity;
import com.scb.phone.view.activity.etb.ETBSaleSheetAccountTypeActivity;
import com.scb.phone.view.activity.etb.EtbActivity;
import com.scb.phone.view.adapter.deposit.C5742x6445dbf5;
import com.scb.phone.view.adapter.deposit.DepositOpenAccountSelectionAdapter;
import com.scb.phone.view.fragment.BaseFragment;
import com.thunderhead.android.aspects.AndroidXSupportFragmentIntentTidInjectionAspect;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import p040o.FundActionsSuccessActivity;
import p040o.HmlPinActivity;
import p040o.HmlVerifyEmailActivity;
import p040o.HmlVerifyPhoneTermsConditionsActivity;
import p040o.MyECouponActivity_ViewBinding;
import p040o.ScriptIntrinsicBlend;
import p040o.SwitchCompat;
import p040o.ZTBSV;
import p040o.access$1900;
import p040o.doOpenSession;
import p040o.getInvestmentSummary;
import p040o.nativeProcessPage;
import p040o.nativeProcessPage$MediaBrowserCompat$ItemReceiver;
import p040o.newIdParameters;
import p040o.onAddAccountClick;
import p040o.onGetStartedClick;
import p040o.onNotNowClick;
import p040o.setTapText;
import p040o.writeMapTo;

public final class DepositSelectionFragment extends BaseFragment implements newIdParameters, C5742x6445dbf5 {
    public static final read MediaBrowserCompat$CustomActionResultReceiver = new read((byte) 0);
    private String IconCompatParcelizer;
    private final HmlVerifyEmailActivity MediaDescriptionCompat;
    private DepositOpenAccountSelectionAdapter MediaMetadataCompat;
    @HmlPinActivity
    public nativeProcessPage depositSelectAccountPresenter;
    @BindView
    public RecyclerView recyclerView;
    @BindView
    public LinearLayout saleSheetButtonContainer;

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
    }

    public DepositSelectionFragment() {
        FundActionsSuccessActivity fundActionsSuccessActivity = C5905xcfb1752b.MediaBrowserCompat$ItemReceiver;
        onGetStartedClick.write((Object) fundActionsSuccessActivity, "initializer");
        this.MediaDescriptionCompat = new HmlVerifyPhoneTermsConditionsActivity(fundActionsSuccessActivity);
    }

    public static final class read {
        private read() {
        }

        public /* synthetic */ read(byte b) {
            this();
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        onGetStartedClick.write((Object) layoutInflater, "inflater");
        boolean z = false;
        View inflate = layoutInflater.inflate(R.layout.f86682131493895, viewGroup, false);
        ButterKnife.IconCompatParcelizer(this, inflate);
        Bundle arguments = getArguments();
        writeMapTo writemapto = null;
        this.IconCompatParcelizer = arguments != null ? arguments.getString("accountType") : null;
        nativeProcessPage nativeprocesspage = this.depositSelectAccountPresenter;
        if (nativeprocesspage == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("depositSelectAccountPresenter");
        }
        nativeprocesspage.MediaBrowserCompat$ItemReceiver(this);
        nativeProcessPage nativeprocesspage2 = this.depositSelectAccountPresenter;
        if (nativeprocesspage2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("depositSelectAccountPresenter");
        }
        String str = this.IconCompatParcelizer;
        onGetStartedClick.write((Object) "2", "openFlag");
        nativeprocesspage2.IconCompatParcelizer = str;
        nativeprocesspage2.write = "2";
        String str2 = nativeprocesspage2.write;
        if (str2 != null) {
            writemapto = new writeMapTo(str2, nativeprocesspage2.IconCompatParcelizer);
        }
        onNotNowClick.read read2 = new onNotNowClick.read();
        if (writemapto != null) {
            if (nativeprocesspage2.RatingCompat != null) {
                z = true;
            }
            if (z) {
                nativeprocesspage2.RatingCompat.AlertController$RecycleListView();
            }
            nativeprocesspage2.read.write(new nativeProcessPage.IconCompatParcelizer(nativeprocesspage2, read2), new nativeProcessPage.write(nativeprocesspage2), writemapto);
        }
        ZTBSV ztbsv = (ScriptIntrinsicBlend) this.MediaDescriptionCompat.MediaBrowserCompat$CustomActionResultReceiver();
        if (getActivity() != null) {
            ztbsv.MediaBrowserCompat$ItemReceiver(((BaseActivity) getActivity()).scbAnalytics, "etb_select_account");
        }
        return inflate;
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(List<access$1900> list) {
        onGetStartedClick.write((Object) list, "accountDisplayList");
        Context requireContext = requireContext();
        onGetStartedClick.IconCompatParcelizer((Object) requireContext, "requireContext()");
        this.MediaMetadataCompat = new DepositOpenAccountSelectionAdapter(requireContext, new ArrayList(), this);
        RecyclerView recyclerView2 = this.recyclerView;
        if (recyclerView2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("recyclerView");
        }
        recyclerView2.getContext();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(1, false);
        RecyclerView recyclerView3 = this.recyclerView;
        if (recyclerView3 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("recyclerView");
        }
        recyclerView3.setLayoutManager(linearLayoutManager);
        RecyclerView recyclerView4 = this.recyclerView;
        if (recyclerView4 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("recyclerView");
        }
        recyclerView4.MediaBrowserCompat$CustomActionResultReceiver((RecyclerView.RatingCompat) new getInvestmentSummary(recyclerView2.getContext(), 12));
        if (this.depositSelectAccountPresenter == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("depositSelectAccountPresenter");
        }
        for (Map.Entry<String, List<access$1900>> value : nativeProcessPage.read((List<access$1900>) onAddAccountClick.MediaBrowserCompat$CustomActionResultReceiver(list)).entrySet()) {
            List list2 = (List) value.getValue();
            DepositOpenAccountSelectionAdapter depositOpenAccountSelectionAdapter = this.MediaMetadataCompat;
            if (depositOpenAccountSelectionAdapter == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("selectAccountAdapter");
            }
            Collection collection = list2;
            onGetStartedClick.write((Object) collection, "$this$toMutableList");
            List arrayList = new ArrayList(collection);
            onGetStartedClick.write((Object) arrayList, "itemList");
            depositOpenAccountSelectionAdapter.MediaBrowserCompat$ItemReceiver.addAll(arrayList);
            depositOpenAccountSelectionAdapter.IconCompatParcelizer.write();
            RecyclerView recyclerView5 = this.recyclerView;
            if (recyclerView5 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("recyclerView");
            }
            DepositOpenAccountSelectionAdapter depositOpenAccountSelectionAdapter2 = this.MediaMetadataCompat;
            if (depositOpenAccountSelectionAdapter2 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("selectAccountAdapter");
            }
            recyclerView5.setAdapter(depositOpenAccountSelectionAdapter2);
        }
        SwitchCompat.IconCompatParcelizer((View) recyclerView2, false);
        LinearLayout linearLayout = this.saleSheetButtonContainer;
        if (linearLayout == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("saleSheetButtonContainer");
        }
        linearLayout.setVisibility(0);
    }

    public final void IconCompatParcelizer(List<doOpenSession> list) {
        onGetStartedClick.write((Object) list, "productDisplayList");
        Intent read2 = ETBSaleSheetAccountTypeActivity.read(getContext(), list, "DEPOSIT");
        AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
        try {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                read2 = setTapText.write(activity, read2).read();
            }
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivity(Intent), modified: ");
            sb.append(read2.getData());
            sb.append("\n with context ");
            sb.append(activity.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            startActivity(read2);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @OnClick
    public final void onClickRead() {
        C5593x7d741dc4 depositProductCatalogActivity$MediaBrowserCompat$CustomActionResultReceiver = DepositProductCatalogActivity.MediaMetadataCompat;
        Context requireContext = requireContext();
        onGetStartedClick.IconCompatParcelizer((Object) requireContext, "requireContext()");
        onGetStartedClick.write((Object) requireContext, "context");
        Intent intent = new Intent(requireContext, DepositProductCatalogActivity.class);
        AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
        try {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                intent = setTapText.write(activity, intent).read();
            }
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivity(Intent), modified: ");
            sb.append(intent.getData());
            sb.append("\n with context ");
            sb.append(activity.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            startActivity(intent);
        } catch (Throwable th) {
            th.printStackTrace();
        }
        ZTBSV ztbsv = (ScriptIntrinsicBlend) this.MediaDescriptionCompat.MediaBrowserCompat$CustomActionResultReceiver();
        if (getActivity() != null) {
            ztbsv.MediaBrowserCompat$ItemReceiver(((BaseActivity) getActivity()).scbAnalytics, "etb_open_deposit_product_catalog");
        }
    }

    @OnClick
    public final void onClickViewSalesList() {
        nativeProcessPage nativeprocesspage = this.depositSelectAccountPresenter;
        if (nativeprocesspage == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("depositSelectAccountPresenter");
        }
        String str = nativeprocesspage.write;
        writeMapTo writemapto = str != null ? new writeMapTo(str, nativeprocesspage.IconCompatParcelizer) : null;
        onNotNowClick.read read2 = new onNotNowClick.read();
        if (writemapto != null) {
            if (nativeprocesspage.RatingCompat != null) {
                nativeprocesspage.RatingCompat.AlertController$RecycleListView();
            }
            nativeprocesspage.read.write(new nativeProcessPage$MediaBrowserCompat$ItemReceiver(nativeprocesspage, read2), new nativeProcessPage.read(nativeprocesspage), writemapto);
        }
        ZTBSV ztbsv = (ScriptIntrinsicBlend) this.MediaDescriptionCompat.MediaBrowserCompat$CustomActionResultReceiver();
        if (getActivity() != null) {
            ztbsv.MediaBrowserCompat$ItemReceiver(((BaseActivity) getActivity()).scbAnalytics, "etb_open_deposit_sales_sheet");
        }
    }

    public final void MediaBrowserCompat$ItemReceiver(access$1900 access_1900) {
        onGetStartedClick.write((Object) access_1900, "item");
        Intent IconCompatParcelizer2 = EtbActivity.IconCompatParcelizer(getContext(), access_1900.MediaBrowserCompat$CustomActionResultReceiver, access_1900.MediaDescriptionCompat, "2");
        AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
        try {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                IconCompatParcelizer2 = setTapText.write(activity, IconCompatParcelizer2).read();
            }
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivity(Intent), modified: ");
            sb.append(IconCompatParcelizer2.getData());
            sb.append("\n with context ");
            sb.append(activity.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            startActivity(IconCompatParcelizer2);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final void onDestroy() {
        nativeProcessPage nativeprocesspage = this.depositSelectAccountPresenter;
        if (nativeprocesspage == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("depositSelectAccountPresenter");
        }
        nativeprocesspage.onDestroy();
        super.onDestroy();
    }
}
