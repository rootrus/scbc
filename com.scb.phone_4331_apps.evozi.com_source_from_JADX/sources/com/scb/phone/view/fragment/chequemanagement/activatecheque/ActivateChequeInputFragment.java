package com.scb.phone.view.fragment.chequemanagement.activatecheque;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.activity.chequemanagement.activatecheque.ActivateChequeReviewActivity;
import com.scb.phone.view.custom.common.ScbEditText;
import com.scb.phone.view.custom.common.ScbTextInputLayout;
import com.scb.phone.view.fragment.BaseFragment;
import com.scb.phone.view.fragment.transferandpay.AccountSourceSelectFragment;
import com.thunderhead.android.aspects.AndroidXSupportFragmentIntentTidInjectionAspect;
import p040o.C6384xbfeacfd5;
import p040o.ConstructorConstructor;
import p040o.CrashlyticsReport;
import p040o.CrashlyticsReportJsonTransform$$Lambda$4;
import p040o.FragmentBuilder_BindChubbPaySuccessFragment;
import p040o.FragmentBuilder_BindCreditLimitDisplayFragment;
import p040o.HmlPinActivity;
import p040o.MyECouponActivity_ViewBinding;
import p040o.TermsConditionsService;
import p040o.connectExpirables;
import p040o.newDefaultImplementationConstructor;
import p040o.removeDependent;
import p040o.setLastBaselineToBottomHeight;
import p040o.setTapText;
import p040o.setUuidFromUtf8Bytes;
import p040o.submitCareerInfo;

public class ActivateChequeInputFragment extends BaseFragment implements C6384xbfeacfd5, FragmentBuilder_BindChubbPaySuccessFragment, AccountSourceSelectFragment.write {
    public int IconCompatParcelizer = 8;
    public String MediaBrowserCompat$CustomActionResultReceiver = "";
    private String MediaBrowserCompat$MediaItem;
    private TextWatcher MediaDescriptionCompat = new FragmentBuilder_BindCreditLimitDisplayFragment() {
        public final void afterTextChanged(Editable editable) {
            ActivateChequeInputFragment.this.scbTextInputLayout.setErrorEnabled(false);
            ActivateChequeInputFragment.this.write(editable.toString());
        }
    };
    private TextView.OnEditorActionListener MediaMetadataCompat = new TermsConditionsService(this);
    @BindView
    Button btnActivateChequeReview;
    @BindView
    public ScbEditText editText;
    @HmlPinActivity
    public ConstructorConstructor.C319810 presenter;
    @BindView
    LinearLayout rootErrorNoAccount;
    @BindView
    RelativeLayout rootView;
    @BindView
    public ScbTextInputLayout scbTextInputLayout;
    @BindView
    TextView tvErrorNoAccountDetail;
    @BindView
    TextView tvErrorNoAccountTitle;

    public final void IconCompatParcelizer(String str) {
    }

    public final void MediaBrowserCompat$ItemReceiver(removeDependent removedependent) {
    }

    public final /* synthetic */ void MediaSessionCompat$ResultReceiverWrapper() {
    }

    /* renamed from: c_ */
    public final void mo13978c_(boolean z) {
    }

