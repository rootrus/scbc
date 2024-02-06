package com.scb.phone.view.fragment.transferandpay.billpaymenttab;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.activity.PreLoadCheckActivity;
import com.scb.phone.view.activity.chubb.review.ChubbReviewActivity;
import com.scb.phone.view.activity.scheduledtransaction.ScheduleLandingActivity;
import com.scb.phone.view.activity.sme.deals.DealsBuyReviewActivity;
import com.scb.phone.view.activity.sme.gifting.GiftingPresentReviewActivity;
import com.scb.phone.view.activity.transferandpay.billpayment.BillPaymentReviewActivity;
import com.scb.phone.view.custom.ScbEditText;
import com.scb.phone.view.custom.common.AmountEditText;
import com.scb.phone.view.custom.common.CustomDialog;
import com.scb.phone.view.custom.common.CustomScheduleView;
import com.scb.phone.view.fragment.transferandpay.BaseTargetSelectedFragment;
import com.thunderhead.android.aspects.AndroidXSupportFragmentIntentTidInjectionAspect;
import p040o.ActivityBuilder_EasycashCreditPowerInformationActivity;
import p040o.ActivityBuilder_EasycashCreditPowerSummaryActivity;
import p040o.ActivityBuilder_EasycashSalesheetIndexActivity;
import p040o.C5176qV;
import p040o.C5211rb;
import p040o.C5242ri;
import p040o.C5243rj;
import p040o.C5244rk;
import p040o.C5245rl;
import p040o.C5246rm;
import p040o.C5247rn;
import p040o.C5248ro;
import p040o.C7475st;
import p040o.C7479sv;
import p040o.C7524tl;
import p040o.C7526tp;
import p040o.C7531tx;
import p040o.Collections2;
import p040o.CrashlyticsReport;
import p040o.FragmentBuilder_BindBranchTabFragment;
import p040o.FragmentBuilder_BindEasycashContactInformationFragment;
import p040o.FragmentBuilder_BindEasycashFeaturesAccountDynamicFragment;
import p040o.HmlPinActivity;
import p040o.MyECouponActivity_ViewBinding;
import p040o.ServerProjectProvider$5$MediaBrowserCompat$ItemReceiver;
import p040o.StreetViewPanoramaFragment;
import p040o.ZSYR2K;
import p040o.getICheckDeserializerRtti;
import p040o.getOversizeImage;
import p040o.getRamUsed;
import p040o.getTopLeftCornerWidth$MediaBrowserCompat$SearchResultReceiver;
import p040o.jsonFromMapEntryString;
import p040o.onProviderEnabled;
import p040o.onStatusChanged;
import p040o.putInstance;
import p040o.setLastBaselineToBottomHeight;
import p040o.setTapText;
import p040o.setUuidFromUtf8Bytes;
import p040o.zzmd;

public class BillPaymentBillerSelectedFragment extends BaseTargetSelectedFragment implements getTopLeftCornerWidth$MediaBrowserCompat$SearchResultReceiver, FragmentBuilder_BindBranchTabFragment {
    private getRamUsed Keep;
    private String MediaBrowserCompat$CustomActionResultReceiver;

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    private ServerProjectProvider$5$MediaBrowserCompat$ItemReceiver f3099x50fd9e4a;
    boolean MediaMetadataCompat = false;
    private String MediaSessionCompat$QueueItem;
    private String MediaSessionCompat$ResultReceiverWrapper;
    private String MediaSessionCompat$Token = "";
    private View.OnFocusChangeListener ParcelableVolumeInfo = new ActivityBuilder_EasycashCreditPowerInformationActivity(this);
    private String PlaybackStateCompat$CustomAction;
    @HmlPinActivity
    public C7475st billPaymentBillerSelectedPresenter;
    @BindView
    protected CustomScheduleView customScheduleView;
    @BindView
    protected View moreOptionsDividerBottom;
    @BindView
    protected View moreOptionsDividerTop;
    @BindView
    protected TextView moreOptionsText;
    @BindView
    protected LinearLayout noteLayout;
    @BindView
    protected LinearLayout scheduleLinearLayout;
    private TextWatcher setHasDecor = new TextWatcher() {
        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public final void afterTextChanged(Editable editable) {
            BillPaymentBillerSelectedFragment.this.billPaymentBillerSelectedPresenter.IconCompatParcelizer = true;
            BillPaymentBillerSelectedFragment.this.mAmountValue.getText().clear();
            BillPaymentBillerSelectedFragment.this.mAmountValue.setEnabled(true);
            BillPaymentBillerSelectedFragment.this.MediaMetadataCompat = true;
            BillPaymentBillerSelectedFragment.this.mAmountValue.setLongClickable(false);
            BillPaymentBillerSelectedFragment.this.mReferenceEditText1.removeTextChangedListener(this);
        }
    };
    @BindView
    public View toTextView;

