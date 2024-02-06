package p040o;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import p040o.writeUInt64NoTag;

/* renamed from: o.computeSInt32SizeNoTag */
public final /* synthetic */ class computeSInt32SizeNoTag implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ getThreadSize write;

    public /* synthetic */ computeSInt32SizeNoTag(getThreadSize getthreadsize) {
        this.write = getthreadsize;
    }

    public final void IconCompatParcelizer(Object obj) {
        getThreadSize getthreadsize = this.write;
        long MediaBrowserCompat$ItemReceiver = getthreadsize.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ");
        Calendar instance = Calendar.getInstance();
        instance.setTimeInMillis(MediaBrowserCompat$ItemReceiver);
        ((getPercentAverageImageContrast) obj).write(simpleDateFormat.format(instance.getTime()), String.valueOf(getthreadsize.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver()), String.valueOf(getthreadsize.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer()));
    }
}
