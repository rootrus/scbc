package p040o;

/* renamed from: o.setBadgeHidesWhenActive */
public final /* synthetic */ class setBadgeHidesWhenActive implements dump {
    private final /* synthetic */ EasycashCardInfoRepositoryModule MediaBrowserCompat$ItemReceiver;
    private final /* synthetic */ boolean write;

    public /* synthetic */ setBadgeHidesWhenActive(EasycashCardInfoRepositoryModule easycashCardInfoRepositoryModule, boolean z) {
        this.MediaBrowserCompat$ItemReceiver = easycashCardInfoRepositoryModule;
        this.write = z;
    }

    public final void MediaBrowserCompat$ItemReceiver(Object obj) {
        EasycashCardInfoRepositoryModule easycashCardInfoRepositoryModule = this.MediaBrowserCompat$ItemReceiver;
        EventBus$$Lambda$1 eventBus$$Lambda$1 = (EventBus$$Lambda$1) obj;
        eventBus$$Lambda$1.IconCompatParcelizer = this.write;
        easycashCardInfoRepositoryModule.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver(easycashCardInfoRepositoryModule.MediaBrowserCompat$ItemReceiver.indexOf(eventBus$$Lambda$1), 1);
    }
}
