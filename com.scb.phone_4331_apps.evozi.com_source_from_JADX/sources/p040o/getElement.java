package p040o;

/* renamed from: o.getElement */
public final class getElement extends createCubemapFromCubeFaces<ioReceive> {
    public getElement(ioReceive ioreceive) {
        super(ioreceive);
    }

    public final String MediaBrowserCompat$CustomActionResultReceiver(int i) {
        if (i == 2) {
            int[] MediaBrowserCompat$ItemReceiver = ((ioReceive) this.write).MediaBrowserCompat$ItemReceiver(2);
            if (MediaBrowserCompat$ItemReceiver == null || MediaBrowserCompat$ItemReceiver.length != 2) {
                return ((ioReceive) this.write).MediaBrowserCompat$SearchResultReceiver(2);
            }
            StringBuilder sb = new StringBuilder();
            sb.append(MediaBrowserCompat$ItemReceiver[0]);
            sb.append(" x ");
            sb.append(MediaBrowserCompat$ItemReceiver[1]);
            sb.append(" pixels");
            return sb.toString();
        } else if (i == 3) {
            Integer MediaBrowserCompat$CustomActionResultReceiver = ((ioReceive) this.write).MediaBrowserCompat$CustomActionResultReceiver(3);
            if (MediaBrowserCompat$CustomActionResultReceiver == null) {
                return null;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(Integer.toString(MediaBrowserCompat$CustomActionResultReceiver.intValue()));
            sb2.append(" bytes");
            return sb2.toString();
        } else if (i == 4) {
            return ((ioReceive) this.write).MediaBrowserCompat$SearchResultReceiver(4);
        } else {
            if (i == 8) {
                return write(8, 1, "Fine", "Super Fine");
            }
            if (i == 9) {
                Integer MediaBrowserCompat$CustomActionResultReceiver2 = ((ioReceive) this.write).MediaBrowserCompat$CustomActionResultReceiver(9);
                if (MediaBrowserCompat$CustomActionResultReceiver2 == null) {
                    return null;
                }
                int intValue = MediaBrowserCompat$CustomActionResultReceiver2.intValue();
                if (intValue == 0) {
                    return "640 x 480 pixels";
                }
                if (intValue == 36) {
                    return "3008 x 2008 pixels";
                }
                if (intValue == 4) {
                    return "1600 x 1200 pixels";
                }
                if (intValue == 5) {
                    return "2048 x 1536 pixels";
                }
                switch (intValue) {
                    case 20:
                        return "2288 x 1712 pixels";
                    case 21:
                        return "2592 x 1944 pixels";
                    case 22:
                        return "2304 x 1728 pixels";
                    default:
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append("Unknown (");
                        sb3.append(MediaBrowserCompat$CustomActionResultReceiver2);
                        sb3.append(")");
                        return sb3.toString();
                }
            } else if (i == 13) {
                return MediaBrowserCompat$CustomActionResultReceiver(13, "Normal", "Macro");
            } else {
                if (i == 20) {
                    Integer MediaBrowserCompat$CustomActionResultReceiver3 = ((ioReceive) this.write).MediaBrowserCompat$CustomActionResultReceiver(20);
                    if (MediaBrowserCompat$CustomActionResultReceiver3 == null) {
                        return null;
                    }
                    int intValue2 = MediaBrowserCompat$CustomActionResultReceiver3.intValue();
                    if (intValue2 == 3) {
                        return "50";
                    }
                    if (intValue2 == 4) {
                        return "64";
                    }
                    if (intValue2 == 6) {
                        return "100";
                    }
                    if (intValue2 == 9) {
                        return "200";
                    }
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append("Unknown (");
                    sb4.append(MediaBrowserCompat$CustomActionResultReceiver3);
                    sb4.append(")");
                    return sb4.toString();
                } else if (i == 25) {
                    return MediaBrowserCompat$CustomActionResultReceiver(25, "Auto", "Daylight", "Shade", "Tungsten", "Florescent", "Manual");
                } else {
                    if (i == 29) {
                        Double read = ((ioReceive) this.write).read(29);
                        if (read == null) {
                            return null;
                        }
                        return MediaBrowserCompat$CustomActionResultReceiver(read.doubleValue() / 10.0d);
                    } else if (i == 8192) {
                        byte[] IconCompatParcelizer = ((ioReceive) this.write).IconCompatParcelizer(8192);
                        if (IconCompatParcelizer == null) {
                            return null;
                        }
                        StringBuilder sb5 = new StringBuilder();
                        sb5.append("<");
                        sb5.append(IconCompatParcelizer.length);
                        sb5.append(" bytes of image data>");
                        return sb5.toString();
                    } else if (i == 8226) {
                        Integer MediaBrowserCompat$CustomActionResultReceiver4 = ((ioReceive) this.write).MediaBrowserCompat$CustomActionResultReceiver(8226);
                        if (MediaBrowserCompat$CustomActionResultReceiver4 == null) {
                            return null;
                        }
                        StringBuilder sb6 = new StringBuilder();
                        sb6.append(Integer.toString(MediaBrowserCompat$CustomActionResultReceiver4.intValue()));
                        sb6.append(" mm");
                        return sb6.toString();
                    } else if (i == 8244) {
                        return MediaBrowserCompat$CustomActionResultReceiver(8244, "Off");
                    } else {
                        if (i == 12294) {
                            return ((ioReceive) this.write).MediaBrowserCompat$SearchResultReceiver(12294);
                        }
                        if (i == 8209) {
                            return ((ioReceive) this.write).MediaBrowserCompat$SearchResultReceiver(8209);
                        }
                        if (i != 8210) {
                            switch (i) {
                                case 31:
                                    return MediaBrowserCompat$CustomActionResultReceiver(31, "-1", "Normal", "+1");
                                case 32:
                                    return MediaBrowserCompat$CustomActionResultReceiver(32, "-1", "Normal", "+1");
                                case 33:
                                    return MediaBrowserCompat$CustomActionResultReceiver(33, "-1", "Normal", "+1");
                                default:
                                    switch (i) {
                                        case C7887a.f3647sL /*12288*/:
                                            return write(C7887a.f3647sL, 2, "Normal");
                                        case 12289:
                                            return write(12289, 1, "Off");
                                        case 12290:
                                            return write(12290, 3, "Fine");
                                        case 12291:
                                            Integer MediaBrowserCompat$CustomActionResultReceiver5 = ((ioReceive) this.write).MediaBrowserCompat$CustomActionResultReceiver(12291);
                                            if (MediaBrowserCompat$CustomActionResultReceiver5 == null) {
                                                return null;
                                            }
                                            int intValue3 = MediaBrowserCompat$CustomActionResultReceiver5.intValue();
                                            if (intValue3 == 1) {
                                                return "Fixation";
                                            }
                                            if (intValue3 == 6) {
                                                return "Multi-Area Focus";
                                            }
                                            StringBuilder sb7 = new StringBuilder();
                                            sb7.append("Unknown (");
                                            sb7.append(MediaBrowserCompat$CustomActionResultReceiver5);
                                            sb7.append(")");
                                            return sb7.toString();
                                        default:
                                            switch (i) {
                                                case 12308:
                                                    return MediaBrowserCompat$CustomActionResultReceiver(12308, "Off", "On");
                                                case 12309:
                                                    return MediaBrowserCompat$CustomActionResultReceiver(12309, "Off");
                                                case 12310:
                                                    return MediaBrowserCompat$CustomActionResultReceiver(12310, "Off");
                                                case 12311:
                                                    return MediaBrowserCompat$CustomActionResultReceiver(12311, "Off");
                                                default:
                                                    return super.MediaBrowserCompat$CustomActionResultReceiver(i);
                                            }
                                    }
                            }
                        } else {
                            Integer MediaBrowserCompat$CustomActionResultReceiver6 = ((ioReceive) this.write).MediaBrowserCompat$CustomActionResultReceiver(8210);
                            if (MediaBrowserCompat$CustomActionResultReceiver6 == null) {
                                return null;
                            }
                            int intValue4 = MediaBrowserCompat$CustomActionResultReceiver6.intValue();
                            if (intValue4 == 0) {
                                return "Manual";
                            }
                            if (intValue4 == 1) {
                                return "Auto";
                            }
                            if (intValue4 == 4 || intValue4 == 12) {
                                return "Flash";
                            }
                            StringBuilder sb8 = new StringBuilder();
                            sb8.append("Unknown (");
                            sb8.append(MediaBrowserCompat$CustomActionResultReceiver6);
                            sb8.append(")");
                            return sb8.toString();
                        }
                    }
                }
            }
        }
    }
}
