package com.scb.phone.view.fragment.fastpay;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.google.android.material.textfield.TextInputLayout;
import com.scb.phone.R;
import com.scb.phone.view.activity.HomeActivity;
import com.scb.phone.view.activity.fastpay.FastPayBillPaymentReviewActivity;
import com.scb.phone.view.activity.fastpay.FastPayTransferReviewActivity;
import com.scb.phone.view.activity.prelogin.PinLoginActivity;
import com.scb.phone.view.activity.transferandpay.billpayment.BillPaymentReviewActivity;
import com.scb.phone.view.activity.transferandpay.transfer.TransferReviewActivity;
import com.scb.phone.view.custom.common.AmountEditText;
import com.scb.phone.view.custom.common.AmountEditText$MediaBrowserCompat$ItemReceiver;
import com.scb.phone.view.custom.common.CustomDialog;
import com.scb.phone.view.custom.common.NoteEditText;
import com.scb.phone.view.custom.transferandpay.CustomTransferAndPayItem;
import com.scb.phone.view.custom.transferandpay.CustomTransferAndPaySource;
import com.scb.phone.view.custom.transferandpay.CustomTransferAndPayTarget;
import com.scb.phone.view.fragment.transferandpay.BaseDuplicatedTransferFragment;
import com.thunderhead.android.aspects.AndroidXSupportFragmentIntentTidInjectionAspect;
import p040o.CrashlyticsReport;
import p040o.DeepLinkModule_ContributePartnerAuthorizationDeepLinkActivity;
import p040o.DeepLinkModule_ContributePartnerInAppLoginDeepLinkActivity;
import p040o.DeepLinkModule_ContributePayNowTransactionsDeepLinkActivity;
import p040o.DeepLinkModule_ContributePlanetScbCardDeepLinkActivity;
import p040o.DeepLinkModule_ContributePrepaidTravelCardDeepLinkActivity;
import p040o.HmlPinActivity;
import p040o.IGoogleMapDelegate;
import p040o.LogFileManager;
import p040o.MyECouponActivity_ViewBinding;
import p040o.StreetViewPanoramaFragment;
import p040o.getICheckDeserializerRtti;
import p040o.getIpVersion;
import p040o.nativeWriteImageToFileBuffer;
import p040o.newCheckExtractor;
import p040o.setTapText;
import p040o.setUuidFromUtf8Bytes;

public class FastPayInputFragment extends BaseDuplicatedTransferFragment implements newCheckExtractor.IconCompatParcelizer {
    private write IconCompatParcelizer;
    public Double MediaBrowserCompat$CustomActionResultReceiver;
    @BindView
    protected CustomTransferAndPaySource accountFrom;
    @BindView
    protected CustomTransferAndPayTarget accountTo;
    @BindView
    protected LinearLayout amountInputLayout;
    @BindView
    protected CustomTransferAndPayItem amountItem;
    @BindView
    protected Button buttonReview;
    @BindView
    protected AmountEditText editAmount;
    @HmlPinActivity
    public nativeWriteImageToFileBuffer fastPayInputPresenter;
    @BindView
    protected TextInputLayout inputLayout;
    @BindView
    protected NoteEditText noteEditText;
    @BindView
    protected TextView remainingLimit;
    @BindView
    protected TextView remainingLimitError;
    @BindView
    protected LinearLayout remainingLimitLinearLayout;
    @BindView
    protected TextView textRemainingLimit;

    public interface write {
        void MediaBrowserCompat$ItemReceiver(CrashlyticsReport.Session.Event.Application.Execution execution, StreetViewPanoramaFragment.zzb zzb, String str, LogFileManager.C35981 r4);

        void read(StreetViewPanoramaFragment.zzb zzb, String str);
    }

