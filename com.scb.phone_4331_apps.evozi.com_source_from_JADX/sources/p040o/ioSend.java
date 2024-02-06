package p040o;

/* renamed from: o.ioSend */
public final class ioSend extends createCubemapFromCubeFaces<getUsage> {
    public ioSend(getUsage getusage) {
        super(getusage);
    }

    public final String MediaBrowserCompat$CustomActionResultReceiver(int i) {
        if (i == 9) {
            return write(9, 1, "Fine", "Normal");
        }
        if (i == 10) {
            return MediaBrowserCompat$CustomActionResultReceiver(10, "Off", "On");
        }
        if (i == 27) {
            Integer MediaBrowserCompat$CustomActionResultReceiver = ((getUsage) this.write).MediaBrowserCompat$CustomActionResultReceiver(27);
            if (MediaBrowserCompat$CustomActionResultReceiver == null) {
                return null;
            }
            int intValue = MediaBrowserCompat$CustomActionResultReceiver.intValue();
            if (intValue == 0) {
                return "Auto";
            }
            if (intValue == 8) {
                return "Aperture Priority";
            }
            if (intValue == 32) {
                return "Manual";
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Unknown (");
            sb.append(MediaBrowserCompat$CustomActionResultReceiver);
            sb.append(")");
            return sb.toString();
        } else if (i == 56) {
            return MediaBrowserCompat$CustomActionResultReceiver(56, "Normal", null, "Macro");
        } else {
            if (i == 64) {
                return MediaBrowserCompat$CustomActionResultReceiver(64, "Auto", "Flash", "Tungsten", "Daylight");
            }
            if (i == 102) {
                Integer MediaBrowserCompat$CustomActionResultReceiver2 = ((getUsage) this.write).MediaBrowserCompat$CustomActionResultReceiver(102);
                if (MediaBrowserCompat$CustomActionResultReceiver2 == null) {
                    return null;
                }
                int intValue2 = MediaBrowserCompat$CustomActionResultReceiver2.intValue();
                if (intValue2 == 1) {
                    return "B&W";
                }
                if (intValue2 == 2) {
                    return "Sepia";
                }
                if (intValue2 == 3) {
                    return "B&W Yellow Filter";
                }
                if (intValue2 == 4) {
                    return "B&W Red Filter";
                }
                if (intValue2 == 32) {
                    return "Saturated Color";
                }
                if (intValue2 == 64) {
                    return "Neutral Color";
                }
                if (intValue2 == 256) {
                    return "Saturated Color";
                }
                if (intValue2 == 512) {
                    return "Neutral Color";
                }
                if (intValue2 == 8192) {
                    return "B&W";
                }
                if (intValue2 == 16384) {
                    return "Sepia";
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Unknown (");
                sb2.append(MediaBrowserCompat$CustomActionResultReceiver2);
                sb2.append(")");
                return sb2.toString();
            } else if (i == 107) {
                return MediaBrowserCompat$CustomActionResultReceiver(107, "Normal");
            } else {
                if (i == 92) {
                    Integer MediaBrowserCompat$CustomActionResultReceiver3 = ((getUsage) this.write).MediaBrowserCompat$CustomActionResultReceiver(92);
                    if (MediaBrowserCompat$CustomActionResultReceiver3 == null) {
                        return null;
                    }
                    int intValue3 = MediaBrowserCompat$CustomActionResultReceiver3.intValue();
                    if (intValue3 == 0) {
                        return "Auto";
                    }
                    if (intValue3 == 1) {
                        return "Fill Flash";
                    }
                    if (intValue3 != 2) {
                        if (intValue3 == 3) {
                            return "Red Eye";
                        }
                        if (intValue3 == 16) {
                            return "Fill Flash";
                        }
                        if (intValue3 != 32) {
                            if (intValue3 == 64) {
                                return "Red Eye";
                            }
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append("Unknown (");
                            sb3.append(MediaBrowserCompat$CustomActionResultReceiver3);
                            sb3.append(")");
                            return sb3.toString();
                        }
                    }
                    return "Off";
                } else if (i != 93) {
                    return super.MediaBrowserCompat$CustomActionResultReceiver(i);
                } else {
                    return MediaBrowserCompat$CustomActionResultReceiver(93, "No", "Yes");
                }
            }
        }
    }
}
