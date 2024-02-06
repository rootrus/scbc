package com.scb.phone.view.custom.easycash;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.scb.phone.R;
import p040o.C3758xd990f62c;
import p040o.HmlPinActivity;
import p040o.PhenotypeFlag;
import p040o.RestrictedComponentContainer;

public class CustomInfoItem extends RelativeLayout {
    @BindView
    LinearLayout infoDetails;
    @BindView
    TextView item_bottom;
    @BindView
    TextView item_left;
    @BindView
    TextView item_right;
    @HmlPinActivity
    PhenotypeFlag.zza useCase;

    public CustomInfoItem(Context context, RestrictedComponentContainer restrictedComponentContainer) {
        super(context);
        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService("layout_inflater");
        String str = restrictedComponentContainer.MediaBrowserCompat$CustomActionResultReceiver;
        if (((str.hashCode() != 103431 || !str.equals("hml")) ? (char) 65535 : 0) != 0) {
            layoutInflater.inflate(R.layout.f90752131494302, this, true);
        } else {
            layoutInflater.inflate(R.layout.f90652131494292, this, true);
        }
        ButterKnife.IconCompatParcelizer(this);
        write(restrictedComponentContainer);
    }

    private void write(RestrictedComponentContainer restrictedComponentContainer) {
        View view;
        this.item_left.setText(restrictedComponentContainer.IconCompatParcelizer);
        this.item_right.setText(restrictedComponentContainer.MediaBrowserCompat$ItemReceiver);
        String str = restrictedComponentContainer.write;
        if (str != null && !str.isEmpty()) {
            this.item_bottom.setText(str);
            this.item_bottom.setVisibility(0);
        } else if (restrictedComponentContainer.read != null && !restrictedComponentContainer.read.isEmpty()) {
            for (C3758xd990f62c next : restrictedComponentContainer.read) {
                if ("normal".equals(next.IconCompatParcelizer)) {
                    String str2 = restrictedComponentContainer.MediaBrowserCompat$CustomActionResultReceiver;
                    char c = 65535;
                    if (str2.hashCode() == 103431 && str2.equals("hml")) {
                        c = 0;
                    }
                    if (c != 0) {
                        view = inflate(this.infoDetails.getContext(), R.layout.f90762131494303, (ViewGroup) null);
                    } else {
                        view = inflate(this.infoDetails.getContext(), R.layout.f90662131494293, (ViewGroup) null);
                    }
                    this.infoDetails.addView(view);
                    TextView textView = (TextView) view.findViewById(R.id.detail_text);
                    textView.setText(next.MediaBrowserCompat$CustomActionResultReceiver);
                    if (next.read != 0) {
                        textView.setTextColor(next.read);
                    }
                } else {
                    View inflate = inflate(this.infoDetails.getContext(), R.layout.f90772131494304, (ViewGroup) null);
                    this.infoDetails.addView(inflate);
                    ((TextView) inflate.findViewById(R.id.detail_text)).setText(next.MediaBrowserCompat$CustomActionResultReceiver);
                }
            }
        }
    }
}
