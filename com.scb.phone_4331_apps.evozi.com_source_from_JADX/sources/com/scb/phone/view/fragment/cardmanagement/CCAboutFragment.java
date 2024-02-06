package com.scb.phone.view.fragment.cardmanagement;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.scb.phone.R;
import com.scb.phone.view.activity.cardmanagement.deejungtransfer.DeejungTermsAndConditionsActivity;
import com.scb.phone.view.fragment.BaseFragment;
import com.thunderhead.android.aspects.AndroidXSupportFragmentIntentTidInjectionAspect;
import kotlin.NoWhenBranchMatchedException;
import p040o.AbstractMultimap;
import p040o.HmlPinActivity;
import p040o.MyECouponActivity_ViewBinding;
import p040o.UncheckedTimeoutException;
import p040o.getBinaryImageSize;
import p040o.getEventAppExecutionSignalSize;
import p040o.getICheckDeserializerRtti;
import p040o.onGetStartedClick;
import p040o.setTapText;
import p040o.toLongArray;

public class CCAboutFragment extends BaseFragment {
    private UncheckedTimeoutException MediaBrowserCompat$CustomActionResultReceiver;
    @HmlPinActivity
    public getBinaryImageSize presenter;
    @BindView
    TextView txvCCAbout;

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String str;
        View inflate = layoutInflater.inflate(R.layout.f86042131493831, viewGroup, false);
        ButterKnife.IconCompatParcelizer(this, inflate);
        this.presenter.MediaBrowserCompat$ItemReceiver(this);
        this.MediaBrowserCompat$CustomActionResultReceiver = (UncheckedTimeoutException) getActivity().getIntent().getSerializableExtra("com.scb.phone.view.activity.card_management.CCAboutActivity.KEY_EXTRA_ABOUT_TYPE");
        UncheckedTimeoutException uncheckedTimeoutException = (UncheckedTimeoutException) getActivity().getIntent().getSerializableExtra("com.scb.phone.view.activity.card_management.CCAboutActivity.KEY_EXTRA_ABOUT_TYPE");
        getBinaryImageSize getbinaryimagesize = this.presenter;
        onGetStartedClick.write((Object) uncheckedTimeoutException, "ccAboutType");
        int i = getEventAppExecutionSignalSize.write[uncheckedTimeoutException.ordinal()];
        if (i == 1) {
            str = AbstractMultimap.MediaBrowserCompat$CustomActionResultReceiver("DEEJUNG_INSTALLMENT", (String) null);
        } else if (i == 2) {
            str = AbstractMultimap.MediaBrowserCompat$CustomActionResultReceiver("SPEEDY_CASH", (String) null);
        } else if (i == 3) {
            str = AbstractMultimap.MediaBrowserCompat$CustomActionResultReceiver("DEEJUNG_TRANSFER", (String) null);
        } else {
            throw new NoWhenBranchMatchedException();
        }
        toLongArray tolongarray = getbinaryimagesize.read;
        onGetStartedClick.write((Object) str, "path");
        String read = getICheckDeserializerRtti.read(str, tolongarray.read);
        onGetStartedClick.IconCompatParcelizer((Object) read, "Utilities.transformAssetUrl(path, baseStaticURL)");
        getbinaryimagesize.MediaBrowserCompat$ItemReceiver = read;
        this.txvCCAbout.setText(getString(this.MediaBrowserCompat$CustomActionResultReceiver.infoResId));
        return inflate;
    }

    /* access modifiers changed from: package-private */
    @OnClick
    public void onTermsAndConditionsClick() {
        Intent IconCompatParcelizer = DeejungTermsAndConditionsActivity.IconCompatParcelizer(getActivity(), this.presenter.MediaBrowserCompat$ItemReceiver);
        AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
        try {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                IconCompatParcelizer = setTapText.write(activity, IconCompatParcelizer).read();
            }
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivity(Intent), modified: ");
            sb.append(IconCompatParcelizer.getData());
            sb.append("\n with context ");
            sb.append(activity.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            startActivity(IconCompatParcelizer);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
