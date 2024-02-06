package com.scb.phone.view.fragment.cardmanagement;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.scb.phone.R;
import java.util.HashMap;
import p040o.FirebaseTooManyRequestsException;
import p040o.ZHER2K;
import p040o.onGetStartedClick;
import p040o.requestForm;

public final class AmortizationBreakdownAmountTabFragment extends BaseAmortizationAmountTabFragment {
    public static final C5865x86bbd087 IconCompatParcelizer = new C5865x86bbd087((byte) 0);
    private HashMap MediaBrowserCompat$CustomActionResultReceiver;

    public final View IconCompatParcelizer(int i) {
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

    public final void IconCompatParcelizer() {
        HashMap hashMap = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        onGetStartedClick.write((Object) layoutInflater, "inflater");
        return LayoutInflater.from(getContext()).inflate(R.layout.f85662131493793, viewGroup, false);
    }

    public final void write(FirebaseTooManyRequestsException firebaseTooManyRequestsException) {
        onGetStartedClick.write((Object) firebaseTooManyRequestsException, "display");
        RecyclerView recyclerView = (RecyclerView) IconCompatParcelizer(ZHER2K.write.rvItems);
        onGetStartedClick.IconCompatParcelizer((Object) recyclerView, "rvItems");
        recyclerView.setNestedScrollingEnabled(false);
        RecyclerView recyclerView2 = (RecyclerView) IconCompatParcelizer(ZHER2K.write.rvItems);
        onGetStartedClick.IconCompatParcelizer((Object) recyclerView2, "rvItems");
        getContext();
        recyclerView2.setLayoutManager(new LinearLayoutManager());
        RecyclerView recyclerView3 = (RecyclerView) IconCompatParcelizer(ZHER2K.write.rvItems);
        onGetStartedClick.IconCompatParcelizer((Object) recyclerView3, "rvItems");
        requestForm requestform = new requestForm();
        requestForm.read read = requestForm.read.BREAKDOWN;
        onGetStartedClick.write((Object) read, "<set-?>");
        requestform.MediaBrowserCompat$ItemReceiver = read;
        requestform.write = firebaseTooManyRequestsException;
        recyclerView3.setAdapter(requestform);
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        HashMap hashMap = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (hashMap != null) {
            hashMap.clear();
        }
    }
}
