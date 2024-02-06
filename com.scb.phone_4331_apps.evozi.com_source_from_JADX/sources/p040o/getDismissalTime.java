package p040o;

import com.scb.phone.view.activity.easycash.EasycashCommonNCBConsentActivity$MediaBrowserCompat$ItemReceiver;
import com.scb.phone.view.activity.juristic.JuristicRequestFormActivity;
import p040o.TaskRunner;
import p040o.writeUInt64NoTag;

/* renamed from: o.getDismissalTime */
public final /* synthetic */ class getDismissalTime implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ C10833element IconCompatParcelizer;
    private final /* synthetic */ JuristicRequestFormActivity.read MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ String MediaBrowserCompat$ItemReceiver;
    private final /* synthetic */ TaskRunner.C3843b.C38441 read;

    public /* synthetic */ getDismissalTime(TaskRunner.C3843b.C38441 r1, C10833element element, String str, JuristicRequestFormActivity.read read2) {
        this.read = r1;
        this.IconCompatParcelizer = element;
        this.MediaBrowserCompat$ItemReceiver = str;
        this.MediaBrowserCompat$CustomActionResultReceiver = read2;
    }

    public final void IconCompatParcelizer(Object obj) {
        TaskRunner.C3843b.C38441 r0 = this.read;
        EasycashCommonNCBConsentActivity$MediaBrowserCompat$ItemReceiver IconCompatParcelizer2 = r0.write.IconCompatParcelizer(this.IconCompatParcelizer, this.MediaBrowserCompat$ItemReceiver, this.MediaBrowserCompat$CustomActionResultReceiver, r0.read.MediaBrowserCompat$CustomActionResultReceiver.setItemInvoker());
        r0.MediaBrowserCompat$ItemReceiver = IconCompatParcelizer2;
        ((IdExtractionParameters) obj).write(IconCompatParcelizer2);
    }
}
