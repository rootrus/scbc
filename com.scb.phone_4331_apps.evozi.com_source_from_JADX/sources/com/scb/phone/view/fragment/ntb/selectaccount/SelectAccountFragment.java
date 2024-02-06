package com.scb.phone.view.fragment.ntb.selectaccount;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.google.android.gms.analytics.ecommerce.ProductAction;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.activity.ntb.touchpoint.TouchPointAccountDetailActivity;
import com.scb.phone.view.activity.ntb.touchpoint.TouchPointSelectAccountActivity;
import com.scb.phone.view.adapter.ntb.selectaccount.SelectAccountAdapter;
import com.scb.phone.view.custom.common.CustomDialog;
import com.scb.phone.view.fragment.BaseFragment;
import com.thunderhead.android.aspects.AndroidXSupportFragmentIntentTidInjectionAspect;
import java.lang.ref.WeakReference;
import java.util.List;
import p040o.ActivityBuilder_ContributeHmlNTBApplicationOutcomeActivity;
import p040o.ActivityBuilder_ContributeHmlNTBCaptureDocumentActivity;
import p040o.C4158cS;
import p040o.C4213cq;
import p040o.C9873cP;
import p040o.CardView;
import p040o.FragmentBuilder_BindChangeChannelStatementReviewFragment;
import p040o.FragmentBuilder_BindDepositMoreInfoFragment;
import p040o.HmlPinActivity;
import p040o.KtaJsonCheck;
import p040o.KtaJsonCheck$MediaBrowserCompat$MediaItem;
import p040o.MyECouponActivity_ViewBinding;
import p040o.blend;
import p040o.setDisplayVersion;
import p040o.setTapText;

public class SelectAccountFragment extends BaseFragment implements KtaJsonCheck$MediaBrowserCompat$MediaItem, SelectAccountAdapter.write, FragmentBuilder_BindChangeChannelStatementReviewFragment.MediaDescriptionCompat {
    private boolean IconCompatParcelizer;
    public FragmentBuilder_BindChangeChannelStatementReviewFragment.read MediaBrowserCompat$CustomActionResultReceiver;
    private KtaJsonCheck.MediaDescriptionCompat MediaMetadataCompat;
    @BindView
    RecyclerView recyclerView;
    @HmlPinActivity
    public C4213cq selectAccountPresenter;

    public static SelectAccountFragment IconCompatParcelizer() {
        SelectAccountFragment selectAccountFragment = new SelectAccountFragment();
        Bundle bundle = new Bundle();
        bundle.putBoolean("EXTRA_TOUCH_POINT", true);
        selectAccountFragment.setArguments(bundle);
        return selectAccountFragment;
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof FragmentBuilder_BindChangeChannelStatementReviewFragment.read) {
            this.MediaBrowserCompat$CustomActionResultReceiver = (FragmentBuilder_BindChangeChannelStatementReviewFragment.read) context;
        }
        if (context instanceof KtaJsonCheck.MediaDescriptionCompat) {
            this.MediaMetadataCompat = (KtaJsonCheck.MediaDescriptionCompat) context;
        } else if (context instanceof TouchPointSelectAccountActivity) {
            this.IconCompatParcelizer = true;
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        boolean z = false;
        View inflate = layoutInflater.inflate(R.layout.f89822131494209, viewGroup, false);
        ButterKnife.IconCompatParcelizer(this, inflate);
        this.selectAccountPresenter.MediaBrowserCompat$ItemReceiver(this);
        C4213cq cqVar = this.selectAccountPresenter;
        if (cqVar.RatingCompat != null) {
            z = true;
        }
        if (z) {
            cqVar.RatingCompat.AlertController$RecycleListView();
        }
        cqVar.read.MediaBrowserCompat$ItemReceiver();
        cqVar.read.IconCompatParcelizer(new C4213cq.read());
        this.MediaBrowserCompat$CustomActionResultReceiver.an_();
        this.MediaBrowserCompat$CustomActionResultReceiver.mo34015m_(getString(R.string.select_account_title));
        blend MediaBrowserCompat$CustomActionResultReceiver2 = MediaBrowserCompat$CustomActionResultReceiver();
        if (getActivity() != null) {
            MediaBrowserCompat$CustomActionResultReceiver2.MediaBrowserCompat$ItemReceiver(((BaseActivity) getActivity()).scbAnalytics, "ekyc_selectaccount");
        }
        return inflate;
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        if (getArguments() != null) {
            this.IconCompatParcelizer = getArguments().getBoolean("EXTRA_TOUCH_POINT", false);
        }
        FragmentBuilder_BindChangeChannelStatementReviewFragment.read read = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (read != null) {
            read.an_();
        }
    }