    private static final /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(Fragment fragment, Intent intent) {
        try {
            FragmentActivity activity = fragment.getActivity();
            if (activity != null) {
                intent = setTapText.write(activity, intent).read();
            }
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivity(Intent), modified: ");
            sb.append(intent.getData());
            sb.append("\n with context ");
            sb.append(activity.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            ((BillPaymentBillerSelectedFragment) fragment).startActivity(intent);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static BillPaymentBillerSelectedFragment read(CrashlyticsReport.Session.Event.Application.Execution execution, StreetViewPanoramaFragment.zzb zzb, String str, boolean z, CrashlyticsReport.FilesPayload.File.Builder builder, String str2, String str3, jsonFromMapEntryString jsonfrommapentrystring) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.scb.phone.EXTRA_BILL_PAYMENT_DISPLAY", execution);
        bundle.putSerializable("com.scb.phone.EXTRA_BILL_PAY_METHOD", zzb);
        bundle.putString("source", str);
        bundle.putBoolean("com.scb.phone.EXTRA_BILL_PAYMENT_ENABLE_SCHEDULE", z);
        if (builder != null) {
            bundle.putParcelable("com.scb.phone.EXTRA_ACCOUNT_SELECTED", builder);
        }
        if (str3 != null) {
            bundle.putString("com.scb.phone.view.activity.partner.EXTRA_BILL_PAYMENT_PARTNER_CALLBACK", str3);
        }
        bundle.putString("EXTRA_BILL_PAYMENT_PARTNER_SUBTYPE", str2);
        bundle.putSerializable("com.scb.phone.EXTRA_PAYMENT_FLOW_TYPE", jsonfrommapentrystring);
        BillPaymentBillerSelectedFragment billPaymentBillerSelectedFragment = new BillPaymentBillerSelectedFragment();
        billPaymentBillerSelectedFragment.setArguments(bundle);
        return billPaymentBillerSelectedFragment;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        CrashlyticsReport.FilesPayload.File.Builder builder;
        CrashlyticsReport.Session.Event.Application.Execution execution;
        View inflate = layoutInflater.inflate(R.layout.f85782131493805, viewGroup, false);
        ButterKnife.IconCompatParcelizer(this, inflate);
        if (!(getActivity() == null || getActivity().getIntent() == null)) {
            this.billPaymentBillerSelectedPresenter.MediaMetadataCompat = getActivity().getIntent().getBooleanExtra("EXTRA_BILL_PAYMENT_IS_PREDICTIVE", false);
        }
        this.billPaymentBillerSelectedPresenter.MediaSessionCompat$Token = setCheckable();
        this.billPaymentBillerSelectedPresenter.MediaBrowserCompat$ItemReceiver(this);
        this.billPaymentBillerSelectedPresenter.MediaDescriptionCompat = zzmd.zzm.zzb.zza.JURISTIC == (getActivity() instanceof PreLoadCheckActivity ? ((PreLoadCheckActivity) getActivity()).setTitleOptional() : null);
        this.billPaymentBillerSelectedPresenter.MediaBrowserCompat$SearchResultReceiver = getArguments() != null && getArguments().getBoolean("com.scb.phone.EXTRA_BILL_PAYMENT_ENABLE_SCHEDULE");
        C7475st stVar = this.billPaymentBillerSelectedPresenter;
        stVar.write = getArguments() != null ? (CrashlyticsReport.Session.Event.Application.Execution) getArguments().getParcelable("com.scb.phone.EXTRA_BILL_PAYMENT_DISPLAY") : null;
        if ((stVar.RatingCompat != null) && (execution = stVar.write) != null) {
            if (execution.MediaBrowserCompat$ItemReceiver() || stVar.MediaMetadataCompat) {
                if ("03".equalsIgnoreCase(stVar.write.RatingCompat) || "04".equalsIgnoreCase(stVar.write.RatingCompat)) {
                    C7479sv svVar = C7479sv.MediaBrowserCompat$ItemReceiver;
                    if (stVar.RatingCompat != null) {
                        svVar.IconCompatParcelizer(stVar.RatingCompat);
                    }
                    Collections2 MediaBrowserCompat$CustomActionResultReceiver2 = Collections2.MediaBrowserCompat$CustomActionResultReceiver();
                    MediaBrowserCompat$CustomActionResultReceiver2.MediaBrowserCompat$ItemReceiver = putInstance.MediaBrowserCompat$CustomActionResultReceiver(stVar.MediaSessionCompat$Token);
                    MediaBrowserCompat$CustomActionResultReceiver2.write = stVar.write.MediaBrowserCompat$SearchResultReceiver;
                    String str = stVar.write.setPopupCallback;
                    String str2 = "";
                    if (str == null) {
                        str = str2;
                    }
                    MediaBrowserCompat$CustomActionResultReceiver2.read = str;
                    String str3 = stVar.write.setGroupDividerEnabled;
                    if (str3 != null) {
                        str2 = str3;
                    }
                    MediaBrowserCompat$CustomActionResultReceiver2.MediaBrowserCompat$CustomActionResultReceiver = str2;
                    stVar.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver(MediaBrowserCompat$CustomActionResultReceiver2);
                    stVar.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer(new C7475st.write(stVar, (byte) 0));
                } else {
                    if (!TextUtils.isEmpty(stVar.write.ExpandedMenuView)) {
                        C5211rb rbVar = new C5211rb(stVar);
                        if (stVar.RatingCompat != null) {
                            rbVar.IconCompatParcelizer(stVar.RatingCompat);
                        }
                    }
                    if (!TextUtils.isEmpty(stVar.write.setGroupDividerEnabled)) {
                        C5248ro roVar = new C5248ro(stVar);
                        if (stVar.RatingCompat != null) {
                            roVar.IconCompatParcelizer(stVar.RatingCompat);
                        }
                    }
                    if (!TextUtils.isEmpty(stVar.write.setPopupCallback)) {
                        C5246rm rmVar = new C5246rm(stVar);
                        if (stVar.RatingCompat != null) {
                            rmVar.IconCompatParcelizer(stVar.RatingCompat);
                        }
                    }
                    onProviderEnabled onproviderenabled = new onProviderEnabled(stVar);
                    if (stVar.RatingCompat != null) {
                        onproviderenabled.IconCompatParcelizer(stVar.RatingCompat);
                    }
                }
                if (stVar.write.setShortcut != null) {
                    C5176qV qVVar = C5176qV.MediaBrowserCompat$ItemReceiver;
                    if (stVar.RatingCompat != null) {
                        qVVar.IconCompatParcelizer(stVar.RatingCompat);
                    }
                } else if (!(stVar.write.AppCompatDialogFragment == null && stVar.write.MediaSessionCompat$Token == null)) {
                    C7524tl tlVar = C7524tl.MediaBrowserCompat$ItemReceiver;
                    if (stVar.RatingCompat != null) {
                        tlVar.IconCompatParcelizer(stVar.RatingCompat);
                    }
                    C7531tx txVar = C7531tx.MediaBrowserCompat$CustomActionResultReceiver;
                    if (stVar.RatingCompat != null) {
                        txVar.IconCompatParcelizer(stVar.RatingCompat);
                    }
                }
                if (!stVar.MediaBrowserCompat$SearchResultReceiver) {
                    C7524tl tlVar2 = C7524tl.MediaBrowserCompat$ItemReceiver;
                    if (stVar.RatingCompat != null) {
                        tlVar2.IconCompatParcelizer(stVar.RatingCompat);
                    }
                    C7531tx txVar2 = C7531tx.MediaBrowserCompat$CustomActionResultReceiver;
                    if (stVar.RatingCompat != null) {
                        txVar2.IconCompatParcelizer(stVar.RatingCompat);
                    }
                }
                onStatusChanged onstatuschanged = onStatusChanged.MediaBrowserCompat$CustomActionResultReceiver;
                if (stVar.RatingCompat != null) {
                    onstatuschanged.IconCompatParcelizer(stVar.RatingCompat);
                }
            } else {
                if ("03".equalsIgnoreCase(stVar.write.RatingCompat) || "04".equalsIgnoreCase(stVar.write.RatingCompat)) {
                    C5244rk rkVar = C5244rk.write;
                    if (stVar.RatingCompat != null) {
                        rkVar.IconCompatParcelizer(stVar.RatingCompat);
                    }
                } else {
                    C5242ri riVar = C5242ri.IconCompatParcelizer;
                    if (stVar.RatingCompat != null) {
                        riVar.IconCompatParcelizer(stVar.RatingCompat);
                    }
                }
                if ("01".equals(stVar.write.setForceShowIcon)) {
                    C5247rn rnVar = new C5247rn(stVar);
                    if (stVar.RatingCompat != null) {
                        rnVar.IconCompatParcelizer(stVar.RatingCompat);
                    }
                } else if ("02".equals(stVar.write.setForceShowIcon)) {
                    C5245rl rlVar = new C5245rl(stVar);
                    if (stVar.RatingCompat != null) {
                        rlVar.IconCompatParcelizer(stVar.RatingCompat);
                    }
                } else if ("03".equals(stVar.write.setForceShowIcon)) {
                    C5243rj rjVar = new C5243rj(stVar);
                    if (stVar.RatingCompat != null) {
                        rjVar.IconCompatParcelizer(stVar.RatingCompat);
                    }
                }
            }
            if (stVar.MediaDescriptionCompat) {
                C7531tx txVar3 = C7531tx.MediaBrowserCompat$CustomActionResultReceiver;
                if (stVar.RatingCompat != null) {
                    txVar3.IconCompatParcelizer(stVar.RatingCompat);
                }
            }
        }
        C7475st stVar2 = this.billPaymentBillerSelectedPresenter;
        C7526tp tpVar = C7526tp.read;
        if (stVar2.RatingCompat != null) {
            tpVar.IconCompatParcelizer(stVar2.RatingCompat);
        }
        stVar2.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer("BILLPAYMENT", "ALL");
        stVar2.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer(new C7475st.read(stVar2, (byte) 0));
        super.onCreateView(layoutInflater, viewGroup, bundle);
        this.MediaSessionCompat$ResultReceiverWrapper = AbsActionBarView();
        String string = getArguments().getString("EXTRA_BILL_PAYMENT_PARTNER_SUBTYPE", (String) null);
        this.MediaSessionCompat$Token = string;
        this.billPaymentBillerSelectedPresenter.write(this.MediaSessionCompat$ResultReceiverWrapper, string);
        jsonFromMapEntryString jsonfrommapentrystring = jsonFromMapEntryString.NORMAL;
        if (!(getArguments() == null || getArguments().getSerializable("com.scb.phone.EXTRA_PAYMENT_FLOW_TYPE") == null)) {
            jsonfrommapentrystring = (jsonFromMapEntryString) getArguments().getSerializable("com.scb.phone.EXTRA_PAYMENT_FLOW_TYPE");
        }
        this.billPaymentBillerSelectedPresenter.MediaSessionCompat$ResultReceiverWrapper = jsonfrommapentrystring;
        this.mAmountValue.setOnFocusChangeListener(this.ParcelableVolumeInfo);
        this.mAmountValue.setOnAmountChangeListener(new AmountEditText.read() {
            public final void MediaBrowserCompat$CustomActionResultReceiver(double d) {
            }

            public final void MediaBrowserCompat$CustomActionResultReceiver() {
                BillPaymentBillerSelectedFragment.this.PlaybackStateCompat$CustomAction();
            }
        });
        this.mAmountValue.setCustomHint(getString(R.string.transfer_to_account_amount_hint), this.mAmountInputLayout);
        this.mAmountInputLayout.setHintEnabled(false);
        this.customScheduleView.setOnEditClickListener(this);
        FragmentBuilder_BindEasycashContactInformationFragment fragmentBuilder_BindEasycashContactInformationFragment = this.mAmountValue.read;
        if (fragmentBuilder_BindEasycashContactInformationFragment != null) {
            fragmentBuilder_BindEasycashContactInformationFragment.IconCompatParcelizer(Double.MAX_VALUE);
        }
        this.mAmountValue.setMaximumDecimalDigit(17);
        Bundle arguments = getArguments();
        if (!(arguments == null || !arguments.containsKey("com.scb.phone.EXTRA_ACCOUNT_SELECTED") || (builder = (CrashlyticsReport.FilesPayload.File.Builder) arguments.getParcelable("com.scb.phone.EXTRA_ACCOUNT_SELECTED")) == null)) {
            read(builder);
        }
        InputFilter[] inputFilterArr = {new FragmentBuilder_BindEasycashFeaturesAccountDynamicFragment("[^\\u0E01-\\u0E39\\u0E40-\\u0E4C]")};
        this.mReferenceEditText1.setFilters(inputFilterArr);
        this.mReferenceEditText2.setFilters(inputFilterArr);
        this.mReferenceEditText3.setFilters(inputFilterArr);
        this.mReferenceEditText1.setOnPasteListener(new read());
        this.mReferenceEditText2.setOnPasteListener(new read());
        this.mReferenceEditText3.setOnPasteListener(new read());
        return inflate;
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(String str, String str2, String str3) {
        ZSYR2K[] zsyr2kArr = {new ZSYR2K("source", str2), new ZSYR2K("subtype", str3)};
        if (getActivity() != null) {
            ((BaseActivity) getActivity()).scbAnalytics.write(str, zsyr2kArr);
        }
    }

    public final /* synthetic */ void IconCompatParcelizer(boolean z) {
        boolean z2 = true;
        String str = "";
        if (z) {
            if (!this.MediaMetadataCompat) {
                this.mAmountInputLayout.setHintEnabled(false);
                this.mAmountValue.setHint(str);
            } else if (TextUtils.isEmpty(this.mReferenceEditText1.getText())) {
                if (Build.VERSION.SDK_INT < 28) {
                    this.mAmountValue.setEnabled(false);
                } else {
                    this.mAmountValue.clearFocus();
                }
                this.mAmountInputLayout.setError(getString(R.string.bill_payment_reference_empty));
            } else {
                C7475st stVar = this.billPaymentBillerSelectedPresenter;
                String obj = this.mReferenceEditText1.getText().toString();
                String obj2 = this.mReferenceEditText2.getText().toString();
                if (stVar.RatingCompat != null) {
                    C7479sv svVar = C7479sv.MediaBrowserCompat$ItemReceiver;
                    if (stVar.RatingCompat == null) {
                        z2 = false;
                    }
                    if (z2) {
                        svVar.IconCompatParcelizer(stVar.RatingCompat);
                    }
                    Collections2 MediaBrowserCompat$CustomActionResultReceiver2 = Collections2.MediaBrowserCompat$CustomActionResultReceiver();
                    MediaBrowserCompat$CustomActionResultReceiver2.MediaBrowserCompat$ItemReceiver = putInstance.MediaBrowserCompat$CustomActionResultReceiver(stVar.MediaSessionCompat$Token);
                    MediaBrowserCompat$CustomActionResultReceiver2.write = stVar.write.MediaBrowserCompat$SearchResultReceiver;
                    if (obj == null) {
                        obj = str;
                    }
                    MediaBrowserCompat$CustomActionResultReceiver2.read = obj;
                    if (obj2 != null) {
                        str = obj2;
                    }
                    MediaBrowserCompat$CustomActionResultReceiver2.MediaBrowserCompat$CustomActionResultReceiver = str;
                    stVar.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver(MediaBrowserCompat$CustomActionResultReceiver2);
                    stVar.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer(new C7475st.write(stVar, (byte) 0));
                }
            }
        } else if (this.MediaMetadataCompat) {
            this.mAmountInputLayout.setError((CharSequence) null);
            this.mAmountInputLayout.setErrorEnabled(false);
            if (Build.VERSION.SDK_INT < 28) {
                this.mAmountValue.setEnabled(true);
            }
        } else if (getICheckDeserializerRtti.MediaBrowserCompat$CustomActionResultReceiver(this.mAmountValue.getText())) {
            this.mAmountInputLayout.setHintEnabled(true);
            this.mAmountValue.setText(str);
            this.mAmountValue.setHint(this.mAmountValue.IconCompatParcelizer);
        }
    }

    public void onDestroy() {
        this.billPaymentBillerSelectedPresenter.onDestroy();
        if (this.MediaBrowserCompat$SearchResultReceiver != null && !this.MediaBrowserCompat$SearchResultReceiver.isDisposed()) {
            this.MediaBrowserCompat$SearchResultReceiver.dispose();
        }
        super.onDestroy();
    }

    public final void MediaBrowserCompat$ItemReceiver(CrashlyticsReport.Session.Builder builder) {
        super.MediaBrowserCompat$ItemReceiver(builder);
        this.mAmountInputLayout.setVisibility(0);
        this.mButton.setButtonEnabled(false);
        this.mButton.setText(getString(R.string.review));
    }

    public final void aD_() {
        ServerProjectProvider$5$MediaBrowserCompat$ItemReceiver serverProjectProvider$5$MediaBrowserCompat$ItemReceiver = this.f3099x50fd9e4a;
        if (serverProjectProvider$5$MediaBrowserCompat$ItemReceiver != null) {
            serverProjectProvider$5$MediaBrowserCompat$ItemReceiver.IconCompatParcelizer();
        }
    }

    public final void write(CrashlyticsReport.Session.Event.Application.Execution execution) {
        MediaBrowserCompat$ItemReceiver(execution);
        this.mCustomTransferAndPayBiller.setDescription(execution.MediaDescriptionCompat);
        this.mReferenceEditText1.setHint(execution.setChecked);
        this.mReferenceTextView1.setText(execution.setIcon);
        if (execution.IconCompatParcelizer()) {
            this.mCustomTransferAndPayBiller.mBackButton.setVisibility(8);
            if (!TextUtils.isEmpty(execution.setPopupCallback)) {
                this.mReferenceEditText1.setText(execution.setPopupCallback);
            }
            if (!TextUtils.isEmpty(execution.setGroupDividerEnabled)) {
                this.mReferenceEditText2.setText(execution.setGroupDividerEnabled);
            }
            if (!TextUtils.isEmpty(execution.ExpandedMenuView)) {
                this.mReferenceEditText3.setText(execution.ExpandedMenuView);
            }
            if (!"03".equalsIgnoreCase(execution.RatingCompat) && !"04".equalsIgnoreCase(execution.RatingCompat)) {
                this.mAmountValue.setFormattedAmount(execution.MediaBrowserCompat$MediaItem);
            }
        }
    }

    public final void read(CrashlyticsReport.Session.Event.Application.Execution execution) {
        write(execution);
        this.mReferenceTextView2.setVisibility(0);
        this.mReferenceEditText2.setVisibility(0);
        this.mReferenceTextView2.setText(execution.setPadding);
        this.mReferenceEditText2.setHint(execution.AppCompatViewInflater);
    }

    public final void IconCompatParcelizer(CrashlyticsReport.Session.Event.Application.Execution execution) {
        read(execution);
        this.mReferenceTextView3.setVisibility(0);
        this.mReferenceEditText3.setVisibility(0);
        this.mReferenceTextView3.setText(execution.setItemInvoker);
        this.mReferenceEditText3.setHint(execution.ActionMenuItemView);
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(CrashlyticsReport.Session.Event.Application.Execution execution) {
        write(execution);
        this.mReferenceEditText1.setEnabled(false);
        this.mReferenceEditText1.setText(execution.setPopupCallback);
        this.mCustomTransferAndPayBiller.mBackButton.setVisibility(8);
        this.mAmountValue.setFormattedAmount(execution.MediaBrowserCompat$MediaItem);
        if (execution.MediaSessionCompat$Token != null) {
            MediaBrowserCompat$ItemReceiver((EditText) this.mReferenceEditText1);
        }
    }

    public final void MediaBrowserCompat$ItemReceiver(CrashlyticsReport.Session.Event.Application.Execution execution) {
        this.mReferenceTextView2.setVisibility(0);
        this.mReferenceEditText2.setVisibility(0);
        this.mReferenceTextView2.setText(execution.setPadding);
        this.mReferenceEditText2.setHint(execution.AppCompatViewInflater);
        this.mReferenceEditText2.setEnabled(false);
        this.mReferenceEditText2.setText(execution.setGroupDividerEnabled);
        if (execution.MediaSessionCompat$Token != null) {
            MediaBrowserCompat$ItemReceiver((EditText) this.mReferenceEditText2);
        }
    }

    public final void MediaBrowserCompat$MediaItem(CrashlyticsReport.Session.Event.Application.Execution execution) {
        this.mReferenceTextView3.setVisibility(0);
        this.mReferenceEditText3.setVisibility(0);
        this.mReferenceTextView3.setText(execution.setItemInvoker);
        this.mReferenceEditText3.setHint(execution.ActionMenuItemView);
        this.mReferenceEditText3.setEnabled(false);
        this.mReferenceEditText3.setText(execution.ExpandedMenuView);
        if (execution.MediaSessionCompat$Token != null) {
            MediaBrowserCompat$ItemReceiver((EditText) this.mReferenceEditText3);
        }
    }

    private void MediaBrowserCompat$ItemReceiver(EditText editText) {
        editText.setBackgroundResource(R.color.f70982131100254);
        editText.setTextColor(setLastBaselineToBottomHeight.read(getContext(), R.color.f66022131099757));
        editText.setPadding(0, 0, 0, 0);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) editText.getLayoutParams();
        layoutParams.topMargin = 0;
        layoutParams.height = -2;
        editText.setLayoutParams(layoutParams);
    }

    public final void MediaBrowserCompat$ItemReceiver(setUuidFromUtf8Bytes setuuidfromutf8bytes) {
        CustomDialog MediaBrowserCompat$ItemReceiver = CustomDialog.IconCompatParcelizer(getContext()).MediaBrowserCompat$ItemReceiver((int) R.string.credit_card_alert_information_title).MediaBrowserCompat$ItemReceiver(getString(R.string.credit_card_alert_information_description));
        CustomDialog IconCompatParcelizer = MediaBrowserCompat$ItemReceiver.IconCompatParcelizer(MediaBrowserCompat$ItemReceiver.read.getString(R.string.ok), new ActivityBuilder_EasycashCreditPowerSummaryActivity(this, setuuidfromutf8bytes));
        IconCompatParcelizer.MediaBrowserCompat$ItemReceiver(IconCompatParcelizer.read.getString(R.string.cancel), ActivityBuilder_EasycashSalesheetIndexActivity.read).show();
    }

    public final void read(boolean z) {
        this.mAmountValue.setEnabled(z);
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(boolean z) {
        this.MediaMetadataCompat = z;
    }

    public final void write(String str) {
        this.mAmountValue.setFormattedAmount(str);
        this.billPaymentBillerSelectedPresenter.IconCompatParcelizer = false;
        this.mReferenceEditText1.removeTextChangedListener(this.setHasDecor);
        this.mReferenceEditText1.addTextChangedListener(this.setHasDecor);
    }

    public final void write(boolean z) {
        this.mAmountValue.setLongClickable(z);
    }

    public final boolean AppCompatDelegateImpl$ListMenuDecorView() {
        return this.mReferenceEditText1.getText() != null && !this.mReferenceEditText1.getText().toString().isEmpty() && !this.billPaymentBillerSelectedPresenter.IconCompatParcelizer;
    }

    public final void read() {
        this.mReferenceEditText1.requestFocus();
    }

    public final void MediaMetadataCompat() {
        getActivity().finish();
    }

    public final void MediaBrowserCompat$MediaItem() {
        this.noteEditText.write();
    }

    public final void IconCompatParcelizer() {
        this.noteLayout.setVisibility(8);
        this.moreOptionsText.setVisibility(8);
        this.moreOptionsDividerTop.setVisibility(8);
        this.scheduleLinearLayout.setVisibility(8);
        this.moreOptionsDividerBottom.setVisibility(8);
    }

    public final void write() {
        this.scheduleLinearLayout.setVisibility(8);
    }

    public final void read(setUuidFromUtf8Bytes setuuidfromutf8bytes) {
        GiftingPresentReviewActivity.MediaBrowserCompat$CustomActionResultReceiver(getActivity(), setuuidfromutf8bytes, "input", "gifting");
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        Intent intent = new Intent(getActivity(), DealsBuyReviewActivity.class);
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

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        this.mAmountValue.setAvailableBalanceCurrencyFormattingTextWatcher(this.IconCompatParcelizer.doubleValue());
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(setUuidFromUtf8Bytes setuuidfromutf8bytes) {
        IconCompatParcelizer(setuuidfromutf8bytes);
    }

    public final void write(CrashlyticsReport.Session.Event.Application.Execution.Exception.Builder builder, jsonFromMapEntryString jsonfrommapentrystring) {
        Intent MediaBrowserCompat$CustomActionResultReceiver2 = ChubbReviewActivity.MediaBrowserCompat$CustomActionResultReceiver(getContext(), builder, this.MediaSessionCompat$Token, jsonfrommapentrystring);
        AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
        try {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                MediaBrowserCompat$CustomActionResultReceiver2 = setTapText.write(activity, MediaBrowserCompat$CustomActionResultReceiver2).read();
            }
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivity(Intent), modified: ");
            sb.append(MediaBrowserCompat$CustomActionResultReceiver2.getData());
            sb.append("\n with context ");
            sb.append(activity.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            startActivity(MediaBrowserCompat$CustomActionResultReceiver2);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final void read(String str) {
        AppCompatActivity();
        this.mRemainingLimit.setVisibility(0);
        this.mRemainingLimit.setText(getString(R.string.bill_payment_limit, str));
        this.PlaybackStateCompat$CustomAction = str;
    }

    public final void IconCompatParcelizer(String str) {
        this.MediaSessionCompat$QueueItem = str;
    }

    public final void RatingCompat() {
        setContentView();
    }

    public final void aE_() {
        AppCompatActivity();
        this.mRemainingLimit.setVisibility(0);
        this.mRemainingLimit.setText(R.string.limit_not_available);
    }

    public final void IconCompatParcelizer(setUuidFromUtf8Bytes setuuidfromutf8bytes) {
        PlaybackStateCompat$CustomAction();
        this.mAmountValue.clearFocus();
        Intent intent = new Intent(getActivity(), BillPaymentReviewActivity.class);
        CrashlyticsReport.Session.Event.Application.Execution execution = this.billPaymentBillerSelectedPresenter.write;
        if (execution != null && "EDONATION".equals(execution.setTitle)) {
            intent.putExtra("com.scb.phone.TransferTabFragment.REVIEW_TITLE", getString(R.string.review));
        }
        intent.putExtra("com.scb.phone.EXTRA_REVIEW", setuuidfromutf8bytes);
        intent.putExtra("subtype", C7475st.MediaBrowserCompat$CustomActionResultReceiver(this.MediaSessionCompat$ResultReceiverWrapper, this.MediaSessionCompat$Token));
        intent.putExtra("source", this.MediaSessionCompat$ResultReceiverWrapper);
        AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
        MediaBrowserCompat$CustomActionResultReceiver(this, intent);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:119:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0054  */
    @butterknife.OnClick
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onAdditionalInfoButtonClicked() {
        /*
            r16 = this;
            r0 = r16
            o.st r1 = r0.billPaymentBillerSelectedPresenter
            boolean r1 = r1.read
            if (r1 != 0) goto L_0x0362
            o.st r1 = r0.billPaymentBillerSelectedPresenter
            com.scb.phone.view.custom.common.NoteEditText r2 = r0.noteEditText
            android.widget.EditText r2 = r2.mNoteEditText
            android.text.Editable r2 = r2.getText()
            java.lang.String r2 = r2.toString()
            T r3 = r1.RatingCompat
            r4 = 1
            r5 = 0
            if (r3 == 0) goto L_0x001e
            r3 = r4
            goto L_0x001f
        L_0x001e:
            r3 = r5
        L_0x001f:
            if (r3 == 0) goto L_0x0051
            if (r2 == 0) goto L_0x002b
            int r3 = r2.length()
            if (r3 == 0) goto L_0x002b
            r3 = r5
            goto L_0x002c
        L_0x002b:
            r3 = r4
        L_0x002c:
            if (r3 == 0) goto L_0x0030
        L_0x002e:
            r1 = r4
            goto L_0x0052
        L_0x0030:
            java.lang.String r3 = "^(?=\\S)[0-9a-zA-Z\\u0E00-\\u0E3E\\u0E40-\\u0E7F _*'\"#&*()@\\-]+$"
            java.util.regex.Pattern r3 = java.util.regex.Pattern.compile(r3)
            java.util.regex.Matcher r2 = r3.matcher(r2)
            boolean r2 = r2.matches()
            if (r2 == 0) goto L_0x0041
            goto L_0x002e
        L_0x0041:
            o.tt r2 = p040o.C10164tt.IconCompatParcelizer
            T r3 = r1.RatingCompat
            if (r3 == 0) goto L_0x0049
            r3 = r4
            goto L_0x004a
        L_0x0049:
            r3 = r5
        L_0x004a:
            if (r3 == 0) goto L_0x0051
            T r1 = r1.RatingCompat
            r2.IconCompatParcelizer(r1)
        L_0x0051:
            r1 = r5
        L_0x0052:
            if (r1 == 0) goto L_0x0362
            o.st r1 = r0.billPaymentBillerSelectedPresenter
            o.CrashlyticsReport$Session$Event$Application$Execution r1 = r1.write
            o.access$lambda$2 r1 = r1.setShortcut
            if (r1 == 0) goto L_0x005e
            r1 = r4
            goto L_0x005f
        L_0x005e:
            r1 = r5
        L_0x005f:
            if (r1 == 0) goto L_0x00dc
            o.st r1 = r0.billPaymentBillerSelectedPresenter
            java.lang.String r2 = r0.RatingCompat
            o.SquareCap r3 = r1.MediaBrowserCompat$MediaItem
            o.closePinLocation$MediaBrowserCompat$ItemReceiver r3 = r3.read()
            T r6 = r1.RatingCompat
            if (r6 == 0) goto L_0x0070
            goto L_0x0071
        L_0x0070:
            r4 = r5
        L_0x0071:
            if (r4 == 0) goto L_0x0078
            T r4 = r1.RatingCompat
            r4.AlertController$RecycleListView()
        L_0x0078:
            o.SquareCap r4 = r1.MediaBrowserCompat$MediaItem
            o.CustomConcurrentHashMap$Segment$EvictionQueue r5 = p040o.CustomConcurrentHashMap.Segment.EvictionQueue.read()
            r5.MediaBrowserCompat$CustomActionResultReceiver = r2
            o.CrashlyticsReport$Session$Event$Application$Execution r6 = r1.write
            java.lang.String r6 = r6.MediaBrowserCompat$SearchResultReceiver
            r5.MediaBrowserCompat$ItemReceiver = r6
            o.CrashlyticsReport$Session$Event$Application$Execution r6 = r1.write
            java.lang.String r6 = r6.setPopupCallback
            r5.RatingCompat = r6
            o.CrashlyticsReport$Session$Event$Application$Execution r6 = r1.write
            java.lang.String r6 = r6.setGroupDividerEnabled
            r5.MediaDescriptionCompat = r6
            o.CrashlyticsReport$Session$Event$Application$Execution r6 = r1.write
            java.lang.String r6 = r6.ExpandedMenuView
            r5.MediaSessionCompat$ResultReceiverWrapper = r6
            o.CrashlyticsReport$Session$Event$Application$Execution r6 = r1.write
            java.lang.String r6 = r6.MediaBrowserCompat$MediaItem
            java.lang.Double r6 = p040o.getICheckDeserializerRtti.MediaBrowserCompat$ItemReceiver((java.lang.String) r6)
            double r6 = r6.doubleValue()
            java.lang.String r6 = p040o.removeIfFromRandomAccessList.read((double) r6)
            r5.read = r6
            java.lang.String r6 = r3.MediaBrowserCompat$CustomActionResultReceiver
            r5.IconCompatParcelizer = r6
            java.lang.String r6 = r3.IconCompatParcelizer
            r5.MediaSessionCompat$QueueItem = r6
            java.lang.String r6 = r3.write
            r5.write = r6
            o.CrashlyticsReport$Session$Event$Application$Execution r6 = r1.write
            o.access$lambda$2 r6 = r6.setShortcut
            java.lang.String r6 = r6.MediaBrowserCompat$ItemReceiver
            r5.MediaBrowserCompat$MediaItem = r6
            o.CrashlyticsReport$Session$Event$Application$Execution r6 = r1.write
            o.access$lambda$2 r6 = r6.setShortcut
            java.lang.String r6 = r6.read
            r5.MediaMetadataCompat = r6
            o.CrashlyticsReport$Session$Event$Application$Execution r6 = r1.write
            o.access$lambda$2 r6 = r6.setShortcut
            java.lang.String r6 = r6.IconCompatParcelizer
            r5.MediaBrowserCompat$SearchResultReceiver = r6
            r4.read((p040o.CustomConcurrentHashMap.Segment.EvictionQueue) r5)
            o.SquareCap r4 = r1.MediaBrowserCompat$MediaItem
            o.st$MediaBrowserCompat$ItemReceiver r5 = new o.st$MediaBrowserCompat$ItemReceiver
            r5.<init>(r1, r3, r2)
            r4.IconCompatParcelizer(r5)
            return
        L_0x00dc:
            o.st r1 = r0.billPaymentBillerSelectedPresenter
            o.CrashlyticsReport$Session$Event$Application$Execution r1 = r1.write
            o.CrashlyticsReport$Session$Event$Application$Execution$Thread$Frame r1 = r1.MediaSessionCompat$Token
            if (r1 == 0) goto L_0x00e6
            r1 = r4
            goto L_0x00e7
        L_0x00e6:
            r1 = r5
        L_0x00e7:
            if (r1 == 0) goto L_0x0199
            o.st r7 = r0.billPaymentBillerSelectedPresenter
            java.lang.String r8 = r0.RatingCompat
            com.scb.phone.view.custom.common.NoteEditText r1 = r0.noteEditText
            android.widget.EditText r1 = r1.mNoteEditText
            android.text.Editable r1 = r1.getText()
            java.lang.String r13 = r1.toString()
            T r1 = r7.RatingCompat
            if (r1 == 0) goto L_0x00fe
            goto L_0x00ff
        L_0x00fe:
            r4 = r5
        L_0x00ff:
            if (r4 == 0) goto L_0x0106
            T r1 = r7.RatingCompat
            r1.AlertController$RecycleListView()
        L_0x0106:
            o.CrashlyticsReport$Session$Event$Application$Execution r1 = r7.write
            o.CrashlyticsReport$Session$Event$Application$Execution$Thread$Frame r1 = r1.MediaSessionCompat$Token
            o.withExplicitOrder$read r2 = p040o.withExplicitOrder.IconCompatParcelizer()
            r2.MediaBrowserCompat$ItemReceiver = r8
            java.lang.String r3 = r1.write
            r2.IconCompatParcelizer = r3
            java.lang.String r3 = r1.read
            r2.MediaBrowserCompat$CustomActionResultReceiver = r3
            java.lang.String r3 = r1.MediaBrowserCompat$ItemReceiver
            r2.write = r3
            java.lang.String r3 = r1.MediaBrowserCompat$CustomActionResultReceiver
            r2.RatingCompat = r3
            java.lang.String r3 = r1.IconCompatParcelizer
            r2.MediaBrowserCompat$MediaItem = r3
            java.lang.String r3 = r1.MediaBrowserCompat$SearchResultReceiver
            r2.MediaMetadataCompat = r3
            java.lang.String r3 = r1.MediaMetadataCompat
            r2.MediaDescriptionCompat = r3
            java.lang.String r3 = r1.MediaBrowserCompat$MediaItem
            r2.MediaBrowserCompat$SearchResultReceiver = r3
            java.lang.String r3 = r1.RatingCompat
            r2.MediaSessionCompat$Token = r3
            java.lang.String r3 = r1.MediaDescriptionCompat
            r2.MediaSessionCompat$QueueItem = r3
            java.lang.String r3 = r1.MediaSessionCompat$QueueItem
            r2.MediaSessionCompat$ResultReceiverWrapper = r3
            o.withExplicitOrder$MediaBrowserCompat$ItemReceiver$MediaBrowserCompat$ItemReceiver r3 = p040o.withExplicitOrder$MediaBrowserCompat$ItemReceiver.write()
            o.parseArray r4 = r1.f2701x50fd9e4a
            java.lang.String r4 = r4.write
            r3.write = r4
            o.parseArray r4 = r1.f2701x50fd9e4a
            java.lang.String r4 = r4.MediaBrowserCompat$ItemReceiver
            r3.read = r4
            o.parseArray r4 = r1.f2701x50fd9e4a
            java.lang.String r4 = r4.read
            r3.MediaBrowserCompat$ItemReceiver = r4
            o.parseArray r4 = r1.f2701x50fd9e4a
            java.lang.String r4 = r4.IconCompatParcelizer
            r3.IconCompatParcelizer = r4
            o.parseArray r4 = r1.f2701x50fd9e4a
            java.lang.String r4 = r4.MediaBrowserCompat$CustomActionResultReceiver
            r3.MediaBrowserCompat$CustomActionResultReceiver = r4
            o.parseArray r4 = r1.f2701x50fd9e4a
            java.lang.String r4 = r4.MediaBrowserCompat$SearchResultReceiver
            r3.MediaBrowserCompat$MediaItem = r4
            o.parseArray r4 = r1.f2701x50fd9e4a
            java.lang.String r4 = r4.MediaMetadataCompat
            r3.MediaDescriptionCompat = r4
            o.parseArray r4 = r1.f2701x50fd9e4a
            java.lang.String r4 = r4.RatingCompat
            r3.MediaBrowserCompat$SearchResultReceiver = r4
            o.withExplicitOrder$MediaBrowserCompat$ItemReceiver r4 = new o.withExplicitOrder$MediaBrowserCompat$ItemReceiver
            r4.<init>(r3, r5)
            r2.ParcelableVolumeInfo = r4
            r2.read = r13
            o.withExplicitOrder r3 = new o.withExplicitOrder
            r3.<init>(r2, r5)
            o.include r2 = r7.MediaBrowserCompat$ItemReceiver
            r2.IconCompatParcelizer((p040o.withExplicitOrder) r3)
            o.include r2 = r7.MediaBrowserCompat$ItemReceiver
            java.lang.String r9 = r1.RatingCompat
            java.lang.String r10 = r1.MediaDescriptionCompat
            java.lang.String r11 = r1.MediaSessionCompat$QueueItem
            o.st$IconCompatParcelizer r3 = new o.st$IconCompatParcelizer
            java.lang.String r12 = r1.write
            r14 = 0
            r15 = 0
            r6 = r3
            r6.<init>(r8, r9, r10, r11, r12, r13, r14, r15)
            r2.IconCompatParcelizer(r3)
            return
        L_0x0199:
            com.scb.phone.view.custom.common.AmountEditText r1 = r0.mAmountValue
            android.text.Editable r1 = r1.getText()
            if (r1 == 0) goto L_0x0362
            java.lang.String r1 = r0.RatingCompat
            if (r1 == 0) goto L_0x0362
            o.st r1 = r0.billPaymentBillerSelectedPresenter
            o.CrashlyticsReport$Session$Event$Application$Execution r1 = r1.write
            java.lang.String r1 = r1.MediaBrowserCompat$SearchResultReceiver
            o.st r7 = r0.billPaymentBillerSelectedPresenter
            java.lang.String r8 = r0.RatingCompat
            com.scb.phone.view.custom.common.AmountEditText r2 = r0.mAmountValue
            android.text.Editable r2 = r2.getText()
            java.lang.String r2 = r2.toString()
            java.lang.Double r2 = p040o.getICheckDeserializerRtti.MediaBrowserCompat$ItemReceiver((java.lang.String) r2)
            double r2 = r2.doubleValue()
            com.scb.phone.view.custom.ScbEditText r6 = r0.mReferenceEditText1
            android.text.Editable r6 = r6.getText()
            java.lang.String r9 = r6.toString()
            com.scb.phone.view.custom.ScbEditText r6 = r0.mReferenceEditText2
            android.text.Editable r6 = r6.getText()
            java.lang.String r10 = r6.toString()
            com.scb.phone.view.custom.ScbEditText r6 = r0.mReferenceEditText3
            android.text.Editable r6 = r6.getText()
            java.lang.String r11 = r6.toString()
            o.StreetViewPanoramaFragment$zzb r6 = r16.setCheckable()
            com.scb.phone.view.custom.common.NoteEditText r12 = r0.noteEditText
            android.widget.EditText r12 = r12.mNoteEditText
            android.text.Editable r12 = r12.getText()
            java.lang.String r13 = r12.toString()
            o.getRamUsed r15 = r0.Keep
            android.os.Bundle r12 = r16.getArguments()
            if (r12 == 0) goto L_0x020c
            android.os.Bundle r12 = r16.getArguments()
            java.lang.String r5 = "com.scb.phone.view.activity.partner.EXTRA_BILL_PAYMENT_PARTNER_CALLBACK"
            boolean r12 = r12.containsKey(r5)
            if (r12 == 0) goto L_0x020c
            android.os.Bundle r12 = r16.getArguments()
            java.lang.String r5 = r12.getString(r5)
            goto L_0x020d
        L_0x020c:
            r5 = 0
        L_0x020d:
            T r12 = r7.RatingCompat
            if (r12 == 0) goto L_0x0213
            r12 = r4
            goto L_0x0214
        L_0x0213:
            r12 = 0
        L_0x0214:
            if (r12 == 0) goto L_0x0359
            o.sv r12 = p040o.C7479sv.MediaBrowserCompat$ItemReceiver
            T r14 = r7.RatingCompat
            if (r14 == 0) goto L_0x021e
            r14 = r4
            goto L_0x021f
        L_0x021e:
            r14 = 0
        L_0x021f:
            if (r14 == 0) goto L_0x0226
            T r14 = r7.RatingCompat
            r12.IconCompatParcelizer(r14)
        L_0x0226:
            r7.read = r4
            o.CrashlyticsReport$Session$Event$Application$Execution r12 = r7.write
            if (r12 == 0) goto L_0x0238
            java.lang.String r12 = r12.setTitle
            java.lang.String r14 = "EDONATION"
            boolean r12 = r14.equals(r12)
            if (r12 == 0) goto L_0x0238
            r12 = r4
            goto L_0x0239
        L_0x0238:
            r12 = 0
        L_0x0239:
            java.lang.String r14 = ""
            if (r12 == 0) goto L_0x02ab
            o.CrashlyticsReport$Session$Event$Application$Execution r5 = r7.write
            o.CrashlyticsReport$Session$OperatingSystem r5 = r5.setHasDecor
            if (r5 == 0) goto L_0x024c
            o.CrashlyticsReport$Session$Event$Application$Execution r5 = r7.write
            o.CrashlyticsReport$Session$OperatingSystem r5 = r5.setHasDecor
            boolean r5 = r5.MediaBrowserCompat$ItemReceiver
            if (r5 == 0) goto L_0x024c
            goto L_0x024d
        L_0x024c:
            r4 = 0
        L_0x024d:
            o.ImmutableSortedSetFauxverideShim r5 = p040o.ImmutableSortedSetFauxverideShim.MediaBrowserCompat$ItemReceiver()
            r5.read = r8
            r5.MediaBrowserCompat$CustomActionResultReceiver = r1
            java.lang.String r1 = p040o.removeIfFromRandomAccessList.read((double) r2)
            r5.MediaBrowserCompat$ItemReceiver = r1
            java.lang.String r1 = p040o.putInstance.MediaBrowserCompat$CustomActionResultReceiver(r6)
            r5.RatingCompat = r1
            if (r9 != 0) goto L_0x0265
            r1 = r14
            goto L_0x0266
        L_0x0265:
            r1 = r9
        L_0x0266:
            r5.MediaMetadataCompat = r1
            if (r10 != 0) goto L_0x026b
            goto L_0x026c
        L_0x026b:
            r14 = r10
        L_0x026c:
            r5.MediaBrowserCompat$SearchResultReceiver = r14
            if (r15 == 0) goto L_0x0286
            java.lang.String r1 = r15.IconCompatParcelizer
            java.lang.String r2 = r15.MediaBrowserCompat$CustomActionResultReceiver
            java.lang.String r2 = p040o.CheckCaptureActivity.MediaBrowserCompat$CustomActionResultReceiver(r2)
            java.lang.String r3 = r15.read
            java.lang.String r3 = p040o.CheckCaptureActivity.MediaBrowserCompat$CustomActionResultReceiver(r3)
            o.setActivity r14 = new o.setActivity
            java.lang.String r6 = r15.write
            r14.<init>(r1, r2, r3, r6)
            goto L_0x0287
        L_0x0286:
            r14 = 0
        L_0x0287:
            r5.MediaDescriptionCompat = r14
            o.CrashlyticsReport$Session$Event$Application$Execution r1 = r7.write
            java.lang.String r1 = r1.ListMenuItemView
            r5.MediaBrowserCompat$MediaItem = r1
            r5.IconCompatParcelizer = r4
            o.paddedPartition<java.lang.String> r1 = r5.write
            r1.MediaBrowserCompat$ItemReceiver = r13
            o.include r1 = r7.MediaBrowserCompat$ItemReceiver
            r1.MediaBrowserCompat$CustomActionResultReceiver((p040o.ImmutableSortedSetFauxverideShim) r5)
            o.include r1 = r7.MediaBrowserCompat$ItemReceiver
            o.st$IconCompatParcelizer r2 = new o.st$IconCompatParcelizer
            r11 = 0
            java.lang.String r12 = r5.MediaBrowserCompat$ItemReceiver
            r14 = 0
            r6 = r2
            r6.<init>(r8, r9, r10, r11, r12, r13, r14, r15)
            r1.IconCompatParcelizer(r2)
            goto L_0x0359
        L_0x02ab:
            o.putInstance r4 = p040o.putInstance.IconCompatParcelizer()
            r4.MediaBrowserCompat$ItemReceiver = r8
            r4.MediaBrowserCompat$CustomActionResultReceiver = r1
            java.lang.String r1 = p040o.removeIfFromRandomAccessList.read((double) r2)
            r4.IconCompatParcelizer = r1
            java.lang.String r1 = p040o.putInstance.MediaBrowserCompat$CustomActionResultReceiver(r6)
            r4.MediaSessionCompat$ResultReceiverWrapper = r1
            r4.MediaBrowserCompat$SearchResultReceiver = r14
            if (r9 != 0) goto L_0x02c5
            r1 = r14
            goto L_0x02c6
        L_0x02c5:
            r1 = r9
        L_0x02c6:
            r4.MediaSessionCompat$Token = r1
            if (r10 != 0) goto L_0x02cb
            goto L_0x02cc
        L_0x02cb:
            r14 = r10
        L_0x02cc:
            r4.f2924x50fd9e4a = r14
            r4.AlertController$RecycleListView = r11
            if (r15 == 0) goto L_0x02e8
            java.lang.String r1 = r15.IconCompatParcelizer
            java.lang.String r2 = r15.MediaBrowserCompat$CustomActionResultReceiver
            java.lang.String r2 = p040o.CheckCaptureActivity.MediaBrowserCompat$CustomActionResultReceiver(r2)
            java.lang.String r3 = r15.read
            java.lang.String r3 = p040o.CheckCaptureActivity.MediaBrowserCompat$CustomActionResultReceiver(r3)
            o.setActivity r6 = new o.setActivity
            java.lang.String r12 = r15.write
            r6.<init>(r1, r2, r3, r12)
            goto L_0x02e9
        L_0x02e8:
            r6 = 0
        L_0x02e9:
            r4.setHasDecor = r6
            o.CrashlyticsReport$Session$Event$Application$Execution r1 = r7.write
            java.lang.String r1 = r1.ListMenuItemView
            r4.Keep = r1
            o.paddedPartition<java.lang.String> r1 = r4.write
            r1.MediaBrowserCompat$ItemReceiver = r13
            o.CrashlyticsReport$Session$Event$Application$Execution r1 = r7.write
            boolean r2 = r1 instanceof p040o.CrashlyticsReport.Session.Event.Application.Execution.Exception
            if (r2 == 0) goto L_0x0333
            o.CrashlyticsReport$Session$Event$Application$Execution$Exception r1 = (p040o.CrashlyticsReport.Session.Event.Application.Execution.Exception) r1
            o.jsonFromMapEntryString r2 = r7.MediaSessionCompat$ResultReceiverWrapper
            o.jsonFromMapEntryString r3 = p040o.jsonFromMapEntryString.INSURANCE_PORT
            if (r2 != r3) goto L_0x0317
            r2 = 0
            r4.MediaMetadataCompat = r2
            r4.RatingCompat = r2
            r4.MediaSessionCompat$QueueItem = r2
            r4.MediaDescriptionCompat = r2
            java.lang.String r2 = "IN_APP_PURCHASE"
            r4.ParcelableVolumeInfo = r2
            o.cast r1 = r7.IconCompatParcelizer((p040o.CrashlyticsReport.Session.Event.Application.Execution.Exception) r1)
            r4.MediaBrowserCompat$MediaItem = r1
            goto L_0x0333
        L_0x0317:
            java.lang.String r2 = r1.setPrimaryBackground
            r4.MediaMetadataCompat = r2
            java.lang.String r2 = r1.setTabContainer
            r4.RatingCompat = r2
            java.lang.String r2 = r1.ActionBarContextView
            r4.MediaSessionCompat$QueueItem = r2
            java.lang.String r2 = r1.setSubtitle
            r4.ParcelableVolumeInfo = r2
            java.lang.String r2 = r1.setStackedBackground
            r4.MediaDescriptionCompat = r2
            r4.read = r5
            o.cast r1 = r7.IconCompatParcelizer((p040o.CrashlyticsReport.Session.Event.Application.Execution.Exception) r1)
            r4.MediaBrowserCompat$MediaItem = r1
        L_0x0333:
            o.jsonFromMapEntryString r1 = r7.MediaSessionCompat$ResultReceiverWrapper
            o.jsonFromMapEntryString r2 = p040o.jsonFromMapEntryString.INSURANCE_PORT
            if (r1 != r2) goto L_0x033f
            o.include r1 = r7.MediaBrowserCompat$ItemReceiver
            r1.IconCompatParcelizer((p040o.putInstance) r4)
            goto L_0x0344
        L_0x033f:
            o.include r1 = r7.MediaBrowserCompat$ItemReceiver
            r1.MediaBrowserCompat$ItemReceiver((p040o.putInstance) r4)
        L_0x0344:
            o.include r1 = r7.MediaBrowserCompat$ItemReceiver
            java.lang.String r12 = r4.IconCompatParcelizer
            o.include r2 = r7.MediaBrowserCompat$ItemReceiver
            o.st$IconCompatParcelizer r3 = new o.st$IconCompatParcelizer
            o.getSubElementOffsetBytes$MediaBrowserCompat$ItemReceiver r2 = r2.IconCompatParcelizer
            boolean r14 = r2.setItemInvoker()
            r6 = r3
            r6.<init>(r8, r9, r10, r11, r12, r13, r14, r15)
            r1.IconCompatParcelizer(r3)
        L_0x0359:
            o.st r1 = r0.billPaymentBillerSelectedPresenter
            java.lang.String r2 = r0.MediaSessionCompat$ResultReceiverWrapper
            java.lang.String r3 = r0.MediaSessionCompat$Token
            r1.write((java.lang.String) r2, (java.lang.String) r3)
        L_0x0362:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.scb.phone.view.fragment.transferandpay.billpaymenttab.BillPaymentBillerSelectedFragment.onAdditionalInfoButtonClicked():void");
    }

    /* JADX WARNING: type inference failed for: r1v3, types: [java.io.Serializable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private p040o.StreetViewPanoramaFragment.zzb setCheckable() {
        /*
            r3 = this;
            o.StreetViewPanoramaFragment$zzb r0 = p040o.StreetViewPanoramaFragment.zzb.PROFILE
            android.os.Bundle r1 = r3.getArguments()
            if (r1 == 0) goto L_0x000f
            java.lang.String r2 = "com.scb.phone.EXTRA_BILL_PAY_METHOD"
            java.io.Serializable r1 = r1.getSerializable(r2)
            goto L_0x0010
        L_0x000f:
            r1 = 0
        L_0x0010:
            boolean r2 = r1 instanceof p040o.StreetViewPanoramaFragment.zzb
            if (r2 == 0) goto L_0x0017
            r0 = r1
            o.StreetViewPanoramaFragment$zzb r0 = (p040o.StreetViewPanoramaFragment.zzb) r0
        L_0x0017:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.scb.phone.view.fragment.transferandpay.billpaymenttab.BillPaymentBillerSelectedFragment.setCheckable():o.StreetViewPanoramaFragment$zzb");
    }

    public final void MediaBrowserCompat$SearchResultReceiver() {
        Intent intent = new Intent(getActivity(), ScheduleLandingActivity.class);
        AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
        try {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                intent = setTapText.write(activity, intent).read();
            }
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivityForResult(Intent, int), modified: ");
            sb.append(intent.getData());
            sb.append("\n with context ");
            sb.append(activity.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            startActivityForResult(intent, 100);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i != 100) {
            return;
        }
        if (i2 == -1) {
            this.Keep = (getRamUsed) intent.getParcelableExtra("SCHEDULE_DETAIL");
            if (this.noteLayout.getVisibility() == 0) {
                this.noteLayout.setVisibility(8);
                if (!this.noteEditText.mNoteEditText.getText().toString().isEmpty()) {
                    FragmentActivity activity = getActivity();
                    String string = getString(R.string.topup_input_010);
                    getOversizeImage getoversizeimage = getOversizeImage.ERROR;
                    if (getActivity() != null) {
                        ((BaseActivity) getActivity()).write(activity, R.id.fragment_container_bill_payment_tabs, string, getoversizeimage);
                    }
                    this.noteEditText.mNoteEditText.setText("");
                }
            }
            if (this.MediaSessionCompat$QueueItem != null) {
                this.mRemainingLimit.setText(getString(R.string.schedule_bill_payment_limit, this.MediaSessionCompat$QueueItem));
            }
            this.customScheduleView.setScheduleView(this.Keep, true);
            FragmentBuilder_BindEasycashContactInformationFragment fragmentBuilder_BindEasycashContactInformationFragment = this.mAmountValue.read;
            if (fragmentBuilder_BindEasycashContactInformationFragment != null) {
                fragmentBuilder_BindEasycashContactInformationFragment.IconCompatParcelizer(Double.MAX_VALUE);
            }
        } else if (i2 == 1) {
            if (this.MediaSessionCompat$QueueItem != null) {
                this.mRemainingLimit.setText(getString(R.string.bill_payment_limit, this.PlaybackStateCompat$CustomAction));
            }
            this.customScheduleView.read();
            this.noteLayout.setVisibility(0);
            this.Keep = null;
        }
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        Fragment parentFragment = getParentFragment();
        if (parentFragment instanceof ServerProjectProvider$5$MediaBrowserCompat$ItemReceiver) {
            this.f3099x50fd9e4a = (ServerProjectProvider$5$MediaBrowserCompat$ItemReceiver) parentFragment;
        }
    }

    public static class read implements ScbEditText.write {
        public final boolean MediaBrowserCompat$ItemReceiver(ScbEditText scbEditText, String str) {
            if (!str.matches("[a-zA-Z0-9]*")) {
                return true;
            }
            scbEditText.setText(str);
            return true;
        }
    }

    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        this.billPaymentBillerSelectedPresenter.read = false;
    }

    public final void read(CrashlyticsReport.FilesPayload.File.Builder builder) {
        if (builder != null) {
            this.RatingCompat = builder.MediaSessionCompat$Token;
            this.MediaBrowserCompat$CustomActionResultReceiver = builder.Keep;
            this.billPaymentBillerSelectedPresenter.MediaSessionCompat$Token = setCheckable();
            this.IconCompatParcelizer = builder.MediaBrowserCompat$CustomActionResultReceiver;
        }
    }
}
