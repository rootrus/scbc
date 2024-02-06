package p040o;

/* renamed from: o.getIncAllocID */
public final class getIncAllocID extends createCubemapFromCubeFaces<getByteBuffer> {
    public getIncAllocID(getByteBuffer getbytebuffer) {
        super(getbytebuffer);
    }

    public final String MediaBrowserCompat$CustomActionResultReceiver(int i) {
        if (i != 20) {
            switch (i) {
                case 1:
                    return write(1, 1, "Single shutter", "Panorama", "Night scene", "Portrait", "Landscape");
                case 2:
                    return write(2, 1, "Economy", "Normal", "Fine");
                case 3:
                    return write(3, 2, "Macro", "Auto focus", "Manual focus", "Infinity");
                case 4:
                    return write(4, 1, "Auto", "On", "Off", "Red eye reduction");
                case 5:
                    Integer MediaBrowserCompat$CustomActionResultReceiver = ((getByteBuffer) this.write).MediaBrowserCompat$CustomActionResultReceiver(5);
                    if (MediaBrowserCompat$CustomActionResultReceiver == null) {
                        return null;
                    }
                    int intValue = MediaBrowserCompat$CustomActionResultReceiver.intValue();
                    if (intValue == 11) {
                        return "Weak";
                    }
                    if (intValue == 13) {
                        return "Normal";
                    }
                    if (intValue == 15) {
                        return "Strong";
                    }
                    StringBuilder sb = new StringBuilder();
                    sb.append("Unknown (");
                    sb.append(MediaBrowserCompat$CustomActionResultReceiver);
                    sb.append(")");
                    return sb.toString();
                case 6:
                    Integer MediaBrowserCompat$CustomActionResultReceiver2 = ((getByteBuffer) this.write).MediaBrowserCompat$CustomActionResultReceiver(6);
                    if (MediaBrowserCompat$CustomActionResultReceiver2 == null) {
                        return null;
                    }
                    return MediaBrowserCompat$CustomActionResultReceiver((double) MediaBrowserCompat$CustomActionResultReceiver2.intValue());
                case 7:
                    Integer MediaBrowserCompat$CustomActionResultReceiver3 = ((getByteBuffer) this.write).MediaBrowserCompat$CustomActionResultReceiver(7);
                    if (MediaBrowserCompat$CustomActionResultReceiver3 == null) {
                        return null;
                    }
                    int intValue2 = MediaBrowserCompat$CustomActionResultReceiver3.intValue();
                    if (intValue2 == 1) {
                        return "Auto";
                    }
                    if (intValue2 == 2) {
                        return "Tungsten";
                    }
                    if (intValue2 == 3) {
                        return "Daylight";
                    }
                    if (intValue2 == 4) {
                        return "Florescent";
                    }
                    if (intValue2 == 5) {
                        return "Shade";
                    }
                    if (intValue2 == 129) {
                        return "Manual";
                    }
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Unknown (");
                    sb2.append(MediaBrowserCompat$CustomActionResultReceiver3);
                    sb2.append(")");
                    return sb2.toString();
                default:
                    switch (i) {
                        case 10:
                            Integer MediaBrowserCompat$CustomActionResultReceiver4 = ((getByteBuffer) this.write).MediaBrowserCompat$CustomActionResultReceiver(10);
                            if (MediaBrowserCompat$CustomActionResultReceiver4 == null) {
                                return null;
                            }
                            int intValue3 = MediaBrowserCompat$CustomActionResultReceiver4.intValue();
                            if (intValue3 == 65536) {
                                return "No digital zoom";
                            }
                            if (intValue3 == 65537 || intValue3 == 131072) {
                                return "2x digital zoom";
                            }
                            if (intValue3 == 262144) {
                                return "4x digital zoom";
                            }
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append("Unknown (");
                            sb3.append(MediaBrowserCompat$CustomActionResultReceiver4);
                            sb3.append(")");
                            return sb3.toString();
                        case 11:
                            return MediaBrowserCompat$CustomActionResultReceiver(11, "Normal", "Soft", "Hard");
                        case 12:
                            return MediaBrowserCompat$CustomActionResultReceiver(12, "Normal", "Low", "High");
                        case 13:
                            return MediaBrowserCompat$CustomActionResultReceiver(13, "Normal", "Low", "High");
                        default:
                            return super.MediaBrowserCompat$CustomActionResultReceiver(i);
                    }
            }
        } else {
            Integer MediaBrowserCompat$CustomActionResultReceiver5 = ((getByteBuffer) this.write).MediaBrowserCompat$CustomActionResultReceiver(20);
            if (MediaBrowserCompat$CustomActionResultReceiver5 == null) {
                return null;
            }
            int intValue4 = MediaBrowserCompat$CustomActionResultReceiver5.intValue();
            if (intValue4 == 64) {
                return "Normal";
            }
            if (intValue4 == 80) {
                return "Normal (ISO 80 equivalent)";
            }
            if (intValue4 == 100) {
                return "High";
            }
            if (intValue4 == 125) {
                return "+1.0";
            }
            if (intValue4 == 244) {
                return "+3.0";
            }
            if (intValue4 == 250) {
                return "+2.0";
            }
            StringBuilder sb4 = new StringBuilder();
            sb4.append("Unknown (");
            sb4.append(MediaBrowserCompat$CustomActionResultReceiver5);
            sb4.append(")");
            return sb4.toString();
        }
    }
}
