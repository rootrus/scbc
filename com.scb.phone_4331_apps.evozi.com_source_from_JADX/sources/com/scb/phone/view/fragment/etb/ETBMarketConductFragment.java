package com.scb.phone.view.fragment.etb;

import android.content.Intent;
import android.net.Uri;
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
import com.scb.phone.view.activity.BaseActivity;
import com.thunderhead.android.aspects.AndroidXSupportFragmentIntentTidInjectionAspect;
import p040o.C1346xf91fc122;
import p040o.MyECouponActivity_ViewBinding;
import p040o.ScriptIntrinsicBlend;
import p040o.setTapText;

public class ETBMarketConductFragment extends BaseEtbFragment implements C1346xf91fc122 {
    private ScriptIntrinsicBlend MediaBrowserCompat$CustomActionResultReceiver = new ScriptIntrinsicBlend();
    @BindView
    TextView scbLink;

    public final int ParcelableVolumeInfo() {
        return 0;
    }

    public final boolean setHasDecor() {
        return true;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.f87312131493958, viewGroup, false);
        ButterKnife.IconCompatParcelizer(this, inflate);
        this.scbLink.setText(Html.fromHtml(getString(R.string.etb_product_catalog_link_label)));
        ScriptIntrinsicBlend scriptIntrinsicBlend = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (getActivity() != null) {
            scriptIntrinsicBlend.MediaBrowserCompat$ItemReceiver(((BaseActivity) getActivity()).scbAnalytics, "etb_market_conduct");
        }
        return inflate;
    }

    @OnClick
    public void onReadButtonClick() {
        this.MediaMetadataCompat.write(new ETBMarketConductDetailFragment());
    }

    @OnClick
    public void onScbLink() {
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(getString(R.string.etb_product_catalog_link)));
        AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
        try {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                intent = setTapText.write(activity, intent).read();
            }
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivity(Intent), modified: ");
            sb.append(intent.getData());
            sb.append("\n with context ");
            sb.append(activity.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            startActivity(intent);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final String PlaybackStateCompat() {
        return getString(R.string.etb_product_catalog);
    }
}
