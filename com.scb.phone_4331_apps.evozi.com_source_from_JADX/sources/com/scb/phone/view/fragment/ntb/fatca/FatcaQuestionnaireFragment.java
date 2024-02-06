package com.scb.phone.view.fragment.ntb.fatca;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatButton;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.activity.ntb.fatca.FatcaErrorActivity;
import com.scb.phone.view.activity.ntb.fatca.FatcaHelpActivity;
import com.scb.phone.view.adapter.deposit.FatcaQuestionnaireAdapter;
import com.scb.phone.view.custom.common.CustomDialog;
import com.scb.phone.view.fragment.BaseFragment;
import com.thunderhead.android.aspects.AndroidXSupportFragmentIntentTidInjectionAspect;
import java.util.ArrayList;
import java.util.List;
import p040o.ActivityBuilder_ContributeHmlETBOperatingAccountActivity;
import p040o.ActivityBuilder_ContributeHmlETBOperatingBankActivity;
import p040o.CheckCaptureModule_GetLookAndFeelParametersFactory;
import p040o.FragmentBuilder_BindBulkTransferEmptyFragment;
import p040o.GoogleSigninService;
import p040o.HmlPinActivity;
import p040o.KtaJsonCheck;
import p040o.MyECouponActivity_ViewBinding;
import p040o.ZSYR2K;
import p040o.blend;
import p040o.doWriteNonFatal;
import p040o.nativeAdornBoundary;
import p040o.nativeAdornProjectedBoundary;
import p040o.setTapText;

public class FatcaQuestionnaireFragment extends BaseFragment implements CheckCaptureModule_GetLookAndFeelParametersFactory.IconCompatParcelizer, FatcaQuestionnaireAdapter.write, FatcaQuestionnaireAdapter.IconCompatParcelizer {
    public FatcaQuestionnaireAdapter IconCompatParcelizer;
    public int MediaBrowserCompat$CustomActionResultReceiver;
    public KtaJsonCheck.MediaDescriptionCompat MediaBrowserCompat$MediaItem;
    private blend MediaBrowserCompat$SearchResultReceiver = new blend();
    private List<doWriteNonFatal> MediaDescriptionCompat;
    private FragmentBuilder_BindBulkTransferEmptyFragment MediaMetadataCompat;
    @HmlPinActivity
    public nativeAdornBoundary fatcaQuestionPresenter;
    @BindView
    RecyclerView questionRecyclerView;
    @BindView
    AppCompatButton submitButton;

