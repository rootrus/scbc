package org.jnbis.internal;

import java.util.Arrays;
import org.bouncycastle.crypto.tls.CipherSuite;
import org.jnbis.Bitmap;
import org.jnbis.internal.WsqHelper;

public class InternalWsqDecoder {
    private int getCPpiWSQ() {
        return -1;
    }

    private int intSign(int i) {
        if (i == 0) {
            return 1;
        }
        int i2 = -1;
        for (int i3 = 1; i3 < i; i3++) {
            i2 = -i2;
        }
        return i2;
    }

    public Bitmap decode(byte[] bArr) {
        WsqHelper.Token token = new WsqHelper.Token(bArr);
        token.initialize();
        getCMarkerWSQ(token, 65440);
        int cMarkerWSQ = getCMarkerWSQ(token, 2);
        while (cMarkerWSQ != 65442) {
            getCTableWSQ(token, cMarkerWSQ);
            cMarkerWSQ = getCMarkerWSQ(token, 2);
        }
        WsqHelper.HeaderFrm cFrameHeaderWSQ = getCFrameHeaderWSQ(token);
        int i = cFrameHeaderWSQ.width;
        int i2 = cFrameHeaderWSQ.height;
        int cPpiWSQ = getCPpiWSQ();
        buildWSQTrees(token, i, i2);
        float[] unquantize = unquantize(token, huffmanDecodeDataMem(token, i * i2), i, i2);
        wsqReconstruct(token, unquantize, i, i2);
        int i3 = i;
        int i4 = i2;
        return new Bitmap(convertImage2Byte(unquantize, i3, i4, cFrameHeaderWSQ.mShift, cFrameHeaderWSQ.rScale), i3, i4, cPpiWSQ, 8, 1);
    }

