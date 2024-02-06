package com.scb.phone.view.fragment.transferandpay.cardlessatm;

import android.view.View;
import android.widget.TextView;
import com.scb.phone.R;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public class CardlessATMTutorialFragment_ViewBinding extends BaseFragment_ViewBinding {
    private CardlessATMTutorialFragment MediaBrowserCompat$CustomActionResultReceiver;
    private View MediaBrowserCompat$ItemReceiver;

    public CardlessATMTutorialFragment_ViewBinding(final CardlessATMTutorialFragment cardlessATMTutorialFragment, View view) {
        super(cardlessATMTutorialFragment, view);
        this.MediaBrowserCompat$CustomActionResultReceiver = cardlessATMTutorialFragment;
        cardlessATMTutorialFragment.cardlessDescription = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.textview_cardless_atm, "field 'cardlessDescription'", TextView.class);
        View IconCompatParcelizer = onStart.IconCompatParcelizer(view, R.id.button_continue, "method 'onGetStartedClicked'");
        this.MediaBrowserCompat$ItemReceiver = IconCompatParcelizer;
        IconCompatParcelizer.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                CardlessATMTutorialFragment.this.onGetStartedClicked();
            }
        });
    }

    public final void read() {
        CardlessATMTutorialFragment cardlessATMTutorialFragment = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (cardlessATMTutorialFragment != null) {
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            cardlessATMTutorialFragment.cardlessDescription = null;
            this.MediaBrowserCompat$ItemReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$ItemReceiver = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
