package com.scb.phone.view.fragment.profilemanagement.promptpay;

import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.activity.profilemanagement.promptpay.ManagePromptpayLandingActivity;
import com.scb.phone.view.activity.profilemanagement.promptpay.PromptPayTermsAndConditionsActivity;
import com.scb.phone.view.fragment.BaseFragment;
import com.thunderhead.android.aspects.AndroidXSupportFragmentIntentTidInjectionAspect;
import p040o.ActivityBuilder_ContributeMailingAddressSuccessfulActivity;
import p040o.ActivityBuilder_ContributeManageEmailVerificationActivity;
import p040o.C4918ku;
import p040o.C9924f;
import p040o.GoogleMap;
import p040o.HmlPinActivity;
import p040o.IndoorBuilding$MediaBrowserCompat$ItemReceiver;
import p040o.MyECouponActivity_ViewBinding;
import p040o.getCarbonStripHeight;
import p040o.getKernelIDDstIn;
import p040o.onFocusChangedEvent;
import p040o.setLastBaselineToBottomHeight;
import p040o.setTapText;

public class PromptPayTermsAndConditionsLandingFragment extends BaseFragment implements getCarbonStripHeight.IconCompatParcelizer {
    @BindView
    Button buttonNext;
    @HmlPinActivity
    public C9924f.C43932 presenter;
    @BindView
    CheckBox termsAndConditionsCheck;
    @BindView
    TextView termsConditionsText;

    public static PromptPayTermsAndConditionsLandingFragment MediaBrowserCompat$CustomActionResultReceiver() {
        return new PromptPayTermsAndConditionsLandingFragment();
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.f89092131494136, viewGroup, false);
        ButterKnife.IconCompatParcelizer(this, inflate);
        this.presenter.MediaBrowserCompat$ItemReceiver(this);
        C9924f.C43932 r6 = this.presenter;
        onFocusChangedEvent onfocuschangedevent = onFocusChangedEvent.MediaBrowserCompat$ItemReceiver;
        boolean z = true;
        if (r6.RatingCompat != null) {
            onfocuschangedevent.IconCompatParcelizer(r6.RatingCompat);
        }
        if (r6.RatingCompat == null) {
            z = false;
        }
        if (z) {
            r6.RatingCompat.AlertController$RecycleListView();
        }
        r6.IconCompatParcelizer.read();
        r6.IconCompatParcelizer.IconCompatParcelizer(new IndoorBuilding$MediaBrowserCompat$ItemReceiver<GoogleMap.OnMyLocationChangeListener>() {
            public final /* synthetic */ void onNext(Object obj) {
                GoogleMap.OnMyLocationChangeListener onMyLocationChangeListener = (GoogleMap.OnMyLocationChangeListener) obj;
                super.onNext(onMyLocationChangeListener);
                C43932.MediaBrowserCompat$CustomActionResultReceiver(C43932.this);
                String str = C43932.this.read.read.MediaBrowserCompat$MediaItem().ActionMenuItemView;
                boolean z = true;
                boolean z2 = str != null && !str.isEmpty();
                if (z2) {
                    z2 = onMyLocationChangeListener.read <= Integer.parseInt(str);
                }
                C43932 r5 = C43932.this;
                FocusStatistics focusStatistics = new FocusStatistics(z2);
                if (r5.RatingCompat == null) {
                    z = false;
                }
                if (z) {
                    focusStatistics.IconCompatParcelizer(r5.RatingCompat);
                }
            }

            public final void onError(Throwable th) {
                super.onError(th);
                C43932.this.RatingCompat(th);
                C43932 r3 = C43932.this;
                C4871jj jjVar = C4871jj.read;
                if (r3.RatingCompat != null) {
                    jjVar.IconCompatParcelizer(r3.RatingCompat);
                }
            }
        });
        String string = getString(R.string.terms_and_conditions_link_not_clickable_left);
        String string2 = getString(R.string.terms_and_conditions_link_clickable);
        String string3 = getString(R.string.terms_and_conditions_link_not_clickable_right);
        StringBuilder sb = new StringBuilder();
        sb.append(string);
        sb.append(string2);
        sb.append(string3);
        SpannableString spannableString = new SpannableString(sb.toString());
        spannableString.setSpan(new ClickableSpan() {
            public final void onClick(View view) {
                C9924f.C43932 r3 = PromptPayTermsAndConditionsLandingFragment.this.presenter;
                C4918ku kuVar = C4918ku.MediaBrowserCompat$CustomActionResultReceiver;
                if (r3.RatingCompat != null) {
                    kuVar.IconCompatParcelizer(r3.RatingCompat);
                }
            }

            public final void updateDrawState(TextPaint textPaint) {
                super.updateDrawState(textPaint);
                textPaint.setUnderlineText(true);
                if (PromptPayTermsAndConditionsLandingFragment.this.getContext() != null) {
                    textPaint.setColor(setLastBaselineToBottomHeight.read(PromptPayTermsAndConditionsLandingFragment.this.getContext(), R.color.f67252131099881));
                }
            }
        }, string.length(), string.length() + string2.length(), 33);
        this.termsConditionsText.setText(spannableString);
        this.termsConditionsText.setMovementMethod(LinkMovementMethod.getInstance());
        this.termsConditionsText.setHighlightColor(0);
        this.termsAndConditionsCheck.setOnCheckedChangeListener(new ActivityBuilder_ContributeMailingAddressSuccessfulActivity(this));
        this.buttonNext.setOnClickListener(new ActivityBuilder_ContributeManageEmailVerificationActivity(this));
        getKernelIDDstIn getkerneliddstin = new getKernelIDDstIn();
        if (getActivity() != null) {
            getkerneliddstin.MediaBrowserCompat$ItemReceiver(((BaseActivity) getActivity()).scbAnalytics, "managepromptpay_consent");
        }
        return inflate;
    }

    public final void MediaBrowserCompat$ItemReceiver(boolean z) {
        this.buttonNext.setEnabled(z);
    }

    public final void IconCompatParcelizer(boolean z) {
        this.termsAndConditionsCheck.setChecked(z);
        this.buttonNext.setEnabled(z);
    }

    public final void write() {
        if (getActivity() != null) {
            getActivity().onBackPressed();
        }
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        ManagePromptpayLandingActivity.MediaBrowserCompat$ItemReceiver(getContext());
    }

    public final void IconCompatParcelizer() {
        Intent MediaBrowserCompat$CustomActionResultReceiver = PromptPayTermsAndConditionsActivity.MediaBrowserCompat$CustomActionResultReceiver(getContext());
        AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
        try {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                MediaBrowserCompat$CustomActionResultReceiver = setTapText.write(activity, MediaBrowserCompat$CustomActionResultReceiver).read();
            }
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivity(Intent), modified: ");
            sb.append(MediaBrowserCompat$CustomActionResultReceiver.getData());
            sb.append("\n with context ");
            sb.append(activity.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            startActivity(MediaBrowserCompat$CustomActionResultReceiver);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
