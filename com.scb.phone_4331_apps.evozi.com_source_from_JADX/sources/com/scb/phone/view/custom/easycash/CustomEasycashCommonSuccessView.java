package com.scb.phone.view.custom.easycash;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.scb.phone.R;
import com.scb.phone.view.custom.transferandpay.CustomTransferAndPaySource;
import java.util.List;
import p040o.RestrictedComponentContainer;
import p040o.dropBreadcrumb;
import p040o.getICheckDeserializerRtti;
import p040o.setLastBaselineToBottomHeight;

public class CustomEasycashCommonSuccessView extends LinearLayout {
    @BindView
    CustomSeparatedViews contentOne;
    @BindView
    CustomSeparatedViews contentThree;
    @BindView
    CustomSeparatedViews contentTwo;
    @BindView
    CustomEasyCashSectionLabel labelOne;
    @BindView
    CustomEasyCashSectionLabel labelThree;
    @BindView
    CustomEasyCashSectionLabel labelTwo;

    public CustomEasycashCommonSuccessView(Context context) {
        super(context);
        inflate(getContext(), R.layout.f80582131493283, this);
        ButterKnife.IconCompatParcelizer(this);
    }

    public CustomEasycashCommonSuccessView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        inflate(getContext(), R.layout.f80582131493283, this);
        ButterKnife.IconCompatParcelizer(this);
    }

    public CustomEasycashCommonSuccessView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        inflate(getContext(), R.layout.f80582131493283, this);
        ButterKnife.IconCompatParcelizer(this);
    }

    public final void IconCompatParcelizer(dropBreadcrumb dropbreadcrumb, int i, boolean z, int i2) {
        if (i != 1) {
            if (i == 2) {
                read(this.labelTwo, this.contentTwo, dropbreadcrumb, z);
            } else if (i == 3) {
                read(this.labelThree, this.contentThree, dropbreadcrumb, z);
            }
        } else if (z) {
            CustomSeparatedViews customSeparatedViews = this.contentOne;
            Context context = getContext();
            List<RestrictedComponentContainer> list = dropbreadcrumb.MediaBrowserCompat$ItemReceiver;
            customSeparatedViews.items.removeAllViews();
            for (int i3 = 0; i3 < list.size(); i3++) {
                if (i3 == i2) {
                    CustomTransferAndPaySource customTransferAndPaySource = new CustomTransferAndPaySource(context);
                    customTransferAndPaySource.setText(context.getString(R.string.success_transfer_to));
                    customTransferAndPaySource.setSourceName(list.get(i3).IconCompatParcelizer);
                    customTransferAndPaySource.setAccountNumber(list.get(i3).MediaBrowserCompat$ItemReceiver);
                    customTransferAndPaySource.setAvatar(getICheckDeserializerRtti.write(customSeparatedViews.getContext(), (int) R.drawable.bankicon_scb).toString());
                    customTransferAndPaySource.setDivider(false);
                    customSeparatedViews.items.addView(customTransferAndPaySource);
                    if (i3 < list.size() - 1) {
                        CustomSeparatedViews.inflate(customSeparatedViews.getContext(), R.layout.f84732131493700, customSeparatedViews.items);
                    }
                } else {
                    String str = list.get(i3).MediaBrowserCompat$ItemReceiver;
                    if (!(str == null || str.length() == 0) || (list.get(i3).read != null && !list.get(i3).read.isEmpty())) {
                        customSeparatedViews.items.addView(new CustomInfoItem(customSeparatedViews.getContext(), list.get(i3)));
                        if (i3 < list.size() - 1) {
                            CustomSeparatedViews.inflate(customSeparatedViews.getContext(), R.layout.f84732131493700, customSeparatedViews.items);
                        }
                    }
                }
            }
        } else {
            read((CustomEasyCashSectionLabel) null, this.contentOne, dropbreadcrumb, false);
        }
    }

    private void read(CustomEasyCashSectionLabel customEasyCashSectionLabel, CustomSeparatedViews customSeparatedViews, dropBreadcrumb dropbreadcrumb, boolean z) {
        if (customEasyCashSectionLabel != null) {
            customEasyCashSectionLabel.setVisibility(0);
            customEasyCashSectionLabel.setText(dropbreadcrumb.read);
            if (!z) {
                customEasyCashSectionLabel.setBackgroundColor(setLastBaselineToBottomHeight.read(getContext(), R.color.f66132131099768));
            } else {
                customEasyCashSectionLabel.topDivider.setVisibility(0);
                customEasyCashSectionLabel.bottomDivider.setVisibility(0);
            }
        }
        customSeparatedViews.IconCompatParcelizer(dropbreadcrumb.MediaBrowserCompat$ItemReceiver, R.layout.f84732131493700);
    }
}
