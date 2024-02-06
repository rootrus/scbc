package p040o;

import p040o.SimpleTimeLimiter;

/* renamed from: o.filterEntries */
public final /* synthetic */ class filterEntries implements findFragmentByWho {
    private final /* synthetic */ newConcurrentMap IconCompatParcelizer;

    public /* synthetic */ filterEntries(newConcurrentMap newconcurrentmap) {
        this.IconCompatParcelizer = newconcurrentmap;
    }

    public final Object IconCompatParcelizer(Object obj) {
        ThreadFactoryBuilder threadFactoryBuilder = (ThreadFactoryBuilder) obj;
        SimpleTimeLimiter.C37891 r0 = new Object() {
            public String IconCompatParcelizer;
            public String MediaBrowserCompat$CustomActionResultReceiver;
            public String MediaBrowserCompat$ItemReceiver;
            public String MediaBrowserCompat$MediaItem;
            public String MediaBrowserCompat$SearchResultReceiver;
            public boolean RatingCompat;
            public String read;
            public String write;
        };
        r0.MediaBrowserCompat$CustomActionResultReceiver = threadFactoryBuilder.MediaBrowserCompat$CustomActionResultReceiver;
        r0.write = threadFactoryBuilder.IconCompatParcelizer;
        r0.IconCompatParcelizer = threadFactoryBuilder.MediaBrowserCompat$ItemReceiver;
        r0.MediaBrowserCompat$SearchResultReceiver = threadFactoryBuilder.MediaMetadataCompat;
        r0.RatingCompat = threadFactoryBuilder.MediaDescriptionCompat;
        r0.MediaBrowserCompat$ItemReceiver = threadFactoryBuilder.MediaSessionCompat$Token;
        r0.MediaBrowserCompat$MediaItem = threadFactoryBuilder.MediaBrowserCompat$SearchResultReceiver;
        r0.read = threadFactoryBuilder.read;
        return r0;
    }
}
