package com.scb.phone.view.fragment.ebillsubscription;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$MediaBrowserCompat$SearchResultReceiver;
import com.scb.phone.R;
import com.scb.phone.view.adapter.transferandpay.BillerAdapter;
import p040o.ImagePerfectionProfile;
import p040o.onGetStartedClick;

/* renamed from: com.scb.phone.view.fragment.ebillsubscription.EBillSubscriptionBillerListFragment$MediaBrowserCompat$ItemReceiver */
final class C5946xa046d547 implements TextWatcher {
    private /* synthetic */ EBillSubscriptionBillerListFragment read;

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        onGetStartedClick.write((Object) charSequence, "charSequence");
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        onGetStartedClick.write((Object) charSequence, "charSequence");
    }

    public C5946xa046d547(EBillSubscriptionBillerListFragment eBillSubscriptionBillerListFragment) {
        this.read = eBillSubscriptionBillerListFragment;
    }

    public final void afterTextChanged(Editable editable) {
        onGetStartedClick.write((Object) editable, "editable");
        boolean z = true;
        if (editable.toString().length() == 0) {
            TextView textView = this.read.mRecommendedBillersTextView;
            if (textView == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("mRecommendedBillersTextView");
            }
            textView.setText(R.string.recommended_billers);
            GridLayoutManager gridLayoutManager = new GridLayoutManager(this.read.getContext(), 4);
            RecyclerView IconCompatParcelizer = this.read.mRecyclerView;
            onGetStartedClick.IconCompatParcelizer((Object) IconCompatParcelizer, "mRecyclerView");
            RecyclerView$MediaBrowserCompat$SearchResultReceiver recyclerView$MediaBrowserCompat$SearchResultReceiver = gridLayoutManager;
            IconCompatParcelizer.setLayoutManager(recyclerView$MediaBrowserCompat$SearchResultReceiver);
            BillerAdapter read2 = this.read.IconCompatParcelizer;
            read2.MediaBrowserCompat$ItemReceiver = recyclerView$MediaBrowserCompat$SearchResultReceiver;
            read2.write = false;
            RecyclerView$MediaBrowserCompat$SearchResultReceiver recyclerView$MediaBrowserCompat$SearchResultReceiver2 = read2.MediaBrowserCompat$ItemReceiver;
            if (recyclerView$MediaBrowserCompat$SearchResultReceiver2 == null || (recyclerView$MediaBrowserCompat$SearchResultReceiver2 instanceof GridLayoutManager)) {
                read2.write = true;
            }
            read2.IconCompatParcelizer.write();
            View view = this.read.mViewBillerNotFound;
            if (view == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("mViewBillerNotFound");
            }
            view.setVisibility(8);
            ImagePerfectionProfile.UseMRZPassportDetection useMRZPassportDetection = this.read.eBillSubscriptionBillerListPresenter;
            if (useMRZPassportDetection == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("eBillSubscriptionBillerListPresenter");
            }
            useMRZPassportDetection.write();
            RecyclerView IconCompatParcelizer2 = this.read.mRecyclerView;
            onGetStartedClick.IconCompatParcelizer((Object) IconCompatParcelizer2, "mRecyclerView");
            IconCompatParcelizer2.setVisibility(0);
        }
        Button button = this.read.mSearchButton;
        if (button == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("mSearchButton");
        }
        if (editable.toString().length() < 3) {
            z = false;
        }
        button.setEnabled(z);
    }
}
