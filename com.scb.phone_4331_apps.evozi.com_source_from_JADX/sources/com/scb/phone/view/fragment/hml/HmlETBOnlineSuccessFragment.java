package com.scb.phone.view.fragment.hml;

import android.content.Intent;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.scb.phone.R;
import com.scb.phone.view.activity.HomeActivity;
import com.thunderhead.android.aspects.AndroidXSupportFragmentIntentTidInjectionAspect;
import p040o.CrashlyticsController;
import p040o.MyECouponActivity_ViewBinding;
import p040o.onGetStartedClick;
import p040o.setTapText;
import p040o.sha1Hash;

public final class HmlETBOnlineSuccessFragment extends HmlBaseOnlineSuccessFragment<sha1Hash> {
    public static final write MediaBrowserCompat$CustomActionResultReceiver = new write((byte) 0);

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
    }

    public static final class write {
        private write() {
        }

        public /* synthetic */ write(byte b) {
            this();
        }
    }

    public final void IconCompatParcelizer(CrashlyticsController.C322115 r2) {
        onGetStartedClick.write((Object) r2, "data");
        super.IconCompatParcelizer(r2);
        TextView textView = this.remarkTextView;
        if (textView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("remarkTextView");
        }
        textView.setText(getString(R.string.hml_success_remark_etb));
    }

    public final void IconCompatParcelizer() {
        HomeActivity.write(getContext(), false);
    }

    public final void MediaMetadataCompat() {
        Intent IconCompatParcelizer = HomeActivity.IconCompatParcelizer(getContext());
        AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
        try {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                IconCompatParcelizer = setTapText.write(activity, IconCompatParcelizer).read();
            }
            MyECouponActivity_ViewBinding.write write2 = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivity(Intent), modified: ");
            sb.append(IconCompatParcelizer.getData());
            sb.append("\n with context ");
            sb.append(activity.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write2, sb.toString());
            startActivity(IconCompatParcelizer);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
