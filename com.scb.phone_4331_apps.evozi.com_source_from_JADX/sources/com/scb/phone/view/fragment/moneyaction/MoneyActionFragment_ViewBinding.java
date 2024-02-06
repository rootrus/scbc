package com.scb.phone.view.fragment.moneyaction;

import android.view.View;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.scb.phone.R;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public class MoneyActionFragment_ViewBinding extends BaseFragment_ViewBinding {
    private MoneyActionFragment IconCompatParcelizer;
    private View write;

    public MoneyActionFragment_ViewBinding(final MoneyActionFragment moneyActionFragment, View view) {
        super(moneyActionFragment, view);
        this.IconCompatParcelizer = moneyActionFragment;
        moneyActionFragment.mRecyclerView = (RecyclerView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.money_action_recycler_view, "field 'mRecyclerView'", RecyclerView.class);
        View IconCompatParcelizer2 = onStart.IconCompatParcelizer(view, R.id.money_action_image_view, "field 'mImageView' and method 'onOutsideClick'");
        moneyActionFragment.mImageView = (ImageView) onStart.write(IconCompatParcelizer2, R.id.money_action_image_view, "field 'mImageView'", ImageView.class);
        this.write = IconCompatParcelizer2;
        IconCompatParcelizer2.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                MoneyActionFragment.this.onOutsideClick();
            }
        });
        moneyActionFragment.bgMoneyMovement = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.bg_money_movement, "field 'bgMoneyMovement'", ImageView.class);
    }

    public final void read() {
        MoneyActionFragment moneyActionFragment = this.IconCompatParcelizer;
        if (moneyActionFragment != null) {
            this.IconCompatParcelizer = null;
            moneyActionFragment.mRecyclerView = null;
            moneyActionFragment.mImageView = null;
            moneyActionFragment.bgMoneyMovement = null;
            this.write.setOnClickListener((View.OnClickListener) null);
            this.write = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
