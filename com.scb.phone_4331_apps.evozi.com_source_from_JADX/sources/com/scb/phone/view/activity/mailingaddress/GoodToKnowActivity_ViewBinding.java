package com.scb.phone.view.activity.mailingaddress;

import android.view.View;
import android.widget.Button;
import androidx.recyclerview.widget.RecyclerView;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public final class GoodToKnowActivity_ViewBinding extends BaseActivity_ViewBinding {
    private View MediaBrowserCompat$CustomActionResultReceiver;
    private GoodToKnowActivity write;

    public GoodToKnowActivity_ViewBinding(final GoodToKnowActivity goodToKnowActivity, View view) {
        super(goodToKnowActivity, view);
        this.write = goodToKnowActivity;
        goodToKnowActivity.recyclerView = (RecyclerView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.recycler_view_good_to_know, "field 'recyclerView'", RecyclerView.class);
        View IconCompatParcelizer = onStart.IconCompatParcelizer(view, R.id.button_next, "field 'nextButton' and method 'onNextClick'");
        goodToKnowActivity.nextButton = (Button) onStart.write(IconCompatParcelizer, R.id.button_next, "field 'nextButton'", Button.class);
        this.MediaBrowserCompat$CustomActionResultReceiver = IconCompatParcelizer;
        IconCompatParcelizer.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                GoodToKnowActivity.this.onNextClick();
            }
        });
    }

    public final void read() {
        GoodToKnowActivity goodToKnowActivity = this.write;
        if (goodToKnowActivity != null) {
            this.write = null;
            goodToKnowActivity.recyclerView = null;
            goodToKnowActivity.nextButton = null;
            this.MediaBrowserCompat$CustomActionResultReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
