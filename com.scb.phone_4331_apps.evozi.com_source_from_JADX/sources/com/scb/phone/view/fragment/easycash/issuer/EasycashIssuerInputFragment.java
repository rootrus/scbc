package com.scb.phone.view.fragment.easycash.issuer;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.fragment.app.FragmentActivity;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.google.android.material.textfield.TextInputLayout;
import com.scb.phone.R;
import com.scb.phone.view.activity.easycash.EasycashIssuerSearchActivity;
import com.scb.phone.view.custom.common.AmountEditText;
import com.scb.phone.view.custom.investment.onboarding.CustomSpinnerWithTitle;
import com.scb.phone.view.custom.investment.onboarding.CustomTextViewNavigation;
import com.scb.phone.view.custom.investment.onboarding.CustomTextViewNavigation$MediaBrowserCompat$ItemReceiver;
import com.scb.phone.view.fragment.etb.BreadcrumbFragment;
import com.thunderhead.android.aspects.AndroidXSupportFragmentIntentTidInjectionAspect;
import java.util.List;
import p040o.CheckExtractActivity_MembersInjector;
import p040o.HmlPinActivity;
import p040o.IOrientationGuidanceCalculator;
import p040o.KENLogging;
import p040o.MyECouponActivity_ViewBinding;
import p040o.PassportDetector_Factory;
import p040o.convertMemInfoToBytes;
import p040o.getICheckDeserializerRtti;
import p040o.getResultCode;
import p040o.getSymbolsFound;
import p040o.postRegistrationLandingConf;
import p040o.setTapText;

public class EasycashIssuerInputFragment extends BreadcrumbFragment implements CheckExtractActivity_MembersInjector.setGroupDividerEnabled {
    private CustomSpinnerWithTitle.IconCompatParcelizer IconCompatParcelizer = new CustomSpinnerWithTitle.IconCompatParcelizer() {
        public final void write() {
            getSymbolsFound getsymbolsfound = EasycashIssuerInputFragment.this.inputPresenter;
            if (getsymbolsfound.RatingCompat != null) {
                getsymbolsfound.RatingCompat.AlertController$RecycleListView();
            }
            getsymbolsfound.write.MediaBrowserCompat$CustomActionResultReceiver();
            getsymbolsfound.write.IconCompatParcelizer(new getSymbolsFound.read(getsymbolsfound, (byte) 0));
        }

        public final void IconCompatParcelizer() {
            EasycashIssuerInputFragment.this.MediaBrowserCompat$ItemReceiver();
        }
    };
    private IOrientationGuidanceCalculator MediaBrowserCompat$CustomActionResultReceiver;
    private CustomTextViewNavigation$MediaBrowserCompat$ItemReceiver RatingCompat = new postRegistrationLandingConf(this);
    @BindView
    protected AmountEditText amountEditText;
    @BindView
    protected TextInputLayout amountInputLayout;
    @BindView
    protected Button buttonDone;
    @BindView
    protected CustomTextViewNavigation customSelectIssuer;
    @BindView
    public CustomSpinnerWithTitle customSpinnerLoadType;
    @HmlPinActivity
    public getSymbolsFound inputPresenter;

    public final int ParcelableVolumeInfo() {
        return 1;
    }

    public final boolean setHasDecor() {
        return true;
    }

