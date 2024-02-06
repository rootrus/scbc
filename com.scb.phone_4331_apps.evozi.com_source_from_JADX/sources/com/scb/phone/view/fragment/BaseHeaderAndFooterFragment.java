package com.scb.phone.view.fragment;

import android.os.Bundle;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.scb.phone.R;
import java.util.List;
import p040o.TabParser$TabParserException;
import p040o.preauthenticate;

public abstract class BaseHeaderAndFooterFragment<T> extends BaseFragment {
    private TabParser$TabParserException<T> MediaBrowserCompat$CustomActionResultReceiver;
    @BindView
    RecyclerView recyclerView;

    /* access modifiers changed from: protected */
    public abstract TabParser$TabParserException<T> IconCompatParcelizer(LayoutInflater layoutInflater, ViewGroup viewGroup);

    /* access modifiers changed from: protected */
    public int write() {
        return 0;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.f85752131493802, viewGroup, false);
        ButterKnife.IconCompatParcelizer(this, inflate);
        TabParser$TabParserException<T> IconCompatParcelizer = IconCompatParcelizer(layoutInflater, viewGroup);
        this.MediaBrowserCompat$CustomActionResultReceiver = IconCompatParcelizer;
        this.recyclerView.setAdapter(IconCompatParcelizer);
        getContext();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager();
        linearLayoutManager.MediaMetadataCompat(1);
        this.recyclerView.setLayoutManager(linearLayoutManager);
        this.recyclerView.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        this.recyclerView.MediaBrowserCompat$CustomActionResultReceiver((RecyclerView.RatingCompat) new preauthenticate((int) TypedValue.applyDimension(1, (float) write(), getResources().getDisplayMetrics())));
        return inflate;
    }

    public final void write(List<T> list) {
        this.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer(list);
    }
}
