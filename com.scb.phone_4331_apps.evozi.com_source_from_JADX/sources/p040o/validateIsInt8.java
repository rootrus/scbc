package p040o;

import java.util.HashMap;

/* renamed from: o.validateIsInt8 */
public class validateIsInt8 extends elementFromBitmap {
    private static HashMap<Integer, String> write;

    public final String MediaBrowserCompat$ItemReceiver() {
        return "GPS";
    }

    static {
        HashMap<Integer, String> hashMap = new HashMap<>();
        write = hashMap;
        write(hashMap);
        write.put(0, "GPS Version ID");
        write.put(1, "GPS Latitude Ref");
        write.put(2, "GPS Latitude");
        write.put(3, "GPS Longitude Ref");
        write.put(4, "GPS Longitude");
        write.put(5, "GPS Altitude Ref");
        write.put(6, "GPS Altitude");
        write.put(7, "GPS Time-Stamp");
        write.put(8, "GPS Satellites");
        write.put(9, "GPS Status");
        write.put(10, "GPS Measure Mode");
        write.put(11, "GPS DOP");
        write.put(12, "GPS Speed Ref");
        write.put(13, "GPS Speed");
        write.put(14, "GPS Track Ref");
        write.put(15, "GPS Track");
        write.put(16, "GPS Img Direction Ref");
        write.put(17, "GPS Img Direction");
        write.put(18, "GPS Map Datum");
        write.put(19, "GPS Dest Latitude Ref");
        write.put(20, "GPS Dest Latitude");
        write.put(21, "GPS Dest Longitude Ref");
        write.put(22, "GPS Dest Longitude");
        write.put(23, "GPS Dest Bearing Ref");
        write.put(24, "GPS Dest Bearing");
        write.put(25, "GPS Dest Distance Ref");
        write.put(26, "GPS Dest Distance");
        write.put(27, "GPS Processing Method");
        write.put(28, "GPS Area Information");
        write.put(29, "GPS Date Stamp");
        write.put(30, "GPS Differential");
    }

    public validateIsInt8() {
        read((createCubemapFromCubeFaces) new validateObjectIsPrimitiveArray(this));
    }

    public final HashMap<Integer, String> MediaBrowserCompat$CustomActionResultReceiver() {
        return write;
    }

    public final setAnimator read() {
        copy3DRangeFromUnchecked[] MediaBrowserCompat$MediaItem = MediaBrowserCompat$MediaItem(2);
        copy3DRangeFromUnchecked[] MediaBrowserCompat$MediaItem2 = MediaBrowserCompat$MediaItem(4);
        String MediaBrowserCompat$SearchResultReceiver = MediaBrowserCompat$SearchResultReceiver(1);
        String MediaBrowserCompat$SearchResultReceiver2 = MediaBrowserCompat$SearchResultReceiver(3);
        if (MediaBrowserCompat$MediaItem == null || MediaBrowserCompat$MediaItem.length != 3 || MediaBrowserCompat$MediaItem2 == null || MediaBrowserCompat$MediaItem2.length != 3 || MediaBrowserCompat$SearchResultReceiver == null || MediaBrowserCompat$SearchResultReceiver2 == null) {
            return null;
        }
        Double MediaBrowserCompat$CustomActionResultReceiver = setAnimator.MediaBrowserCompat$CustomActionResultReceiver(MediaBrowserCompat$MediaItem[0], MediaBrowserCompat$MediaItem[1], MediaBrowserCompat$MediaItem[2], MediaBrowserCompat$SearchResultReceiver.equalsIgnoreCase("S"));
        Double MediaBrowserCompat$CustomActionResultReceiver2 = setAnimator.MediaBrowserCompat$CustomActionResultReceiver(MediaBrowserCompat$MediaItem2[0], MediaBrowserCompat$MediaItem2[1], MediaBrowserCompat$MediaItem2[2], MediaBrowserCompat$SearchResultReceiver2.equalsIgnoreCase("W"));
        if (MediaBrowserCompat$CustomActionResultReceiver == null || MediaBrowserCompat$CustomActionResultReceiver2 == null) {
            return null;
        }
        return new setAnimator(MediaBrowserCompat$CustomActionResultReceiver.doubleValue(), MediaBrowserCompat$CustomActionResultReceiver2.doubleValue());
    }
}
