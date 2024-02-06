package com.scb.phone.view.fragment.hml;

import android.widget.Button;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import butterknife.OnClick;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import kotlin.TypeCastException;
import p040o.CrashlyticsController;
import p040o.onGetStartedClick;
import p040o.setRetryOk;
import p040o.writeUInt64NoTag;

public final class HmlNTBOnlineSuccessFragment extends HmlBaseOnlineSuccessFragment<setRetryOk> {
    public static final IconCompatParcelizer MediaBrowserCompat$CustomActionResultReceiver = new IconCompatParcelizer((byte) 0);

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
    }

    public static final class IconCompatParcelizer {
        private IconCompatParcelizer() {
        }

        public /* synthetic */ IconCompatParcelizer(byte b) {
            this();
        }
    }

    public final void IconCompatParcelizer(CrashlyticsController.C322115 r3) {
        onGetStartedClick.write((Object) r3, "data");
        super.IconCompatParcelizer(r3);
        Button button = this.saveSlip;
        if (button == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("saveSlip");
        }
        button.setVisibility(0);
        Button button2 = this.returnToHome;
        if (button2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("returnToHome");
        }
        button2.setVisibility(8);
        Button button3 = this.registerButton;
        if (button3 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("registerButton");
        }
        button3.setVisibility(0);
        TextView textView = this.remarkTextView;
        if (textView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("remarkTextView");
        }
        textView.setText(getString(R.string.hml_success_remark_ntb));
    }

    public final void MediaBrowserCompat$MediaItem() {
        if (getActivity() instanceof BaseActivity) {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                ((BaseActivity) activity).setHideOnContentScrollEnabled();
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.scb.phone.view.activity.BaseActivity");
        }
    }

    public final void MediaMetadataCompat() {
        setSplitBackground();
    }

    @OnClick
    public final void onRegisterClick() {
        T t = this.presenter;
        if (t == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        setRetryOk setretryok = (setRetryOk) t;
        writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = new setRetryOk.IconCompatParcelizer(setretryok);
        if (setretryok.RatingCompat != null) {
            iconCompatParcelizer.IconCompatParcelizer(setretryok.RatingCompat);
        }
    }
}
