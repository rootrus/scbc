package p040o;

/* renamed from: o.getStride */
public final class getStride extends createCubemapFromCubeFaces<getType> {
    public getStride(getType gettype) {
        super(gettype);
    }

    public final String MediaBrowserCompat$CustomActionResultReceiver(int i) {
        int i2 = i;
        if (i2 == 0) {
            return IconCompatParcelizer(0, 2);
        }
        if (i2 == 4102) {
            Integer MediaBrowserCompat$CustomActionResultReceiver = ((getType) this.write).MediaBrowserCompat$CustomActionResultReceiver(4102);
            if (MediaBrowserCompat$CustomActionResultReceiver == null) {
                return null;
            }
            int intValue = MediaBrowserCompat$CustomActionResultReceiver.intValue();
            if (intValue == 0) {
                return "Normal";
            }
            if (intValue == 256) {
                return "High";
            }
            if (intValue == 768) {
                return "Low";
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Unknown (");
            sb.append(MediaBrowserCompat$CustomActionResultReceiver);
            sb.append(")");
            return sb.toString();
        } else if (i2 == 4107) {
            Integer MediaBrowserCompat$CustomActionResultReceiver2 = ((getType) this.write).MediaBrowserCompat$CustomActionResultReceiver(4107);
            if (MediaBrowserCompat$CustomActionResultReceiver2 == null) {
                return null;
            }
            int intValue2 = MediaBrowserCompat$CustomActionResultReceiver2.intValue();
            if (intValue2 == 64) {
                return "Low";
            }
            if (intValue2 == 128) {
                return "Normal";
            }
            if (intValue2 == 256) {
                return "N/A";
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Unknown (");
            sb2.append(MediaBrowserCompat$CustomActionResultReceiver2);
            sb2.append(")");
            return sb2.toString();
        } else if (i2 == 4110) {
            Integer MediaBrowserCompat$CustomActionResultReceiver3 = ((getType) this.write).MediaBrowserCompat$CustomActionResultReceiver(4110);
            if (MediaBrowserCompat$CustomActionResultReceiver3 == null) {
                return null;
            }
            int intValue3 = MediaBrowserCompat$CustomActionResultReceiver3.intValue();
            if (intValue3 == 0) {
                return "Normal";
            }
            if (intValue3 == 256) {
                return "Strong";
            }
            if (intValue3 == 512) {
                return "Weak";
            }
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Unknown (");
            sb3.append(MediaBrowserCompat$CustomActionResultReceiver3);
            sb3.append(")");
            return sb3.toString();
        } else if (i2 == 4352) {
            return MediaBrowserCompat$CustomActionResultReceiver(4352, "Off", "On", "No Flash & Flash");
        } else {
            if (i2 == 4624) {
                Integer MediaBrowserCompat$CustomActionResultReceiver4 = ((getType) this.write).MediaBrowserCompat$CustomActionResultReceiver(4624);
                if (MediaBrowserCompat$CustomActionResultReceiver4 == null) {
                    return null;
                }
                int intValue4 = MediaBrowserCompat$CustomActionResultReceiver4.intValue();
                if (intValue4 == 0) {
                    return "Standard";
                }
                if (intValue4 == 16) {
                    return "Chrome";
                }
                if (intValue4 == 48) {
                    return "B&W";
                }
                StringBuilder sb4 = new StringBuilder();
                sb4.append("Unknown (");
                sb4.append(MediaBrowserCompat$CustomActionResultReceiver4);
                sb4.append(")");
                return sb4.toString();
            } else if (i2 == 4112) {
                return MediaBrowserCompat$CustomActionResultReceiver(4112, "Auto", "On", "Off", "Red-eye Reduction", "External");
            } else {
                if (i2 == 4113) {
                    copy3DRangeFromUnchecked RatingCompat = ((getType) this.write).RatingCompat(4113);
                    if (RatingCompat == null) {
                        return null;
                    }
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append(RatingCompat.IconCompatParcelizer(false));
                    sb5.append(" EV (Apex)");
                    return sb5.toString();
                } else if (i2 == 4128) {
                    return MediaBrowserCompat$CustomActionResultReceiver(4128, "Off", "On");
                } else {
                    if (i2 == 4129) {
                        return MediaBrowserCompat$CustomActionResultReceiver(4129, "Auto Focus", "Manual Focus");
                    }
                    if (i2 == 4144) {
                        return MediaBrowserCompat$CustomActionResultReceiver(4144, "Off", "On");
                    }
                    if (i2 == 4145) {
                        Integer MediaBrowserCompat$CustomActionResultReceiver5 = ((getType) this.write).MediaBrowserCompat$CustomActionResultReceiver(4145);
                        if (MediaBrowserCompat$CustomActionResultReceiver5 == null) {
                            return null;
                        }
                        int intValue5 = MediaBrowserCompat$CustomActionResultReceiver5.intValue();
                        if (intValue5 == 27) {
                            return "Dog Face Detection";
                        }
                        if (intValue5 == 28) {
                            return "Cat Face Detection";
                        }
                        if (intValue5 == 256) {
                            return "Aperture priority AE";
                        }
                        if (intValue5 == 512) {
                            return "Shutter priority AE";
                        }
                        if (intValue5 == 768) {
                            return "Manual exposure";
                        }
                        switch (intValue5) {
                            case 0:
                                return "Auto";
                            case 1:
                                return "Portrait scene";
                            case 2:
                                return "Landscape scene";
                            case 3:
                                return "Macro";
                            case 4:
                                return "Sports scene";
                            case 5:
                                return "Night scene";
                            case 6:
                                return "Program AE";
                            case 7:
                                return "Natural Light";
                            case 8:
                                return "Anti-blur";
                            case 9:
                                return "Beach & Snow";
                            case 10:
                                return "Sunset";
                            case 11:
                                return "Museum";
                            case 12:
                                return "Party";
                            case 13:
                                return "Flower";
                            case 14:
                                return "Text";
                            case 15:
                                return "Natural Light & Flash";
                            case 16:
                                return "Beach";
                            case 17:
                                return "Snow";
                            case 18:
                                return "Fireworks";
                            case 19:
                                return "Underwater";
                            case 20:
                                return "Portrait with Skin Correction";
                            default:
                                switch (intValue5) {
                                    case 22:
                                        return "Panorama";
                                    case 23:
                                        return "Night (Tripod)";
                                    case 24:
                                        return "Pro Low-light";
                                    case 25:
                                        return "Pro Focus";
                                    default:
                                        StringBuilder sb6 = new StringBuilder();
                                        sb6.append("Unknown (");
                                        sb6.append(MediaBrowserCompat$CustomActionResultReceiver5);
                                        sb6.append(")");
                                        return sb6.toString();
                                }
                        }
                    } else if (i2 == 4147) {
                        return MediaBrowserCompat$CustomActionResultReceiver(4147, "Auto", "Manual");
                    } else {
                        if (i2 != 4148) {
                            switch (i2) {
                                case 4097:
                                    Integer MediaBrowserCompat$CustomActionResultReceiver6 = ((getType) this.write).MediaBrowserCompat$CustomActionResultReceiver(4097);
                                    if (MediaBrowserCompat$CustomActionResultReceiver6 == null) {
                                        return null;
                                    }
                                    int intValue6 = MediaBrowserCompat$CustomActionResultReceiver6.intValue();
                                    if (intValue6 == 1) {
                                        return "Softest";
                                    }
                                    if (intValue6 == 2) {
                                        return "Soft";
                                    }
                                    if (intValue6 == 3) {
                                        return "Normal";
                                    }
                                    if (intValue6 == 4) {
                                        return "Hard";
                                    }
                                    if (intValue6 == 5) {
                                        return "Hardest";
                                    }
                                    if (intValue6 == 130) {
                                        return "Medium Soft";
                                    }
                                    if (intValue6 == 132) {
                                        return "Medium Hard";
                                    }
                                    if (intValue6 == 32768) {
                                        return "Film Simulation";
                                    }
                                    if (intValue6 == 65535) {
                                        return "N/A";
                                    }
                                    StringBuilder sb7 = new StringBuilder();
                                    sb7.append("Unknown (");
                                    sb7.append(MediaBrowserCompat$CustomActionResultReceiver6);
                                    sb7.append(")");
                                    return sb7.toString();
                                case 4098:
                                    Integer MediaBrowserCompat$CustomActionResultReceiver7 = ((getType) this.write).MediaBrowserCompat$CustomActionResultReceiver(4098);
                                    if (MediaBrowserCompat$CustomActionResultReceiver7 == null) {
                                        return null;
                                    }
                                    int intValue7 = MediaBrowserCompat$CustomActionResultReceiver7.intValue();
                                    if (intValue7 == 0) {
                                        return "Auto";
                                    }
                                    if (intValue7 == 256) {
                                        return "Daylight";
                                    }
                                    if (intValue7 == 512) {
                                        return "Cloudy";
                                    }
                                    if (intValue7 == 1024) {
                                        return "Incandescence";
                                    }
                                    if (intValue7 == 1280) {
                                        return "Flash";
                                    }
                                    if (intValue7 == 4080) {
                                        return "Kelvin";
                                    }
                                    switch (intValue7) {
                                        case 768:
                                            return "Daylight Fluorescent";
                                        case 769:
                                            return "Day White Fluorescent";
                                        case 770:
                                            return "White Fluorescent";
                                        case 771:
                                            return "Warm White Fluorescent";
                                        case 772:
                                            return "Living Room Warm White Fluorescent";
                                        default:
                                            switch (intValue7) {
                                                case 3840:
                                                    return "Custom White Balance";
                                                case 3841:
                                                    return "Custom White Balance 2";
                                                case 3842:
                                                    return "Custom White Balance 3";
                                                case 3843:
                                                    return "Custom White Balance 4";
                                                case 3844:
                                                    return "Custom White Balance 5";
                                                default:
                                                    StringBuilder sb8 = new StringBuilder();
                                                    sb8.append("Unknown (");
                                                    sb8.append(MediaBrowserCompat$CustomActionResultReceiver7);
                                                    sb8.append(")");
                                                    return sb8.toString();
                                            }
                                    }
                                case 4099:
                                    Integer MediaBrowserCompat$CustomActionResultReceiver8 = ((getType) this.write).MediaBrowserCompat$CustomActionResultReceiver(4099);
                                    if (MediaBrowserCompat$CustomActionResultReceiver8 == null) {
                                        return null;
                                    }
                                    int intValue8 = MediaBrowserCompat$CustomActionResultReceiver8.intValue();
                                    if (intValue8 == 0) {
                                        return "Normal";
                                    }
                                    if (intValue8 == 128) {
                                        return "Medium High";
                                    }
                                    if (intValue8 == 256) {
                                        return "High";
                                    }
                                    if (intValue8 == 384) {
                                        return "Medium Low";
                                    }
                                    if (intValue8 == 512) {
                                        return "Low";
                                    }
                                    if (intValue8 == 32768) {
                                        return "Film Simulation";
                                    }
                                    switch (intValue8) {
                                        case 768:
                                            return "None (B&W)";
                                        case 769:
                                            return "B&W Green Filter";
                                        case 770:
                                            return "B&W Yellow Filter";
                                        case 771:
                                            return "B&W Blue Filter";
                                        case 772:
                                            return "B&W Sepia";
                                        default:
                                            StringBuilder sb9 = new StringBuilder();
                                            sb9.append("Unknown (");
                                            sb9.append(MediaBrowserCompat$CustomActionResultReceiver8);
                                            sb9.append(")");
                                            return sb9.toString();
                                    }
                                case 4100:
                                    Integer MediaBrowserCompat$CustomActionResultReceiver9 = ((getType) this.write).MediaBrowserCompat$CustomActionResultReceiver(4100);
                                    if (MediaBrowserCompat$CustomActionResultReceiver9 == null) {
                                        return null;
                                    }
                                    int intValue9 = MediaBrowserCompat$CustomActionResultReceiver9.intValue();
                                    if (intValue9 == 0) {
                                        return "Normal";
                                    }
                                    if (intValue9 == 128) {
                                        return "Medium High";
                                    }
                                    if (intValue9 == 256) {
                                        return "High";
                                    }
                                    if (intValue9 == 384) {
                                        return "Medium Low";
                                    }
                                    if (intValue9 == 512) {
                                        return "Low";
                                    }
                                    if (intValue9 == 768) {
                                        return "None (B&W)";
                                    }
                                    if (intValue9 == 32768) {
                                        return "Film Simulation";
                                    }
                                    StringBuilder sb10 = new StringBuilder();
                                    sb10.append("Unknown (");
                                    sb10.append(MediaBrowserCompat$CustomActionResultReceiver9);
                                    sb10.append(")");
                                    return sb10.toString();
                                default:
                                    switch (i2) {
                                        case 4864:
                                            return MediaBrowserCompat$CustomActionResultReceiver(4864, "No Blur Warning", "Blur warning");
                                        case 4865:
                                            return MediaBrowserCompat$CustomActionResultReceiver(4865, "Good Focus", "Out Of Focus");
                                        case 4866:
                                            return MediaBrowserCompat$CustomActionResultReceiver(4866, "AE Good", "Over Exposed");
                                        default:
                                            switch (i2) {
                                                case 5120:
                                                    return write(5120, 1, "Standard", null, "Wide");
                                                case 5121:
                                                    Integer MediaBrowserCompat$CustomActionResultReceiver10 = ((getType) this.write).MediaBrowserCompat$CustomActionResultReceiver(5121);
                                                    if (MediaBrowserCompat$CustomActionResultReceiver10 == null) {
                                                        return null;
                                                    }
                                                    int intValue10 = MediaBrowserCompat$CustomActionResultReceiver10.intValue();
                                                    if (intValue10 == 0) {
                                                        return "F0/Standard (Provia) ";
                                                    }
                                                    if (intValue10 == 256) {
                                                        return "F1/Studio Portrait";
                                                    }
                                                    if (intValue10 == 272) {
                                                        return "F1a/Studio Portrait Enhanced Saturation";
                                                    }
                                                    if (intValue10 == 288) {
                                                        return "F1b/Studio Portrait Smooth Skin Tone (Astia)";
                                                    }
                                                    if (intValue10 == 304) {
                                                        return "F1c/Studio Portrait Increased Sharpness";
                                                    }
                                                    if (intValue10 == 512) {
                                                        return "F2/Fujichrome (Velvia)";
                                                    }
                                                    if (intValue10 == 768) {
                                                        return "F3/Studio Portrait Ex";
                                                    }
                                                    if (intValue10 == 1024) {
                                                        return "F4/Velvia";
                                                    }
                                                    if (intValue10 == 1280) {
                                                        return "Pro Neg. Std";
                                                    }
                                                    if (intValue10 == 1281) {
                                                        return "Pro Neg. Hi";
                                                    }
                                                    StringBuilder sb11 = new StringBuilder();
                                                    sb11.append("Unknown (");
                                                    sb11.append(MediaBrowserCompat$CustomActionResultReceiver10);
                                                    sb11.append(")");
                                                    return sb11.toString();
                                                case 5122:
                                                    Integer MediaBrowserCompat$CustomActionResultReceiver11 = ((getType) this.write).MediaBrowserCompat$CustomActionResultReceiver(5122);
                                                    if (MediaBrowserCompat$CustomActionResultReceiver11 == null) {
                                                        return null;
                                                    }
                                                    int intValue11 = MediaBrowserCompat$CustomActionResultReceiver11.intValue();
                                                    if (intValue11 == 0) {
                                                        return "Auto (100-400%)";
                                                    }
                                                    if (intValue11 == 1) {
                                                        return "Manual";
                                                    }
                                                    if (intValue11 == 256) {
                                                        return "Standard (100%)";
                                                    }
                                                    if (intValue11 == 32768) {
                                                        return "Film Simulation";
                                                    }
                                                    if (intValue11 == 512) {
                                                        return "Wide 1 (230%)";
                                                    }
                                                    if (intValue11 == 513) {
                                                        return "Wide 2 (400%)";
                                                    }
                                                    StringBuilder sb12 = new StringBuilder();
                                                    sb12.append("Unknown (");
                                                    sb12.append(MediaBrowserCompat$CustomActionResultReceiver11);
                                                    sb12.append(")");
                                                    return sb12.toString();
                                                default:
                                                    return super.MediaBrowserCompat$CustomActionResultReceiver(i);
                                            }
                                    }
                            }
                        } else {
                            Integer MediaBrowserCompat$CustomActionResultReceiver12 = ((getType) this.write).MediaBrowserCompat$CustomActionResultReceiver(4148);
                            if (MediaBrowserCompat$CustomActionResultReceiver12 == null) {
                                return null;
                            }
                            int intValue12 = MediaBrowserCompat$CustomActionResultReceiver12.intValue();
                            if (intValue12 == 256) {
                                return "HR (High Resolution)";
                            }
                            if (intValue12 == 512) {
                                return "SN (Signal to Noise Priority)";
                            }
                            if (intValue12 == 768) {
                                return "DR (Dynamic Range Priority)";
                            }
                            StringBuilder sb13 = new StringBuilder();
                            sb13.append("Unknown (");
                            sb13.append(MediaBrowserCompat$CustomActionResultReceiver12);
                            sb13.append(")");
                            return sb13.toString();
                        }
                    }
                }
            }
        }
    }
}
