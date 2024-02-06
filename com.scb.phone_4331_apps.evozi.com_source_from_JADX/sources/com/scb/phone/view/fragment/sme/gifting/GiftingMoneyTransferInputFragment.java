package com.scb.phone.view.fragment.sme.gifting;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.google.android.material.textfield.TextInputLayout;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.activity.sme.gifting.GiftingMoneyReviewActivity;
import com.scb.phone.view.activity.sme.gifting.GiftingSelectRecipientActivity;
import com.scb.phone.view.custom.common.AmountEditText;
import com.scb.phone.view.custom.common.AmountEditText$MediaBrowserCompat$ItemReceiver;
import com.scb.phone.view.fragment.transferandpay.AccountSourceSelectFragment;
import com.thunderhead.android.aspects.AndroidXSupportFragmentIntentTidInjectionAspect;
import java.util.regex.Pattern;
import p040o.ActivityBuilder_ContributeRemittanceInputActivity;
import p040o.ActivityBuilder_ContributeRemittanceOtpActivity;
import p040o.AutoValue_CrashlyticsReport_Session_OperatingSystem;
import p040o.C10005hZ;
import p040o.C10110q;
import p040o.C4736hW;
import p040o.C4788ia;
import p040o.C5165qJ;
import p040o.CardView;
import p040o.CheckParameters_MembersInjector$MediaBrowserCompat$ItemReceiver;
import p040o.CrashlyticsReport;
import p040o.CrashlyticsReportJsonTransform$$Lambda$4;
import p040o.FragmentBuilder_BindEasycashContactInformationFragment;
import p040o.HmlPinActivity;
import p040o.IGoogleMapDelegate;
import p040o.MyECouponActivity_ViewBinding;
import p040o.SquareCap;
import p040o.StreetViewSource;
import p040o.getICheckDeserializerRtti;
import p040o.getSteadyMsg;
import p040o.removeIfFromRandomAccessList;
import p040o.setInstructionOverlay;
import p040o.setSteadyMsg;
import p040o.setTapText;
import p040o.setUuidFromUtf8Bytes;
import p040o.showFocusAreas;
import p040o.showFocusAreas$MediaBrowserCompat$ItemReceiver;
import p040o.tryExpireEntries;

public class GiftingMoneyTransferInputFragment extends BaseGiftTransferInputFragment implements CheckParameters_MembersInjector$MediaBrowserCompat$ItemReceiver, AccountSourceSelectFragment.write {
    @BindView
    ViewGroup giftLimitProgress;
    @HmlPinActivity
    public showFocusAreas giftingTransferInputPresenter;
    @BindView
    public TextInputLayout mAmountInputLayout;
    @BindView
    public AmountEditText mAmountValue;
    @BindView
    TextView mRemainingLimit;

    public final /* synthetic */ void MediaSessionCompat$ResultReceiverWrapper() {
    }

    /* renamed from: c_ */
    public final void mo13978c_(boolean z) {
    }

