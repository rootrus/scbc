package com.scb.phone.view.fragment.hml;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.scb.phone.R;
import com.scb.phone.view.fragment.BaseFragment;
import p040o.CheckCaptureModule_GetIExtractionServerKtaFactory;
import p040o.onGetStartedClick;

public final class HmlNoDepositAccountFragment extends BaseFragment implements CheckCaptureModule_GetIExtractionServerKtaFactory.IconCompatParcelizer {
    public static final read IconCompatParcelizer = new read((byte) 0);
    @BindView
    public Button findUsButton;

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
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
        View inflate = layoutInflater.inflate(R.layout.f87902131494017, viewGroup, false);
        ButterKnife.IconCompatParcelizer(this, inflate);
        Button button = this.findUsButton;
        if (button == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("findUsButton");
        }
        button.setOnClickListener(new C6004x979a6f94(this));
        onGetStartedClick.IconCompatParcelizer((Object) inflate, Promotion.ACTION_VIEW);
        return inflate;
    }
}