    public final void read(List<setDisplayVersion> list) {
        SelectAccountAdapter selectAccountAdapter = new SelectAccountAdapter(getContext(), list, this);
        selectAccountAdapter.MediaBrowserCompat$ItemReceiver = this.IconCompatParcelizer;
        getContext();
        this.recyclerView.setLayoutManager(new LinearLayoutManager(1, false));
        this.recyclerView.setAdapter(selectAccountAdapter);
    }

    public final void write(int i) {
        setDisplayVersion setdisplayversion;
        blend MediaBrowserCompat$CustomActionResultReceiver2 = MediaBrowserCompat$CustomActionResultReceiver();
        if (getActivity() != null) {
            MediaBrowserCompat$CustomActionResultReceiver2.MediaBrowserCompat$ItemReceiver(((BaseActivity) getActivity()).scbAnalytics, "ekyc_savingaccountdetail");
        }
        List<setDisplayVersion> list = this.selectAccountPresenter.IconCompatParcelizer;
        if (list != null) {
            setdisplayversion = list.get(i);
        } else {
            setdisplayversion = null;
        }
        if (setdisplayversion != null) {
            Bundle bundle = new Bundle();
            bundle.putString("BUNDLE_CODE", setdisplayversion.IconCompatParcelizer);
            DepositProductDetailFragment depositProductDetailFragment = new DepositProductDetailFragment();
            depositProductDetailFragment.setArguments(bundle);
            CardView MediaBrowserCompat$ItemReceiver = getChildFragmentManager().read().MediaBrowserCompat$ItemReceiver(R.id.select_account_containner, depositProductDetailFragment);
            StringBuilder sb = new StringBuilder();
            sb.append(ProductAction.ACTION_DETAIL);
            sb.append(i);
            MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver(sb.toString()).write();
            this.MediaBrowserCompat$CustomActionResultReceiver.ap_();
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(int i) {
        C4213cq cqVar = this.selectAccountPresenter;
        cqVar.write = i;
        C4158cS cSVar = new C4158cS(i);
        if (cqVar.RatingCompat != null) {
            cSVar.IconCompatParcelizer(cqVar.RatingCompat);
        }
    }

    public final void MediaBrowserCompat$ItemReceiver(int i) {
        setDisplayVersion setdisplayversion;
        blend MediaBrowserCompat$CustomActionResultReceiver2 = MediaBrowserCompat$CustomActionResultReceiver();
        if (getActivity() != null) {
            MediaBrowserCompat$CustomActionResultReceiver2.MediaBrowserCompat$ItemReceiver(((BaseActivity) getActivity()).scbAnalytics, "ekyc_savingaccountdetail");
        }
        List<setDisplayVersion> list = this.selectAccountPresenter.IconCompatParcelizer;
        if (list != null) {
            setdisplayversion = list.get(i);
        } else {
            setdisplayversion = null;
        }
        if (setdisplayversion != null) {
            Intent write = TouchPointAccountDetailActivity.write(getContext(), setdisplayversion.IconCompatParcelizer, "0");
            AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
            try {
                FragmentActivity activity = getActivity();
                if (activity != null) {
                    write = setTapText.write(activity, write).read();
                }
                MyECouponActivity_ViewBinding.write write2 = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
                StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivity(Intent), modified: ");
                sb.append(write.getData());
                sb.append("\n with context ");
                sb.append(activity.hashCode());
                MyECouponActivity_ViewBinding.IconCompatParcelizer(write2, sb.toString());
                startActivity(write);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public final void read(int i) {
        CardView MediaBrowserCompat$ItemReceiver = getChildFragmentManager().read().MediaBrowserCompat$ItemReceiver(R.id.select_account_containner, new SelectPurposeFragment());
        StringBuilder sb = new StringBuilder();
        sb.append("product_select_purpose");
        sb.append(i);
        MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver(sb.toString()).write();
    }

    public void MediaBrowserCompat$ItemReceiver() {
        CustomDialog IconCompatParcelizer2 = CustomDialog.IconCompatParcelizer(getContext()).MediaBrowserCompat$ItemReceiver((int) R.string.ntb_pop_up_title_exit).IconCompatParcelizer((int) R.string.ntb_pop_up_message_exit);
        CustomDialog MediaBrowserCompat$ItemReceiver = IconCompatParcelizer2.MediaBrowserCompat$ItemReceiver(IconCompatParcelizer2.read.getString(R.string.cancel), ActivityBuilder_ContributeHmlNTBCaptureDocumentActivity.write);
        MediaBrowserCompat$ItemReceiver.IconCompatParcelizer(MediaBrowserCompat$ItemReceiver.read.getString(R.string.ok), new ActivityBuilder_ContributeHmlNTBApplicationOutcomeActivity(this)).show();
    }

    public final /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(DialogInterface dialogInterface) {
        dialogInterface.dismiss();
        write();
    }

    /* access modifiers changed from: protected */
    public void write() {
        if (this.IconCompatParcelizer) {
            FragmentBuilder_BindDepositMoreInfoFragment.write((WeakReference<BaseActivity>) new WeakReference((BaseActivity) getActivity()));
        } else {
            getActivity().finish();
        }
    }

    private blend MediaBrowserCompat$CustomActionResultReceiver() {
        blend blend = new blend();
        KtaJsonCheck.MediaDescriptionCompat mediaDescriptionCompat = this.MediaMetadataCompat;
        if (mediaDescriptionCompat != null) {
            String read = mediaDescriptionCompat.read();
            String write = this.selectAccountPresenter.MediaBrowserCompat$ItemReceiver.write();
            blend.read("source", read);
            if (write != null && "touchpoint".equals(read)) {
                blend.read("customer_group", write);
            }
        } else if (this.IconCompatParcelizer) {
            String write2 = this.selectAccountPresenter.MediaBrowserCompat$ItemReceiver.write();
            blend.read("source", "touchpoint");
            if (write2 != null && "touchpoint".equals("touchpoint")) {
                blend.read("customer_group", write2);
            }
        }
        return blend;
    }

    public final void read(String str) {
        setDisplayVersion setdisplayversion;
        C4213cq cqVar = this.selectAccountPresenter;
        int i = cqVar.write;
        List<setDisplayVersion> list = cqVar.IconCompatParcelizer;
        if (list != null) {
            setdisplayversion = list.get(i);
        } else {
            setdisplayversion = null;
        }
        cqVar.write(setdisplayversion != null, new C9873cP(cqVar, setdisplayversion, str));
    }

    public void write(setDisplayVersion setdisplayversion, int i, String str) {
        CardView MediaBrowserCompat$ItemReceiver = getChildFragmentManager().read().MediaBrowserCompat$ItemReceiver(R.id.select_account_containner, EkycProductTermConditionFragment.read(setdisplayversion.IconCompatParcelizer, str));
        StringBuilder sb = new StringBuilder();
        sb.append("product_term_cond");
        sb.append(i);
        MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver(sb.toString()).write();
    }
}
