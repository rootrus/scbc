package com.scb.phone.view.fragment.easycash;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.scb.phone.R;
import com.scb.phone.view.activity.easycash.EasycashReferralSendDfwActivity;
import com.scb.phone.view.activity.easycash.NTBEasycashLandingActivity;
import com.scb.phone.view.activity.easycash.NTBEasycashReferralSendProductActivity;
import com.scb.phone.view.custom.common.DefaultButton;
import com.scb.phone.view.custom.common.InputText;
import com.scb.phone.view.fragment.BaseFragment;
import p040o.BarCodeReader;
import p040o.CheckExtractActivity_MembersInjector;
import p040o.CrashlyticsBackgroundWorker;
import p040o.CustomConcurrentHashMap;
import p040o.HmlPinActivity;
import p040o.ImageClassificationResult;
import p040o.ImageClassificationResult$MediaBrowserCompat$ItemReceiver;
import p040o.MyECouponActivity_ViewBinding;
import p040o.PrepaidActivationService;
import p040o.promptpayVerifyCode;
import p040o.putConsentDocument;
import p040o.sendOperatingAccount;
import p040o.sendPromptPayCode;
import p040o.setAllowCollapse;
import p040o.setLastBaselineToBottomHeight;
import p040o.setMaxBarcodes;
import p040o.setPreviousEvictable;
import p040o.setTapText;
import p040o.setupNTBPin;
import p040o.submitTask;

public class LoanRequestorFragment extends BaseFragment implements CheckExtractActivity_MembersInjector.setTitle {
    @BindView
    InputText currentAddress;
    @BindView
    InputText firstName;
    @BindView
    InputText lastName;
    @BindView
    DefaultButton nextButton;
    @BindView
    InputText officeAddress;
    @HmlPinActivity
    public ImageClassificationResult presenter;
    @BindView
    TextView tvPrivacyNotice;
    @BindView
    LinearLayout vPrivacyNotice;

