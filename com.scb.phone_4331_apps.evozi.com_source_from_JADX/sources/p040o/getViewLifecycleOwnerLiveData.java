package p040o;

import java.io.IOException;

/* renamed from: o.getViewLifecycleOwnerLiveData */
public final class getViewLifecycleOwnerLiveData {
    public final setOnScrollListener MediaBrowserCompat$ItemReceiver;
    public final byte[] write;

    public getViewLifecycleOwnerLiveData(setOnScrollListener setonscrolllistener, byte[] bArr) {
        this.MediaBrowserCompat$ItemReceiver = setonscrolllistener;
        this.write = bArr;
    }

    public getViewLifecycleOwnerLiveData() {
    }

    public static void read(copy1DRangeFromUnchecked copy1drangefromunchecked, getSubElementOffsetBytes getsubelementoffsetbytes) {
        data1DChecks data1dchecks = new data1DChecks();
        getsubelementoffsetbytes.IconCompatParcelizer.add(data1dchecks);
        copy1drangefromunchecked.IconCompatParcelizer = false;
        try {
            if (copy1drangefromunchecked.RatingCompat() != 19778) {
                data1dchecks.IconCompatParcelizer.add("Invalid BMP magic number");
                return;
            }
            copy1drangefromunchecked.write(12);
            int MediaBrowserCompat$CustomActionResultReceiver = copy1drangefromunchecked.MediaBrowserCompat$CustomActionResultReceiver();
            data1dchecks.IconCompatParcelizer(-1, Integer.valueOf(MediaBrowserCompat$CustomActionResultReceiver));
            if (MediaBrowserCompat$CustomActionResultReceiver == 40) {
                data1dchecks.IconCompatParcelizer(2, Integer.valueOf(copy1drangefromunchecked.MediaBrowserCompat$CustomActionResultReceiver()));
                data1dchecks.IconCompatParcelizer(1, Integer.valueOf(copy1drangefromunchecked.MediaBrowserCompat$CustomActionResultReceiver()));
                data1dchecks.IconCompatParcelizer(3, Integer.valueOf(copy1drangefromunchecked.read()));
                data1dchecks.IconCompatParcelizer(4, Integer.valueOf(copy1drangefromunchecked.read()));
                data1dchecks.IconCompatParcelizer(5, Integer.valueOf(copy1drangefromunchecked.MediaBrowserCompat$CustomActionResultReceiver()));
                copy1drangefromunchecked.write(4);
                data1dchecks.IconCompatParcelizer(6, Integer.valueOf(copy1drangefromunchecked.MediaBrowserCompat$CustomActionResultReceiver()));
                data1dchecks.IconCompatParcelizer(7, Integer.valueOf(copy1drangefromunchecked.MediaBrowserCompat$CustomActionResultReceiver()));
                data1dchecks.IconCompatParcelizer(8, Integer.valueOf(copy1drangefromunchecked.MediaBrowserCompat$CustomActionResultReceiver()));
                data1dchecks.IconCompatParcelizer(9, Integer.valueOf(copy1drangefromunchecked.MediaBrowserCompat$CustomActionResultReceiver()));
            } else if (MediaBrowserCompat$CustomActionResultReceiver == 12) {
                data1dchecks.IconCompatParcelizer(2, Integer.valueOf(copy1drangefromunchecked.read()));
                data1dchecks.IconCompatParcelizer(1, Integer.valueOf(copy1drangefromunchecked.read()));
                data1dchecks.IconCompatParcelizer(3, Integer.valueOf(copy1drangefromunchecked.read()));
                data1dchecks.IconCompatParcelizer(4, Integer.valueOf(copy1drangefromunchecked.read()));
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("Unexpected DIB header size: ");
                sb.append(MediaBrowserCompat$CustomActionResultReceiver);
                data1dchecks.IconCompatParcelizer.add(sb.toString());
            }
        } catch (IOException unused) {
            data1dchecks.IconCompatParcelizer.add("Unable to read BMP header");
        }
    }
}