    public final String PlaybackStateCompat() {
        return getString(R.string.occupation_info_title);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.f87012131493928, viewGroup, false);
        ButterKnife.IconCompatParcelizer(this, inflate);
        this.inputPresenter.MediaBrowserCompat$ItemReceiver(this);
        this.customSpinnerLoadType.setOnCustomSpinnerWithTitleCompletion(this.IconCompatParcelizer);
        this.customSelectIssuer.setOnClickDetailNavigationCompletion(this.RatingCompat);
        this.amountEditText.setOnAmountChangeListener(new AmountEditText.read() {
            public final void MediaBrowserCompat$CustomActionResultReceiver(double d) {
                getSymbolsFound getsymbolsfound = EasycashIssuerInputFragment.this.inputPresenter;
                String obj = EasycashIssuerInputFragment.this.amountEditText.getText().toString();
                getsymbolsfound.IconCompatParcelizer = d;
                boolean z = true;
                if (TextUtils.isEmpty(obj) || d == 0.0d) {
                    KENLogging kENLogging = KENLogging.MediaBrowserCompat$CustomActionResultReceiver;
                    if (getsymbolsfound.RatingCompat == null) {
                        z = false;
                    }
                    if (z) {
                        kENLogging.IconCompatParcelizer(getsymbolsfound.RatingCompat);
                    }
                } else {
                    getResultCode getresultcode = getResultCode.read;
                    if (getsymbolsfound.RatingCompat == null) {
                        z = false;
                    }
                    if (z) {
                        getresultcode.IconCompatParcelizer(getsymbolsfound.RatingCompat);
                    }
                }
                EasycashIssuerInputFragment.this.MediaBrowserCompat$ItemReceiver();
            }

            public final void MediaBrowserCompat$CustomActionResultReceiver() {
                EasycashIssuerInputFragment.this.PlaybackStateCompat$CustomAction();
            }
        });
        return inflate;
    }

    /* access modifiers changed from: private */
    public void MediaBrowserCompat$ItemReceiver() {
        boolean z = !TextUtils.isEmpty(this.amountEditText.getText()) && !getICheckDeserializerRtti.MediaBrowserCompat$MediaItem(this.amountEditText.getText().toString()) && !TextUtils.isEmpty(this.customSelectIssuer.textViewDesc.getText().toString()) && this.customSpinnerLoadType.spinner.getSelectedItemPosition() > 0;
        if (this.buttonDone.isEnabled() != z) {
            this.buttonDone.setEnabled(z);
        }
    }

    public final void write(List<String> list) {
        this.customSpinnerLoadType.setItemsWithPlaceholder(list, true);
        this.customSpinnerLoadType.setMandatory(true);
    }

    public final void read(int i) {
        this.amountInputLayout.setError(getString(i));
    }

    public final void read() {
        this.amountInputLayout.setError((CharSequence) null);
    }

    public void write() {
        Intent MediaBrowserCompat$ItemReceiver = EasycashIssuerSearchActivity.MediaBrowserCompat$ItemReceiver(getContext());
        AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
        try {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                MediaBrowserCompat$ItemReceiver = setTapText.write(activity, MediaBrowserCompat$ItemReceiver).read();
            }
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivityForResult(Intent, int), modified: ");
            sb.append(MediaBrowserCompat$ItemReceiver.getData());
            sb.append("\n with context ");
            sb.append(activity.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            startActivityForResult(MediaBrowserCompat$ItemReceiver, 107);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final void read(String str) {
        this.customSelectIssuer.setDescriptionText(str);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (i2 == -1 && i == 107) {
            convertMemInfoToBytes convertmeminfotobytes = (convertMemInfoToBytes) intent.getParcelableExtra("EXTRA_RESULT_ISSUER_SEARCH");
            getSymbolsFound getsymbolsfound = this.inputPresenter;
            getsymbolsfound.MediaBrowserCompat$ItemReceiver = convertmeminfotobytes;
            PassportDetector_Factory passportDetector_Factory = new PassportDetector_Factory(getsymbolsfound, convertmeminfotobytes);
            if (getsymbolsfound.RatingCompat != null) {
                passportDetector_Factory.IconCompatParcelizer(getsymbolsfound.RatingCompat);
            }
            MediaBrowserCompat$ItemReceiver();
        }
    }

    @OnClick
    public void onDoneButtonClick() {
        IconCompatParcelizer();
    }

    /* access modifiers changed from: protected */
    public void IconCompatParcelizer() {
        this.inputPresenter.IconCompatParcelizer(this.customSpinnerLoadType.spinner.getSelectedItemPosition() - 1, this.MediaBrowserCompat$CustomActionResultReceiver.read(), Boolean.FALSE);
    }

    public void MediaBrowserCompat$CustomActionResultReceiver() {
        this.MediaBrowserCompat$CustomActionResultReceiver.RatingCompat();
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof IOrientationGuidanceCalculator) {
            this.MediaBrowserCompat$CustomActionResultReceiver = (IOrientationGuidanceCalculator) context;
        }
    }

    public void onDestroy() {
        this.MediaBrowserCompat$CustomActionResultReceiver = null;
        super.onDestroy();
    }
}
