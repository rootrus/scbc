package com.scb.phone.view.activity.investment.scbs.open;

import android.view.View;
import android.widget.FrameLayout;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public class ScbsOnboardingProductCatalogActivity_ViewBinding extends BaseActivity_ViewBinding {
    private View IconCompatParcelizer;
    private ScbsOnboardingProductCatalogActivity MediaBrowserCompat$CustomActionResultReceiver;

    public ScbsOnboardingProductCatalogActivity_ViewBinding(final ScbsOnboardingProductCatalogActivity scbsOnboardingProductCatalogActivity, View view) {
        super(scbsOnboardingProductCatalogActivity, view);
        this.MediaBrowserCompat$CustomActionResultReceiver = scbsOnboardingProductCatalogActivity;
        scbsOnboardingProductCatalogActivity.pdfView = (FrameLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.pdf_container, "field 'pdfView'", FrameLayout.class);
        View IconCompatParcelizer2 = onStart.IconCompatParcelizer(view, R.id.bt_next, "method 'onNextButtonClick'");
        this.IconCompatParcelizer = IconCompatParcelizer2;
        IconCompatParcelizer2.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                ScbsOnboardingProductCatalogActivity.this.onNextButtonClick();
            }
        });
    }

    public final void read() {
        ScbsOnboardingProductCatalogActivity scbsOnboardingProductCatalogActivity = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (scbsOnboardingProductCatalogActivity != null) {
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            scbsOnboardingProductCatalogActivity.pdfView = null;
            this.IconCompatParcelizer.setOnClickListener((View.OnClickListener) null);
            this.IconCompatParcelizer = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
