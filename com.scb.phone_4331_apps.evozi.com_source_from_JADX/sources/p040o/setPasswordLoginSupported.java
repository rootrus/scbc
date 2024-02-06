package p040o;

import p040o.LottieDrawable;
import p040o.setEventInterceptor;
import p040o.setInstanceIdProvider;

/* renamed from: o.setPasswordLoginSupported */
public final class setPasswordLoginSupported extends FragmentBuilder_BindSummaryFragment {
    public final setEventInterceptor IconCompatParcelizer(removeListener removelistener) {
        setInstanceIdProvider setinstanceidprovider;
        setEventInterceptor.IconCompatParcelizer iconCompatParcelizer = new setEventInterceptor.IconCompatParcelizer((byte) 0);
        iconCompatParcelizer.MediaBrowserCompat$SearchResultReceiver = removelistener.MediaBrowserCompat$SearchResultReceiver;
        iconCompatParcelizer.RatingCompat = removelistener.MediaDescriptionCompat;
        iconCompatParcelizer.IconCompatParcelizer = removelistener.MediaBrowserCompat$CustomActionResultReceiver;
        iconCompatParcelizer.MediaBrowserCompat$ItemReceiver = removelistener.write;
        iconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver = removelistener.MediaBrowserCompat$ItemReceiver;
        iconCompatParcelizer.read = removelistener.IconCompatParcelizer;
        iconCompatParcelizer.write = read(removelistener.read, new shutdownNow$MediaBrowserCompat$ItemReceiver(this), setStringInternal.IconCompatParcelizer);
        if (removelistener.RatingCompat == null) {
            setinstanceidprovider = null;
        } else {
            LottieDrawable.C36246 r6 = removelistener.RatingCompat;
            setInstanceIdProvider.read read = new setInstanceIdProvider.read((byte) 0);
            read.MediaBrowserCompat$ItemReceiver = r6.write;
            read.read = r6.MediaBrowserCompat$CustomActionResultReceiver;
            setinstanceidprovider = new setInstanceIdProvider(read, (byte) 0);
        }
        iconCompatParcelizer.MediaDescriptionCompat = setinstanceidprovider;
        return new setEventInterceptor(iconCompatParcelizer, (byte) 0);
    }
}
