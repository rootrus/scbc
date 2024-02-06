package p040o;

import java.util.HashMap;

/* renamed from: o.getSubElementArraySize */
public final class getSubElementArraySize extends createFromBitmapResource {
    private static HashMap<Integer, String> write;

    public final String MediaBrowserCompat$ItemReceiver() {
        return "PSD Header";
    }

    static {
        HashMap<Integer, String> hashMap = new HashMap<>();
        write = hashMap;
        hashMap.put(1, "Channel Count");
        write.put(2, "Image Height");
        write.put(3, "Image Width");
        write.put(4, "Bits Per Channel");
        write.put(5, "Color Mode");
    }

    public getSubElementArraySize() {
        read((createCubemapFromCubeFaces) new U8_4(this));
    }

    public final HashMap<Integer, String> MediaBrowserCompat$CustomActionResultReceiver() {
        return write;
    }
}
