package com.scb.phone.view.fragment.easycash.landing;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.scb.phone.R;
import com.scb.phone.view.activity.easycash.EasycashReferralSendDfwActivity;
import com.scb.phone.view.activity.easycash.EasycashReferralSendProductActivity;
import com.scb.phone.view.activity.easycash.EasycashSalesheetIndexActivity;
import com.scb.phone.view.activity.easycash.LoanRequestorActivity;
import com.scb.phone.view.custom.common.DefaultButton;
import com.scb.phone.view.fragment.BaseFragment;
import com.thunderhead.android.aspects.AndroidXSupportFragmentIntentTidInjectionAspect;
import p040o.CheckExtractActivity_MembersInjector;
import p040o.CrashlyticsBackgroundWorker;
import p040o.MyECouponActivity_ViewBinding;
import p040o.access$1200;
import p040o.allowRegister;
import p040o.getCpuArchitectureInt;
import p040o.getInputDocShortEdge;
import p040o.postRegisterNewPin;
import p040o.setTapText;
import p040o.submitTask;

public abstract class EasycashBaseLandingFragment extends BaseFragment implements CheckExtractActivity_MembersInjector.Keep {
    public getInputDocShortEdge MediaBrowserCompat$CustomActionResultReceiver;
    @BindView
    LinearLayout footerLayout;

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return MediaBrowserCompat$ItemReceiver(layoutInflater, viewGroup);
    }

    /* access modifiers changed from: protected */
    public View MediaBrowserCompat$ItemReceiver(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.f87032131493930, viewGroup, false);
        ButterKnife.IconCompatParcelizer(this, inflate);
        return inflate;
    }

    public final void IconCompatParcelizer(CrashlyticsBackgroundWorker.C32131 r5) {
        Intent write = EasycashReferralSendProductActivity.write(getContext(), r5);
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

    public final void MediaBrowserCompat$CustomActionResultReceiver(CrashlyticsBackgroundWorker.C32131 r2) {
        EasycashReferralSendDfwActivity.MediaBrowserCompat$ItemReceiver(getContext(), r2);
    }

    public final void MediaBrowserCompat$ItemReceiver(access$1200 access_1200) {
        EasycashSalesheetIndexActivity.IconCompatParcelizer(getContext(), access_1200);
    }

    public final void IconCompatParcelizer(submitTask submittask) {
        LoanRequestorActivity.MediaBrowserCompat$CustomActionResultReceiver(getContext(), submittask);
    }

    public final void MediaBrowserCompat$ItemReceiver(getCpuArchitectureInt getcpuarchitectureint) {
        MediaBrowserCompat$ItemReceiver(getcpuarchitectureint, true);
    }

    public final void write(getCpuArchitectureInt getcpuarchitectureint) {
        MediaBrowserCompat$ItemReceiver(getcpuarchitectureint, false);
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(getCpuArchitectureInt getcpuarchitectureint) {
        TextView textView = new TextView(getContext());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.setMargins((int) getResources().getDimension(R.dimen.f72402131165377), (int) getResources().getDimension(R.dimen.f72412131165379), (int) getResources().getDimension(R.dimen.f72392131165375), 0);
        layoutParams.gravity = 1;
        textView.setTextAppearance(R.style.f98712131821092);
        textView.setLayoutParams(layoutParams);
        textView.setText(getcpuarchitectureint.MediaBrowserCompat$MediaItem);
        getResources();
        textView.setTextColor(-9031231);
        textView.setOnClickListener(new postRegisterNewPin(this, getcpuarchitectureint));
        this.footerLayout.addView(textView);
    }

    private void MediaBrowserCompat$ItemReceiver(getCpuArchitectureInt getcpuarchitectureint, boolean z) {
        DefaultButton defaultButton = new DefaultButton(getContext());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, (int) getResources().getDimension(R.dimen.f72382131165372));
        layoutParams.setMargins((int) getResources().getDimension(R.dimen.f72402131165377), (int) getResources().getDimension(R.dimen.f72412131165379), (int) getResources().getDimension(R.dimen.f72392131165375), 0);
        defaultButton.setLayoutParams(layoutParams);
        defaultButton.setBackground(getResources().getDrawable(z ? R.drawable.bg_button : R.drawable.bg_button_transparent));
        defaultButton.setRipple(getResources().getDrawable(z ? R.drawable.ripple_rounded_dark_purple : R.drawable.ripple_rounded_purple));
        defaultButton.setText(getcpuarchitectureint.MediaBrowserCompat$MediaItem);
        defaultButton.setTextColor(getResources().getColor(z ? R.color.f71012131100257 : R.color.f67252131099881));
        defaultButton.setOnClickListener(new allowRegister(this, getcpuarchitectureint));
        this.footerLayout.addView(defaultButton);
    }

    public void onDestroy() {
        super.onDestroy();
        this.MediaBrowserCompat$CustomActionResultReceiver.onDestroy();
    }
}