    private static final /* synthetic */ void read(Fragment fragment, Intent intent) {
        try {
            FragmentActivity activity = fragment.getActivity();
            if (activity != null) {
                intent = setTapText.write(activity, intent).read();
            }
            MyECouponActivity_ViewBinding.write write2 = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivity(Intent), modified: ");
            sb.append(intent.getData());
            sb.append("\n with context ");
            sb.append(activity.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write2, sb.toString());
            ((FastPayInputFragment) fragment).startActivity(intent);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    private static final /* synthetic */ void write(Fragment fragment, Intent intent) {
        try {
            FragmentActivity activity = fragment.getActivity();
            if (activity != null) {
                intent = setTapText.write(activity, intent).read();
            }
            MyECouponActivity_ViewBinding.write write2 = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivity(Intent), modified: ");
            sb.append(intent.getData());
            sb.append("\n with context ");
            sb.append(activity.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write2, sb.toString());
            ((FastPayInputFragment) fragment).startActivity(intent);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static FastPayInputFragment IconCompatParcelizer(CrashlyticsReport.Session.Event.Application.Execution.Signal.Builder builder, boolean z) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.scb.phone.EXTRA_FASTPAY_DISPLAY", builder);
        bundle.putBoolean("com.scb.phone.EXTRA_FASTPAY_FROM_SCAN_DEEP_LINK", z);
        FastPayInputFragment fastPayInputFragment = new FastPayInputFragment();
        fastPayInputFragment.setArguments(bundle);
        return fastPayInputFragment;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.f87402131493967, viewGroup, false);
        ButterKnife.IconCompatParcelizer(this, inflate);
        this.fastPayInputPresenter.MediaBrowserCompat$ItemReceiver(this);
        Bundle arguments = getArguments();
        CrashlyticsReport.Session.Event.Application.Execution.Signal.Builder builder = arguments != null ? (CrashlyticsReport.Session.Event.Application.Execution.Signal.Builder) arguments.getParcelable("com.scb.phone.EXTRA_FASTPAY_DISPLAY") : null;
        boolean z = true;
        boolean z2 = arguments != null && arguments.getBoolean("com.scb.phone.EXTRA_FASTPAY_FROM_SCAN_DEEP_LINK", false);
        if (builder != null) {
            this.fastPayInputPresenter.MediaMetadataCompat = z2;
            nativeWriteImageToFileBuffer nativewriteimagetofilebuffer = this.fastPayInputPresenter;
            if (nativewriteimagetofilebuffer.RatingCompat != null) {
                nativewriteimagetofilebuffer.RatingCompat.AlertController$RecycleListView();
            }
            nativewriteimagetofilebuffer.MediaDescriptionCompat = builder;
            nativewriteimagetofilebuffer.MediaBrowserCompat$ItemReceiver.write();
            nativewriteimagetofilebuffer.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer(new nativeWriteImageToFileBuffer.read(builder));
            nativeWriteImageToFileBuffer nativewriteimagetofilebuffer2 = this.fastPayInputPresenter;
            getIpVersion getipversion = getIpVersion.MediaBrowserCompat$ItemReceiver;
            if (nativewriteimagetofilebuffer2.RatingCompat == null) {
                z = false;
            }
            if (z) {
                getipversion.IconCompatParcelizer(nativewriteimagetofilebuffer2.RatingCompat);
            }
            nativewriteimagetofilebuffer2.IconCompatParcelizer.IconCompatParcelizer("FASTPAY", "ALL");
            nativewriteimagetofilebuffer2.IconCompatParcelizer.IconCompatParcelizer(new nativeWriteImageToFileBuffer.IconCompatParcelizer(nativewriteimagetofilebuffer2, (byte) 0));
            this.MediaBrowserCompat$CustomActionResultReceiver = Double.valueOf(builder.read);
        }
        this.buttonReview.setEnabled(false);
        return inflate;
    }

    public final void IconCompatParcelizer(String str) {
        this.accountFrom.setAvatar(getICheckDeserializerRtti.write(getContext(), (int) R.drawable.bankicon_scb).toString());
        this.accountFrom.setRightSpace(50);
        this.accountFrom.setSourceName(str);
        this.accountFrom.mAccountNumberTextView.setVisibility(8);
        this.accountFrom.setOnClickListener(new DeepLinkModule_ContributePartnerInAppLoginDeepLinkActivity(this));
    }

    public final void IconCompatParcelizer(CrashlyticsReport.Session.Event.Application.Execution execution) {
        this.accountTo.setAvatar(execution.MediaBrowserCompat$CustomActionResultReceiver());
        this.accountTo.setTargetName(execution.read());
        this.accountTo.setReferenceNumbers(execution.MediaDescriptionCompat);
        this.accountTo.setReferenceNo1(getString(R.string.ebill_selected_reference, execution.setIcon, execution.setPopupCallback));
    }

    public final void IconCompatParcelizer(String str, int i) {
        this.accountTo.setAvatar(getICheckDeserializerRtti.write(getContext(), i).toString());
        this.accountTo.setTargetName(str);
        this.accountTo.setReferenceNumbersVisible(false);
    }

    public final void MediaBrowserCompat$ItemReceiver(CrashlyticsReport.Session.Event.Application.Execution execution) {
        this.accountTo.setReferenceNo2(getString(R.string.ebill_selected_reference, execution.setPadding, execution.setGroupDividerEnabled));
    }

    public final void read(CrashlyticsReport.Session.Event.Application.Execution execution) {
        this.accountTo.setReferenceNo3(getString(R.string.ebill_selected_reference, execution.setItemInvoker, execution.ExpandedMenuView));
    }

    public final void MediaBrowserCompat$SearchResultReceiver() {
        super.Keep();
        write(false);
    }

    public final void MediaBrowserCompat$MediaItem() {
        this.textRemainingLimit.setText(R.string.limit_not_available);
        write(true);
    }

    public final void IconCompatParcelizer() {
        super.ay_();
    }

    public final void write(String str) {
        this.textRemainingLimit.setText(getString(R.string.remaining_fastpay_limit, str));
        write(true);
    }

    private void write(boolean z) {
        int i = 0;
        this.remainingLimitLinearLayout.setVisibility(z ? 0 : 8);
        this.remainingLimitError.setVisibility(z ? 8 : 0);
        this.textRemainingLimit.setVisibility(z ? 0 : 8);
        TextView textView = this.remainingLimit;
        if (!z) {
            i = 8;
        }
        textView.setVisibility(i);
    }

    public final void read(String str) {
        this.amountItem.setVisibility(0);
        this.amountItem.setValue(str);
        this.amountItem.mDividerView.setVisibility(8);
        this.amountInputLayout.setVisibility(8);
        this.buttonReview.setEnabled(true);
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        this.amountItem.setVisibility(8);
        this.amountInputLayout.setVisibility(0);
        this.editAmount.setHint(getString(R.string.transfer_to_account_amount_hint));
        this.editAmount.setOnPasteListener(new AmountEditText$MediaBrowserCompat$ItemReceiver());
        this.editAmount.setOnAmountChangeListener(new AmountEditText.read() {
            public final void MediaBrowserCompat$CustomActionResultReceiver(double d) {
                Double unused = FastPayInputFragment.this.MediaBrowserCompat$CustomActionResultReceiver = Double.valueOf(d);
                FastPayInputFragment.this.buttonReview.setEnabled(d > 0.0d);
            }

            public final void MediaBrowserCompat$CustomActionResultReceiver() {
                FastPayInputFragment.this.PlaybackStateCompat$CustomAction();
            }
        });
        this.editAmount.setMaximumDecimalDigit(17);
    }

    @OnClick
    public void onReviewButtonClick() {
        this.fastPayInputPresenter.write(this.MediaBrowserCompat$CustomActionResultReceiver.doubleValue(), this.noteEditText.mNoteEditText.getText().toString());
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(setUuidFromUtf8Bytes setuuidfromutf8bytes) {
        CustomDialog MediaBrowserCompat$ItemReceiver = CustomDialog.IconCompatParcelizer(getContext()).MediaBrowserCompat$ItemReceiver((int) R.string.credit_card_alert_information_title).MediaBrowserCompat$ItemReceiver(getString(R.string.credit_card_alert_information_description));
        CustomDialog IconCompatParcelizer2 = MediaBrowserCompat$ItemReceiver.IconCompatParcelizer(MediaBrowserCompat$ItemReceiver.read.getString(R.string.ok), new DeepLinkModule_ContributePayNowTransactionsDeepLinkActivity(this, setuuidfromutf8bytes));
        IconCompatParcelizer2.MediaBrowserCompat$ItemReceiver(IconCompatParcelizer2.read.getString(R.string.cancel), DeepLinkModule_ContributePartnerAuthorizationDeepLinkActivity.read).show();
    }

    public final void IconCompatParcelizer(setUuidFromUtf8Bytes setuuidfromutf8bytes) {
        Intent intent = new Intent(getActivity(), FastPayBillPaymentReviewActivity.class);
        intent.putExtra("com.scb.phone.EXTRA_REVIEW", setuuidfromutf8bytes);
        AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
        write((Fragment) this, intent);
    }

    public final void IconCompatParcelizer(setUuidFromUtf8Bytes setuuidfromutf8bytes, String str) {
        CustomDialog MediaBrowserCompat$ItemReceiver = CustomDialog.IconCompatParcelizer(getContext()).MediaBrowserCompat$ItemReceiver((int) R.string.credit_card_alert_information_title).MediaBrowserCompat$ItemReceiver(getString(R.string.credit_card_alert_information_description));
        CustomDialog IconCompatParcelizer2 = MediaBrowserCompat$ItemReceiver.IconCompatParcelizer(MediaBrowserCompat$ItemReceiver.read.getString(R.string.ok), new DeepLinkModule_ContributePlanetScbCardDeepLinkActivity(this, setuuidfromutf8bytes, str));
        IconCompatParcelizer2.MediaBrowserCompat$ItemReceiver(IconCompatParcelizer2.read.getString(R.string.cancel), DeepLinkModule_ContributePrepaidTravelCardDeepLinkActivity.MediaBrowserCompat$CustomActionResultReceiver).show();
    }

    public final void write(setUuidFromUtf8Bytes setuuidfromutf8bytes, String str) {
        Intent intent = new Intent(getActivity(), BillPaymentReviewActivity.class);
        intent.putExtra("com.scb.phone.EXTRA_REVIEW", setuuidfromutf8bytes);
        intent.putExtra("subtype", "bill_payment");
        intent.putExtra("source", str);
        AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
        read((Fragment) this, intent);
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(setUuidFromUtf8Bytes setuuidfromutf8bytes, IGoogleMapDelegate iGoogleMapDelegate, String str) {
        Intent intent = new Intent(getContext(), TransferReviewActivity.class);
        intent.putExtra("com.scb.phone.EXTRA_REVIEW", setuuidfromutf8bytes);
        intent.putExtra("com.scb.phone.EXTRA_TRANSFER_TYPE", iGoogleMapDelegate);
        intent.putExtra("source", str);
        AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
        try {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                intent = setTapText.write(activity, intent).read();
            }
            MyECouponActivity_ViewBinding.write write2 = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivity(Intent), modified: ");
            sb.append(intent.getData());
            sb.append("\n with context ");
            sb.append(activity.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write2, sb.toString());
            startActivity(intent);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final void read(setUuidFromUtf8Bytes setuuidfromutf8bytes, IGoogleMapDelegate iGoogleMapDelegate) {
        Intent intent = new Intent(getContext(), FastPayTransferReviewActivity.class);
        intent.putExtra("com.scb.phone.EXTRA_REVIEW", setuuidfromutf8bytes);
        intent.putExtra("com.scb.phone.EXTRA_TRANSFER_TYPE", iGoogleMapDelegate);
        AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
        try {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                intent = setTapText.write(activity, intent).read();
            }
            MyECouponActivity_ViewBinding.write write2 = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivity(Intent), modified: ");
            sb.append(intent.getData());
            sb.append("\n with context ");
            sb.append(activity.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write2, sb.toString());
            startActivity(intent);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(CrashlyticsReport.Session.Event.Application.Execution execution, StreetViewPanoramaFragment.zzb zzb, String str, LogFileManager.C35981 r5) {
        write write2 = this.IconCompatParcelizer;
        if (write2 != null) {
            write2.MediaBrowserCompat$ItemReceiver(execution, zzb, str, r5);
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(StreetViewPanoramaFragment.zzb zzb, String str) {
        write write2 = this.IconCompatParcelizer;
        if (write2 != null) {
            write2.read(zzb, str);
        }
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        Intent intent = new Intent(getActivity(), PinLoginActivity.class);
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
            startActivityForResult(intent, 7000);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final void read() {
        this.noteEditText.write();
    }

    public final void write() {
        Intent IconCompatParcelizer2 = HomeActivity.IconCompatParcelizer((Context) getActivity());
        AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
        try {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                IconCompatParcelizer2 = setTapText.write(activity, IconCompatParcelizer2).read();
            }
            MyECouponActivity_ViewBinding.write write2 = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivity(Intent), modified: ");
            sb.append(IconCompatParcelizer2.getData());
            sb.append("\n with context ");
            sb.append(activity.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write2, sb.toString());
            startActivity(IconCompatParcelizer2);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 7000 && i2 == -1) {
            this.fastPayInputPresenter.write(this.MediaBrowserCompat$CustomActionResultReceiver.doubleValue(), this.noteEditText.mNoteEditText.getText().toString());
        }
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof write) {
            this.IconCompatParcelizer = (write) context;
        }
    }

    public void onDestroy() {
        this.fastPayInputPresenter.onDestroy();
        super.onDestroy();
    }
}
