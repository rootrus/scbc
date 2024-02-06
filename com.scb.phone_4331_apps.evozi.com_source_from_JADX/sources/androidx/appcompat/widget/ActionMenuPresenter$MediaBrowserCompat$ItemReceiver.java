package androidx.appcompat.widget;

import android.content.Context;
import android.view.View;
import androidx.appcompat.view.menu.MenuItemImpl;
import androidx.appcompat.widget.ActionMenuPresenter;
import p040o.AlertController$RecycleListView;
import p040o.setCustomView;
import p040o.setPrimaryBackground;
import p040o.setSplitBackground;
import p040o.setStackedBackground$MediaBrowserCompat$ItemReceiver;

class ActionMenuPresenter$MediaBrowserCompat$ItemReceiver extends setSplitBackground {
    final /* synthetic */ ActionMenuPresenter RatingCompat;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ActionMenuPresenter$MediaBrowserCompat$ItemReceiver(ActionMenuPresenter actionMenuPresenter, Context context, setCustomView setcustomview, View view) {
        super(context, setcustomview, view, false, AlertController$RecycleListView.read.actionOverflowMenuStyle);
        this.RatingCompat = actionMenuPresenter;
        if (!((((MenuItemImpl) setcustomview.getItem()).MediaBrowserCompat$ItemReceiver & 32) == 32)) {
            this.MediaBrowserCompat$CustomActionResultReceiver = actionMenuPresenter.write == null ? (View) actionMenuPresenter.PlaybackStateCompat : actionMenuPresenter.write;
        }
        ActionMenuPresenter.IconCompatParcelizer iconCompatParcelizer = actionMenuPresenter.MediaDescriptionCompat;
        this.MediaBrowserCompat$MediaItem = iconCompatParcelizer;
        setPrimaryBackground setprimarybackground = this.MediaBrowserCompat$ItemReceiver;
        if (setprimarybackground != null) {
            setprimarybackground.MediaBrowserCompat$ItemReceiver((setStackedBackground$MediaBrowserCompat$ItemReceiver) iconCompatParcelizer);
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        this.RatingCompat.read = null;
        this.RatingCompat.MediaBrowserCompat$ItemReceiver = 0;
        super.MediaBrowserCompat$CustomActionResultReceiver();
    }
}
