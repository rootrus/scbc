package com.scb.phone.view.custom.common;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RelativeLayout;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.scb.phone.R;
import p040o.FragmentBuilder_BindBilledDetailFragment;

public class CustomCustomizePageItem extends RelativeLayout {
    private FragmentBuilder_BindBilledDetailFragment IconCompatParcelizer;
    @BindView
    public CheckBox checkBox;
    @BindView
    TextView description;
    @BindView
    View divider;
    @BindView
    TextView title;

    public CustomCustomizePageItem(Context context) {
        super(context);
        if (!isInEditMode()) {
            ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(R.layout.f81602131493386, this, true);
            ButterKnife.IconCompatParcelizer(this);
        }
    }

    public CustomCustomizePageItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (!isInEditMode()) {
            ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(R.layout.f81602131493386, this, true);
            ButterKnife.IconCompatParcelizer(this);
        }
    }

    public CustomCustomizePageItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (!isInEditMode()) {
            ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(R.layout.f81602131493386, this, true);
            ButterKnife.IconCompatParcelizer(this);
        }
    }

    @OnClick
    public void onToggleCheckedChanged() {
        FragmentBuilder_BindBilledDetailFragment fragmentBuilder_BindBilledDetailFragment = this.IconCompatParcelizer;
        if (fragmentBuilder_BindBilledDetailFragment != null) {
            this.checkBox.isChecked();
            fragmentBuilder_BindBilledDetailFragment.MediaBrowserCompat$ItemReceiver();
        }
    }

    public void setTitle(String str) {
        this.title.setText(str);
    }

    public void setDescription(String str) {
        this.description.setText(str);
    }

    public void setDividerVisible(boolean z) {
        this.divider.setVisibility(z ? 0 : 8);
    }

    public void setOnCustomCustomizePageItemClickListener(FragmentBuilder_BindBilledDetailFragment fragmentBuilder_BindBilledDetailFragment) {
        this.IconCompatParcelizer = fragmentBuilder_BindBilledDetailFragment;
    }

    public void setToggleStatus(boolean z) {
        this.checkBox.setChecked(z);
    }
}
