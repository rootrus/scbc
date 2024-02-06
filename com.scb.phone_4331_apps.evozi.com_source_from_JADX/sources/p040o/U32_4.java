package p040o;

/* renamed from: o.U32_4 */
public final class U32_4 extends createCubemapFromCubeFaces<U64_2> {
    public U32_4(U64_2 u64_2) {
        super(u64_2);
    }

    public final String MediaBrowserCompat$CustomActionResultReceiver(int i) {
        if (i != 1) {
            return super.MediaBrowserCompat$CustomActionResultReceiver(i);
        }
        Integer MediaBrowserCompat$CustomActionResultReceiver = ((U64_2) this.write).MediaBrowserCompat$CustomActionResultReceiver(1);
        if (MediaBrowserCompat$CustomActionResultReceiver == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(MediaBrowserCompat$CustomActionResultReceiver.intValue() == 1 ? " Huffman table" : " Huffman tables");
        return sb.toString();
    }
}