    public static GiftingMoneyTransferInputFragment write(AutoValue_CrashlyticsReport_Session_OperatingSystem.C30991 r2) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("GIFT_TRANSFER_DISPLAY", r2);
        GiftingMoneyTransferInputFragment giftingMoneyTransferInputFragment = new GiftingMoneyTransferInputFragment();
        giftingMoneyTransferInputFragment.setArguments(bundle);
        return giftingMoneyTransferInputFragment;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        this.giftingTransferInputPresenter.MediaBrowserCompat$ItemReceiver(this);
        showFocusAreas showfocusareas = this.giftingTransferInputPresenter;
        AutoValue_CrashlyticsReport_Session_OperatingSystem.C30991 r3 = (AutoValue_CrashlyticsReport_Session_OperatingSystem.C30991) getArguments().getParcelable("GIFT_TRANSFER_DISPLAY");
        showfocusareas.MediaBrowserCompat$ItemReceiver = r3;
        if (showfocusareas.RatingCompat != null) {
            C4736hW hWVar = new C4736hW(r3);
            if (showfocusareas.RatingCompat != null) {
                hWVar.IconCompatParcelizer(showfocusareas.RatingCompat);
            }
        }
        CardView read = getChildFragmentManager().read();
        CrashlyticsReport.FilesPayload.File.write write = new CrashlyticsReport.FilesPayload.File.write(CrashlyticsReportJsonTransform$$Lambda$4.TRANSFER_FUNCTION);
        write.MediaBrowserCompat$ItemReceiver = false;
        write.IconCompatParcelizer = true;
        write.MediaDescriptionCompat = true;
        write.RatingCompat = true;
        read.MediaBrowserCompat$ItemReceiver(R.id.fragment_account_source_select, AccountSourceSelectFragment.read(new CrashlyticsReport.FilesPayload.File(write, (byte) 0))).write();
        this.mAmountValue.setOnAmountChangeListener(new AmountEditText.read() {
            public final void MediaBrowserCompat$CustomActionResultReceiver(double d) {
            }

            public final void MediaBrowserCompat$CustomActionResultReceiver() {
                GiftingMoneyTransferInputFragment.this.noteEditText.requestFocus();
            }
        });
        this.mAmountValue.setCustomHint(getString(R.string.transfer_to_account_amount_hint), this.mAmountInputLayout);
        this.mAmountInputLayout.setHintEnabled(false);
        AmountEditText amountEditText = this.mAmountValue;
        amountEditText.setCurrencyFormattingTextWatcher(new FragmentBuilder_BindEasycashContactInformationFragment(amountEditText, this.mAmountInputLayout, 9.9999999999E8d, 0.0d, getResources().getString(R.string.error_limit), getResources().getString(R.string.not_enough_funds_on_selected_account), getResources().getString(R.string.invalid_amount_transfer_input)));
        this.mAmountValue.setHandleDismissKeyboard(new ActivityBuilder_ContributeRemittanceOtpActivity(this));
        this.mAmountValue.setOnFocusChangeListener(new ActivityBuilder_ContributeRemittanceInputActivity(this));
        return onCreateView;
    }

    /* access modifiers changed from: protected */
    public final View IconCompatParcelizer(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.f87632131493990, viewGroup, false);
        ButterKnife.IconCompatParcelizer(this, inflate);
        this.mAmountValue.setOnPasteListener(new AmountEditText$MediaBrowserCompat$ItemReceiver());
        return inflate;
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(double d) {
        this.mAmountValue.setAvailableBalanceCurrencyFormattingTextWatcher(d);
    }

    /* access modifiers changed from: protected */
    public final void IconCompatParcelizer(AutoValue_CrashlyticsReport_Session_OperatingSystem.Builder builder) {
        String str;
        showFocusAreas showfocusareas = this.giftingTransferInputPresenter;
        showfocusareas.IconCompatParcelizer = builder;
        boolean z = true;
        if (builder != null) {
            if (showfocusareas.RatingCompat != null) {
                C4788ia iaVar = new C4788ia(builder);
                if (showfocusareas.RatingCompat != null) {
                    iaVar.IconCompatParcelizer(showfocusareas.RatingCompat);
                }
                getSteadyMsg getsteadymsg = getSteadyMsg.read;
                if (showfocusareas.RatingCompat == null) {
                    z = false;
                }
                if (z) {
                    getsteadymsg.IconCompatParcelizer(showfocusareas.RatingCompat);
                }
            }
            StreetViewSource streetViewSource = showfocusareas.MediaBrowserCompat$SearchResultReceiver;
            if (getICheckDeserializerRtti.MediaBrowserCompat$ItemReceiver(IGoogleMapDelegate.SCB).equalsIgnoreCase(builder.MediaBrowserCompat$MediaItem)) {
                str = "SCB";
            } else {
                str = getICheckDeserializerRtti.MediaBrowserCompat$ItemReceiver(IGoogleMapDelegate.PROMPTPAY).equalsIgnoreCase(builder.MediaBrowserCompat$MediaItem) ? "PROMPTPAY" : builder.MediaBrowserCompat$MediaItem;
            }
            streetViewSource.MediaBrowserCompat$ItemReceiver(str);
            showfocusareas.MediaBrowserCompat$SearchResultReceiver.IconCompatParcelizer(new showFocusAreas.read(showfocusareas, (byte) 0));
            return;
        }
        if (showfocusareas.RatingCompat != null) {
            C5165qJ qJVar = C5165qJ.MediaBrowserCompat$CustomActionResultReceiver;
            if (showfocusareas.RatingCompat == null) {
                z = false;
            }
            if (z) {
                qJVar.IconCompatParcelizer(showfocusareas.RatingCompat);
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void MediaBrowserCompat$SearchResultReceiver() {
        String str;
        showFocusAreas showfocusareas = this.giftingTransferInputPresenter;
        boolean z = true;
        boolean z2 = !this.mAmountInputLayout.MediaBrowserCompat$MediaItem.IconCompatParcelizer;
        String obj = this.mAmountValue.getText().toString();
        boolean isEnabled = this.sendGiftButton.isEnabled();
        if (showfocusareas.RatingCompat != null) {
            if (isEnabled != (z2 && (str = showfocusareas.write) != null && !str.isEmpty() && showfocusareas.IconCompatParcelizer != null && !TextUtils.isEmpty(obj))) {
                setInstructionOverlay setinstructionoverlay = setInstructionOverlay.read;
                if (showfocusareas.RatingCompat == null) {
                    z = false;
                }
                if (z) {
                    setinstructionoverlay.IconCompatParcelizer(showfocusareas.RatingCompat);
                }
            }
        }
    }

    public final void read(String str) {
        this.mRemainingLimit.setVisibility(0);
        this.mRemainingLimit.setText(str);
        this.customSelectAccountGift.requestFocus();
    }

    public final void IconCompatParcelizer() {
        this.mRemainingLimit.setVisibility(0);
        this.mRemainingLimit.setText(getString(R.string.custom_error_title));
        this.customSelectAccountGift.requestFocus();
    }

    /* access modifiers changed from: protected */
    public final void RatingCompat() {
        boolean z;
        showFocusAreas showfocusareas = this.giftingTransferInputPresenter;
        String obj = this.mAmountValue.getText().toString();
        String obj2 = this.noteEditText.mNoteEditText.getText().toString();
        boolean z2 = false;
        if (TextUtils.isEmpty(obj2) || Pattern.compile("^(?=\\S)[0-9a-zA-Z\\u0E00-\\u0E3E\\u0E40-\\u0E7F _*'\"#&*()@\\-]+$").matcher(obj2).matches()) {
            z = true;
        } else {
            if (showfocusareas.RatingCompat != null) {
                setSteadyMsg setsteadymsg = setSteadyMsg.MediaBrowserCompat$CustomActionResultReceiver;
                if (showfocusareas.RatingCompat != null) {
                    setsteadymsg.IconCompatParcelizer(showfocusareas.RatingCompat);
                }
            }
            z = false;
        }
        if (z) {
            if (!TextUtils.isEmpty(obj) && showfocusareas.write != null) {
                if (showfocusareas.RatingCompat != null) {
                    z2 = true;
                }
                if (z2) {
                    showfocusareas.RatingCompat.AlertController$RecycleListView();
                }
                SquareCap squareCap = showfocusareas.MediaBrowserCompat$MediaItem;
                tryExpireEntries MediaBrowserCompat$CustomActionResultReceiver = tryExpireEntries.MediaBrowserCompat$CustomActionResultReceiver();
                MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver = showfocusareas.write;
                MediaBrowserCompat$CustomActionResultReceiver.read = removeIfFromRandomAccessList.read(getICheckDeserializerRtti.MediaBrowserCompat$ItemReceiver(obj).doubleValue());
                MediaBrowserCompat$CustomActionResultReceiver.MediaDescriptionCompat = showfocusareas.IconCompatParcelizer.MediaBrowserCompat$MediaItem;
                MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer = String.valueOf(showfocusareas.MediaBrowserCompat$ItemReceiver.RatingCompat);
                MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$MediaItem = obj2;
                if (showfocusareas.IconCompatParcelizer.MediaBrowserCompat$MediaItem.equalsIgnoreCase(getICheckDeserializerRtti.MediaBrowserCompat$ItemReceiver(IGoogleMapDelegate.PROMPTPAY))) {
                    MediaBrowserCompat$CustomActionResultReceiver.MediaMetadataCompat = showfocusareas.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver;
                    MediaBrowserCompat$CustomActionResultReceiver.RatingCompat = showfocusareas.IconCompatParcelizer.MediaDescriptionCompat;
                } else {
                    MediaBrowserCompat$CustomActionResultReceiver.write = showfocusareas.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver;
                    MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver = showfocusareas.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver;
                }
                squareCap.read(MediaBrowserCompat$CustomActionResultReceiver);
                showfocusareas.MediaBrowserCompat$MediaItem.IconCompatParcelizer(new showFocusAreas$MediaBrowserCompat$ItemReceiver(showfocusareas, showfocusareas.MediaBrowserCompat$ItemReceiver, showfocusareas.write, showfocusareas.IconCompatParcelizer, obj, obj2));
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onPreviewButtonClicked() {
        ((BaseActivity) getActivity()).mo13676d_("gifting_input_preview");
        showFocusAreas showfocusareas = this.giftingTransferInputPresenter;
        String obj = this.noteEditText.mNoteEditText.getText().toString();
        boolean z = true;
        if (showfocusareas.RatingCompat != null) {
            C10005hZ hZVar = new C10005hZ(showfocusareas, obj);
            if (showfocusareas.RatingCompat == null) {
                z = false;
            }
            if (z) {
                hZVar.IconCompatParcelizer(showfocusareas.RatingCompat);
            }
        }
    }

    public void onDestroy() {
        super.onDestroy();
        this.giftingTransferInputPresenter.onDestroy();
        if (this.IconCompatParcelizer != null && !this.IconCompatParcelizer.isDisposed()) {
            this.IconCompatParcelizer.dispose();
        }
    }

    public final void read() {
        ViewGroup viewGroup = this.giftLimitProgress;
        if (viewGroup != null) {
            viewGroup.setVisibility(0);
        }
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        ViewGroup viewGroup = this.giftLimitProgress;
        if (viewGroup != null) {
            viewGroup.setVisibility(8);
        }
    }

    public final void MediaBrowserCompat$MediaItem() {
        Intent intent = new Intent(getActivity(), GiftingSelectRecipientActivity.class);
        intent.putExtra("RECIPIENT_TYPE", "money");
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

    public final void read(setUuidFromUtf8Bytes setuuidfromutf8bytes) {
        GiftingMoneyReviewActivity.MediaBrowserCompat$ItemReceiver(getActivity(), setuuidfromutf8bytes);
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(CrashlyticsReport.FilesPayload.File.Builder builder) {
        if (builder != null) {
            showFocusAreas showfocusareas = this.giftingTransferInputPresenter;
            String str = builder.MediaSessionCompat$Token;
            double doubleValue = builder.MediaBrowserCompat$CustomActionResultReceiver.doubleValue();
            showfocusareas.write = str;
            boolean z = true;
            if (showfocusareas.RatingCompat != null) {
                C10110q.C5160a aVar = new C10110q.C5160a(doubleValue);
                if (showfocusareas.RatingCompat == null) {
                    z = false;
                }
                if (z) {
                    aVar.IconCompatParcelizer(showfocusareas.RatingCompat);
                }
            }
        }
    }
}