    private int getCMarkerWSQ(WsqHelper.Token token, int i) {
        if (token.pointer < token.buffer.length) {
            int readShort = token.readShort();
            if (i != 2) {
                if (i != 4) {
                    if (i != 65440) {
                        if (i != 65535) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("ERROR : getc_marker_wsq : Invalid marker : ");
                            sb.append(readShort);
                            throw new RuntimeException(sb.toString());
                        } else if ((readShort & CipherSuite.DRAFT_TLS_DHE_RSA_WITH_AES_128_OCB) != 65280) {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("ERROR : getc_marker_wsq : no marker found : ");
                            sb2.append(readShort);
                            throw new RuntimeException(sb2.toString());
                        } else if (readShort >= 65440 && readShort <= 65448) {
                            return readShort;
                        } else {
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append("ERROR : getc_marker_wsq : not a valid marker : ");
                            sb3.append(readShort);
                            throw new RuntimeException(sb3.toString());
                        }
                    } else if (readShort == 65440) {
                        return readShort;
                    } else {
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append("ERROR : getCMarkerWSQ : No SOI marker : ");
                        sb4.append(readShort);
                        throw new RuntimeException(sb4.toString());
                    }
                } else if (readShort == 65444 || readShort == 65445 || readShort == 65446 || readShort == 65443 || readShort == 65448) {
                    return readShort;
                } else {
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append("ERROR : getc_marker_wsq : No SOB, Table, or comment markers : ");
                    sb5.append(readShort);
                    throw new RuntimeException(sb5.toString());
                }
            } else if (readShort == 65444 || readShort == 65445 || readShort == 65446 || readShort == 65442 || readShort == 65448) {
                return readShort;
            } else {
                StringBuilder sb6 = new StringBuilder();
                sb6.append("ERROR : getc_marker_wsq : No SOF, Table, or comment markers : ");
                sb6.append(readShort);
                throw new RuntimeException(sb6.toString());
            }
        } else {
            StringBuilder sb7 = new StringBuilder();
            sb7.append("Error, Invalid pointer : ");
            sb7.append(token.pointer);
            throw new RuntimeException(sb7.toString());
        }
    }

    private void getCTableWSQ(WsqHelper.Token token, int i) {
        switch (i) {
            case 65444:
                getCTransformTable(token);
                return;
            case 65445:
                getCQuantizationTable(token);
                return;
            case 65446:
                getCHuffmanTableWSQ(token);
                return;
            case 65448:
                getCComment(token);
                return;
            default:
                StringBuilder sb = new StringBuilder();
                sb.append("ERROR: getCTableWSQ : Invalid table defined : ");
                sb.append(i);
                throw new RuntimeException(sb.toString());
        }
    }

    private String getCComment(WsqHelper.Token token) {
        return Arrays.toString(token.readBytes(token.readShort() - 2));
    }

    private void getCTransformTable(WsqHelper.Token token) {
        int i;
        int i2;
        token.readShort();
        token.tableDTT.hisz = token.readByte();
        token.tableDTT.losz = token.readByte();
        token.tableDTT.hifilt = new float[token.tableDTT.hisz];
        token.tableDTT.lofilt = new float[token.tableDTT.losz];
        if (token.tableDTT.hisz % 2 != 0) {
            i = (token.tableDTT.hisz + 1) / 2;
        } else {
            i = token.tableDTT.hisz / 2;
        }
        float[] fArr = new float[i];
        int i3 = i - 1;
        for (int i4 = 0; i4 <= i3; i4++) {
            int readByte = token.readByte();
            fArr[i4] = (float) token.readInt();
            for (int readByte2 = token.readByte(); readByte2 > 0; readByte2--) {
                fArr[i4] = (float) (((double) fArr[i4]) / 10.0d);
            }
            if (readByte != 0) {
                fArr[i4] = (float) (-((double) fArr[i4]));
            }
            if (token.tableDTT.hisz % 2 != 0) {
                int i5 = i4 + i3;
                token.tableDTT.hifilt[i5] = ((float) intSign(i4)) * fArr[i4];
                if (i4 > 0) {
                    token.tableDTT.hifilt[i3 - i4] = token.tableDTT.hifilt[i5];
                }
            } else {
                int i6 = i4 + i3 + 1;
                token.tableDTT.hifilt[i6] = ((float) intSign(i4)) * fArr[i4];
                token.tableDTT.hifilt[i3 - i4] = -token.tableDTT.hifilt[i6];
            }
        }
        if (token.tableDTT.losz % 2 != 0) {
            i2 = (token.tableDTT.losz + 1) / 2;
        } else {
            i2 = token.tableDTT.losz / 2;
        }
        float[] fArr2 = new float[i2];
        int i7 = i2 - 1;
        for (int i8 = 0; i8 <= i7; i8++) {
            int readByte3 = token.readByte();
            fArr2[i8] = (float) token.readInt();
            for (int readByte4 = token.readByte(); readByte4 > 0; readByte4--) {
                fArr2[i8] = (float) (((double) fArr2[i8]) / 10.0d);
            }
            if (readByte3 != 0) {
                fArr2[i8] = (float) (-((double) fArr2[i8]));
            }
            if (token.tableDTT.losz % 2 != 0) {
                int i9 = i8 + i7;
                token.tableDTT.lofilt[i9] = ((float) intSign(i8)) * fArr2[i8];
                if (i8 > 0) {
                    token.tableDTT.lofilt[i7 - i8] = token.tableDTT.lofilt[i9];
                }
            } else {
                int i10 = i8 + i7 + 1;
                token.tableDTT.lofilt[i10] = ((float) intSign(i8 + 1)) * fArr2[i8];
                token.tableDTT.lofilt[i7 - i8] = token.tableDTT.lofilt[i10];
            }
        }
        token.tableDTT.lodef = 1;
        token.tableDTT.hidef = 1;
    }

    public void getCQuantizationTable(WsqHelper.Token token) {
        token.readShort();
        token.tableDQT.binCenter = (float) token.readShort();
        for (int readByte = token.readByte(); readByte > 0; readByte--) {
            WsqHelper.Table_DQT table_DQT = token.tableDQT;
            table_DQT.binCenter = (float) (((double) table_DQT.binCenter) / 10.0d);
        }
        for (int i = 0; i < 64; i++) {
            token.tableDQT.qBin[i] = (float) token.readShort();
            for (int readByte2 = token.readByte(); readByte2 > 0; readByte2--) {
                float[] fArr = token.tableDQT.qBin;
                fArr[i] = (float) (((double) fArr[i]) / 10.0d);
            }
            token.tableDQT.zBin[i] = (float) token.readShort();
            for (int readByte3 = token.readByte(); readByte3 > 0; readByte3--) {
                float[] fArr2 = token.tableDQT.zBin;
                fArr2[i] = (float) (((double) fArr2[i]) / 10.0d);
            }
        }
        token.tableDQT.dqtDef = 1;
    }

    public void getCHuffmanTableWSQ(WsqHelper.Token token) {
        WsqHelper.HuffmanTable cHuffmanTable = getCHuffmanTable(token, 256, 0, true);
        int i = cHuffmanTable.tableId;
        token.tableDHT[i].huffbits = (int[]) cHuffmanTable.huffbits.clone();
        token.tableDHT[i].huffvalues = (int[]) cHuffmanTable.huffvalues.clone();
        token.tableDHT[i].tabdef = 1;
        int i2 = cHuffmanTable.bytesLeft;
        while (i2 != 0) {
            WsqHelper.HuffmanTable cHuffmanTable2 = getCHuffmanTable(token, 256, i2, false);
            int i3 = cHuffmanTable2.tableId;
            if (token.tableDHT[i3].tabdef == 0) {
                token.tableDHT[i3].huffbits = (int[]) cHuffmanTable2.huffbits.clone();
                token.tableDHT[i3].huffvalues = (int[]) cHuffmanTable2.huffvalues.clone();
                token.tableDHT[i3].tabdef = 1;
                i2 = cHuffmanTable2.bytesLeft;
            } else {
                throw new RuntimeException("ERROR : getCHuffmanTableWSQ : huffman table already defined.");
            }
        }
    }

    private WsqHelper.HuffmanTable getCHuffmanTable(WsqHelper.Token token, int i, int i2, boolean z) {
        WsqHelper.HuffmanTable huffmanTable = new WsqHelper.HuffmanTable();
        if (z) {
            huffmanTable.tableLen = token.readShort();
            huffmanTable.bytesLeft = huffmanTable.tableLen - 2;
            i2 = huffmanTable.bytesLeft;
        } else {
            huffmanTable.bytesLeft = i2;
        }
        if (i2 > 0) {
            huffmanTable.tableId = token.readByte();
            huffmanTable.bytesLeft--;
            huffmanTable.huffbits = new int[16];
            int i3 = 0;
            for (int i4 = 0; i4 < 16; i4++) {
                huffmanTable.huffbits[i4] = token.readByte();
                i3 += huffmanTable.huffbits[i4];
            }
            huffmanTable.bytesLeft -= 16;
            int i5 = i + 1;
            if (i3 <= i5) {
                huffmanTable.huffvalues = new int[i5];
                for (int i6 = 0; i6 < i3; i6++) {
                    huffmanTable.huffvalues[i6] = token.readByte();
                }
                huffmanTable.bytesLeft -= i3;
                return huffmanTable;
            }
            throw new RuntimeException("ERROR : getCHuffmanTable : numHufvals is larger than MAX_HUFFCOUNTS");
        }
        throw new RuntimeException("ERROR : getCHuffmanTable : no huffman table bytes remaining");
    }

    private WsqHelper.HeaderFrm getCFrameHeaderWSQ(WsqHelper.Token token) {
        WsqHelper.HeaderFrm headerFrm = new WsqHelper.HeaderFrm();
        token.readShort();
        headerFrm.black = token.readByte();
        headerFrm.white = token.readByte();
        headerFrm.height = token.readShort();
        headerFrm.width = token.readShort();
        headerFrm.mShift = (float) token.readShort();
        for (int readByte = token.readByte(); readByte > 0; readByte--) {
            headerFrm.mShift = (float) (((double) headerFrm.mShift) / 10.0d);
        }
        headerFrm.rScale = (float) token.readShort();
        for (int readByte2 = token.readByte(); readByte2 > 0; readByte2--) {
            headerFrm.rScale = (float) (((double) headerFrm.rScale) / 10.0d);
        }
        headerFrm.wsqEncoder = token.readByte();
        headerFrm.software = token.readShort();
        return headerFrm;
    }

    private void buildWSQTrees(WsqHelper.Token token, int i, int i2) {
        buildWTree(token, 20, i, i2);
        buildQTree(token, 64);
    }

    private void buildWTree(WsqHelper.Token token, int i, int i2, int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        WsqHelper.Token token2 = token;
        int i8 = i;
        token2.wtree = new WsqHelper.WavletTree[i8];
        for (int i9 = 0; i9 < i8; i9++) {
            token2.wtree[i9] = new WsqHelper.WavletTree();
            token2.wtree[i9].invrw = 0;
            token2.wtree[i9].invcl = 0;
        }
        token2.wtree[2].invrw = 1;
        token2.wtree[4].invrw = 1;
        token2.wtree[7].invrw = 1;
        token2.wtree[9].invrw = 1;
        token2.wtree[11].invrw = 1;
        token2.wtree[13].invrw = 1;
        token2.wtree[16].invrw = 1;
        token2.wtree[18].invrw = 1;
        token2.wtree[3].invcl = 1;
        token2.wtree[5].invcl = 1;
        token2.wtree[8].invcl = 1;
        token2.wtree[9].invcl = 1;
        token2.wtree[12].invcl = 1;
        token2.wtree[13].invcl = 1;
        token2.wtree[17].invcl = 1;
        token2.wtree[18].invcl = 1;
        wtree4(token, 0, 1, i2, i3, 0, 0, 1);
        if (token2.wtree[1].lenx % 2 == 0) {
            i5 = token2.wtree[1].lenx / 2;
            i4 = i5;
        } else {
            int i10 = (token2.wtree[1].lenx + 1) / 2;
            i4 = i10;
            i5 = i10 - 1;
        }
        if (token2.wtree[1].leny % 2 == 0) {
            i7 = token2.wtree[1].leny / 2;
            i6 = i7;
        } else {
            int i11 = (token2.wtree[1].leny + 1) / 2;
            i7 = i11;
            i6 = i11 - 1;
        }
        WsqHelper.Token token3 = token;
        wtree4(token3, 4, 6, i5, i7, i4, 0, 0);
        int i12 = i4;
        wtree4(token3, 5, 10, i12, i6, 0, i7, 0);
        wtree4(token3, 14, 15, i12, i7, 0, 0, 0);
        token2.wtree[19].f6392x = 0;
        token2.wtree[19].f6393y = 0;
        if (token2.wtree[15].lenx % 2 == 0) {
            token2.wtree[19].lenx = token2.wtree[15].lenx / 2;
        } else {
            token2.wtree[19].lenx = (token2.wtree[15].lenx + 1) / 2;
        }
        if (token2.wtree[15].leny % 2 == 0) {
            token2.wtree[19].leny = token2.wtree[15].leny / 2;
            return;
        }
        token2.wtree[19].leny = (token2.wtree[15].leny + 1) / 2;
    }

    private void wtree4(WsqHelper.Token token, int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        token.wtree[i].f6392x = i5;
        token.wtree[i].f6393y = i6;
        token.wtree[i].lenx = i3;
        token.wtree[i].leny = i4;
        token.wtree[i2].f6392x = i5;
        int i8 = i2 + 2;
        token.wtree[i8].f6392x = i5;
        token.wtree[i2].f6393y = i6;
        int i9 = i2 + 1;
        token.wtree[i9].f6393y = i6;
        if (i3 % 2 == 0) {
            token.wtree[i2].lenx = i3 / 2;
            token.wtree[i9].lenx = token.wtree[i2].lenx;
        } else if (i == 4) {
            token.wtree[i2].lenx = (i3 - 1) / 2;
            token.wtree[i9].lenx = token.wtree[i2].lenx + 1;
        } else {
            token.wtree[i2].lenx = (i3 + 1) / 2;
            token.wtree[i9].lenx = token.wtree[i2].lenx - 1;
        }
        token.wtree[i9].f6392x = token.wtree[i2].lenx + i5;
        if (i7 == 0) {
            int i10 = i2 + 3;
            token.wtree[i10].lenx = token.wtree[i9].lenx;
            token.wtree[i10].f6392x = token.wtree[i9].f6392x;
        }
        token.wtree[i8].lenx = token.wtree[i2].lenx;
        if (i4 % 2 == 0) {
            token.wtree[i2].leny = i4 / 2;
            token.wtree[i8].leny = token.wtree[i2].leny;
        } else if (i == 5) {
            token.wtree[i2].leny = (i4 - 1) / 2;
            token.wtree[i8].leny = token.wtree[i2].leny + 1;
        } else {
            token.wtree[i2].leny = (i4 + 1) / 2;
            token.wtree[i8].leny = token.wtree[i2].leny - 1;
        }
        token.wtree[i8].f6393y = token.wtree[i2].leny + i6;
        if (i7 == 0) {
            int i11 = i2 + 3;
            token.wtree[i11].leny = token.wtree[i8].leny;
            token.wtree[i11].f6393y = token.wtree[i8].f6393y;
        }
        token.wtree[i9].leny = token.wtree[i2].leny;
    }

    private void buildQTree(WsqHelper.Token token, int i) {
        token.qtree = new WsqHelper.QuantTree[i];
        for (int i2 = 0; i2 < token.qtree.length; i2++) {
            token.qtree[i2] = new WsqHelper.QuantTree();
        }
        qtree16(token, 3, token.wtree[14].lenx, token.wtree[14].leny, token.wtree[14].f6392x, token.wtree[14].f6393y, 0, 0);
        WsqHelper.Token token2 = token;
        qtree16(token2, 19, token.wtree[4].lenx, token.wtree[4].leny, token.wtree[4].f6392x, token.wtree[4].f6393y, 0, 1);
        qtree16(token2, 48, token.wtree[0].lenx, token.wtree[0].leny, token.wtree[0].f6392x, token.wtree[0].f6393y, 0, 0);
        qtree16(token, 35, token.wtree[5].lenx, token.wtree[5].leny, token.wtree[5].f6392x, token.wtree[5].f6393y, 1, 0);
        qtree4(token, 0, token.wtree[19].lenx, token.wtree[19].leny, token.wtree[19].f6392x, token.wtree[19].f6393y);
    }

    private void qtree16(WsqHelper.Token token, int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        int i8;
        int i9;
        int i10;
        int i11;
        WsqHelper.Token token2 = token;
        int i12 = i4;
        int i13 = i5;
        if (i2 % 2 == 0) {
            i9 = i2 / 2;
            i8 = i9;
        } else if (i7 != 0) {
            int i14 = (i2 + 1) / 2;
            i8 = i14;
            i9 = i14 - 1;
        } else {
            i9 = (i2 + 1) / 2;
            i8 = i9 - 1;
        }
        if (i3 % 2 == 0) {
            i11 = i3 / 2;
            i10 = i11;
        } else if (i6 != 0) {
            int i15 = (i3 + 1) / 2;
            i10 = i15;
            i11 = i15 - 1;
        } else {
            i11 = (i3 + 1) / 2;
            i10 = i11 - 1;
        }
        token2.qtree[i].f6390x = i12;
        int i16 = i + 2;
        token2.qtree[i16].f6390x = i12;
        token2.qtree[i].f6391y = i13;
        int i17 = i + 1;
        token2.qtree[i17].f6391y = i13;
        if (i9 % 2 == 0) {
            token2.qtree[i].lenx = i9 / 2;
            token2.qtree[i17].lenx = token2.qtree[i].lenx;
            token2.qtree[i16].lenx = token2.qtree[i].lenx;
            token2.qtree[i + 3].lenx = token2.qtree[i].lenx;
        } else {
            token2.qtree[i].lenx = (i9 + 1) / 2;
            token2.qtree[i17].lenx = token2.qtree[i].lenx - 1;
            token2.qtree[i16].lenx = token2.qtree[i].lenx;
            token2.qtree[i + 3].lenx = token2.qtree[i17].lenx;
        }
        token2.qtree[i17].f6390x = token2.qtree[i].lenx + i12;
        int i18 = i + 3;
        token2.qtree[i18].f6390x = token2.qtree[i17].f6390x;
        if (i11 % 2 == 0) {
            token2.qtree[i].leny = i11 / 2;
            token2.qtree[i17].leny = token2.qtree[i].leny;
            token2.qtree[i16].leny = token2.qtree[i].leny;
            token2.qtree[i18].leny = token2.qtree[i].leny;
        } else {
            token2.qtree[i].leny = (i11 + 1) / 2;
            token2.qtree[i17].leny = token2.qtree[i].leny;
            token2.qtree[i16].leny = token2.qtree[i].leny - 1;
            token2.qtree[i18].leny = token2.qtree[i16].leny;
        }
        token2.qtree[i16].f6391y = token2.qtree[i].leny + i13;
        token2.qtree[i18].f6391y = token2.qtree[i16].f6391y;
        int i19 = i + 4;
        token2.qtree[i19].f6390x = i9 + i12;
        int i20 = i + 6;
        token2.qtree[i20].f6390x = token2.qtree[i19].f6390x;
        token2.qtree[i19].f6391y = i13;
        int i21 = i + 5;
        token2.qtree[i21].f6391y = i13;
        token2.qtree[i20].f6391y = token2.qtree[i16].f6391y;
        int i22 = i + 7;
        token2.qtree[i22].f6391y = token2.qtree[i16].f6391y;
        token2.qtree[i19].leny = token2.qtree[i].leny;
        token2.qtree[i21].leny = token2.qtree[i].leny;
        token2.qtree[i20].leny = token2.qtree[i16].leny;
        token2.qtree[i22].leny = token2.qtree[i16].leny;
        if (i8 % 2 == 0) {
            token2.qtree[i19].lenx = i8 / 2;
            token2.qtree[i21].lenx = token2.qtree[i19].lenx;
            token2.qtree[i20].lenx = token2.qtree[i19].lenx;
            token2.qtree[i22].lenx = token2.qtree[i19].lenx;
        } else {
            token2.qtree[i21].lenx = (i8 + 1) / 2;
            token2.qtree[i19].lenx = token2.qtree[i21].lenx - 1;
            token2.qtree[i20].lenx = token2.qtree[i19].lenx;
            token2.qtree[i22].lenx = token2.qtree[i21].lenx;
        }
        token2.qtree[i21].f6390x = token2.qtree[i19].f6390x + token2.qtree[i19].lenx;
        token2.qtree[i22].f6390x = token2.qtree[i21].f6390x;
        int i23 = i + 8;
        token2.qtree[i23].f6390x = i12;
        int i24 = i + 9;
        token2.qtree[i24].f6390x = token2.qtree[i17].f6390x;
        int i25 = i + 10;
        token2.qtree[i25].f6390x = i12;
        int i26 = i + 11;
        token2.qtree[i26].f6390x = token2.qtree[i17].f6390x;
        token2.qtree[i23].f6391y = i13 + i11;
        token2.qtree[i24].f6391y = token2.qtree[i23].f6391y;
        token2.qtree[i23].lenx = token2.qtree[i].lenx;
        token2.qtree[i24].lenx = token2.qtree[i17].lenx;
        token2.qtree[i25].lenx = token2.qtree[i].lenx;
        token2.qtree[i26].lenx = token2.qtree[i17].lenx;
        if (i10 % 2 == 0) {
            token2.qtree[i23].leny = i10 / 2;
            token2.qtree[i24].leny = token2.qtree[i23].leny;
            token2.qtree[i25].leny = token2.qtree[i23].leny;
            token2.qtree[i26].leny = token2.qtree[i23].leny;
        } else {
            token2.qtree[i25].leny = (i10 + 1) / 2;
            token2.qtree[i26].leny = token2.qtree[i25].leny;
            token2.qtree[i23].leny = token2.qtree[i25].leny - 1;
            token2.qtree[i24].leny = token2.qtree[i23].leny;
        }
        token2.qtree[i25].f6391y = token2.qtree[i23].f6391y + token2.qtree[i23].leny;
        token2.qtree[i26].f6391y = token2.qtree[i25].f6391y;
        int i27 = i + 12;
        token2.qtree[i27].f6390x = token2.qtree[i19].f6390x;
        int i28 = i + 13;
        token2.qtree[i28].f6390x = token2.qtree[i21].f6390x;
        int i29 = i + 14;
        token2.qtree[i29].f6390x = token2.qtree[i19].f6390x;
        int i30 = i + 15;
        token2.qtree[i30].f6390x = token2.qtree[i21].f6390x;
        token2.qtree[i27].f6391y = token2.qtree[i23].f6391y;
        token2.qtree[i28].f6391y = token2.qtree[i23].f6391y;
        token2.qtree[i29].f6391y = token2.qtree[i25].f6391y;
        token2.qtree[i30].f6391y = token2.qtree[i25].f6391y;
        token2.qtree[i27].lenx = token2.qtree[i19].lenx;
        token2.qtree[i28].lenx = token2.qtree[i21].lenx;
        token2.qtree[i29].lenx = token2.qtree[i19].lenx;
        token2.qtree[i30].lenx = token2.qtree[i21].lenx;
        token2.qtree[i27].leny = token2.qtree[i23].leny;
        token2.qtree[i28].leny = token2.qtree[i23].leny;
        token2.qtree[i29].leny = token2.qtree[i25].leny;
        token2.qtree[i30].leny = token2.qtree[i25].leny;
    }

    private void qtree4(WsqHelper.Token token, int i, int i2, int i3, int i4, int i5) {
        token.qtree[i].f6390x = i4;
        int i6 = i + 2;
        token.qtree[i6].f6390x = i4;
        token.qtree[i].f6391y = i5;
        int i7 = i + 1;
        token.qtree[i7].f6391y = i5;
        if (i2 % 2 == 0) {
            token.qtree[i].lenx = i2 / 2;
            token.qtree[i7].lenx = token.qtree[i].lenx;
            token.qtree[i6].lenx = token.qtree[i].lenx;
            token.qtree[i + 3].lenx = token.qtree[i].lenx;
        } else {
            token.qtree[i].lenx = (i2 + 1) / 2;
            token.qtree[i7].lenx = token.qtree[i].lenx - 1;
            token.qtree[i6].lenx = token.qtree[i].lenx;
            token.qtree[i + 3].lenx = token.qtree[i7].lenx;
        }
        token.qtree[i7].f6390x = i4 + token.qtree[i].lenx;
        int i8 = i + 3;
        token.qtree[i8].f6390x = token.qtree[i7].f6390x;
        if (i3 % 2 == 0) {
            token.qtree[i].leny = i3 / 2;
            token.qtree[i7].leny = token.qtree[i].leny;
            token.qtree[i6].leny = token.qtree[i].leny;
            token.qtree[i8].leny = token.qtree[i].leny;
        } else {
            token.qtree[i].leny = (i3 + 1) / 2;
            token.qtree[i7].leny = token.qtree[i].leny;
            token.qtree[i6].leny = token.qtree[i].leny - 1;
            token.qtree[i8].leny = token.qtree[i6].leny;
        }
        token.qtree[i6].f6391y = i5 + token.qtree[i].leny;
        token.qtree[i8].f6391y = token.qtree[i6].f6391y;
    }

    private int[] huffmanDecodeDataMem(WsqHelper.Token token, int i) {
        WsqHelper.IntRef intRef;
        int i2;
        int i3;
        WsqHelper.Token token2 = token;
        int[] iArr = new int[i];
        int[] iArr2 = new int[17];
        int[] iArr3 = new int[17];
        int[] iArr4 = new int[17];
        int i4 = 4;
        WsqHelper.IntRef intRef2 = new WsqHelper.IntRef(getCMarkerWSQ(token2, 4));
        int i5 = 0;
        WsqHelper.IntRef intRef3 = new WsqHelper.IntRef(0);
        WsqHelper.IntRef intRef4 = new WsqHelper.IntRef(0);
        int i6 = 0;
        int i7 = 0;
        while (intRef2.value != 65441) {
            if (intRef2.value != 0) {
                while (intRef2.value != 65443) {
                    getCTableWSQ(token2, intRef2.value);
                    intRef2.value = getCMarkerWSQ(token2, i4);
                }
                i2 = getCBlockHeader(token);
                if (token2.tableDHT[i2].tabdef == 1) {
                    WsqHelper.HuffCode[] buildHuffsizes = buildHuffsizes(token2.tableDHT[i2].huffbits, 256);
                    buildHuffcodes(buildHuffsizes);
                    intRef = intRef4;
                    genDecodeTable(buildHuffsizes, iArr2, iArr3, iArr4, token2.tableDHT[i2].huffbits);
                    intRef3.value = i5;
                    intRef2.value = i5;
                } else {
                    throw new RuntimeException("ERROR : huffmanDecodeDataMem : huffman table undefined.");
                }
            } else {
                intRef = intRef4;
                i2 = i6;
            }
            int i8 = i5;
            WsqHelper.IntRef intRef5 = intRef3;
            int i9 = i4;
            int decodeDataMem = decodeDataMem(token, iArr3, iArr2, iArr4, token2.tableDHT[i2].huffvalues, intRef3, intRef2, intRef);
            if (decodeDataMem != -1) {
                if (decodeDataMem > 0 && decodeDataMem <= 100) {
                    int i10 = i8;
                    while (i10 < decodeDataMem) {
                        iArr[i7] = i8;
                        i10++;
                        i7++;
                    }
                } else if (decodeDataMem <= 106 || decodeDataMem >= 255) {
                    if (decodeDataMem == 101) {
                        i3 = i7 + 1;
                        intRef4 = intRef;
                        iArr[i7] = getCNextbitsWSQ(token, intRef2, intRef5, 8, intRef4);
                    } else if (decodeDataMem == 102) {
                        i3 = i7 + 1;
                        intRef4 = intRef;
                        iArr[i7] = -getCNextbitsWSQ(token, intRef2, intRef5, 8, intRef4);
                    } else if (decodeDataMem == 103) {
                        i3 = i7 + 1;
                        intRef4 = intRef;
                        iArr[i7] = getCNextbitsWSQ(token, intRef2, intRef5, 16, intRef4);
                    } else if (decodeDataMem == 104) {
                        i3 = i7 + 1;
                        intRef4 = intRef;
                        iArr[i7] = -getCNextbitsWSQ(token, intRef2, intRef5, 16, intRef4);
                    } else if (decodeDataMem == 105) {
                        for (int cNextbitsWSQ = getCNextbitsWSQ(token, intRef2, intRef5, 8, intRef); cNextbitsWSQ > 0; cNextbitsWSQ--) {
                            iArr[i7] = i8;
                            i7++;
                        }
                    } else if (decodeDataMem == 106) {
                        for (int cNextbitsWSQ2 = getCNextbitsWSQ(token, intRef2, intRef5, 16, intRef); cNextbitsWSQ2 > 0; cNextbitsWSQ2--) {
                            iArr[i7] = i8;
                            i7++;
                        }
                    } else {
                        StringBuilder sb = new StringBuilder();
                        sb.append("ERROR: huffman_decode_data_mem : Invalid code (");
                        sb.append(decodeDataMem);
                        sb.append(")");
                        throw new RuntimeException(sb.toString());
                    }
                    i7 = i3;
                    i6 = i2;
                    i5 = i8;
                    intRef3 = intRef5;
                    i4 = i9;
                } else {
                    iArr[i7] = decodeDataMem - 180;
                    i7++;
                }
            }
            i6 = i2;
            i5 = i8;
            intRef4 = intRef;
            intRef3 = intRef5;
            i4 = i9;
        }
        return iArr;
    }

    private int getCBlockHeader(WsqHelper.Token token) {
        token.readShort();
        return token.readByte();
    }

    private WsqHelper.HuffCode[] buildHuffsizes(int[] iArr, int i) {
        WsqHelper.HuffCode[] huffCodeArr = new WsqHelper.HuffCode[(i + 1)];
        int i2 = 0;
        for (int i3 = 1; i3 <= 16; i3++) {
            for (int i4 = 1; i4 <= iArr[i3 - 1]; i4++) {
                huffCodeArr[i2] = new WsqHelper.HuffCode();
                huffCodeArr[i2].size = i3;
                i2++;
            }
        }
        huffCodeArr[i2] = new WsqHelper.HuffCode();
        huffCodeArr[i2].size = 0;
        return huffCodeArr;
    }

    private void buildHuffcodes(WsqHelper.HuffCode[] huffCodeArr) {
        int i = 0;
        int i2 = huffCodeArr[0].size;
        if (huffCodeArr[0].size != 0) {
            int i3 = i2;
            short s = 0;
            while (true) {
                huffCodeArr[i].code = s;
                s = (short) (s + 1);
                i++;
                if (huffCodeArr[i].size != i3) {
                    if (huffCodeArr[i].size != 0) {
                        do {
                            s = (short) (s << 1);
                            i3++;
                        } while (huffCodeArr[i].size != i3);
                        if (huffCodeArr[i].size != i3) {
                            return;
                        }
                    } else {
                        return;
                    }
                }
            }
        }
    }

    private void genDecodeTable(WsqHelper.HuffCode[] huffCodeArr, int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4) {
        int i = 0;
        for (int i2 = 0; i2 <= 16; i2++) {
            iArr[i2] = 0;
            iArr2[i2] = 0;
            iArr3[i2] = 0;
        }
        for (int i3 = 1; i3 <= 16; i3++) {
            int i4 = i3 - 1;
            if (iArr4[i4] == 0) {
                iArr[i3] = -1;
            } else {
                iArr3[i3] = i;
                iArr2[i3] = huffCodeArr[i].code;
                int i5 = (i + iArr4[i4]) - 1;
                iArr[i3] = huffCodeArr[i5].code;
                i = i5 + 1;
            }
        }
    }

    private int decodeDataMem(WsqHelper.Token token, int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4, WsqHelper.IntRef intRef, WsqHelper.IntRef intRef2, WsqHelper.IntRef intRef3) {
        WsqHelper.IntRef intRef4 = intRef2;
        short cNextbitsWSQ = (short) getCNextbitsWSQ(token, intRef2, intRef, 1, intRef3);
        if (intRef4.value != 0) {
            return -1;
        }
        int i = 1;
        while (cNextbitsWSQ > iArr2[i]) {
            cNextbitsWSQ = (short) ((cNextbitsWSQ << 1) + getCNextbitsWSQ(token, intRef2, intRef, 1, intRef3));
            if (intRef4.value != 0) {
                return -1;
            }
            i++;
        }
        return iArr4[(iArr3[i] + cNextbitsWSQ) - iArr[i]];
    }

    private int getCNextbitsWSQ(WsqHelper.Token token, WsqHelper.IntRef intRef, WsqHelper.IntRef intRef2, int i, WsqHelper.IntRef intRef3) {
        if (intRef2.value == 0) {
            intRef3.value = token.readByte();
            intRef2.value = 8;
            if (intRef3.value == 255) {
                int readByte = token.readByte();
                if (readByte != 0 && i == 1) {
                    intRef.value = (intRef3.value << 8) | readByte;
                    return 1;
                } else if (readByte != 0) {
                    throw new RuntimeException("ERROR: getCNextbitsWSQ : No stuffed zeros.");
                }
            }
        }
        if (i <= intRef2.value) {
            int i2 = (intRef3.value >> (intRef2.value - i)) & WsqHelper.BITMASK[i];
            intRef2.value -= i;
            intRef3.value &= WsqHelper.BITMASK[intRef2.value];
            return i2;
        }
        int i3 = i - intRef2.value;
        int i4 = intRef3.value;
        intRef2.value = 0;
        return getCNextbitsWSQ(token, intRef, intRef2, i3, intRef3) | (i4 << i3);
    }

    private float[] unquantize(WsqHelper.Token token, int[] iArr, int i, int i2) {
        float[] fArr = new float[(i2 * i)];
        if (token.tableDQT.dqtDef == 1) {
            float f = token.tableDQT.binCenter;
            int i3 = 0;
            for (int i4 = 0; i4 < 60; i4++) {
                if (((double) token.tableDQT.qBin[i4]) != 0.0d) {
                    int i5 = (token.qtree[i4].f6391y * i) + token.qtree[i4].f6390x;
                    int i6 = 0;
                    while (i6 < token.qtree[i4].leny) {
                        for (int i7 = 0; i7 < token.qtree[i4].lenx; i7++) {
                            if (iArr[i3] == 0) {
                                fArr[i5] = 0.0f;
                            } else if (iArr[i3] > 0) {
                                fArr[i5] = (token.tableDQT.qBin[i4] * (((float) iArr[i3]) - f)) + (token.tableDQT.zBin[i4] / 2.0f);
                            } else if (iArr[i3] < 0) {
                                fArr[i5] = (token.tableDQT.qBin[i4] * (((float) iArr[i3]) + f)) - (token.tableDQT.zBin[i4] / 2.0f);
                            } else {
                                throw new RuntimeException("ERROR : unquantize : invalid quantization pixel value");
                            }
                            i5++;
                            i3++;
                        }
                        i6++;
                        i5 += i - token.qtree[i4].lenx;
                    }
                    continue;
                }
            }
            return fArr;
        }
        throw new RuntimeException("ERROR: unquantize : quantization table parameters not defined!");
    }

    private void wsqReconstruct(WsqHelper.Token token, float[] fArr, int i, int i2) {
        WsqHelper.Token token2 = token;
        if (token2.tableDTT.lodef != 1) {
            throw new RuntimeException("ERROR: wsq_reconstruct : Lopass filter coefficients not defined");
        } else if (token2.tableDTT.hidef == 1) {
            float[] fArr2 = new float[(i * i2)];
            for (int i3 = 19; i3 >= 0; i3--) {
                int i4 = (token2.wtree[i3].f6393y * i) + token2.wtree[i3].f6392x;
                joinLets(fArr2, fArr, 0, i4, token2.wtree[i3].lenx, token2.wtree[i3].leny, 1, i, token2.tableDTT.hifilt, token2.tableDTT.hisz, token2.tableDTT.lofilt, token2.tableDTT.losz, token2.wtree[i3].invcl);
                joinLets(fArr, fArr2, i4, 0, token2.wtree[i3].leny, token2.wtree[i3].lenx, i, 1, token2.tableDTT.hifilt, token2.tableDTT.hisz, token2.tableDTT.lofilt, token2.tableDTT.losz, token2.wtree[i3].invrw);
            }
        } else {
            throw new RuntimeException("ERROR: wsq_reconstruct : Hipass filter coefficients not defined");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:105:0x023b  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x0248  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x0251  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x01fc  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void joinLets(float[] r50, float[] r51, int r52, int r53, int r54, int r55, int r56, int r57, float[] r58, int r59, float[] r60, int r61, int r62) {
        /*
            r49 = this;
            r0 = r57
            r1 = r59
            r2 = r61
            int r3 = r55 % 2
            int r4 = r2 % 2
            int r5 = -r0
            r6 = 2
            r7 = 1
            if (r3 == 0) goto L_0x0015
            int r8 = r55 + 1
            int r8 = r8 / r6
            int r9 = r8 + -1
            goto L_0x0018
        L_0x0015:
            int r8 = r55 / 2
            r9 = r8
        L_0x0018:
            if (r4 == 0) goto L_0x003d
            int r13 = r2 + -1
            int r14 = r13 / 4
            int r15 = r1 + 1
            int r16 = r15 / 4
            int r16 = r16 + -1
            int r13 = r13 / r6
            int r13 = r13 % r6
            int r15 = r15 / r6
            int r15 = r15 % r6
            if (r3 == 0) goto L_0x002f
            r17 = r7
            r18 = 0
            goto L_0x0033
        L_0x002f:
            r18 = r7
            r17 = 0
        L_0x0033:
            r10 = r17
            r11 = 1065353216(0x3f800000, float:1.0)
            r12 = 0
            r19 = 0
            r20 = 0
            goto L_0x0080
        L_0x003d:
            int r13 = r2 / 4
            int r13 = r13 - r7
            int r14 = r1 / 4
            int r14 = r14 - r7
            int r15 = r2 / 2
            int r16 = r1 / 2
            int r16 = r16 % 2
            if (r3 == 0) goto L_0x004e
            r18 = 0
            goto L_0x0050
        L_0x004e:
            r18 = r7
        L_0x0050:
            r7 = -1
            if (r13 != r7) goto L_0x0057
            r13 = 0
            r19 = 0
            goto L_0x0059
        L_0x0057:
            r19 = 1
        L_0x0059:
            if (r14 != r7) goto L_0x005e
            r7 = 0
            r14 = 0
            goto L_0x005f
        L_0x005e:
            r7 = 1
        L_0x005f:
            r10 = 0
        L_0x0060:
            if (r10 >= r1) goto L_0x0070
            r11 = r58[r10]
            r20 = r13
            double r12 = (double) r11
            double r11 = -r12
            float r11 = (float) r11
            r58[r10] = r11
            int r10 = r10 + 1
            r13 = r20
            goto L_0x0060
        L_0x0070:
            r20 = r13
            int r13 = r15 % 2
            r12 = r6
            r15 = r16
            r10 = 1
            r11 = -1082130432(0xffffffffbf800000, float:-1.0)
            r16 = r14
            r14 = r20
            r20 = 1
        L_0x0080:
            r6 = r54
            r22 = r5
            r5 = 0
            r23 = 0
        L_0x0087:
            if (r5 >= r6) goto L_0x02d7
            int r24 = r5 * r56
            int r25 = r52 + r24
            r26 = 0
            r50[r25] = r26
            int r27 = r25 + r0
            r50[r27] = r26
            if (r62 == 0) goto L_0x009e
            int r24 = r53 + r24
            int r26 = r0 * r9
            int r26 = r24 + r26
            goto L_0x00a4
        L_0x009e:
            int r26 = r53 + r24
            int r24 = r0 * r8
            int r24 = r26 + r24
        L_0x00a4:
            r6 = r24
            r24 = r7
            r7 = r26
            int r26 = r8 + -1
            int r26 = r26 * r0
            r27 = r8
            int r8 = r7 + r26
            int r26 = r9 + -1
            int r26 = r26 * r0
            r28 = r10
            int r10 = r6 + r26
            int r26 = r14 * r0
            int r26 = r7 + r26
            int r29 = r16 * r0
            int r29 = r6 + r29
            r35 = r11
            r30 = r12
            r32 = r13
            r31 = r14
            r38 = r15
            r33 = r19
            r34 = r22
            r37 = r34
            r36 = r24
            r12 = r29
            r14 = 0
            r29 = r35
            r11 = r26
            r26 = r25
        L_0x00dd:
            r39 = 0
            if (r14 >= r9) goto L_0x01e6
        L_0x00e1:
            if (r32 < 0) goto L_0x012c
            r41 = r51[r11]
            r42 = r60[r32]
            float r41 = r41 * r42
            r50[r25] = r41
            int r41 = r32 + 2
            r44 = r4
            r42 = r9
            r4 = r11
            r43 = r33
            r45 = r34
            r9 = r41
            r41 = r18
        L_0x00fa:
            if (r9 >= r2) goto L_0x0123
            if (r4 != r7) goto L_0x0107
            if (r43 == 0) goto L_0x0105
            r43 = 0
            r45 = 0
            goto L_0x0107
        L_0x0105:
            r45 = r0
        L_0x0107:
            if (r4 != r8) goto L_0x0112
            if (r41 == 0) goto L_0x0110
            r41 = 0
            r45 = 0
            goto L_0x0112
        L_0x0110:
            r45 = r22
        L_0x0112:
            int r4 = r4 + r45
            r46 = r50[r25]
            r47 = r51[r4]
            r48 = r60[r9]
            float r47 = r47 * r48
            float r46 = r46 + r47
            r50[r25] = r46
            int r9 = r9 + 2
            goto L_0x00fa
        L_0x0123:
            int r25 = r25 + r0
            int r32 = r32 + -1
            r9 = r42
            r4 = r44
            goto L_0x00e1
        L_0x012c:
            r44 = r4
            r42 = r9
            if (r11 != r7) goto L_0x013b
            if (r33 == 0) goto L_0x0139
            r33 = 0
            r34 = 0
            goto L_0x013b
        L_0x0139:
            r34 = r0
        L_0x013b:
            int r11 = r11 + r34
        L_0x013d:
            if (r38 < 0) goto L_0x01bf
            r43 = r11
            r11 = r12
            r45 = r28
            r23 = r30
            r41 = r35
            r9 = r36
            r32 = r37
            r4 = r38
        L_0x014e:
            if (r4 >= r1) goto L_0x01b3
            if (r11 != r6) goto L_0x015c
            if (r9 == 0) goto L_0x0158
            r9 = 0
            r32 = 0
            goto L_0x015c
        L_0x0158:
            r32 = r0
            r41 = 1065353216(0x3f800000, float:1.0)
        L_0x015c:
            if (r11 != r10) goto L_0x0196
            if (r45 == 0) goto L_0x0189
            if (r20 == 0) goto L_0x017a
            if (r3 == 0) goto L_0x017a
            r46 = r9
            int r9 = r23 + -1
            r47 = r5
            float r5 = (float) r9
            r23 = r9
            r48 = r10
            double r9 = (double) r5
            int r9 = (r9 > r39 ? 1 : (r9 == r39 ? 0 : -1))
            if (r9 == 0) goto L_0x0177
            r45 = 1
            goto L_0x0184
        L_0x0177:
            r41 = r5
            goto L_0x0180
        L_0x017a:
            r47 = r5
            r46 = r9
            r48 = r10
        L_0x0180:
            r5 = r41
            r45 = 0
        L_0x0184:
            r41 = r5
            r32 = 0
            goto L_0x019c
        L_0x0189:
            r47 = r5
            r46 = r9
            r48 = r10
            r32 = r22
            if (r20 == 0) goto L_0x019c
            r41 = -1082130432(0xffffffffbf800000, float:-1.0)
            goto L_0x019c
        L_0x0196:
            r47 = r5
            r46 = r9
            r48 = r10
        L_0x019c:
            r5 = r50[r26]
            r9 = r51[r11]
            r10 = r58[r4]
            float r9 = r9 * r10
            float r9 = r9 * r41
            float r5 = r5 + r9
            r50[r26] = r5
            int r11 = r11 + r32
            int r4 = r4 + 2
            r9 = r46
            r5 = r47
            r10 = r48
            goto L_0x014e
        L_0x01b3:
            r47 = r5
            r48 = r10
            int r26 = r26 + r0
            int r38 = r38 + -1
            r11 = r43
            goto L_0x013d
        L_0x01bf:
            r47 = r5
            r48 = r10
            r43 = r11
            if (r12 != r6) goto L_0x01d2
            if (r36 == 0) goto L_0x01ce
            r36 = 0
            r37 = 0
            goto L_0x01d2
        L_0x01ce:
            r37 = r0
            r35 = 1065353216(0x3f800000, float:1.0)
        L_0x01d2:
            int r12 = r12 + r37
            int r14 = r14 + 1
            r9 = r42
            r11 = r43
            r4 = r44
            r5 = r47
            r10 = r48
            r32 = 1
            r38 = 1
            goto L_0x00dd
        L_0x01e6:
            r44 = r4
            r47 = r5
            r42 = r9
            r48 = r10
            if (r3 == 0) goto L_0x01f4
            if (r13 != 0) goto L_0x01f8
            r4 = 0
            goto L_0x01f9
        L_0x01f4:
            if (r13 == 0) goto L_0x01f8
            r4 = 2
            goto L_0x01f9
        L_0x01f8:
            r4 = 1
        L_0x01f9:
            r5 = 1
        L_0x01fa:
            if (r5 < r4) goto L_0x0239
            r9 = r51[r11]
            r10 = r60[r5]
            float r9 = r9 * r10
            r50[r25] = r9
            int r9 = r5 + 2
            r14 = r11
            r32 = r18
            r10 = r33
            r38 = r34
        L_0x020c:
            if (r9 >= r2) goto L_0x0234
            if (r14 != r7) goto L_0x0218
            if (r10 == 0) goto L_0x0216
            r10 = 0
            r38 = 0
            goto L_0x0218
        L_0x0216:
            r38 = r0
        L_0x0218:
            if (r14 != r8) goto L_0x0223
            if (r32 == 0) goto L_0x0221
            r32 = 0
            r38 = 0
            goto L_0x0223
        L_0x0221:
            r38 = r22
        L_0x0223:
            int r14 = r14 + r38
            r41 = r50[r25]
            r43 = r51[r14]
            r45 = r60[r9]
            float r43 = r43 * r45
            float r41 = r41 + r43
            r50[r25] = r41
            int r9 = r9 + 2
            goto L_0x020c
        L_0x0234:
            int r25 = r25 + r0
            int r5 = r5 + -1
            goto L_0x01fa
        L_0x0239:
            if (r3 == 0) goto L_0x0248
            if (r15 == 0) goto L_0x023f
            r4 = 1
            goto L_0x0240
        L_0x023f:
            r4 = 0
        L_0x0240:
            r5 = 2
            if (r1 != r5) goto L_0x024e
            int r12 = r12 - r37
            r23 = 1
            goto L_0x024e
        L_0x0248:
            r5 = 2
            if (r15 == 0) goto L_0x024d
            r4 = r5
            goto L_0x024e
        L_0x024d:
            r4 = 1
        L_0x024e:
            r7 = 1
        L_0x024f:
            if (r7 < r4) goto L_0x02bd
            if (r1 == r5) goto L_0x0255
            r23 = r30
        L_0x0255:
            r8 = r7
            r14 = r12
            r21 = r28
            r11 = r35
            r9 = r36
            r10 = r37
        L_0x025f:
            if (r8 >= r1) goto L_0x02b1
            if (r14 != r6) goto L_0x0270
            if (r9 == 0) goto L_0x026a
            r5 = r48
            r9 = 0
            r10 = 0
            goto L_0x0272
        L_0x026a:
            r10 = r0
            r5 = r48
            r11 = 1065353216(0x3f800000, float:1.0)
            goto L_0x0272
        L_0x0270:
            r5 = r48
        L_0x0272:
            if (r14 != r5) goto L_0x0298
            if (r21 == 0) goto L_0x028f
            if (r20 == 0) goto L_0x0289
            if (r3 == 0) goto L_0x0289
            int r10 = r23 + -1
            float r11 = (float) r10
            r32 = r3
            double r2 = (double) r11
            int r2 = (r2 > r39 ? 1 : (r2 == r39 ? 0 : -1))
            r23 = r10
            if (r2 == 0) goto L_0x028b
            r21 = 1
            goto L_0x028d
        L_0x0289:
            r32 = r3
        L_0x028b:
            r21 = 0
        L_0x028d:
            r10 = 0
            goto L_0x029a
        L_0x028f:
            r32 = r3
            r10 = r22
            if (r20 == 0) goto L_0x029a
            r11 = -1082130432(0xffffffffbf800000, float:-1.0)
            goto L_0x029a
        L_0x0298:
            r32 = r3
        L_0x029a:
            r2 = r50[r26]
            r3 = r51[r14]
            r33 = r58[r8]
            float r3 = r3 * r33
            float r3 = r3 * r11
            float r2 = r2 + r3
            r50[r26] = r2
            int r14 = r14 + r10
            int r8 = r8 + 2
            r2 = r61
            r48 = r5
            r3 = r32
            r5 = 2
            goto L_0x025f
        L_0x02b1:
            r32 = r3
            r5 = r48
            int r26 = r26 + r0
            int r7 = r7 + -1
            r2 = r61
            r5 = 2
            goto L_0x024f
        L_0x02bd:
            r32 = r3
            int r5 = r47 + 1
            r6 = r54
            r2 = r61
            r7 = r24
            r8 = r27
            r10 = r28
            r11 = r29
            r12 = r30
            r14 = r31
            r9 = r42
            r4 = r44
            goto L_0x0087
        L_0x02d7:
            r44 = r4
            if (r44 != 0) goto L_0x02e8
            r12 = 0
        L_0x02dc:
            if (r12 >= r1) goto L_0x02e8
            r0 = r58[r12]
            double r2 = (double) r0
            double r2 = -r2
            float r0 = (float) r2
            r58[r12] = r0
            int r12 = r12 + 1
            goto L_0x02dc
        L_0x02e8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.jnbis.internal.InternalWsqDecoder.joinLets(float[], float[], int, int, int, int, int, int, float[], int, float[], int, int):void");
    }

    private byte[] convertImage2Byte(float[] fArr, int i, int i2, float f, float f2) {
        byte[] bArr = new byte[(i * i2)];
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            for (int i5 = 0; i5 < i; i5++) {
                float f3 = (float) (((double) ((fArr[i3] * f2) + f)) + 0.5d);
                double d = (double) f3;
                if (d < 0.0d) {
                    bArr[i3] = 0;
                } else if (d > 255.0d) {
                    bArr[i3] = -1;
                } else {
                    bArr[i3] = (byte) ((int) f3);
                }
                i3++;
            }
        }
        return bArr;
    }
}
