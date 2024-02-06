package com.scb.phone.view.fragment.remittance;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.activity.HomeActivity;
import com.scb.phone.view.custom.common.CustomInputDialog;
import com.scb.phone.view.custom.transferandpay.CustomNoteItem;
import com.scb.phone.view.custom.transferandpay.CustomTransferAndPayItem;
import com.scb.phone.view.custom.transferandpay.CustomTransferAndPaySource;
import com.scb.phone.view.custom.transferandpay.CustomTransferAndPayTarget;
import com.thunderhead.android.aspects.AndroidXSupportFragmentIntentTidInjectionAspect;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;
import java.util.Arrays;
import java.util.Calendar;
import java.util.regex.Pattern;
import kotlin.TypeCastException;
import org.jmrtd.lds.ImageInfo;
import p040o.ActivityBuilder_ContributePrepaidRequestReviewActivity;
import p040o.ActivityBuilder_ContributePrepaidRequestSuccessActivity;
import p040o.BankingServicesDeepLinkActivity;
import p040o.BulkTransferDeepLinkActivity;
import p040o.C5024nV;
import p040o.DebitCardResetOtpActivity;
import p040o.ForwardingListenableFuture;
import p040o.FragmentBuilder_BindDepositSelectorFragment;
import p040o.FragmentBuilder_BindDirectDebitTermsAndConditionsFragment;
import p040o.FragmentBuilder_BindEBillSelectedFragment;
import p040o.FundOnboardingSuccessActivity;
import p040o.GoodToKnowActivity;
import p040o.HmlETBLandingActivity;
import p040o.HmlPinActivity;
import p040o.ImmutableListMultimap;
import p040o.MyECouponActivity_ViewBinding;
import p040o.ServerProjectProvider;
import p040o.access$2200;
import p040o.getOversizeImage;
import p040o.getRegistrationsAddresses;
import p040o.logEventNoInterceptor;
import p040o.nV$MediaBrowserCompat$CustomActionResultReceiver;
import p040o.onGetStartedClick;
import p040o.onStart;
import p040o.setExitButtonEnabled;
import p040o.setImportance;
import p040o.setLastBaselineToBottomHeight;
import p040o.setOverflowCount;
import p040o.setTapText;
import p040o.validateEntries;
import p040o.writeUInt64NoTag;

public final class RemittanceSuccessFragment extends BaseRemittanceDetailsFragment implements ServerProjectProvider.C706313 {
    public static final read IconCompatParcelizer = new read((byte) 0);
    private final IconCompatParcelizer MediaBrowserCompat$CustomActionResultReceiver = new IconCompatParcelizer(this);
    /* access modifiers changed from: private */
    public CustomInputDialog MediaBrowserCompat$SearchResultReceiver;
    private BulkTransferDeepLinkActivity MediaDescriptionCompat;
    private setImportance MediaMetadataCompat;
    @BindView
    protected View amountsSeparatorSpace;
    @BindView
    protected Button buttonSaveSlip;
    @BindView
    protected View dividerButtons;
    @BindView
    protected ImageView pendingIcon;
    @HmlPinActivity
    public C5024nV presenter;
    @BindView
    protected TextView textViewRefId;
    @BindView
    protected TextView textViewSuccessfulHeaderTitle;
    @BindView
    protected TextView textViewTransactionDate;
    @BindView
    protected TextView textViewTransactionRemark;
    @HmlPinActivity
    public setExitButtonEnabled themesSlipPresenter;

    public final class SlipScreenshot_ViewBinding implements Unbinder {
        private SlipScreenshot IconCompatParcelizer;

