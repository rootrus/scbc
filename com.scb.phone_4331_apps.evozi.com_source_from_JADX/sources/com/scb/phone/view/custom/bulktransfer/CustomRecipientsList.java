package com.scb.phone.view.custom.bulktransfer;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.scb.phone.R;
import com.scb.phone.view.adapter.bulktransfer.RecipientsAdapter;
import com.scb.phone.view.custom.common.CustomLimit;
import java.util.ArrayList;
import java.util.List;
import p040o.Group;
import p040o.UncaughtExceptionHandlers;

public class CustomRecipientsList extends LinearLayout {
    private RecipientsAdapter MediaBrowserCompat$ItemReceiver;
    @BindView
    public CustomLimit customLimit;
    @BindView
    RecyclerView recipientsRecyclerView;
    @BindView
    TextView targetLabel;

    public CustomRecipientsList(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(R.layout.f84612131493687, this, true);
        ButterKnife.IconCompatParcelizer(this);
        setOrientation(1);
        RecyclerView recyclerView = this.recipientsRecyclerView;
        getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(1, false));
        this.recipientsRecyclerView.MediaBrowserCompat$CustomActionResultReceiver((RecyclerView.RatingCompat) new Group(getContext()));
        RecipientsAdapter recipientsAdapter = new RecipientsAdapter(new ArrayList());
        this.MediaBrowserCompat$ItemReceiver = recipientsAdapter;
        this.recipientsRecyclerView.setAdapter(recipientsAdapter);
        this.recipientsRecyclerView.setNestedScrollingEnabled(false);
    }

    public void setHeader(String str) {
        this.targetLabel.setText(str);
    }

    public void setRecipients(List<UncaughtExceptionHandlers> list) {
        RecipientsAdapter recipientsAdapter = this.MediaBrowserCompat$ItemReceiver;
        recipientsAdapter.read = list;
        recipientsAdapter.IconCompatParcelizer.write();
    }

    public void setOnRecipientChangeListener(RecipientsAdapter.read read) {
        RecipientsAdapter recipientsAdapter = this.MediaBrowserCompat$ItemReceiver;
        recipientsAdapter.MediaBrowserCompat$ItemReceiver = read;
        recipientsAdapter.IconCompatParcelizer.write();
    }

    public void setRemainingLimit(String str) {
        this.customLimit.setText(str);
    }
}