    public static final /* synthetic */ void write(Fragment fragment, Intent intent) {
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
            ((LoanRequestorFragment) fragment).startActivity(intent);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static LoanRequestorFragment write(submitTask submittask) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.scb.phone.EXTRA_DISPLAY", submittask);
        LoanRequestorFragment loanRequestorFragment = new LoanRequestorFragment();
        loanRequestorFragment.setArguments(bundle);
        return loanRequestorFragment;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.f87062131493933, viewGroup, false);
        ButterKnife.IconCompatParcelizer(this, inflate);
        this.presenter.MediaBrowserCompat$ItemReceiver(this);
        this.firstName.setOnInputChangeListener(new setupNTBPin(this));
        this.lastName.setOnInputChangeListener(new sendPromptPayCode(this));
        this.currentAddress.setOnInputChangeListener(new sendOperatingAccount(this));
        boolean z = true;
        this.currentAddress.setImeOptions(1);
        this.officeAddress.setOnInputChangeListener(new putConsentDocument(this));
        this.officeAddress.setImeOptions(1);
        if (!(getArguments() == null || getArguments().getParcelable("com.scb.phone.EXTRA_DISPLAY") == null)) {
            submitTask submittask = (submitTask) getArguments().getParcelable("com.scb.phone.EXTRA_DISPLAY");
            ImageClassificationResult imageClassificationResult = this.presenter;
            imageClassificationResult.read = submittask;
            BarCodeReader.Direction direction = new BarCodeReader.Direction(submittask);
            if (imageClassificationResult.RatingCompat != null) {
                direction.IconCompatParcelizer(imageClassificationResult.RatingCompat);
            }
            if (imageClassificationResult.RatingCompat == null) {
                z = false;
            }
            if (z) {
                imageClassificationResult.RatingCompat.AlertController$RecycleListView();
            }
            CustomConcurrentHashMap.ReferenceEntry.read read = new CustomConcurrentHashMap.ReferenceEntry.read();
            read.IconCompatParcelizer = imageClassificationResult.read.MediaBrowserCompat$ItemReceiver.MediaDescriptionCompat;
            imageClassificationResult.write.MediaBrowserCompat$CustomActionResultReceiver(new CustomConcurrentHashMap.ReferenceEntry(read, (byte) 0));
            imageClassificationResult.write.IconCompatParcelizer(new ImageClassificationResult$MediaBrowserCompat$ItemReceiver(imageClassificationResult, (byte) 0));
        }
        return inflate;
    }

    public final void write(String str) {
        this.firstName.setText(str);
    }

    public final void read(String str) {
        this.lastName.setText(str);
    }

    public final void MediaBrowserCompat$ItemReceiver(CrashlyticsBackgroundWorker.C32142 r3) {
        this.tvPrivacyNotice.setText(setAllowCollapse.write(r3.IconCompatParcelizer, 0));
        this.tvPrivacyNotice.setMovementMethod(new PrepaidActivationService(new promptpayVerifyCode(this)));
    }

    public final void read() {
        this.vPrivacyNotice.setVisibility(8);
    }

    public final void MediaBrowserCompat$ItemReceiver(boolean z) {
        this.nextButton.setButtonEnabled(z);
    }

    public final void MediaBrowserCompat$SearchResultReceiver() {
        this.firstName.read(getString(R.string.incomplete_information));
    }

    public final void RatingCompat() {
        this.firstName.read(getString(R.string.easycash_loan_requestor_name_error));
    }

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public final void mo16217x50fd9e4a() {
        this.lastName.read(getString(R.string.incomplete_information));
    }

    public final void MediaSessionCompat$Token() {
        this.lastName.read(getString(R.string.easycash_loan_requestor_name_error));
    }

    public final void MediaBrowserCompat$MediaItem() {
        this.currentAddress.read(getString(R.string.incomplete_information));
    }

    public final void MediaMetadataCompat() {
        this.currentAddress.read(getString(R.string.easycash_invalid_format));
    }

    public final void MediaSessionCompat$ResultReceiverWrapper() {
        this.officeAddress.read(getString(R.string.incomplete_information));
    }

    public final void MediaSessionCompat$QueueItem() {
        this.officeAddress.read(getString(R.string.easycash_invalid_format));
    }

    public final void write() {
        InputText inputText = this.firstName;
        inputText.errorText.setVisibility(8);
        inputText.inputEditText.setBackground(setLastBaselineToBottomHeight.write(inputText.getContext(), R.drawable.shape_gray_rounded_rectangle));
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        InputText inputText = this.lastName;
        inputText.errorText.setVisibility(8);
        inputText.inputEditText.setBackground(setLastBaselineToBottomHeight.write(inputText.getContext(), R.drawable.shape_gray_rounded_rectangle));
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        InputText inputText = this.currentAddress;
        inputText.errorText.setVisibility(8);
        inputText.inputEditText.setBackground(setLastBaselineToBottomHeight.write(inputText.getContext(), R.drawable.shape_gray_rounded_rectangle));
    }

    public final void IconCompatParcelizer() {
        InputText inputText = this.officeAddress;
        inputText.errorText.setVisibility(8);
        inputText.inputEditText.setBackground(setLastBaselineToBottomHeight.write(inputText.getContext(), R.drawable.shape_gray_rounded_rectangle));
    }

    @OnClick
    public void onClick() {
        ImageClassificationResult imageClassificationResult = this.presenter;
        if (imageClassificationResult.RatingCompat != null) {
            imageClassificationResult.RatingCompat.AlertController$RecycleListView();
        }
        setPreviousEvictable.read read = new setPreviousEvictable.read();
        read.read = imageClassificationResult.IconCompatParcelizer.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver();
        read.MediaBrowserCompat$MediaItem = imageClassificationResult.read.MediaBrowserCompat$ItemReceiver.MediaDescriptionCompat;
        read.MediaBrowserCompat$CustomActionResultReceiver = imageClassificationResult.read.MediaBrowserCompat$CustomActionResultReceiver;
        read.write = imageClassificationResult.read.IconCompatParcelizer;
        read.MediaBrowserCompat$ItemReceiver = imageClassificationResult.read.read;
        read.IconCompatParcelizer = imageClassificationResult.read.MediaDescriptionCompat;
        imageClassificationResult.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver(new setPreviousEvictable(read, (byte) 0));
        imageClassificationResult.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer(new ImageClassificationResult.write(imageClassificationResult, (byte) 0));
    }

    public final void read(CrashlyticsBackgroundWorker.C32131 r2) {
        NTBEasycashReferralSendProductActivity.read(getContext(), r2);
    }

    public final void MediaBrowserCompat$ItemReceiver(CrashlyticsBackgroundWorker.C32131 r2) {
        EasycashReferralSendDfwActivity.MediaBrowserCompat$ItemReceiver(getContext(), r2);
    }

    public final void MediaDescriptionCompat() {
        NTBEasycashLandingActivity.MediaBrowserCompat$ItemReceiver(getContext());
    }

    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        ImageClassificationResult imageClassificationResult = this.presenter;
        setMaxBarcodes setmaxbarcodes = setMaxBarcodes.MediaBrowserCompat$CustomActionResultReceiver;
        if (imageClassificationResult.RatingCompat != null) {
            setmaxbarcodes.IconCompatParcelizer(imageClassificationResult.RatingCompat);
        }
    }

    public void onDestroy() {
        super.onDestroy();
        this.presenter.onDestroy();
    }
}