    public static ActivateChequeInputFragment MediaBrowserCompat$ItemReceiver(int i) {
        ActivateChequeInputFragment activateChequeInputFragment = new ActivateChequeInputFragment();
        Bundle bundle = new Bundle();
        bundle.putInt("EXTRA_SOURCE_SIZE", i);
        activateChequeInputFragment.setArguments(bundle);
        return activateChequeInputFragment;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.f85572131493784, viewGroup, false);
        ButterKnife.IconCompatParcelizer(this, inflate);
        this.editText.setOnEditorActionListener(this.MediaMetadataCompat);
        this.editText.addTextChangedListener(this.MediaDescriptionCompat);
        this.editText.setOnFocusChangeListener(new submitCareerInfo(this));
        this.editText.setFilters(new InputFilter[]{new InputFilter.LengthFilter(8)});
        this.editText.setOnPasteListener(new ScbEditText.IconCompatParcelizer());
        this.btnActivateChequeReview.setEnabled(false);
        this.presenter.MediaBrowserCompat$ItemReceiver(this);
        if (getActivity() != null) {
            ((BaseActivity) getActivity()).mo13676d_("activatechq_input");
        }
        return inflate;
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        boolean z = false;
        int i = getArguments() != null ? getArguments().getInt("EXTRA_SOURCE_SIZE", 0) : 0;
        ConstructorConstructor.C319810 r0 = this.presenter;
        if (i > 0) {
            newDefaultImplementationConstructor newdefaultimplementationconstructor = newDefaultImplementationConstructor.write;
            if (r0.RatingCompat != null) {
                z = true;
            }
            if (z) {
                newdefaultimplementationconstructor.IconCompatParcelizer(r0.RatingCompat);
                return;
            }
            return;
        }
        ConstructorConstructor.C319911 r4 = ConstructorConstructor.C319911.IconCompatParcelizer;
        if (r0.RatingCompat != null) {
            z = true;
        }
        if (z) {
            r4.IconCompatParcelizer(r0.RatingCompat);
        }
    }

    public final void write() {
        String string = getString(R.string.error_issued_cheque_no_account);
        String string2 = getString(R.string.error_issued_activate_cheque_no_account_detail);
        this.tvErrorNoAccountTitle.setText(string);
        this.tvErrorNoAccountDetail.setText(string2);
        this.rootErrorNoAccount.setVisibility(0);
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        CrashlyticsReport.FilesPayload.File.write write = new CrashlyticsReport.FilesPayload.File.write(CrashlyticsReportJsonTransform$$Lambda$4.ACTIVATE_ORDER_CHEQUE_FUNCTION);
        write.MediaBrowserCompat$ItemReceiver = false;
        write.IconCompatParcelizer = true;
        write.MediaDescriptionCompat = true;
        write.RatingCompat = true;
        write.MediaDescriptionCompat = false;
        write.RatingCompat = false;
        write.IconCompatParcelizer = false;
        getChildFragmentManager().read().MediaBrowserCompat$ItemReceiver(R.id.fragment_account_source_select, AccountSourceSelectFragment.read(new CrashlyticsReport.FilesPayload.File(write, (byte) 0))).write();
    }

    @OnClick
    public void onReviewButtonClick() {
        String obj = this.editText.getText().toString();
        this.editText.setBackgroundDrawable(setLastBaselineToBottomHeight.write(getContext(), R.drawable.shape_gray_rounded_rectangle));
        ConstructorConstructor.C319810 r1 = this.presenter;
        String str = this.MediaBrowserCompat$MediaItem;
        r1.write.write(new connectExpirables(str, obj));
        r1.write.IconCompatParcelizer(new ConstructorConstructor.C319810.write(str, obj));
    }

    public final void read(setUuidFromUtf8Bytes setuuidfromutf8bytes) {
        Intent intent = new Intent(getContext(), ActivateChequeReviewActivity.class);
        setuuidfromutf8bytes.IconCompatParcelizer(this.MediaBrowserCompat$MediaItem);
        intent.putExtra("com.scb.phone.EXTRA_REVIEW", setuuidfromutf8bytes);
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
    }

    public final void IconCompatParcelizer() {
        ((BaseActivity) getActivity()).PlaybackStateCompat$CustomAction();
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        ((BaseActivity) getActivity()).PlaybackStateCompat$CustomAction();
    }

    public final void write(String str) {
        this.MediaBrowserCompat$CustomActionResultReceiver = str;
        this.editText.setBackgroundDrawable(setLastBaselineToBottomHeight.write(getContext(), R.drawable.shape_gray_rounded_rectangle));
        if (str.length() != this.IconCompatParcelizer || TextUtils.isEmpty(this.MediaBrowserCompat$MediaItem)) {
            this.btnActivateChequeReview.setEnabled(false);
        } else {
            this.btnActivateChequeReview.setEnabled(true);
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(CrashlyticsReport.FilesPayload.File.Builder builder) {
        if (builder != null) {
            this.MediaBrowserCompat$MediaItem = builder.MediaSessionCompat$Token;
        }
    }
}
