package com.scb.phone.view.activity.bankingaccount;

import android.view.View;
import android.view.ViewGroup;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public class BankingActionActivity_ViewBinding extends BaseActivity_ViewBinding {
    private View MediaBrowserCompat$ItemReceiver;
    private BankingActionActivity write;

    public BankingActionActivity_ViewBinding(final BankingActionActivity bankingActionActivity, View view) {
        super(bankingActionActivity, view);
        this.write = bankingActionActivity;
        View IconCompatParcelizer = onStart.IconCompatParcelizer(view, R.id.tutorial_view, "field 'tutorialView' and method 'onClickTutorial'");
        bankingActionActivity.tutorialView = (ViewGroup) onStart.write(IconCompatParcelizer, R.id.tutorial_view, "field 'tutorialView'", ViewGroup.class);
        this.MediaBrowserCompat$ItemReceiver = IconCompatParcelizer;
        IconCompatParcelizer.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                BankingActionActivity.this.onClickTutorial();
            }
        });
    }

    public final void read() {
        BankingActionActivity bankingActionActivity = this.write;
        if (bankingActionActivity != null) {
            this.write = null;
            bankingActionActivity.tutorialView = null;
            this.MediaBrowserCompat$ItemReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$ItemReceiver = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
