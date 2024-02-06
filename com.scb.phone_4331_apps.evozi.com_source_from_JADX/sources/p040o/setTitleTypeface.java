package p040o;

import com.scb.phone.view.custom.CustomCheckboxView;
import p040o.EasycashCardInfoRepositoryModule;

/* renamed from: o.setTitleTypeface */
public final /* synthetic */ class setTitleTypeface implements CustomCheckboxView.write {
    private final /* synthetic */ EventBus$$Lambda$1 read;
    private final /* synthetic */ C6446xa4368296 write;

    public /* synthetic */ setTitleTypeface(C6446xa4368296 easycashCardInfoRepositoryModule$MediaBrowserCompat$CustomActionResultReceiver, EventBus$$Lambda$1 eventBus$$Lambda$1) {
        this.write = easycashCardInfoRepositoryModule$MediaBrowserCompat$CustomActionResultReceiver;
        this.read = eventBus$$Lambda$1;
    }

    public final void IconCompatParcelizer(boolean z) {
        EasycashCardInfoRepositoryModule.read.IconCompatParcelizer(this.write, this.read, z);
    }
}
