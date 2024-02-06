package com.scb.phone.view.activity.easycash.introduction;

import android.view.View;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public class EasycashBaseIntroductionActivity_ViewBinding extends BaseActivity_ViewBinding {
    private EasycashBaseIntroductionActivity MediaBrowserCompat$CustomActionResultReceiver;
    private View write;

    public EasycashBaseIntroductionActivity_ViewBinding(final EasycashBaseIntroductionActivity easycashBaseIntroductionActivity, View view) {
        super(easycashBaseIntroductionActivity, view);
        this.MediaBrowserCompat$CustomActionResultReceiver = easycashBaseIntroductionActivity;
        easycashBaseIntroductionActivity.webView = (WebView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.webview, "field 'webView'", WebView.class);
        easycashBaseIntroductionActivity.imagePlaceholder = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.image_placeholder, "field 'imagePlaceholder'", ImageView.class);
        easycashBaseIntroductionActivity.tvPrivacyNotice = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_privacy_notice, "field 'tvPrivacyNotice'", TextView.class);
        easycashBaseIntroductionActivity.vPrivacyNotice = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.v_privacy_notice, "field 'vPrivacyNotice'", LinearLayout.class);
        View IconCompatParcelizer = onStart.IconCompatParcelizer(view, R.id.btn_apply_now, "method 'onClickApplyNow'");
        this.write = IconCompatParcelizer;
        IconCompatParcelizer.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                EasycashBaseIntroductionActivity.this.onClickApplyNow();
            }
        });
    }

    public final void read() {
        EasycashBaseIntroductionActivity easycashBaseIntroductionActivity = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (easycashBaseIntroductionActivity != null) {
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            easycashBaseIntroductionActivity.webView = null;
            easycashBaseIntroductionActivity.imagePlaceholder = null;
            easycashBaseIntroductionActivity.tvPrivacyNotice = null;
            easycashBaseIntroductionActivity.vPrivacyNotice = null;
            this.write.setOnClickListener((View.OnClickListener) null);
            this.write = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
