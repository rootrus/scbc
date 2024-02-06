package com.scb.phone.view.activity.investment.scbs;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public class OffshoreCurrencyActivity_ViewBinding extends BaseActivity_ViewBinding {
    private View IconCompatParcelizer;
    private OffshoreCurrencyActivity write;

    public OffshoreCurrencyActivity_ViewBinding(final OffshoreCurrencyActivity offshoreCurrencyActivity, View view) {
        super(offshoreCurrencyActivity, view);
        this.write = offshoreCurrencyActivity;
        offshoreCurrencyActivity.recyclerView = (RecyclerView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.recycler_view, "field 'recyclerView'", RecyclerView.class);
        offshoreCurrencyActivity.sourceTV = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_source, "field 'sourceTV'", TextView.class);
        View IconCompatParcelizer2 = onStart.IconCompatParcelizer(view, R.id.bt_trade_now, "field 'buttonTradeNow' and method 'onClickTrade'");
        offshoreCurrencyActivity.buttonTradeNow = (Button) onStart.write(IconCompatParcelizer2, R.id.bt_trade_now, "field 'buttonTradeNow'", Button.class);
        this.IconCompatParcelizer = IconCompatParcelizer2;
        IconCompatParcelizer2.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                OffshoreCurrencyActivity.this.onClickTrade();
            }
        });
    }

    public final void read() {
        OffshoreCurrencyActivity offshoreCurrencyActivity = this.write;
        if (offshoreCurrencyActivity != null) {
            this.write = null;
            offshoreCurrencyActivity.recyclerView = null;
            offshoreCurrencyActivity.sourceTV = null;
            offshoreCurrencyActivity.buttonTradeNow = null;
            this.IconCompatParcelizer.setOnClickListener((View.OnClickListener) null);
            this.IconCompatParcelizer = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
