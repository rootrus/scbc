package com.scb.phone.view.fragment.cardmanagement;

import android.os.Bundle;
import android.view.View;
import com.scb.phone.view.fragment.BaseFragment;
import java.util.HashMap;
import p040o.FirebaseTooManyRequestsException;

public abstract class BaseAmortizationAmountTabFragment extends BaseFragment {
    private HashMap MediaBrowserCompat$CustomActionResultReceiver;

    public View IconCompatParcelizer(int i) {
        if (this.MediaBrowserCompat$CustomActionResultReceiver == null) {
            this.MediaBrowserCompat$CustomActionResultReceiver = new HashMap();
        }
        View view = (View) this.MediaBrowserCompat$CustomActionResultReceiver.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.MediaBrowserCompat$CustomActionResultReceiver.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public void IconCompatParcelizer() {
        HashMap hashMap = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        IconCompatParcelizer();
    }

    public abstract void write(FirebaseTooManyRequestsException firebaseTooManyRequestsException);

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        Bundle arguments = getArguments();
        FirebaseTooManyRequestsException firebaseTooManyRequestsException = arguments != null ? (FirebaseTooManyRequestsException) arguments.getParcelable("EXTRA_SUMMARY_DISPLAY") : null;
        if (firebaseTooManyRequestsException != null) {
            write(firebaseTooManyRequestsException);
        }
    }
}
