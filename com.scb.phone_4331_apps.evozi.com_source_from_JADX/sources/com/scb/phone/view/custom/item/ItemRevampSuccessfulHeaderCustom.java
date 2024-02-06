package com.scb.phone.view.custom.item;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import butterknife.BindView;
import com.scb.phone.R;
import p040o.ForwardingFuture;
import p040o.HmlPinActivity;
import p040o.capSessionCount;
import p040o.onGetStartedClick;
import p040o.setLastBaselineToBottomHeight;

public final class ItemRevampSuccessfulHeaderCustom extends ItemSuccessfulHeaderCustom {
    @BindView
    protected LinearLayout layoutHeaderTitle;

    public final /* bridge */ /* synthetic */ void setUpWithDisplay(ForwardingFuture forwardingFuture) {
        setUpWithDisplay((capSessionCount) forwardingFuture);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @HmlPinActivity
    public ItemRevampSuccessfulHeaderCustom(Context context) {
        super(context);
        onGetStartedClick.write((Object) context, "context");
    }

    public final void setUpWithDisplay(capSessionCount capsessioncount) {
        super.setUpWithDisplay(capsessioncount);
        if (capsessioncount != null && capsessioncount.MediaBrowserCompat$ItemReceiver > 0) {
            int read = setLastBaselineToBottomHeight.read(this.write, capsessioncount.MediaBrowserCompat$ItemReceiver);
            this.componentExtra.setTextColor(read);
            this.componentMoreExtra.setTextColor(read);
        }
    }

    public final void read() {
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.f73252131165576);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.f72532131165444);
        ImageView imageView = this.componentIcon;
        onGetStartedClick.IconCompatParcelizer((Object) imageView, "componentIcon");
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            layoutParams = null;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        if (marginLayoutParams != null) {
            marginLayoutParams.height = dimensionPixelSize;
        }
        if (marginLayoutParams != null) {
            marginLayoutParams.width = dimensionPixelSize;
        }
        if (marginLayoutParams != null) {
            marginLayoutParams.setMargins(0, 0, dimensionPixelSize2, 0);
        }
        ImageView imageView2 = this.componentIcon;
        onGetStartedClick.IconCompatParcelizer((Object) imageView2, "componentIcon");
        imageView2.setLayoutParams(marginLayoutParams);
        this.componentIcon.requestLayout();
        LinearLayout linearLayout = this.layoutHeaderTitle;
        if (linearLayout == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("layoutHeaderTitle");
        }
        linearLayout.getLayoutParams().width = -1;
        LinearLayout linearLayout2 = this.layoutHeaderTitle;
        if (linearLayout2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("layoutHeaderTitle");
        }
        linearLayout2.setOrientation(0);
        LinearLayout linearLayout3 = this.layoutHeaderTitle;
        if (linearLayout3 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("layoutHeaderTitle");
        }
        linearLayout3.requestLayout();
    }
}