    public static FatcaQuestionnaireFragment write(List<doWriteNonFatal> list, int i) {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("BUNDLE_FATCA_QUESTIONNAIRE_LIST", (ArrayList) list);
        bundle.putInt("BUNDLE_FATCA_TYPE", i);
        FatcaQuestionnaireFragment fatcaQuestionnaireFragment = new FatcaQuestionnaireFragment();
        fatcaQuestionnaireFragment.setArguments(bundle);
        return fatcaQuestionnaireFragment;
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof FragmentBuilder_BindBulkTransferEmptyFragment) {
            this.MediaMetadataCompat = (FragmentBuilder_BindBulkTransferEmptyFragment) context;
        }
        if (context instanceof KtaJsonCheck.MediaDescriptionCompat) {
            this.MediaBrowserCompat$MediaItem = (KtaJsonCheck.MediaDescriptionCompat) context;
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.f87422131493969, viewGroup, false);
        ButterKnife.IconCompatParcelizer(this, inflate);
        this.fatcaQuestionPresenter.MediaBrowserCompat$ItemReceiver(this);
        this.MediaDescriptionCompat = getArguments().getParcelableArrayList("BUNDLE_FATCA_QUESTIONNAIRE_LIST");
        int i = getArguments().getInt("BUNDLE_FATCA_TYPE");
        this.MediaBrowserCompat$CustomActionResultReceiver = i;
        this.fatcaQuestionPresenter.read = i;
        nativeAdornBoundary nativeadornboundary = this.fatcaQuestionPresenter;
        List<doWriteNonFatal> list = this.MediaDescriptionCompat;
        if (list != null) {
            nativeadornboundary.IconCompatParcelizer = list;
            nativeAdornProjectedBoundary nativeadornprojectedboundary = new nativeAdornProjectedBoundary(list);
            if (nativeadornboundary.RatingCompat != null) {
                nativeadornprojectedboundary.IconCompatParcelizer(nativeadornboundary.RatingCompat);
            }
        }
        this.submitButton.setEnabled(false);
        int i2 = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 == 2) {
                    this.MediaBrowserCompat$SearchResultReceiver.read("etb");
                } else if (i2 == 3) {
                    ZSYR2K[] zsyr2kArr = {new ZSYR2K("source", "scbs")};
                    if (getActivity() != null) {
                        ((BaseActivity) getActivity()).scbAnalytics.write("scbsonboard_answerfatca", zsyr2kArr);
                    }
                } else if (i2 == 4) {
                    this.MediaBrowserCompat$SearchResultReceiver.read("your_loan");
                }
            } else if (getActivity() != null) {
                ((BaseActivity) getActivity()).mo13676d_("mfonboard_answerfatca");
            }
            return inflate;
        }
        KtaJsonCheck.MediaDescriptionCompat mediaDescriptionCompat = this.MediaBrowserCompat$MediaItem;
        String read = mediaDescriptionCompat != null ? mediaDescriptionCompat.read() : "ekyc";
        blend blend = this.MediaBrowserCompat$SearchResultReceiver;
        String write = this.fatcaQuestionPresenter.MediaBrowserCompat$ItemReceiver.write();
        blend.read("source", read);
        if (write != null && "touchpoint".equals(read)) {
            blend.read("customer_group", write);
        }
        blend blend2 = this.MediaBrowserCompat$SearchResultReceiver;
        if (getActivity() != null) {
            blend2.MediaBrowserCompat$ItemReceiver(((BaseActivity) getActivity()).scbAnalytics, "ekyc_answerfatca");
        }
        return inflate;
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(int i, String str) {
        int i2 = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (i2 == 0) {
            IconCompatParcelizer(i, "scbs");
        } else if (i2 == 4) {
            IconCompatParcelizer(i, "your_loan");
        }
        Intent read = FatcaHelpActivity.read(getContext(), str);
        AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
        try {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                read = setTapText.write(activity, read).read();
            }
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivity(Intent), modified: ");
            sb.append(read.getData());
            sb.append("\n with context ");
            sb.append(activity.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            startActivity(read);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    private void IconCompatParcelizer(int i, String str) {
        this.MediaBrowserCompat$SearchResultReceiver.read(str);
        if (i == 0) {
            blend blend = this.MediaBrowserCompat$SearchResultReceiver;
            if (getActivity() != null) {
                blend.MediaBrowserCompat$ItemReceiver(((BaseActivity) getActivity()).scbAnalytics, "ekyc_fatca1moreinfo");
            }
        } else if (i == 1) {
            blend blend2 = this.MediaBrowserCompat$SearchResultReceiver;
            if (getActivity() != null) {
                blend2.MediaBrowserCompat$ItemReceiver(((BaseActivity) getActivity()).scbAnalytics, "ekyc_fatca2moreinfo");
            }
        } else if (i == 2) {
            blend blend3 = this.MediaBrowserCompat$SearchResultReceiver;
            if (getActivity() != null) {
                blend3.MediaBrowserCompat$ItemReceiver(((BaseActivity) getActivity()).scbAnalytics, "ekyc_fatca3moreinfo");
            }
        }
    }

    public final void write() {
        FragmentBuilder_BindBulkTransferEmptyFragment fragmentBuilder_BindBulkTransferEmptyFragment = this.MediaMetadataCompat;
        if (fragmentBuilder_BindBulkTransferEmptyFragment != null) {
            fragmentBuilder_BindBulkTransferEmptyFragment.MediaSessionCompat$Token();
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        Intent intent = new Intent(new Intent(getContext(), FatcaErrorActivity.class));
        intent.putExtra("EXTRA_TITLE", R.string.fatca_error_open_account_title);
        intent.putExtra("EXTRA_FATCA_TYPE", this.MediaBrowserCompat$CustomActionResultReceiver);
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
        getActivity().finish();
    }

    public final void read(boolean z) {
        this.submitButton.setEnabled(z);
    }

    @OnClick
    public void onSubmitButtonClick() {
        CustomDialog IconCompatParcelizer2 = CustomDialog.IconCompatParcelizer(getContext()).MediaBrowserCompat$ItemReceiver((int) R.string.fatca_answer_confirm_title).IconCompatParcelizer((int) R.string.fatca_answer_confirm_message);
        CustomDialog MediaBrowserCompat$ItemReceiver = IconCompatParcelizer2.MediaBrowserCompat$ItemReceiver(IconCompatParcelizer2.read.getString(R.string.cancel), ActivityBuilder_ContributeHmlETBOperatingAccountActivity.write);
        MediaBrowserCompat$ItemReceiver.IconCompatParcelizer(MediaBrowserCompat$ItemReceiver.read.getString(R.string.ok), new ActivityBuilder_ContributeHmlETBOperatingBankActivity(this)).show();
        int i = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (i == 0) {
            write("ekyc_confirmfatca", this.MediaBrowserCompat$MediaItem.read());
        } else if (i == 4) {
            write("ekyc_confirmfatca", "your_loan");
        }
    }

    public final void write(String str, String str2) {
        this.MediaBrowserCompat$SearchResultReceiver.MediaBrowserCompat$ItemReceiver();
        if (str2 != null) {
            blend blend = this.MediaBrowserCompat$SearchResultReceiver;
            String write = this.fatcaQuestionPresenter.MediaBrowserCompat$ItemReceiver.write();
            blend.read("source", str2);
            if (write != null && "touchpoint".equals(str2)) {
                blend.read("customer_group", write);
            }
        }
        blend blend2 = this.MediaBrowserCompat$SearchResultReceiver;
        if (getActivity() != null) {
            blend2.MediaBrowserCompat$ItemReceiver(((BaseActivity) getActivity()).scbAnalytics, str);
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(List<doWriteNonFatal> list) {
        this.IconCompatParcelizer = new FatcaQuestionnaireAdapter(list, this, this);
        RecyclerView recyclerView = this.questionRecyclerView;
        getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(1, false));
        this.questionRecyclerView.IconCompatParcelizer((RecyclerView.RatingCompat) new GoogleSigninService(), -1);
        this.questionRecyclerView.setAdapter(this.IconCompatParcelizer);
        this.questionRecyclerView.setNestedScrollingEnabled(false);
    }
}
