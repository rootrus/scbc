package p040o;

/* renamed from: o.validateIsInt64 */
public final class validateIsInt64 extends createCubemapFromCubeFaces<validateIsObject> {
    public validateIsInt64(validateIsObject validateisobject) {
        super(validateisobject);
    }

    public final String MediaBrowserCompat$CustomActionResultReceiver(int i) {
        if (i == 2) {
            Integer MediaBrowserCompat$CustomActionResultReceiver = ((validateIsObject) this.write).MediaBrowserCompat$CustomActionResultReceiver(2);
            if (MediaBrowserCompat$CustomActionResultReceiver == null) {
                return null;
            }
            return new copy3DRangeFromUnchecked((long) MediaBrowserCompat$CustomActionResultReceiver.intValue(), 32678).toString();
        } else if (i == 11) {
            Integer MediaBrowserCompat$CustomActionResultReceiver2 = ((validateIsObject) this.write).MediaBrowserCompat$CustomActionResultReceiver(11);
            if (MediaBrowserCompat$CustomActionResultReceiver2 == null) {
                return null;
            }
            return new copy3DRangeFromUnchecked((long) MediaBrowserCompat$CustomActionResultReceiver2.intValue(), 32678).toString();
        } else if (i == 4) {
            Integer MediaBrowserCompat$CustomActionResultReceiver3 = ((validateIsObject) this.write).MediaBrowserCompat$CustomActionResultReceiver(4);
            if (MediaBrowserCompat$CustomActionResultReceiver3 == null) {
                return null;
            }
            return new copy3DRangeFromUnchecked((long) MediaBrowserCompat$CustomActionResultReceiver3.intValue(), 32678).toString();
        } else if (i == 5) {
            Integer MediaBrowserCompat$CustomActionResultReceiver4 = ((validateIsObject) this.write).MediaBrowserCompat$CustomActionResultReceiver(5);
            if (MediaBrowserCompat$CustomActionResultReceiver4 == null) {
                return null;
            }
            return Integer.toString(1 / ((MediaBrowserCompat$CustomActionResultReceiver4.intValue() / 32768) + 1));
        } else if (i == 7) {
            Integer MediaBrowserCompat$CustomActionResultReceiver5 = ((validateIsObject) this.write).MediaBrowserCompat$CustomActionResultReceiver(7);
            if (MediaBrowserCompat$CustomActionResultReceiver5 == null) {
                return null;
            }
            int intValue = MediaBrowserCompat$CustomActionResultReceiver5.intValue() & 15;
            if (intValue == 0) {
                return "Off";
            }
            if (intValue == 1) {
                return "On";
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Unknown (");
            sb.append(MediaBrowserCompat$CustomActionResultReceiver5);
            sb.append(")");
            return sb.toString();
        } else if (i == 8) {
            Integer MediaBrowserCompat$CustomActionResultReceiver6 = ((validateIsObject) this.write).MediaBrowserCompat$CustomActionResultReceiver(8);
            if (MediaBrowserCompat$CustomActionResultReceiver6 == null) {
                return null;
            }
            return new copy3DRangeFromUnchecked((long) MediaBrowserCompat$CustomActionResultReceiver6.intValue(), 32678).toString();
        } else if (i != 9) {
            return super.MediaBrowserCompat$CustomActionResultReceiver(i);
        } else {
            Integer MediaBrowserCompat$CustomActionResultReceiver7 = ((validateIsObject) this.write).MediaBrowserCompat$CustomActionResultReceiver(9);
            if (MediaBrowserCompat$CustomActionResultReceiver7 == null) {
                return null;
            }
            return new copy3DRangeFromUnchecked((long) MediaBrowserCompat$CustomActionResultReceiver7.intValue(), 32678).toString();
        }
    }
}
