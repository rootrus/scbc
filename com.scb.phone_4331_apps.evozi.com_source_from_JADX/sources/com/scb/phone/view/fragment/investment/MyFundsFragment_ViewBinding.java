package com.scb.phone.view.fragment.investment;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.scb.phone.R;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onStart;

public class MyFundsFragment_ViewBinding extends BaseFragment_ViewBinding {
    private MyFundsFragment MediaBrowserCompat$ItemReceiver;

    public MyFundsFragment_ViewBinding(MyFundsFragment myFundsFragment, View view) {
        super(myFundsFragment, view);
        this.MediaBrowserCompat$ItemReceiver = myFundsFragment;
        myFundsFragment.recyclerView = (RecyclerView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.investment_details_my_funds_recycler_view, "field 'recyclerView'", RecyclerView.class);
        myFundsFragment.errorTextView = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.investment_details_my_funds_error, "field 'errorTextView'", TextView.class);
    }

    public final void read() {
        MyFundsFragment myFundsFragment = this.MediaBrowserCompat$ItemReceiver;
        if (myFundsFragment != null) {
            this.MediaBrowserCompat$ItemReceiver = null;
            myFundsFragment.recyclerView = null;
            myFundsFragment.errorTextView = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
