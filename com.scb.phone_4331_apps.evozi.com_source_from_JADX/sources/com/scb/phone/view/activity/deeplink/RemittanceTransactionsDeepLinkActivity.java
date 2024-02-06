package com.scb.phone.view.activity.deeplink;

import android.content.Intent;
import com.scb.phone.view.activity.remittance.RemittanceSuccessActivity;
import com.scb.phone.view.activity.remittance.RemittanceSuccessActivity$MediaBrowserCompat$ItemReceiver;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;
import p040o.AbstractIndexedListIterator;
import p040o.Corners;
import p040o.HmlPinActivity;
import p040o.IsEdgeConfident;
import p040o.MyECouponActivity_ViewBinding;
import p040o.ZSYR2K;
import p040o.newIdExtractor;
import p040o.onGetStartedClick;
import p040o.setImportance;
import p040o.setTapText;

public final class RemittanceTransactionsDeepLinkActivity extends BaseDeepLinkActivity implements newIdExtractor {
    @HmlPinActivity
    public IsEdgeConfident presenter;

    /* access modifiers changed from: protected */
    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public final boolean mo14202x50fd9e4a() {
        return true;
    }

    /* access modifiers changed from: protected */
    public final void ActionMenuPresenter$OverflowMenuButton() {
        super.ActionMenuPresenter$OverflowMenuButton();
        IsEdgeConfident isEdgeConfident = this.presenter;
        if (isEdgeConfident == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        isEdgeConfident.MediaBrowserCompat$ItemReceiver(this);
        if (getIntent().getBooleanExtra("NOTIFICATION_INBOX_TAG", false)) {
            this.scbAnalytics.write("inbox_noti", new ZSYR2K("feature", "remittance_successful"));
        }
    }

    /* access modifiers changed from: protected */
    public final void IconCompatParcelizer(Intent intent, String str) {
        onGetStartedClick.write((Object) intent, "data");
        if (str != null) {
            IsEdgeConfident isEdgeConfident = this.presenter;
            if (isEdgeConfident == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
            }
            onGetStartedClick.write((Object) str, "deepLinkId");
            if (isEdgeConfident.RatingCompat != null) {
                isEdgeConfident.RatingCompat.AlertController$RecycleListView();
            }
            AbstractIndexedListIterator abstractIndexedListIterator = isEdgeConfident.MediaBrowserCompat$ItemReceiver;
            onGetStartedClick.write((Object) str, Name.MARK);
            IsEdgeConfident isEdgeConfident2 = isEdgeConfident;
            abstractIndexedListIterator.read(abstractIndexedListIterator.write.read(str), new Corners(new IsEdgeConfident.read(isEdgeConfident2)), new Corners(new IsEdgeConfident.IconCompatParcelizer(isEdgeConfident2)));
        }
    }

    public final void read(setImportance setimportance) {
        onGetStartedClick.write((Object) setimportance, "display");
        RemittanceSuccessActivity$MediaBrowserCompat$ItemReceiver remittanceSuccessActivity$MediaBrowserCompat$ItemReceiver = RemittanceSuccessActivity.MediaDescriptionCompat;
        Intent read = RemittanceSuccessActivity$MediaBrowserCompat$ItemReceiver.read(this, setimportance);
        IntentTidInjectionContextAspect.aspectOf();
        try {
            Intent read2 = setTapText.write(this, read).read();
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on Context.startActivity(Intent), modified: ");
            sb.append(read2.getData());
            sb.append("\n with context ");
            sb.append(hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            startActivity(read2);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final void write(Throwable th) {
        onGetStartedClick.write((Object) th, "throwable");
        mo14215a_(th);
    }
}
