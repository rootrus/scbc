package com.scb.phone.view.activity.mwpartner;

import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import androidx.recyclerview.widget.RecyclerView;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public class MwSearchMarketMallActivity_ViewBinding extends BaseActivity_ViewBinding {
    private MwSearchMarketMallActivity IconCompatParcelizer;
    private View MediaBrowserCompat$ItemReceiver;

    public MwSearchMarketMallActivity_ViewBinding(final MwSearchMarketMallActivity mwSearchMarketMallActivity, View view) {
        super(mwSearchMarketMallActivity, view);
        this.IconCompatParcelizer = mwSearchMarketMallActivity;
        mwSearchMarketMallActivity.recyclerView = (RecyclerView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.mw_recycler_view, "field 'recyclerView'", RecyclerView.class);
        mwSearchMarketMallActivity.searchEditText = (EditText) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.mw_search_edit_text, "field 'searchEditText'", EditText.class);
        View IconCompatParcelizer2 = onStart.IconCompatParcelizer(view, R.id.mw_search_edit_clear, "field 'searchClearButton' and method 'clearButtonClick'");
        mwSearchMarketMallActivity.searchClearButton = (ImageButton) onStart.write(IconCompatParcelizer2, R.id.mw_search_edit_clear, "field 'searchClearButton'", ImageButton.class);
        this.MediaBrowserCompat$ItemReceiver = IconCompatParcelizer2;
        IconCompatParcelizer2.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                MwSearchMarketMallActivity.this.clearButtonClick();
            }
        });
    }

    public final void read() {
        MwSearchMarketMallActivity mwSearchMarketMallActivity = this.IconCompatParcelizer;
        if (mwSearchMarketMallActivity != null) {
            this.IconCompatParcelizer = null;
            mwSearchMarketMallActivity.recyclerView = null;
            mwSearchMarketMallActivity.searchEditText = null;
            mwSearchMarketMallActivity.searchClearButton = null;
            this.MediaBrowserCompat$ItemReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$ItemReceiver = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
