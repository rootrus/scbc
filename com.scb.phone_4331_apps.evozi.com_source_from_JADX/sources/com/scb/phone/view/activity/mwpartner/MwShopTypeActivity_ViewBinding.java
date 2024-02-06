package com.scb.phone.view.activity.mwpartner;

import android.view.View;
import android.widget.Button;
import androidx.recyclerview.widget.RecyclerView;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public class MwShopTypeActivity_ViewBinding extends BaseActivity_ViewBinding {
    private View MediaBrowserCompat$CustomActionResultReceiver;
    private MwShopTypeActivity MediaBrowserCompat$ItemReceiver;

    public MwShopTypeActivity_ViewBinding(final MwShopTypeActivity mwShopTypeActivity, View view) {
        super(mwShopTypeActivity, view);
        this.MediaBrowserCompat$ItemReceiver = mwShopTypeActivity;
        mwShopTypeActivity.recyclerView = (RecyclerView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.recycler_view, "field 'recyclerView'", RecyclerView.class);
        View IconCompatParcelizer = onStart.IconCompatParcelizer(view, R.id.btn_mw_next, "field 'btnNext' and method 'onClickNext'");
        mwShopTypeActivity.btnNext = (Button) onStart.write(IconCompatParcelizer, R.id.btn_mw_next, "field 'btnNext'", Button.class);
        this.MediaBrowserCompat$CustomActionResultReceiver = IconCompatParcelizer;
        IconCompatParcelizer.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                MwShopTypeActivity.this.onClickNext();
            }
        });
    }

    public final void read() {
        MwShopTypeActivity mwShopTypeActivity = this.MediaBrowserCompat$ItemReceiver;
        if (mwShopTypeActivity != null) {
            this.MediaBrowserCompat$ItemReceiver = null;
            mwShopTypeActivity.recyclerView = null;
            mwShopTypeActivity.btnNext = null;
            this.MediaBrowserCompat$CustomActionResultReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