        public SlipScreenshot_ViewBinding(SlipScreenshot slipScreenshot, View view) {
            this.IconCompatParcelizer = slipScreenshot;
            slipScreenshot.slipTextViewSuccessfulHeaderTitle = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_successful_transfer, "field 'slipTextViewSuccessfulHeaderTitle'", TextView.class);
            slipScreenshot.successIcon = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.iv_success_icon, "field 'successIcon'", ImageView.class);
            slipScreenshot.pendingIcon = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.iv_pending_icon, "field 'pendingIcon'", ImageView.class);
            slipScreenshot.slipTextViewTransactionDate = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_transaction_date, "field 'slipTextViewTransactionDate'", TextView.class);
            slipScreenshot.slipTextViewRefId = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_ref_id, "field 'slipTextViewRefId'", TextView.class);
            slipScreenshot.slipTextViewTransactionRemark = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_transation_remark, "field 'slipTextViewTransactionRemark'", TextView.class);
            slipScreenshot.slipCustomSource = (CustomTransferAndPaySource) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.remittance_review_source, "field 'slipCustomSource'", CustomTransferAndPaySource.class);
            slipScreenshot.slipCustomTarget = (CustomTransferAndPayTarget) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.remittance_review_target, "field 'slipCustomTarget'", CustomTransferAndPayTarget.class);
            slipScreenshot.slipCustomConversionRate = (CustomTransferAndPayItem) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.remittance_conversion_rate, "field 'slipCustomConversionRate'", CustomTransferAndPayItem.class);
            slipScreenshot.slipCustomAmountToSendLayout = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.remittance_amount_to_send, "field 'slipCustomAmountToSendLayout'", LinearLayout.class);
            slipScreenshot.slipCustomAmountToSend = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_remittance_amount_to_send_value, "field 'slipCustomAmountToSend'", TextView.class);
            slipScreenshot.slipCustomAmountToGetLayout = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.remittance_amount_to_get, "field 'slipCustomAmountToGetLayout'", LinearLayout.class);
            slipScreenshot.slipCustomAmountToGet = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_remittance_amount_to_get_value, "field 'slipCustomAmountToGet'", TextView.class);
            slipScreenshot.slipCustomFeeLayout = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.remittance_fee, "field 'slipCustomFeeLayout'", LinearLayout.class);
            slipScreenshot.slipCustomFee = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_remittance_fee_value, "field 'slipCustomFee'", TextView.class);
            slipScreenshot.slipCustomPersonalDetail = (CustomNoteItem) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.remittance_recipient_personal_details, "field 'slipCustomPersonalDetail'", CustomNoteItem.class);
            slipScreenshot.slipCustomRecipientAddress = (CustomNoteItem) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.remittance_recipient_address, "field 'slipCustomRecipientAddress'", CustomNoteItem.class);
            slipScreenshot.slipCustomRecipientContacts = (CustomNoteItem) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.remittance_recipient_contact_details, "field 'slipCustomRecipientContacts'", CustomNoteItem.class);
            slipScreenshot.slipCustomTransactionDetails = (CustomNoteItem) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.remittance_transaction_details, "field 'slipCustomTransactionDetails'", CustomNoteItem.class);
            slipScreenshot.slipCustomNote = (CustomNoteItem) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.remittance_note, "field 'slipCustomNote'", CustomNoteItem.class);
            slipScreenshot.slipRemittanceLogo = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.remittance_logo, "field 'slipRemittanceLogo'", ImageView.class);
            slipScreenshot.slipAmountsSeparatorSpace = onStart.IconCompatParcelizer(view, R.id.remittance_recipient_amounts_separator_space, "field 'slipAmountsSeparatorSpace'");
            slipScreenshot.slipSeparatorAmountToSend = onStart.IconCompatParcelizer(view, R.id.separator_remittance_amount_to_send, "field 'slipSeparatorAmountToSend'");
            slipScreenshot.slipSeparatorAmountToGet = onStart.IconCompatParcelizer(view, R.id.separator_remittance_amount_to_get, "field 'slipSeparatorAmountToGet'");
        }

        public final void read() {
            SlipScreenshot slipScreenshot = this.IconCompatParcelizer;
            if (slipScreenshot != null) {
                this.IconCompatParcelizer = null;
                slipScreenshot.slipTextViewSuccessfulHeaderTitle = null;
                slipScreenshot.successIcon = null;
                slipScreenshot.pendingIcon = null;
                slipScreenshot.slipTextViewTransactionDate = null;
                slipScreenshot.slipTextViewRefId = null;
                slipScreenshot.slipTextViewTransactionRemark = null;
                slipScreenshot.slipCustomSource = null;
                slipScreenshot.slipCustomTarget = null;
                slipScreenshot.slipCustomConversionRate = null;
                slipScreenshot.slipCustomAmountToSendLayout = null;
                slipScreenshot.slipCustomAmountToSend = null;
                slipScreenshot.slipCustomAmountToGetLayout = null;
                slipScreenshot.slipCustomAmountToGet = null;
                slipScreenshot.slipCustomFeeLayout = null;
                slipScreenshot.slipCustomFee = null;
                slipScreenshot.slipCustomPersonalDetail = null;
                slipScreenshot.slipCustomRecipientAddress = null;
                slipScreenshot.slipCustomRecipientContacts = null;
                slipScreenshot.slipCustomTransactionDetails = null;
                slipScreenshot.slipCustomNote = null;
                slipScreenshot.slipRemittanceLogo = null;
                slipScreenshot.slipAmountsSeparatorSpace = null;
                slipScreenshot.slipSeparatorAmountToSend = null;
                slipScreenshot.slipSeparatorAmountToGet = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
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
        View inflate = layoutInflater.inflate(R.layout.f89452131494172, viewGroup, false);
        this.read = ButterKnife.IconCompatParcelizer(this, inflate);
        return inflate;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        onGetStartedClick.write((Object) view, Promotion.ACTION_VIEW);
        super.onViewCreated(view, bundle);
        C5024nV nVVar = this.presenter;
        if (nVVar == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        nVVar.MediaBrowserCompat$ItemReceiver(this);
        if (getActivity() != null) {
            ((BaseActivity) getActivity()).mo13676d_("outward_remittance_request_successful");
        }
    }

    public final void onActivityCreated(Bundle bundle) {
        setImportance setimportance;
        super.onActivityCreated(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            setImportance setimportance2 = (setImportance) arguments.getParcelable("EXTRA_REMITTANCE_SUCCESS_DISPLAY");
            this.MediaMetadataCompat = setimportance2;
            if (setimportance2 != null) {
                C5024nV nVVar = this.presenter;
                if (nVVar == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
                }
                onGetStartedClick.write((Object) setimportance2, "successDisplay");
                nVVar.IconCompatParcelizer = setimportance2;
                writeUInt64NoTag.IconCompatParcelizer mediaMetadataCompat = new C5024nV.MediaMetadataCompat(setimportance2);
                boolean z = true;
                if (nVVar.RatingCompat != null) {
                    mediaMetadataCompat.IconCompatParcelizer(nVVar.RatingCompat);
                }
                boolean shortcut = nVVar.read.MediaBrowserCompat$CustomActionResultReceiver.setShortcut();
                writeUInt64NoTag.IconCompatParcelizer nv_mediabrowsercompat_customactionresultreceiver = new nV$MediaBrowserCompat$CustomActionResultReceiver(shortcut);
                if (nVVar.RatingCompat != null) {
                    nv_mediabrowsercompat_customactionresultreceiver.IconCompatParcelizer(nVVar.RatingCompat);
                }
                if (shortcut && (setimportance = nVVar.IconCompatParcelizer) != null) {
                    writeUInt64NoTag.IconCompatParcelizer write2 = new C5024nV.write(setimportance);
                    if (nVVar.RatingCompat == null) {
                        z = false;
                    }
                    if (z) {
                        write2.IconCompatParcelizer(nVVar.RatingCompat);
                    }
                }
            }
        }
    }

    public final void onDestroyView() {
        super.onDestroyView();
        C5024nV nVVar = this.presenter;
        if (nVVar == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        nVVar.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver();
        BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity = this.MediaDescriptionCompat;
        if (bulkTransferDeepLinkActivity != null && !bulkTransferDeepLinkActivity.isDisposed()) {
            bulkTransferDeepLinkActivity.dispose();
        }
    }

    public final void IconCompatParcelizer(boolean z) {
        Button button = this.buttonSaveSlip;
        if (button == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("buttonSaveSlip");
        }
        int i = 8;
        button.setVisibility(z ? 8 : 0);
        View view = this.dividerButtons;
        if (view == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("dividerButtons");
        }
        if (!z) {
            i = 0;
        }
        view.setVisibility(i);
    }

    public final void read(setImportance setimportance, boolean z) {
        onGetStartedClick.write((Object) setimportance, "display");
        Context context = getContext();
        if (context != null) {
            setExitButtonEnabled setexitbuttonenabled = this.themesSlipPresenter;
            if (setexitbuttonenabled == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("themesSlipPresenter");
            }
            SlipScreenshot slipScreenshot = new SlipScreenshot(setexitbuttonenabled);
            onGetStartedClick.IconCompatParcelizer((Object) context, "it");
            FundOnboardingSuccessActivity fundOnboardingSuccessActivity = FundOnboardingSuccessActivity.IconCompatParcelizer;
            String string = getString(R.string.remittance_success_slip_file_name);
            onGetStartedClick.IconCompatParcelizer((Object) string, "getString(R.string.remit…e_success_slip_file_name)");
            Calendar instance = Calendar.getInstance();
            onGetStartedClick.IconCompatParcelizer((Object) instance, "Calendar.getInstance()");
            String format = String.format(string, Arrays.copyOf(new Object[]{String.valueOf(instance.getTimeInMillis())}, 1));
            onGetStartedClick.IconCompatParcelizer((Object) format, "java.lang.String.format(format, *args)");
            this.MediaDescriptionCompat = DebitCardResetOtpActivity.fromCallable(new FragmentBuilder_BindDirectDebitTermsAndConditionsFragment(slipScreenshot, new C6161xc2059ba2(context, format, z, setimportance), getActivity())).observeOn(BankingServicesDeepLinkActivity.MediaBrowserCompat$ItemReceiver()).subscribeOn(HmlETBLandingActivity.IconCompatParcelizer()).subscribe(new RemittanceSuccessFragment$MediaBrowserCompat$MediaItem(this, z));
        }
    }

    public final void MediaBrowserCompat$ItemReceiver(setImportance setimportance, boolean z) {
        onGetStartedClick.write((Object) setimportance, "successDisplay");
        ActivityBuilder_ContributePrepaidRequestReviewActivity.IconCompatParcelizer(this, setimportance, z);
    }

    public final void IconCompatParcelizer(String str) {
        onGetStartedClick.write((Object) str, "slipFilePath");
        CharSequence charSequence = str;
        if (!(charSequence == null || charSequence.length() == 0) && getUserVisibleHint() && getActivity() != null) {
            MediaBrowserCompat$ItemReceiver((int) R.string.saved_slip, getOversizeImage.SUCCESS);
        }
    }

    public final void write(String str) {
        onGetStartedClick.write((Object) str, "name");
        MediaBrowserCompat$ItemReceiver((int) R.string.favourite_added_successfully, getOversizeImage.SUCCESS);
        CustomInputDialog customInputDialog = this.MediaBrowserCompat$SearchResultReceiver;
        if (customInputDialog != null) {
            customInputDialog.dismiss();
        }
        MediaBrowserCompat$CustomActionResultReceiver().setFavoriteName(str);
        MediaBrowserCompat$CustomActionResultReceiver().setAddFavoriteButtonVisible(false);
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(access$2200 access_2200) {
        String str;
        onGetStartedClick.write((Object) access_2200, "errorDisplay");
        CustomInputDialog customInputDialog = this.MediaBrowserCompat$SearchResultReceiver;
        if (customInputDialog != null) {
            if (access_2200.IconCompatParcelizer.length() > 0) {
                str = access_2200.IconCompatParcelizer;
            } else {
                str = access_2200.MediaBrowserCompat$ItemReceiver;
            }
            customInputDialog.mErrorTextView.setVisibility(0);
            customInputDialog.mErrorTextView.setText(str);
        }
    }

    @OnClick
    public final void onShareSlipButtonClick() {
        ActivityBuilder_ContributePrepaidRequestReviewActivity.MediaBrowserCompat$ItemReceiver(this);
    }

    @OnClick
    public final void onSaveSlipButtonClick() {
        ActivityBuilder_ContributePrepaidRequestReviewActivity.read(this);
    }

    public final void MediaMetadataCompat() {
        if (!isDetached() && getContext() != null) {
            C5024nV nVVar = this.presenter;
            if (nVVar == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
            }
            setImportance setimportance = nVVar.IconCompatParcelizer;
            if (setimportance != null) {
                writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = new C5024nV.IconCompatParcelizer(setimportance);
                if (nVVar.RatingCompat != null) {
                    iconCompatParcelizer.IconCompatParcelizer(nVVar.RatingCompat);
                }
            }
        }
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        if (!isDetached() && getContext() != null) {
            C5024nV nVVar = this.presenter;
            if (nVVar == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
            }
            setImportance setimportance = nVVar.IconCompatParcelizer;
            if (setimportance != null) {
                writeUInt64NoTag.IconCompatParcelizer write2 = new C5024nV.write(setimportance);
                if (nVVar.RatingCompat != null) {
                    write2.IconCompatParcelizer(nVVar.RatingCompat);
                }
            }
        }
    }

    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        onGetStartedClick.write((Object) strArr, "permissions");
        onGetStartedClick.write((Object) iArr, "grantResults");
        super.onRequestPermissionsResult(i, strArr, iArr);
        ActivityBuilder_ContributePrepaidRequestReviewActivity.read(this, i, iArr);
    }

    @OnClick
    public final void onAddFavoriteClick() {
        CustomInputDialog customInputDialog;
        CustomInputDialog MediaBrowserCompat$ItemReceiver = CustomInputDialog.MediaBrowserCompat$ItemReceiver(getContext());
        String string = getString(R.string.favourite_name);
        if (string != null) {
            MediaBrowserCompat$ItemReceiver.mTitleTextView.setVisibility(0);
            MediaBrowserCompat$ItemReceiver.mTitleTextView.setText(string);
        }
        MediaBrowserCompat$ItemReceiver.mEditTextView.addTextChangedListener(this.MediaBrowserCompat$CustomActionResultReceiver);
        MediaBrowserCompat$ItemReceiver.mEditTextView.setFilters(new InputFilter[]{new InputFilter.LengthFilter(20)});
        MediaBrowserCompat$ItemReceiver.setCanceledOnTouchOutside(false);
        MediaBrowserCompat$ItemReceiver.mEditTextView.setVisibility(0);
        MediaBrowserCompat$ItemReceiver.write(MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver.getString(R.string.cancel), write.MediaBrowserCompat$CustomActionResultReceiver);
        String string2 = getString(R.string.add_favourite);
        DialogInterface.OnClickListener activityBuilder_ContributePrepaidRequestSuccessActivity = new ActivityBuilder_ContributePrepaidRequestSuccessActivity(new RemittanceSuccessFragment$MediaBrowserCompat$ItemReceiver(this));
        if (string2 != null) {
            MediaBrowserCompat$ItemReceiver.mPositiveButton.setText(string2);
            MediaBrowserCompat$ItemReceiver.mPositiveButton.setOnClickListener(new getRegistrationsAddresses(MediaBrowserCompat$ItemReceiver, activityBuilder_ContributePrepaidRequestSuccessActivity, false));
        }
        this.MediaBrowserCompat$SearchResultReceiver = MediaBrowserCompat$ItemReceiver;
        if (isAdded() && getContext() != null && (customInputDialog = this.MediaBrowserCompat$SearchResultReceiver) != null) {
            customInputDialog.show();
        }
    }

    static final class write implements DialogInterface.OnClickListener {
        public static final write MediaBrowserCompat$CustomActionResultReceiver = new write();

        write() {
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
        }
    }

    public static final class IconCompatParcelizer implements TextWatcher {
        private /* synthetic */ RemittanceSuccessFragment MediaBrowserCompat$ItemReceiver;

        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            onGetStartedClick.write((Object) charSequence, "s");
        }

        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            onGetStartedClick.write((Object) charSequence, "s");
        }

        IconCompatParcelizer(RemittanceSuccessFragment remittanceSuccessFragment) {
            this.MediaBrowserCompat$ItemReceiver = remittanceSuccessFragment;
        }

        public final void afterTextChanged(Editable editable) {
            onGetStartedClick.write((Object) editable, "s");
            CustomInputDialog MediaBrowserCompat$CustomActionResultReceiver = this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$SearchResultReceiver;
            if (MediaBrowserCompat$CustomActionResultReceiver != null) {
                MediaBrowserCompat$CustomActionResultReceiver.mErrorTextView.setVisibility(8);
            }
        }
    }

    @OnClick
    public final void onReturnToAccount() {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            if (!HomeActivity.AppCompatDelegateImpl$ListMenuDecorView()) {
                activity.finishAffinity();
            }
            Intent putExtra = new Intent(getContext(), HomeActivity.class).addFlags(603979776).putExtra("com.scb.phone.EXTRA_NEW_INSTANCE_LAYOUT", R.id.account_summary_tab).putExtra("com.scb.phone.EXTRA_NEW_INSTANCE_REFRESH", true);
            onGetStartedClick.IconCompatParcelizer((Object) putExtra, "Intent(context, HomeActi…W_INSTANCE_REFRESH, true)");
            IntentTidInjectionContextAspect.aspectOf();
            try {
                Intent read2 = setTapText.write(activity, putExtra).read();
                MyECouponActivity_ViewBinding.write write2 = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
                StringBuilder sb = new StringBuilder("Uri intercepted on Context.startActivity(Intent), modified: ");
                sb.append(read2.getData());
                sb.append("\n with context ");
                sb.append(activity.hashCode());
                MyECouponActivity_ViewBinding.IconCompatParcelizer(write2, sb.toString());
                activity.startActivity(read2);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    private final void MediaBrowserCompat$ItemReceiver(int i, getOversizeImage getoversizeimage) {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            Activity activity2 = activity;
            String string = getString(i);
            if (getActivity() != null) {
                ((BaseActivity) getActivity()).write(activity2, R.id.root_view, string, getoversizeimage);
            }
        }
    }

    protected static final class SlipScreenshot extends FragmentBuilder_BindEBillSelectedFragment<C6161xc2059ba2> {
        private Context MediaBrowserCompat$ItemReceiver;
        @BindView
        protected ImageView pendingIcon;
        @BindView
        protected View slipAmountsSeparatorSpace;
        @BindView
        protected TextView slipCustomAmountToGet;
        @BindView
        protected LinearLayout slipCustomAmountToGetLayout;
        @BindView
        protected TextView slipCustomAmountToSend;
        @BindView
        protected LinearLayout slipCustomAmountToSendLayout;
        @BindView
        protected CustomTransferAndPayItem slipCustomConversionRate;
        @BindView
        protected TextView slipCustomFee;
        @BindView
        protected LinearLayout slipCustomFeeLayout;
        @BindView
        protected CustomNoteItem slipCustomNote;
        @BindView
        protected CustomNoteItem slipCustomPersonalDetail;
        @BindView
        protected CustomNoteItem slipCustomRecipientAddress;
        @BindView
        protected CustomNoteItem slipCustomRecipientContacts;
        @BindView
        protected CustomTransferAndPaySource slipCustomSource;
        @BindView
        protected CustomTransferAndPayTarget slipCustomTarget;
        @BindView
        protected CustomNoteItem slipCustomTransactionDetails;
        @BindView
        protected ImageView slipRemittanceLogo;
        @BindView
        protected View slipSeparatorAmountToGet;
        @BindView
        protected View slipSeparatorAmountToSend;
        @BindView
        protected TextView slipTextViewRefId;
        @BindView
        protected TextView slipTextViewSuccessfulHeaderTitle;
        @BindView
        protected TextView slipTextViewTransactionDate;
        @BindView
        protected TextView slipTextViewTransactionRemark;
        @BindView
        protected ImageView successIcon;

        public final /* synthetic */ void write(ForwardingListenableFuture.SimpleForwardingListenableFuture simpleForwardingListenableFuture, View view) {
            String str;
            View view2 = view;
            C6161xc2059ba2 remittanceSuccessFragment$MediaBrowserCompat$CustomActionResultReceiver = (C6161xc2059ba2) simpleForwardingListenableFuture;
            onGetStartedClick.write((Object) remittanceSuccessFragment$MediaBrowserCompat$CustomActionResultReceiver, "screenshotDisplay");
            onGetStartedClick.write((Object) view2, Promotion.ACTION_VIEW);
            ButterKnife.IconCompatParcelizer(this, view2);
            setImportance setimportance = remittanceSuccessFragment$MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer;
            this.MediaBrowserCompat$ItemReceiver = remittanceSuccessFragment$MediaBrowserCompat$CustomActionResultReceiver.read;
            TextView textView = this.slipTextViewTransactionDate;
            if (textView == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("slipTextViewTransactionDate");
            }
            textView.setText(setimportance.PlaybackStateCompat);
            TextView textView2 = this.slipTextViewRefId;
            if (textView2 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("slipTextViewRefId");
            }
            textView2.setText(setimportance.ParcelableVolumeInfo);
            if (setimportance.MediaBrowserCompat$SearchResultReceiver) {
                TextView textView3 = this.slipTextViewSuccessfulHeaderTitle;
                if (textView3 == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver("slipTextViewSuccessfulHeaderTitle");
                }
                Context context = this.MediaBrowserCompat$ItemReceiver;
                if (context == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver("mContext");
                }
                textView3.setText(context.getString(R.string.remittance_request_success_header_title));
                Context context2 = this.MediaBrowserCompat$ItemReceiver;
                if (context2 == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver("mContext");
                }
                textView3.setTextColor(setLastBaselineToBottomHeight.read(context2, R.color.f67182131099874));
                ImageView imageView = this.successIcon;
                if (imageView == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver("successIcon");
                }
                imageView.setVisibility(8);
                ImageView imageView2 = this.pendingIcon;
                if (imageView2 == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver("pendingIcon");
                }
                imageView2.setVisibility(0);
                TextView textView4 = this.slipTextViewTransactionRemark;
                if (textView4 == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver("slipTextViewTransactionRemark");
                }
                textView4.setVisibility(0);
            } else {
                TextView textView5 = this.slipTextViewTransactionRemark;
                if (textView5 == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver("slipTextViewTransactionRemark");
                }
                textView5.setVisibility(8);
            }
            setOverflowCount setoverflowcount = setimportance.read;
            String str2 = "";
            if (!TextUtils.isEmpty(setoverflowcount.MediaBrowserCompat$CustomActionResultReceiver)) {
                CustomTransferAndPaySource customTransferAndPaySource = this.slipCustomSource;
                if (customTransferAndPaySource == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver("slipCustomSource");
                }
                customTransferAndPaySource.setVisibility(0);
                CustomTransferAndPaySource customTransferAndPaySource2 = this.slipCustomSource;
                if (customTransferAndPaySource2 == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver("slipCustomSource");
                }
                customTransferAndPaySource2.setSourceName(setoverflowcount.MediaBrowserCompat$CustomActionResultReceiver);
                CustomTransferAndPaySource customTransferAndPaySource3 = this.slipCustomSource;
                if (customTransferAndPaySource3 == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver("slipCustomSource");
                }
                customTransferAndPaySource3.setDivider(false);
                CustomTransferAndPaySource customTransferAndPaySource4 = this.slipCustomSource;
                if (customTransferAndPaySource4 == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver("slipCustomSource");
                }
                if (setoverflowcount.write.length() > 0) {
                    str = setoverflowcount.write;
                } else {
                    str = setoverflowcount.read;
                }
                customTransferAndPaySource4.setAccountNumber(str);
                CustomTransferAndPaySource customTransferAndPaySource5 = this.slipCustomSource;
                if (customTransferAndPaySource5 == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver("slipCustomSource");
                }
                String str3 = setoverflowcount.MediaBrowserCompat$ItemReceiver;
                if (str3 == null) {
                    str3 = str2;
                }
                customTransferAndPaySource5.setAvatar(str3);
            }
            if (!TextUtils.isEmpty(setimportance.write.read)) {
                CustomTransferAndPayTarget customTransferAndPayTarget = this.slipCustomTarget;
                if (customTransferAndPayTarget == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver("slipCustomTarget");
                }
                customTransferAndPayTarget.setVisibility(0);
                CustomTransferAndPayTarget customTransferAndPayTarget2 = this.slipCustomTarget;
                if (customTransferAndPayTarget2 == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver("slipCustomTarget");
                }
                customTransferAndPayTarget2.setFullDivider(true);
                CustomTransferAndPayTarget customTransferAndPayTarget3 = this.slipCustomTarget;
                if (customTransferAndPayTarget3 == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver("slipCustomTarget");
                }
                customTransferAndPayTarget3.setTargetName(setimportance.write.read);
                CustomTransferAndPayTarget customTransferAndPayTarget4 = this.slipCustomTarget;
                if (customTransferAndPayTarget4 == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver("slipCustomTarget");
                }
                customTransferAndPayTarget4.setReferenceNumbers(setimportance.write.IconCompatParcelizer);
                CustomTransferAndPayTarget customTransferAndPayTarget5 = this.slipCustomTarget;
                if (customTransferAndPayTarget5 == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver("slipCustomTarget");
                }
                customTransferAndPayTarget5.setReferenceNo1(setimportance.write.write);
                CustomTransferAndPayTarget customTransferAndPayTarget6 = this.slipCustomTarget;
                if (customTransferAndPayTarget6 == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver("slipCustomTarget");
                }
                String str4 = setimportance.write.MediaBrowserCompat$CustomActionResultReceiver;
                if (str4 != null) {
                    str2 = str4;
                }
                customTransferAndPayTarget6.setAvatar(str2, R.drawable.bankicon_remittance);
                CustomTransferAndPayTarget customTransferAndPayTarget7 = this.slipCustomTarget;
                if (customTransferAndPayTarget7 == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver("slipCustomTarget");
                }
                customTransferAndPayTarget7.setAddFavoriteButtonVisible(false);
                CustomTransferAndPayTarget customTransferAndPayTarget8 = this.slipCustomTarget;
                if (customTransferAndPayTarget8 == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver("slipCustomTarget");
                }
                customTransferAndPayTarget8.mFavouriteIcon.setVisibility(8);
                customTransferAndPayTarget8.mFavouriteName.setVisibility(8);
            }
            CustomTransferAndPayItem customTransferAndPayItem = this.slipCustomConversionRate;
            if (customTransferAndPayItem == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("slipCustomConversionRate");
            }
            String str5 = setimportance.MediaBrowserCompat$ItemReceiver;
            if (!TextUtils.isEmpty(str5)) {
                customTransferAndPayItem.setVisibility(0);
                customTransferAndPayItem.setValue(str5);
            }
            LinearLayout linearLayout = this.slipCustomAmountToSendLayout;
            if (linearLayout == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("slipCustomAmountToSendLayout");
            }
            TextView textView6 = this.slipCustomAmountToSend;
            if (textView6 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("slipCustomAmountToSend");
            }
            CharSequence charSequence = setimportance.IconCompatParcelizer;
            if (!TextUtils.isEmpty(charSequence)) {
                linearLayout.setVisibility(0);
                textView6.setText(charSequence);
            }
            LinearLayout linearLayout2 = this.slipCustomAmountToGetLayout;
            if (linearLayout2 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("slipCustomAmountToGetLayout");
            }
            TextView textView7 = this.slipCustomAmountToGet;
            if (textView7 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("slipCustomAmountToGet");
            }
            CharSequence charSequence2 = setimportance.MediaBrowserCompat$CustomActionResultReceiver;
            if (!TextUtils.isEmpty(charSequence2)) {
                linearLayout2.setVisibility(0);
                textView7.setText(charSequence2);
            }
            LinearLayout linearLayout3 = this.slipCustomFeeLayout;
            if (linearLayout3 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("slipCustomFeeLayout");
            }
            TextView textView8 = this.slipCustomFee;
            if (textView8 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("slipCustomFee");
            }
            CharSequence charSequence3 = setimportance.MediaBrowserCompat$MediaItem;
            if (!TextUtils.isEmpty(charSequence3)) {
                linearLayout3.setVisibility(0);
                textView8.setText(charSequence3);
            }
            String str6 = setimportance.MediaBrowserCompat$MediaItem;
            int MediaBrowserCompat$CustomActionResultReceiver = GoodToKnowActivity.MediaBrowserCompat$CustomActionResultReceiver((CharSequence) setimportance.MediaBrowserCompat$MediaItem, ' ', 0, false);
            if (str6 != null) {
                String substring = str6.substring(0, MediaBrowserCompat$CustomActionResultReceiver);
                onGetStartedClick.IconCompatParcelizer((Object) substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                if (TextUtils.isEmpty(substring) || onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) substring, (Object) "0.00")) {
                    LinearLayout linearLayout4 = this.slipCustomFeeLayout;
                    if (linearLayout4 == null) {
                        onGetStartedClick.MediaBrowserCompat$ItemReceiver("slipCustomFeeLayout");
                    }
                    linearLayout4.setVisibility(8);
                }
                Context context3 = this.MediaBrowserCompat$ItemReceiver;
                if (context3 == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver("mContext");
                }
                CustomNoteItem customNoteItem = this.slipCustomPersonalDetail;
                if (customNoteItem == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver("slipCustomPersonalDetail");
                }
                write(context3, customNoteItem, R.string.remittance_review_recipient_personal_detail, setimportance.MediaSessionCompat$ResultReceiverWrapper, false);
                Context context4 = this.MediaBrowserCompat$ItemReceiver;
                if (context4 == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver("mContext");
                }
                CustomNoteItem customNoteItem2 = this.slipCustomRecipientAddress;
                if (customNoteItem2 == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver("slipCustomRecipientAddress");
                }
                write(context4, customNoteItem2, R.string.remittance_review_recipient_address, setimportance.MediaSessionCompat$Token, false);
                CustomNoteItem customNoteItem3 = this.slipCustomRecipientAddress;
                if (customNoteItem3 == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver("slipCustomRecipientAddress");
                }
                customNoteItem3.topSpace.setVisibility(8);
                Context context5 = this.MediaBrowserCompat$ItemReceiver;
                if (context5 == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver("mContext");
                }
                CustomNoteItem customNoteItem4 = this.slipCustomRecipientContacts;
                if (customNoteItem4 == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver("slipCustomRecipientContacts");
                }
                write(context5, customNoteItem4, R.string.remittance_review_recipient_contact_details, setimportance.f2945x50fd9e4a, false);
                CustomNoteItem customNoteItem5 = this.slipCustomRecipientContacts;
                if (customNoteItem5 == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver("slipCustomRecipientContacts");
                }
                customNoteItem5.topSpace.setVisibility(8);
                Context context6 = this.MediaBrowserCompat$ItemReceiver;
                if (context6 == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver("mContext");
                }
                CustomNoteItem customNoteItem6 = this.slipCustomTransactionDetails;
                if (customNoteItem6 == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver("slipCustomTransactionDetails");
                }
                write(context6, customNoteItem6, R.string.remittance_recipient_purpose_input_title, setimportance.setHasDecor, TextUtils.isEmpty(setimportance.MediaDescriptionCompat));
                CustomNoteItem customNoteItem7 = this.slipCustomTransactionDetails;
                if (customNoteItem7 == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver("slipCustomTransactionDetails");
                }
                customNoteItem7.topSpace.setVisibility(8);
                Context context7 = this.MediaBrowserCompat$ItemReceiver;
                if (context7 == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver("mContext");
                }
                CustomNoteItem customNoteItem8 = this.slipCustomNote;
                if (customNoteItem8 == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver("slipCustomNote");
                }
                write(context7, customNoteItem8, R.string.remittance_review_note, setimportance.MediaDescriptionCompat, true);
                CustomNoteItem customNoteItem9 = this.slipCustomNote;
                if (customNoteItem9 == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver("slipCustomNote");
                }
                customNoteItem9.topSpace.setVisibility(8);
                CustomTransferAndPayItem customTransferAndPayItem2 = this.slipCustomConversionRate;
                if (customTransferAndPayItem2 == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver("slipCustomConversionRate");
                }
                customTransferAndPayItem2.mDividerView.setVisibility(8);
                CustomTransferAndPayItem customTransferAndPayItem3 = this.slipCustomConversionRate;
                if (customTransferAndPayItem3 == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver("slipCustomConversionRate");
                }
                customTransferAndPayItem3.mBottomSpace.setVisibility(8);
                View view3 = this.slipAmountsSeparatorSpace;
                if (view3 == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver("slipAmountsSeparatorSpace");
                }
                view3.setVisibility(8);
                CustomNoteItem customNoteItem10 = this.slipCustomTransactionDetails;
                if (customNoteItem10 == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver("slipCustomTransactionDetails");
                }
                customNoteItem10.setFullDivider(true);
                View view4 = this.slipSeparatorAmountToSend;
                if (view4 == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver("slipSeparatorAmountToSend");
                }
                view4.setVisibility(8);
                View view5 = this.slipSeparatorAmountToGet;
                if (view5 == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver("slipSeparatorAmountToGet");
                }
                view5.setVisibility(8);
                LinearLayout linearLayout5 = this.slipCustomAmountToGetLayout;
                if (linearLayout5 == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver("slipCustomAmountToGetLayout");
                }
                linearLayout5.setPadding(0, 0, 0, 0);
                LinearLayout linearLayout6 = this.slipCustomFeeLayout;
                if (linearLayout6 == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver("slipCustomFeeLayout");
                }
                linearLayout6.setPadding(0, 0, 0, 0);
                CustomNoteItem customNoteItem11 = this.slipCustomPersonalDetail;
                if (customNoteItem11 == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver("slipCustomPersonalDetail");
                }
                customNoteItem11.write();
                CustomNoteItem customNoteItem12 = this.slipCustomRecipientAddress;
                if (customNoteItem12 == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver("slipCustomRecipientAddress");
                }
                customNoteItem12.write();
                CustomNoteItem customNoteItem13 = this.slipCustomRecipientContacts;
                if (customNoteItem13 == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver("slipCustomRecipientContacts");
                }
                customNoteItem13.write();
                CustomNoteItem customNoteItem14 = this.slipCustomTransactionDetails;
                if (customNoteItem14 == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver("slipCustomTransactionDetails");
                }
                customNoteItem14.write();
                CustomNoteItem customNoteItem15 = this.slipCustomNote;
                if (customNoteItem15 == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver("slipCustomNote");
                }
                customNoteItem15.setFullDivider(true);
                CustomNoteItem customNoteItem16 = this.slipCustomNote;
                if (customNoteItem16 == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver("slipCustomNote");
                }
                customNoteItem16.write();
                if (!TextUtils.isEmpty(setimportance.MediaSessionCompat$QueueItem)) {
                    ImageView imageView3 = this.slipRemittanceLogo;
                    if (imageView3 == null) {
                        onGetStartedClick.MediaBrowserCompat$ItemReceiver("slipRemittanceLogo");
                    }
                    imageView3.setVisibility(0);
                    if (this.MediaBrowserCompat$ItemReceiver == null) {
                        onGetStartedClick.MediaBrowserCompat$ItemReceiver("mContext");
                    }
                    ImageView imageView4 = this.slipRemittanceLogo;
                    if (imageView4 == null) {
                        onGetStartedClick.MediaBrowserCompat$ItemReceiver("slipRemittanceLogo");
                    }
                    FragmentBuilder_BindDepositSelectorFragment.MediaBrowserCompat$SearchResultReceiver(imageView4, setimportance.MediaSessionCompat$QueueItem);
                    return;
                }
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public SlipScreenshot(setExitButtonEnabled setexitbuttonenabled) {
            super(setexitbuttonenabled);
            onGetStartedClick.write((Object) setexitbuttonenabled, "themesSlipPresenter");
        }

        private static void write(Context context, CustomNoteItem customNoteItem, int i, String str, boolean z) {
            if (!TextUtils.isEmpty(str)) {
                int i2 = 0;
                customNoteItem.setVisibility(0);
                customNoteItem.setTitle(context.getString(i));
                customNoteItem.setText(str);
                View view = customNoteItem.divider;
                if (!z) {
                    i2 = 8;
                }
                view.setVisibility(i2);
            }
        }
    }

    public static final /* synthetic */ void read(RemittanceSuccessFragment remittanceSuccessFragment) {
        CustomInputDialog customInputDialog = remittanceSuccessFragment.MediaBrowserCompat$SearchResultReceiver;
        String valueOf = customInputDialog != null ? String.valueOf(customInputDialog.mEditTextView.getText()) : null;
        if (valueOf != null) {
            boolean z = false;
            if (Pattern.compile("^(?=\\S)[0-9a-zA-Z\\u0E00-\\u0E3E\\u0E40-\\u0E7F _*'\"#&*()@\\-]+$").matcher(valueOf).matches()) {
                C5024nV nVVar = remittanceSuccessFragment.presenter;
                if (nVVar == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
                }
                setImportance setimportance = remittanceSuccessFragment.MediaMetadataCompat;
                onGetStartedClick.write((Object) valueOf, "nickname");
                if (setimportance != null) {
                    ImmutableListMultimap immutableListMultimap = new ImmutableListMultimap();
                    immutableListMultimap.ActionMenuItemView = valueOf;
                    immutableListMultimap.setContentView = setimportance.read.read;
                    immutableListMultimap.AppCompatViewInflater = "REMITTANCE";
                    immutableListMultimap.setShortcut = "ALL";
                    validateEntries MediaMetadataCompat2 = nVVar.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver.MediaMetadataCompat();
                    if (MediaMetadataCompat2 != null) {
                        immutableListMultimap.MediaDescriptionCompat = MediaMetadataCompat2.RatingCompat;
                        immutableListMultimap.MediaBrowserCompat$MediaItem = MediaMetadataCompat2.MediaDescriptionCompat;
                        immutableListMultimap.IconCompatParcelizer = MediaMetadataCompat2.MediaBrowserCompat$CustomActionResultReceiver;
                        immutableListMultimap.MediaBrowserCompat$SearchResultReceiver = MediaMetadataCompat2.MediaSessionCompat$ResultReceiverWrapper;
                        immutableListMultimap.PlaybackStateCompat$CustomAction = MediaMetadataCompat2.AppCompatDialogFragment;
                        immutableListMultimap.MediaBrowserCompat$CustomActionResultReceiver = MediaMetadataCompat2.write;
                        immutableListMultimap.MediaBrowserCompat$ItemReceiver = MediaMetadataCompat2.IconCompatParcelizer;
                        immutableListMultimap.read = MediaMetadataCompat2.MediaBrowserCompat$ItemReceiver;
                        immutableListMultimap.AppCompatDialogFragment = MediaMetadataCompat2.setContentView;
                        immutableListMultimap.setBackgroundResource = MediaMetadataCompat2.AppCompatDelegateImpl$ListMenuDecorView;
                        immutableListMultimap.f5514x50fd9e4a = MediaMetadataCompat2.ParcelableVolumeInfo;
                        immutableListMultimap.MediaSessionCompat$QueueItem = MediaMetadataCompat2.PlaybackStateCompat$CustomAction;
                        immutableListMultimap.AlertController$RecycleListView = MediaMetadataCompat2.setHasDecor;
                        immutableListMultimap.MediaSessionCompat$Token = MediaMetadataCompat2.MediaSessionCompat$Token;
                        immutableListMultimap.MediaSessionCompat$ResultReceiverWrapper = MediaMetadataCompat2.MediaSessionCompat$QueueItem;
                        immutableListMultimap.write = MediaMetadataCompat2.read;
                        immutableListMultimap.MediaMetadataCompat = MediaMetadataCompat2.MediaMetadataCompat;
                        immutableListMultimap.AppCompatActivity = MediaMetadataCompat2.AppCompatActivity;
                        immutableListMultimap.PlaybackStateCompat = MediaMetadataCompat2.AlertController$RecycleListView;
                        immutableListMultimap.RatingCompat = MediaMetadataCompat2.MediaBrowserCompat$MediaItem;
                        immutableListMultimap.Keep = MediaMetadataCompat2.PlaybackStateCompat;
                        immutableListMultimap.ParcelableVolumeInfo = MediaMetadataCompat2.f2974x50fd9e4a;
                        immutableListMultimap.setHasDecor = MediaMetadataCompat2.Keep;
                    }
                    if (nVVar.RatingCompat != null) {
                        z = true;
                    }
                    if (z) {
                        nVVar.RatingCompat.AlertController$RecycleListView();
                    }
                    nVVar.read.IconCompatParcelizer(immutableListMultimap);
                    logEventNoInterceptor logeventnointerceptor = nVVar.read;
                    String str = immutableListMultimap.ActionMenuItemView;
                    onGetStartedClick.IconCompatParcelizer((Object) str, "favouriteSaveTargetRequest.getNickname()");
                    logeventnointerceptor.IconCompatParcelizer(new C5024nV.read(nVVar, str));
                    return;
                }
                return;
            }
            CustomInputDialog customInputDialog2 = remittanceSuccessFragment.MediaBrowserCompat$SearchResultReceiver;
            if (customInputDialog2 != null) {
                String string = remittanceSuccessFragment.getString(R.string.favorite_invalid_character);
                customInputDialog2.mErrorTextView.setVisibility(0);
                customInputDialog2.mErrorTextView.setText(string);
            }
        }
    }

    public final void read(String str) {
        onGetStartedClick.write((Object) str, "slipFilePath");
        if (getActivity() != null) {
            ((BaseActivity) getActivity()).mo13676d_("share_slip_action");
        }
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType(ImageInfo.JPEG_MIME_TYPE);
        intent.addFlags(1);
        intent.putExtra("android.intent.extra.STREAM", Uri.parse(str));
        Intent createChooser = Intent.createChooser(intent, getString(R.string.share_slip));
        AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
        try {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                createChooser = setTapText.write(activity, createChooser).read();
            }
            MyECouponActivity_ViewBinding.write write2 = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivity(Intent), modified: ");
            sb.append(createChooser.getData());
            sb.append("\n with context ");
            sb.append(activity.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write2, sb.toString());
            startActivity(createChooser);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final void MediaBrowserCompat$ItemReceiver(setImportance setimportance) {
        String str;
        onGetStartedClick.write((Object) setimportance, "successDisplay");
        boolean z = setimportance.MediaBrowserCompat$SearchResultReceiver;
        String str2 = setimportance.PlaybackStateCompat;
        String str3 = setimportance.ParcelableVolumeInfo;
        TextView textView = this.textViewTransactionDate;
        if (textView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("textViewTransactionDate");
        }
        textView.setText(str2);
        TextView textView2 = this.textViewRefId;
        if (textView2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("textViewRefId");
        }
        textView2.setText(str3);
        if (z) {
            TextView textView3 = this.textViewSuccessfulHeaderTitle;
            if (textView3 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("textViewSuccessfulHeaderTitle");
            }
            textView3.setText(getString(R.string.remittance_request_success_header_title));
            textView3.setTextColor(setLastBaselineToBottomHeight.read(textView3.getContext(), R.color.f67182131099874));
            ImageView imageView = this.pendingIcon;
            if (imageView == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("pendingIcon");
            }
            imageView.setImageDrawable(setLastBaselineToBottomHeight.write(imageView.getContext(), R.drawable.timer));
            imageView.setColorFilter(setLastBaselineToBottomHeight.read(imageView.getContext(), R.color.f67182131099874));
            TextView textView4 = this.textViewTransactionRemark;
            if (textView4 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("textViewTransactionRemark");
            }
            textView4.setVisibility(0);
        } else {
            TextView textView5 = this.textViewTransactionRemark;
            if (textView5 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("textViewTransactionRemark");
            }
            textView5.setVisibility(8);
        }
        setOverflowCount setoverflowcount = setimportance.read;
        write().setVisibility(0);
        write().setSourceName(setoverflowcount.MediaBrowserCompat$CustomActionResultReceiver);
        write().setDivider(false);
        CustomTransferAndPaySource write2 = write();
        if (setoverflowcount.write.length() > 0) {
            str = setoverflowcount.write;
        } else {
            str = setoverflowcount.read;
        }
        write2.setAccountNumber(str);
        CustomTransferAndPaySource write3 = write();
        String str4 = setoverflowcount.MediaBrowserCompat$ItemReceiver;
        String str5 = "";
        if (str4 == null) {
            str4 = str5;
        }
        write3.setAvatar(str4);
        MediaBrowserCompat$CustomActionResultReceiver().setVisibility(0);
        MediaBrowserCompat$CustomActionResultReceiver().setFullDivider(true);
        MediaBrowserCompat$CustomActionResultReceiver().setTargetName(setimportance.write.read);
        MediaBrowserCompat$CustomActionResultReceiver().setReferenceNumbers(setimportance.write.IconCompatParcelizer);
        MediaBrowserCompat$CustomActionResultReceiver().setReferenceNo1(setimportance.write.write);
        CustomTransferAndPayTarget MediaBrowserCompat$CustomActionResultReceiver2 = MediaBrowserCompat$CustomActionResultReceiver();
        String str6 = setimportance.write.MediaBrowserCompat$CustomActionResultReceiver;
        if (str6 != null) {
            str5 = str6;
        }
        MediaBrowserCompat$CustomActionResultReceiver2.setAvatar(str5, R.drawable.bankicon_remittance);
        if (!z) {
            MediaBrowserCompat$CustomActionResultReceiver().setAddFavoriteButtonVisible(false);
            CustomTransferAndPayTarget MediaBrowserCompat$CustomActionResultReceiver3 = MediaBrowserCompat$CustomActionResultReceiver();
            MediaBrowserCompat$CustomActionResultReceiver3.mFavouriteIcon.setVisibility(8);
            MediaBrowserCompat$CustomActionResultReceiver3.mFavouriteName.setVisibility(8);
        } else if (setimportance.RatingCompat) {
            String str7 = setimportance.MediaMetadataCompat;
            if (str7 != null && !TextUtils.isEmpty(str7)) {
                MediaBrowserCompat$CustomActionResultReceiver().setFavoriteName(str7);
            }
        } else {
            MediaBrowserCompat$CustomActionResultReceiver().setAddFavoriteButtonVisible(true);
        }
        View view = this.amountsSeparatorSpace;
        if (view == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("amountsSeparatorSpace");
        }
        view.setVisibility(8);
        IconCompatParcelizer().setFullDivider(true);
        RatingCompat();
        write(setimportance);
    }
}
