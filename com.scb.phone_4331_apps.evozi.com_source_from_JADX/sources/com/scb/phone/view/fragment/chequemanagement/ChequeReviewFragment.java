package com.scb.phone.view.fragment.chequemanagement;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import butterknife.OnClick;
import com.scb.phone.R;
import p040o.setUuidFromUtf8Bytes;

public class ChequeReviewFragment extends BaseChequeReviewFragment {
    private setUuidFromUtf8Bytes IconCompatParcelizer;
    public read MediaBrowserCompat$CustomActionResultReceiver;

    @FunctionalInterface
    public interface read {
        void write(setUuidFromUtf8Bytes setuuidfromutf8bytes);
    }

    public static ChequeReviewFragment IconCompatParcelizer(setUuidFromUtf8Bytes setuuidfromutf8bytes) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.scb.phone.EXTRA_REVIEW", setuuidfromutf8bytes);
        ChequeReviewFragment chequeReviewFragment = new ChequeReviewFragment();
        chequeReviewFragment.setArguments(bundle);
        return chequeReviewFragment;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.f86162131493843, viewGroup, false);
        setUuidFromUtf8Bytes setuuidfromutf8bytes = (setUuidFromUtf8Bytes) getArguments().getParcelable("com.scb.phone.EXTRA_REVIEW");
        this.IconCompatParcelizer = setuuidfromutf8bytes;
        MediaBrowserCompat$CustomActionResultReceiver(setuuidfromutf8bytes, inflate, getContext());
        setTransitioning();
        return inflate;
    }

    @OnClick
    public void onConfirmButtonClick() {
        read read2 = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (read2 != null) {
            read2.write(this.IconCompatParcelizer);
        }
    }
}
