package p040o;

/* renamed from: o.setMapToolbarEnabled$MediaBrowserCompat$ItemReceiver */
public final class setMapToolbarEnabled$MediaBrowserCompat$ItemReceiver {
    private setMapToolbarEnabled$MediaBrowserCompat$ItemReceiver() {
    }

    public /* synthetic */ setMapToolbarEnabled$MediaBrowserCompat$ItemReceiver(byte b) {
        this();
    }

    public static setMapToolbarEnabled write(String str) {
        setMapToolbarEnabled setmaptoolbarenabled;
        setMapToolbarEnabled[] values = setMapToolbarEnabled.values();
        int length = values.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                setmaptoolbarenabled = null;
                break;
            }
            setmaptoolbarenabled = values[i];
            if (onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) setmaptoolbarenabled.key, (Object) str)) {
                break;
            }
            i++;
        }
        return setmaptoolbarenabled == null ? setMapToolbarEnabled.FAIL : setmaptoolbarenabled;
    }
}
