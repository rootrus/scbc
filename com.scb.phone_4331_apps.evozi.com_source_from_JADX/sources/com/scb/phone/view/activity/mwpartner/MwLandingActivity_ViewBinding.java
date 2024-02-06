package com.scb.phone.view.activity.mwpartner;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public class MwLandingActivity_ViewBinding extends BaseActivity_ViewBinding {
    private MwLandingActivity IconCompatParcelizer;
    private View MediaBrowserCompat$CustomActionResultReceiver;
    private View MediaBrowserCompat$ItemReceiver;
    private View write;

    public MwLandingActivity_ViewBinding(final MwLandingActivity mwLandingActivity, View view) {
        super(mwLandingActivity, view);
        this.IconCompatParcelizer = mwLandingActivity;
        mwLandingActivity.rvWallet = (RecyclerView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.rv_wallet, "field 'rvWallet'", RecyclerView.class);
        View IconCompatParcelizer2 = onStart.IconCompatParcelizer(view, R.id.iv_gmb_banner, "field 'ivGmbBanner' and method 'omGMBSectionClick'");
        mwLandingActivity.ivGmbBanner = (ImageView) onStart.write(IconCompatParcelizer2, R.id.iv_gmb_banner, "field 'ivGmbBanner'", ImageView.class);
        this.write = IconCompatParcelizer2;
        IconCompatParcelizer2.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                MwLandingActivity.this.omGMBSectionClick();
            }
        });
        View IconCompatParcelizer3 = onStart.IconCompatParcelizer(view, R.id.btn_download, "field 'buttonDownload' and method 'onDownloadClick'");
        mwLandingActivity.buttonDownload = (Button) onStart.write(IconCompatParcelizer3, R.id.btn_download, "field 'buttonDownload'", Button.class);
        this.MediaBrowserCompat$ItemReceiver = IconCompatParcelizer3;
        IconCompatParcelizer3.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                MwLandingActivity.this.onDownloadClick();
            }
        });
        mwLandingActivity.myshopTitle = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_myshop, "field 'myshopTitle'", TextView.class);
        View IconCompatParcelizer4 = onStart.IconCompatParcelizer(view, R.id.btn_gmb_activate_account, "field 'btnGmbActivateAccount' and method 'omGMBSectionClick'");
        mwLandingActivity.btnGmbActivateAccount = (Button) onStart.write(IconCompatParcelizer4, R.id.btn_gmb_activate_account, "field 'btnGmbActivateAccount'", Button.class);
        this.MediaBrowserCompat$CustomActionResultReceiver = IconCompatParcelizer4;
        IconCompatParcelizer4.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                MwLandingActivity.this.omGMBSectionClick();
            }
        });
    }

    public final void read() {
        MwLandingActivity mwLandingActivity = this.IconCompatParcelizer;
        if (mwLandingActivity != null) {
            this.IconCompatParcelizer = null;
            mwLandingActivity.rvWallet = null;
            mwLandingActivity.ivGmbBanner = null;
            mwLandingActivity.buttonDownload = null;
            mwLandingActivity.myshopTitle = null;
            mwLandingActivity.btnGmbActivateAccount = null;
            this.write.setOnClickListener((View.OnClickListener) null);
            this.write = null;
            this.MediaBrowserCompat$ItemReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$ItemReceiver = null;
            this.MediaBrowserCompat$CustomActionResultReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
