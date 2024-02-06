package com.scb.phone.view.custom;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.scb.phone.R;
import com.scb.phone.view.adapter.etb.InformationPanelAdapter;
import java.util.ArrayList;
import java.util.List;
import p040o.ZHER2K$MediaBrowserCompat$CustomActionResultReceiver;
import p040o.access$2600;

public class CustomInformationList extends LinearLayout {
    private InformationPanelAdapter IconCompatParcelizer;
    private String MediaBrowserCompat$ItemReceiver;
    @BindView
    TextView tvBottomDetail1;
    @BindView
    TextView tvBottomDetail2;
    @BindView
    TextView tvBottomTitle;
    @BindView
    TextView tvTitle;
    @BindView
    RelativeLayout vBottom;
    @BindView
    RecyclerView vRecycler;

    public CustomInformationList(Context context) {
        super(context);
    }

    public CustomInformationList(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ZHER2K$MediaBrowserCompat$CustomActionResultReceiver.CustomInformationList, 0, 0);
        this.MediaBrowserCompat$ItemReceiver = obtainStyledAttributes.getString(0);
        obtainStyledAttributes.recycle();
        ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(R.layout.f82122131493438, this, true);
        ButterKnife.IconCompatParcelizer(this);
        this.IconCompatParcelizer = new InformationPanelAdapter();
        RecyclerView recyclerView = this.vRecycler;
        getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        this.vRecycler.setAdapter(this.IconCompatParcelizer);
        this.vBottom.setVisibility(8);
        this.tvTitle.setText(this.MediaBrowserCompat$ItemReceiver);
    }

    public void setTitle(String str) {
        this.MediaBrowserCompat$ItemReceiver = str;
        this.tvTitle.setText(str);
    }

    public void setTitleBackground(int i) {
        this.tvTitle.setBackgroundResource(i);
    }

    public void setBottomViewVisibility(boolean z) {
        this.vBottom.setVisibility(z ? 0 : 8);
    }

    public void setItems(List<access$2600> list, boolean z) {
        ArrayList<access$2600> arrayList = new ArrayList<>(list);
        if (z) {
            access$2600 access_2600 = (access$2600) arrayList.get(arrayList.size() - 1);
            String str = access_2600.RatingCompat;
            String str2 = access_2600.IconCompatParcelizer;
            String str3 = access_2600.MediaBrowserCompat$ItemReceiver;
            this.vBottom.setVisibility(0);
            this.tvBottomTitle.setText(str);
            this.tvBottomDetail1.setText(str2);
            this.tvBottomDetail2.setText(str3);
            arrayList.remove(access_2600);
        }
        ArrayList arrayList2 = new ArrayList();
        for (access$2600 access_26002 : arrayList) {
            InformationPanelAdapter.read read = new InformationPanelAdapter.read();
            read.MediaBrowserCompat$ItemReceiver = access_26002.RatingCompat;
            read.MediaBrowserCompat$CustomActionResultReceiver = access_26002.MediaBrowserCompat$CustomActionResultReceiver;
            read.IconCompatParcelizer = access_26002.IconCompatParcelizer;
            read.write = access_26002.MediaBrowserCompat$ItemReceiver;
            read.read = access_26002.read;
            arrayList2.add(read);
        }
        InformationPanelAdapter informationPanelAdapter = this.IconCompatParcelizer;
        informationPanelAdapter.read.clear();
        informationPanelAdapter.read.addAll(arrayList2);
        informationPanelAdapter.IconCompatParcelizer.write();
    }
}
