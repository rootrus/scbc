package p040o;

/* renamed from: o.U16 */
public final class U16 extends createCubemapFromCubeFaces<U16_4> {
    public U16(U16_4 u16_4) {
        super(u16_4);
    }

    /* JADX WARNING: Removed duplicated region for block: B:81:0x00fc A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x00fd  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String MediaBrowserCompat$CustomActionResultReceiver(int r8) {
        /*
            r7 = this;
            r0 = 276(0x114, float:3.87E-43)
            r1 = 0
            r2 = 1
            r3 = 0
            if (r8 == r0) goto L_0x0136
            r0 = 326(0x146, float:4.57E-43)
            if (r8 == r0) goto L_0x0131
            r0 = 336(0x150, float:4.71E-43)
            if (r8 == r0) goto L_0x012c
            r0 = 537(0x219, float:7.52E-43)
            if (r8 == r0) goto L_0x0069
            r0 = 542(0x21e, float:7.6E-43)
            if (r8 == r0) goto L_0x0064
            r0 = 547(0x223, float:7.67E-43)
            if (r8 == r0) goto L_0x005f
            r0 = 559(0x22f, float:7.83E-43)
            if (r8 == r0) goto L_0x005a
            r0 = 567(0x237, float:7.95E-43)
            if (r8 == r0) goto L_0x0055
            r0 = 572(0x23c, float:8.02E-43)
            if (r8 == r0) goto L_0x0050
            r0 = 549(0x225, float:7.7E-43)
            if (r8 == r0) goto L_0x004b
            r0 = 550(0x226, float:7.71E-43)
            if (r8 == r0) goto L_0x0046
            r0 = 574(0x23e, float:8.04E-43)
            if (r8 == r0) goto L_0x0041
            r0 = 575(0x23f, float:8.06E-43)
            if (r8 == r0) goto L_0x003c
            java.lang.String r8 = super.MediaBrowserCompat$CustomActionResultReceiver((int) r8)
            return r8
        L_0x003c:
            java.lang.String r8 = r7.MediaBrowserCompat$SearchResultReceiver(r0)
            return r8
        L_0x0041:
            java.lang.String r8 = r7.MediaMetadataCompat(r0)
            return r8
        L_0x0046:
            java.lang.String r8 = r7.MediaBrowserCompat$SearchResultReceiver(r0)
            return r8
        L_0x004b:
            java.lang.String r8 = r7.MediaMetadataCompat(r0)
            return r8
        L_0x0050:
            java.lang.String r8 = r7.MediaBrowserCompat$SearchResultReceiver(r0)
            return r8
        L_0x0055:
            java.lang.String r8 = r7.MediaMetadataCompat(r0)
            return r8
        L_0x005a:
            java.lang.String r8 = r7.MediaMetadataCompat(r0)
            return r8
        L_0x005f:
            java.lang.String r8 = r7.MediaBrowserCompat$SearchResultReceiver(r0)
            return r8
        L_0x0064:
            java.lang.String r8 = r7.MediaMetadataCompat(r0)
            return r8
        L_0x0069:
            T r8 = r7.write
            o.U16_4 r8 = (p040o.U16_4) r8
            java.util.Map<java.lang.Integer, java.lang.Object> r8 = r8.MediaBrowserCompat$ItemReceiver
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object r8 = r8.get(r0)
            if (r8 == 0) goto L_0x00f9
            boolean r0 = r8 instanceof java.lang.String[]
            if (r0 == 0) goto L_0x0081
            java.lang.String[] r8 = (java.lang.String[]) r8
            goto L_0x00fa
        L_0x0081:
            boolean r0 = r8 instanceof java.lang.String
            if (r0 == 0) goto L_0x008e
            java.lang.String[] r0 = new java.lang.String[r2]
            java.lang.String r8 = (java.lang.String) r8
            r0[r3] = r8
        L_0x008b:
            r8 = r0
            goto L_0x00fa
        L_0x008e:
            boolean r0 = r8 instanceof p040o.createFromBitmap
            if (r0 == 0) goto L_0x009b
            java.lang.String[] r0 = new java.lang.String[r2]
            java.lang.String r8 = r8.toString()
            r0[r3] = r8
            goto L_0x008b
        L_0x009b:
            boolean r0 = r8 instanceof p040o.createFromBitmap[]
            if (r0 == 0) goto L_0x00b4
            o.createFromBitmap[] r8 = (p040o.createFromBitmap[]) r8
            int r0 = r8.length
            java.lang.String[] r4 = new java.lang.String[r0]
            r5 = r3
        L_0x00a5:
            if (r5 >= r0) goto L_0x00b2
            r6 = r8[r5]
            java.lang.String r6 = r6.toString()
            r4[r5] = r6
            int r5 = r5 + 1
            goto L_0x00a5
        L_0x00b2:
            r8 = r4
            goto L_0x00fa
        L_0x00b4:
            boolean r0 = r8 instanceof int[]
            if (r0 == 0) goto L_0x00cb
            int[] r8 = (int[]) r8
            int r0 = r8.length
            java.lang.String[] r4 = new java.lang.String[r0]
            r5 = r3
        L_0x00be:
            if (r5 >= r0) goto L_0x00b2
            r6 = r8[r5]
            java.lang.String r6 = java.lang.Integer.toString(r6)
            r4[r5] = r6
            int r5 = r5 + 1
            goto L_0x00be
        L_0x00cb:
            boolean r0 = r8 instanceof byte[]
            if (r0 == 0) goto L_0x00e2
            byte[] r8 = (byte[]) r8
            int r0 = r8.length
            java.lang.String[] r4 = new java.lang.String[r0]
            r5 = r3
        L_0x00d5:
            if (r5 >= r0) goto L_0x00b2
            byte r6 = r8[r5]
            java.lang.String r6 = java.lang.Byte.toString(r6)
            r4[r5] = r6
            int r5 = r5 + 1
            goto L_0x00d5
        L_0x00e2:
            boolean r0 = r8 instanceof p040o.copy3DRangeFromUnchecked[]
            if (r0 == 0) goto L_0x00f9
            o.copy3DRangeFromUnchecked[] r8 = (p040o.copy3DRangeFromUnchecked[]) r8
            int r0 = r8.length
            java.lang.String[] r4 = new java.lang.String[r0]
            r5 = r3
        L_0x00ec:
            if (r5 >= r0) goto L_0x00b2
            r6 = r8[r5]
            java.lang.String r6 = r6.IconCompatParcelizer(r3)
            r4[r5] = r6
            int r5 = r5 + 1
            goto L_0x00ec
        L_0x00f9:
            r8 = r1
        L_0x00fa:
            if (r8 != 0) goto L_0x00fd
            return r1
        L_0x00fd:
            int r0 = r8.length
            r1 = r3
            r4 = r1
        L_0x0100:
            if (r1 >= r0) goto L_0x010d
            r5 = r8[r1]
            int r5 = r5.length()
            int r5 = r5 + r2
            int r4 = r4 + r5
            int r1 = r1 + 1
            goto L_0x0100
        L_0x010d:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r4)
            int r1 = r8.length
            r4 = r3
        L_0x0114:
            if (r4 >= r1) goto L_0x0127
            r5 = r8[r4]
            if (r2 != 0) goto L_0x0120
            java.lang.String r6 = ";"
            r0.append(r6)
            goto L_0x0121
        L_0x0120:
            r2 = r3
        L_0x0121:
            r0.append(r5)
            int r4 = r4 + 1
            goto L_0x0114
        L_0x0127:
            java.lang.String r8 = r0.toString()
            return r8
        L_0x012c:
            java.lang.String r8 = r7.MediaBrowserCompat$SearchResultReceiver(r0)
            return r8
        L_0x0131:
            java.lang.String r8 = r7.MediaMetadataCompat(r0)
            return r8
        L_0x0136:
            T r8 = r7.write
            o.U16_4 r8 = (p040o.U16_4) r8
            java.lang.Integer r8 = r8.MediaBrowserCompat$CustomActionResultReceiver(r0)
            if (r8 != 0) goto L_0x0141
            return r1
        L_0x0141:
            int r0 = r8.intValue()
            switch(r0) {
                case 0: goto L_0x01aa;
                case 1: goto L_0x01a7;
                case 2: goto L_0x01a4;
                case 3: goto L_0x01a1;
                case 4: goto L_0x019e;
                case 5: goto L_0x019b;
                case 6: goto L_0x0198;
                case 7: goto L_0x0195;
                case 8: goto L_0x0192;
                case 9: goto L_0x018f;
                case 10: goto L_0x018c;
                case 11: goto L_0x0189;
                case 12: goto L_0x0186;
                case 13: goto L_0x0183;
                case 14: goto L_0x0180;
                case 15: goto L_0x017d;
                case 16: goto L_0x017a;
                case 17: goto L_0x0177;
                case 18: goto L_0x0174;
                case 19: goto L_0x0171;
                case 20: goto L_0x016e;
                case 21: goto L_0x016b;
                case 22: goto L_0x0168;
                case 23: goto L_0x0165;
                case 24: goto L_0x0162;
                case 25: goto L_0x015f;
                case 26: goto L_0x015c;
                case 27: goto L_0x0159;
                case 28: goto L_0x0156;
                case 29: goto L_0x0153;
                default: goto L_0x0148;
            }
        L_0x0148:
            java.lang.Object[] r0 = new java.lang.Object[r2]
            r0[r3] = r8
            java.lang.String r8 = "Unknown (%d)"
            java.lang.String r8 = java.lang.String.format(r8, r0)
            return r8
        L_0x0153:
            java.lang.String r8 = "Corel Draw [.CDR]"
            return r8
        L_0x0156:
            java.lang.String r8 = "Ritzaus Bureau NITF version (RBNITF DTD)"
            return r8
        L_0x0159:
            java.lang.String r8 = "Tidningarnas Telegrambyra NITF version (TTNITF DTD)"
            return r8
        L_0x015c:
            java.lang.String r8 = "Tape Archive [.TAR]"
            return r8
        L_0x015f:
            java.lang.String r8 = "News Industry Text Format (NITF)"
            return r8
        L_0x0162:
            java.lang.String r8 = "Portable Document File [.PDF] Adobe"
            return r8
        L_0x0165:
            java.lang.String r8 = "MPEG 2 Audio Layer 3, ISO/IEC"
            return r8
        L_0x0168:
            java.lang.String r8 = "MPEG 2 Audio Layer 2 (Musicom), ISO/IEC"
            return r8
        L_0x016b:
            java.lang.String r8 = "Hypertext Markup Language [.HTML] (The Internet Society)"
            return r8
        L_0x016e:
            java.lang.String r8 = "Freehand (Macromedia/Aldus)"
            return r8
        L_0x0171:
            java.lang.String r8 = "RIFF Wave (Microsoft Corporation)"
            return r8
        L_0x0174:
            java.lang.String r8 = "Audio Interchange File Format AIFF (Apple Computer Inc)"
            return r8
        L_0x0177:
            java.lang.String r8 = "Compressed Binary File [.ZIP] (PKWare Inc)"
            return r8
        L_0x017a:
            java.lang.String r8 = "PC DOS/Windows Executable Files [.COM][.EXE]"
            return r8
        L_0x017d:
            java.lang.String r8 = "Audio plus Moving Video [.AVI] (Microsoft)"
            return r8
        L_0x0180:
            java.lang.String r8 = "Digital Audio File [.WAV] (Microsoft & Creative Labs)"
            return r8
        L_0x0183:
            java.lang.String r8 = "Bit Mapped Graphics File [.BMP] (Microsoft)"
            return r8
        L_0x0186:
            java.lang.String r8 = "Photo-CD Image-Pac (Eastman Kodak)"
            return r8
        L_0x0189:
            java.lang.String r8 = "JPEG File Interchange (JFIF)"
            return r8
        L_0x018c:
            java.lang.String r8 = "United Press International Down-Load Message"
            return r8
        L_0x018f:
            java.lang.String r8 = "United Press International ANPA 1312 variant"
            return r8
        L_0x0192:
            java.lang.String r8 = "IPTC Unstructured Character Oriented File Format (UCOFF)"
            return r8
        L_0x0195:
            java.lang.String r8 = "MacBinary II"
            return r8
        L_0x0198:
            java.lang.String r8 = "NAA 89-3 (ANPA 1312)"
            return r8
        L_0x019b:
            java.lang.String r8 = "AppleSingle (Apple Computer Inc)"
            return r8
        L_0x019e:
            java.lang.String r8 = "Illustrator (Adobe Graphics data)"
            return r8
        L_0x01a1:
            java.lang.String r8 = "Tagged Image File Format (Adobe/Aldus Image data)"
            return r8
        L_0x01a4:
            java.lang.String r8 = "IPTC7901 Recommended Message Format"
            return r8
        L_0x01a7:
            java.lang.String r8 = "IPTC-NAA Digital Newsphoto Parameter Record"
            return r8
        L_0x01aa:
            java.lang.String r8 = "No ObjectData"
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.U16.MediaBrowserCompat$CustomActionResultReceiver(int):java.lang.String");
    }

    private String MediaMetadataCompat(int i) {
        String MediaBrowserCompat$SearchResultReceiver = ((U16_4) this.write).MediaBrowserCompat$SearchResultReceiver(i);
        if (MediaBrowserCompat$SearchResultReceiver == null) {
            return null;
        }
        if (MediaBrowserCompat$SearchResultReceiver.length() != 8) {
            return MediaBrowserCompat$SearchResultReceiver;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(MediaBrowserCompat$SearchResultReceiver.substring(0, 4));
        sb.append(':');
        sb.append(MediaBrowserCompat$SearchResultReceiver.substring(4, 6));
        sb.append(':');
        sb.append(MediaBrowserCompat$SearchResultReceiver.substring(6));
        return sb.toString();
    }

    private String MediaBrowserCompat$SearchResultReceiver(int i) {
        String MediaBrowserCompat$SearchResultReceiver = ((U16_4) this.write).MediaBrowserCompat$SearchResultReceiver(i);
        if (MediaBrowserCompat$SearchResultReceiver == null) {
            return null;
        }
        if (MediaBrowserCompat$SearchResultReceiver.length() != 6 && MediaBrowserCompat$SearchResultReceiver.length() != 11) {
            return MediaBrowserCompat$SearchResultReceiver;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(MediaBrowserCompat$SearchResultReceiver.substring(0, 2));
        sb.append(':');
        sb.append(MediaBrowserCompat$SearchResultReceiver.substring(2, 4));
        sb.append(':');
        sb.append(MediaBrowserCompat$SearchResultReceiver.substring(4));
        return sb.toString();
    }
}
