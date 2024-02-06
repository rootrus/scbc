package com.scb.phone.view.fragment.transferandpay.cardlessatm;

import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.scb.phone.R;
import com.scb.phone.view.activity.transferandpay.cardlessatm.CardlessATMCoachMarkActivity;
import com.scb.phone.view.fragment.BaseFragment;
import com.thunderhead.android.aspects.AndroidXSupportFragmentIntentTidInjectionAspect;
import p040o.MyECouponActivity_ViewBinding;
import p040o.setTapText;

public class CardlessATMTutorialFragment extends BaseFragment {
    @BindView
    TextView cardlessDescription;

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.f85972131493824, viewGroup, false);
        ButterKnife.IconCompatParcelizer(this, inflate);
        this.cardlessDescription.setText(Html.fromHtml(getString(R.string.cardless_atm_description)));
        return inflate;
    }

    /* access modifiers changed from: package-private */
    @OnClick
    public void onGetStartedClicked() {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            Intent intent = activity.getIntent();
            if (intent != null) {
                Intent MediaBrowserCompat$CustomActionResultReceiver = CardlessATMCoachMarkActivity.MediaBrowserCompat$CustomActionResultReceiver(activity, AbsActionBarView(), intent.getStringExtra("CARDLESS_DEFAULT_TAB"));
                AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
                try {
                    FragmentActivity activity2 = getActivity();
                    if (activity2 != null) {
                        MediaBrowserCompat$CustomActionResultReceiver = setTapText.write(activity2, MediaBrowserCompat$CustomActionResultReceiver).read();
                    }
                    MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
                    StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivity(Intent), modified: ");
                    sb.append(MediaBrowserCompat$CustomActionResultReceiver.getData());
                    sb.append("\n with context ");
                    sb.append(activity2.hashCode());
                    MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
                    startActivity(MediaBrowserCompat$CustomActionResultReceiver);
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            } else {
                Intent MediaBrowserCompat$CustomActionResultReceiver2 = CardlessATMCoachMarkActivity.MediaBrowserCompat$CustomActionResultReceiver(activity, AbsActionBarView());
                AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
                try {
                    FragmentActivity activity3 = getActivity();
                    if (activity3 != null) {
                        MediaBrowserCompat$CustomActionResultReceiver2 = setTapText.write(activity3, MediaBrowserCompat$CustomActionResultReceiver2).read();
                    }
                    MyECouponActivity_ViewBinding.write write2 = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
                    StringBuilder sb2 = new StringBuilder("Uri intercepted on support Fragment.startActivity(Intent), modified: ");
                    sb2.append(MediaBrowserCompat$CustomActionResultReceiver2.getData());
                    sb2.append("\n with context ");
                    sb2.append(activity3.hashCode());
                    MyECouponActivity_ViewBinding.IconCompatParcelizer(write2, sb2.toString());
                    startActivity(MediaBrowserCompat$CustomActionResultReceiver2);
                } catch (Throwable th2) {
                    th2.printStackTrace();
                }
            }
            activity.finish();
        }
    }
}
