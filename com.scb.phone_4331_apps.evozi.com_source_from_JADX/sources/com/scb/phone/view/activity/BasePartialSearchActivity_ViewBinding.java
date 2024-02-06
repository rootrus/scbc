package com.scb.phone.view.activity;

import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import com.scb.phone.R;
import p040o.onCreateDialog;
import p040o.onStart;

public class BasePartialSearchActivity_ViewBinding extends BaseActivity_ViewBinding {
    private View MediaBrowserCompat$CustomActionResultReceiver;
    private BasePartialSearchActivity MediaBrowserCompat$ItemReceiver;
    private View write;

    public BasePartialSearchActivity_ViewBinding(final BasePartialSearchActivity basePartialSearchActivity, View view) {
        super(basePartialSearchActivity, view);
        this.MediaBrowserCompat$ItemReceiver = basePartialSearchActivity;
        View IconCompatParcelizer = onStart.IconCompatParcelizer(view, R.id.btClear, "field 'btClear' and method 'onClearClick'");
        basePartialSearchActivity.btClear = (ImageButton) onStart.write(IconCompatParcelizer, R.id.btClear, "field 'btClear'", ImageButton.class);
        this.write = IconCompatParcelizer;
        IconCompatParcelizer.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                BasePartialSearchActivity.this.onClearClick();
            }
        });
        View IconCompatParcelizer2 = onStart.IconCompatParcelizer(view, R.id.btScan, "field 'btScan' and method 'onScanClick'");
        basePartialSearchActivity.btScan = (ImageButton) onStart.write(IconCompatParcelizer2, R.id.btScan, "field 'btScan'", ImageButton.class);
        this.MediaBrowserCompat$CustomActionResultReceiver = IconCompatParcelizer2;
        IconCompatParcelizer2.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                BasePartialSearchActivity.this.onScanClick();
            }
        });
        basePartialSearchActivity.etSearch = (AppCompatEditText) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.etSearch, "field 'etSearch'", AppCompatEditText.class);
        basePartialSearchActivity.ivError = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.ivError, "field 'ivError'", ImageView.class);
        basePartialSearchActivity.layoutSearchResult = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.layoutSearchResult, "field 'layoutSearchResult'", LinearLayout.class);
        basePartialSearchActivity.layoutContainer = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.layoutContainer, "field 'layoutContainer'", LinearLayout.class);
        basePartialSearchActivity.layoutEmpty = (ConstraintLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.layoutEmpty, "field 'layoutEmpty'", ConstraintLayout.class);
        basePartialSearchActivity.layoutSearchHint = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.layoutSearchHint, "field 'layoutSearchHint'", LinearLayout.class);
        basePartialSearchActivity.tvSearchHintDescription = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tvSearchHintDescription, "field 'tvSearchHintDescription'", TextView.class);
        basePartialSearchActivity.layoutTxnLoading = (RelativeLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.layoutTxnLoading, "field 'layoutTxnLoading'", RelativeLayout.class);
        basePartialSearchActivity.recyclerView = (RecyclerView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.recyclerView, "field 'recyclerView'", RecyclerView.class);
        basePartialSearchActivity.scrollContainer = (NestedScrollView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.scrollContainer, "field 'scrollContainer'", NestedScrollView.class);
        basePartialSearchActivity.tvErrorDescription = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tvErrorDescription, "field 'tvErrorDescription'", TextView.class);
        basePartialSearchActivity.tvErrorTitle = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tvErrorTitle, "field 'tvErrorTitle'", TextView.class);
        basePartialSearchActivity.tvTotalRecords = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tvTotalRecords, "field 'tvTotalRecords'", TextView.class);
    }

    public final void read() {
        BasePartialSearchActivity basePartialSearchActivity = this.MediaBrowserCompat$ItemReceiver;
        if (basePartialSearchActivity != null) {
            this.MediaBrowserCompat$ItemReceiver = null;
            basePartialSearchActivity.btClear = null;
            basePartialSearchActivity.btScan = null;
            basePartialSearchActivity.etSearch = null;
            basePartialSearchActivity.ivError = null;
            basePartialSearchActivity.layoutSearchResult = null;
            basePartialSearchActivity.layoutContainer = null;
            basePartialSearchActivity.layoutEmpty = null;
            basePartialSearchActivity.layoutSearchHint = null;
            basePartialSearchActivity.tvSearchHintDescription = null;
            basePartialSearchActivity.layoutTxnLoading = null;
            basePartialSearchActivity.recyclerView = null;
            basePartialSearchActivity.scrollContainer = null;
            basePartialSearchActivity.tvErrorDescription = null;
            basePartialSearchActivity.tvErrorTitle = null;
            basePartialSearchActivity.tvTotalRecords = null;
            this.write.setOnClickListener((View.OnClickListener) null);
            this.write = null;
            this.MediaBrowserCompat$CustomActionResultReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
