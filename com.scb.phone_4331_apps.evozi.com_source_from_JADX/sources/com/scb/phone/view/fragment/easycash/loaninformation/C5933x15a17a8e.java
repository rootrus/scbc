package com.scb.phone.view.fragment.easycash.loaninformation;

import com.scb.phone.view.custom.easycash.CustomAccountSelector$MediaBrowserCompat$ItemReceiver;
import java.util.List;
import p040o.CrashlyticsReport;
import p040o.onGetStartedClick;
import p040o.setImageFilePath;

/* renamed from: com.scb.phone.view.fragment.easycash.loaninformation.BaseCommonAccountFragment$MediaBrowserCompat$CustomActionResultReceiver */
final class C5933x15a17a8e implements CustomAccountSelector$MediaBrowserCompat$ItemReceiver {
    private /* synthetic */ BaseCommonAccountFragment MediaBrowserCompat$CustomActionResultReceiver;
    private /* synthetic */ List read;

    C5933x15a17a8e(BaseCommonAccountFragment baseCommonAccountFragment, List list) {
        this.MediaBrowserCompat$CustomActionResultReceiver = baseCommonAccountFragment;
        this.read = list;
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(int i) {
        setImageFilePath<?> write = this.MediaBrowserCompat$CustomActionResultReceiver.write();
        CrashlyticsReport.FilesPayload.File.Builder builder = (CrashlyticsReport.FilesPayload.File.Builder) this.read.get(i);
        onGetStartedClick.write((Object) builder, "repaymentAccount");
        write.MediaBrowserCompat$MediaItem = builder;
    }
}
