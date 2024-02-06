package org.jmrtd;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.Serializable;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;
import net.p088sf.scuba.smartcards.CardServiceException;
import net.p088sf.scuba.smartcards.FileInfo;
import net.p088sf.scuba.smartcards.FileSystemStructured;
import net.p088sf.scuba.tlv.TLVInputStream;
import org.jmrtd.p100io.FragmentBuffer;

class MRTDFileSystem implements FileSystemStructured, Serializable {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final Logger LOGGER = Logger.getLogger("org.jmrtd");
    private static final int READ_AHEAD_LENGTH = 8;
    private static final long serialVersionUID = -4357282016708205020L;
    private Map<Short, MRTDFileInfo> fileInfos = new HashMap();
    private boolean isSelected = false;
    private short selectedFID = 0;
    private PassportService service;

    public MRTDFileSystem(PassportService passportService) {
        this.service = passportService;
    }

    public FileInfo[] getSelectedPath() throws CardServiceException {
        synchronized (this) {
            MRTDFileInfo fileInfo = getFileInfo();
            if (fileInfo == null) {
                return null;
            }
            MRTDFileInfo[] mRTDFileInfoArr = {fileInfo};
            return mRTDFileInfoArr;
        }
    }

    public void selectFile(short s) throws CardServiceException {
        synchronized (this) {
            if (this.selectedFID != s) {
                this.selectedFID = s;
                this.isSelected = false;
            }
        }
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:22:0x0055 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public byte[] readBinary(int r7, int r8) throws net.p088sf.scuba.smartcards.CardServiceException {
        /*
            r6 = this;
            monitor-enter(r6)
            r0 = 0
            short r1 = r6.selectedFID     // Catch:{ CardServiceException -> 0x0074, Exception -> 0x0055 }
            if (r1 <= 0) goto L_0x004b
            r1 = 32767(0x7fff, float:4.5916E-41)
            r2 = 1
            r3 = 0
            if (r7 <= r1) goto L_0x000e
            r1 = r2
            goto L_0x000f
        L_0x000e:
            r1 = r3
        L_0x000f:
            boolean r4 = r6.isSelected     // Catch:{ CardServiceException -> 0x0074, Exception -> 0x0055 }
            if (r4 != 0) goto L_0x001c
            org.jmrtd.PassportService r4 = r6.service     // Catch:{ CardServiceException -> 0x0074, Exception -> 0x0055 }
            short r5 = r6.selectedFID     // Catch:{ CardServiceException -> 0x0074, Exception -> 0x0055 }
            r4.sendSelectFile(r5)     // Catch:{ CardServiceException -> 0x0074, Exception -> 0x0055 }
            r6.isSelected = r2     // Catch:{ CardServiceException -> 0x0074, Exception -> 0x0055 }
        L_0x001c:
            org.jmrtd.MRTDFileSystem$MRTDFileInfo r0 = r6.getFileInfo()     // Catch:{ CardServiceException -> 0x0074, Exception -> 0x0055 }
            org.jmrtd.io.FragmentBuffer$Fragment r2 = r0.getSmallestUnbufferedFragment(r7, r8)     // Catch:{ CardServiceException -> 0x0074, Exception -> 0x0055 }
            int r4 = r2.getLength()     // Catch:{ CardServiceException -> 0x0074, Exception -> 0x0055 }
            if (r4 <= 0) goto L_0x0040
            org.jmrtd.PassportService r8 = r6.service     // Catch:{ CardServiceException -> 0x0074, Exception -> 0x0055 }
            int r4 = r2.getOffset()     // Catch:{ CardServiceException -> 0x0074, Exception -> 0x0055 }
            int r5 = r2.getLength()     // Catch:{ CardServiceException -> 0x0074, Exception -> 0x0055 }
            byte[] r8 = r8.sendReadBinary(r4, r5, r1)     // Catch:{ CardServiceException -> 0x0074, Exception -> 0x0055 }
            int r1 = r2.getOffset()     // Catch:{ CardServiceException -> 0x0074, Exception -> 0x0055 }
            r0.addFragment(r1, r8)     // Catch:{ CardServiceException -> 0x0074, Exception -> 0x0055 }
            int r8 = r8.length     // Catch:{ CardServiceException -> 0x0074, Exception -> 0x0055 }
        L_0x0040:
            byte[] r1 = r0.getBuffer()     // Catch:{ CardServiceException -> 0x0074, Exception -> 0x0055 }
            byte[] r2 = new byte[r8]     // Catch:{ CardServiceException -> 0x0074, Exception -> 0x0055 }
            java.lang.System.arraycopy(r1, r7, r2, r3, r8)     // Catch:{ CardServiceException -> 0x0074, Exception -> 0x0055 }
            monitor-exit(r6)
            return r2
        L_0x004b:
            net.sf.scuba.smartcards.CardServiceException r7 = new net.sf.scuba.smartcards.CardServiceException     // Catch:{ CardServiceException -> 0x0074, Exception -> 0x0055 }
            java.lang.String r8 = "No file selected"
            r7.<init>(r8)     // Catch:{ CardServiceException -> 0x0074, Exception -> 0x0055 }
            throw r7     // Catch:{ CardServiceException -> 0x0074, Exception -> 0x0055 }
        L_0x0053:
            r7 = move-exception
            goto L_0x00a4
        L_0x0055:
            net.sf.scuba.smartcards.CardServiceException r7 = new net.sf.scuba.smartcards.CardServiceException     // Catch:{ all -> 0x0053 }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x0053 }
            r8.<init>()     // Catch:{ all -> 0x0053 }
            java.lang.String r1 = "Read binary failed on file "
            r8.append(r1)     // Catch:{ all -> 0x0053 }
            if (r0 != 0) goto L_0x0069
            short r0 = r6.selectedFID     // Catch:{ all -> 0x0053 }
            java.lang.String r0 = java.lang.Integer.toHexString(r0)     // Catch:{ all -> 0x0053 }
        L_0x0069:
            r8.append(r0)     // Catch:{ all -> 0x0053 }
            java.lang.String r8 = r8.toString()     // Catch:{ all -> 0x0053 }
            r7.<init>(r8)     // Catch:{ all -> 0x0053 }
            throw r7     // Catch:{ all -> 0x0053 }
        L_0x0074:
            r7 = move-exception
            net.sf.scuba.smartcards.CardServiceException r8 = new net.sf.scuba.smartcards.CardServiceException     // Catch:{ all -> 0x0053 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0053 }
            r1.<init>()     // Catch:{ all -> 0x0053 }
            java.lang.String r2 = "Read binary failed on file "
            r1.append(r2)     // Catch:{ all -> 0x0053 }
            if (r0 != 0) goto L_0x0089
            short r0 = r6.selectedFID     // Catch:{ all -> 0x0053 }
            java.lang.String r0 = java.lang.Integer.toHexString(r0)     // Catch:{ all -> 0x0053 }
        L_0x0089:
            r1.append(r0)     // Catch:{ all -> 0x0053 }
            java.lang.String r0 = ": "
            r1.append(r0)     // Catch:{ all -> 0x0053 }
            java.lang.String r0 = r7.getMessage()     // Catch:{ all -> 0x0053 }
            r1.append(r0)     // Catch:{ all -> 0x0053 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0053 }
            int r7 = r7.getSW()     // Catch:{ all -> 0x0053 }
            r8.<init>(r0, r7)     // Catch:{ all -> 0x0053 }
            throw r8     // Catch:{ all -> 0x0053 }
        L_0x00a4:
            monitor-exit(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: org.jmrtd.MRTDFileSystem.readBinary(int, int):byte[]");
    }

    private MRTDFileInfo getFileInfo() throws CardServiceException {
        int i;
        synchronized (this) {
            if (this.selectedFID > 0) {
                MRTDFileInfo mRTDFileInfo = this.fileInfos.get(Short.valueOf(this.selectedFID));
                if (mRTDFileInfo != null) {
                    return mRTDFileInfo;
                }
                try {
                    if (!this.isSelected) {
                        this.service.sendSelectFile(this.selectedFID);
                        this.isSelected = true;
                    }
                    byte[] sendReadBinary = this.service.sendReadBinary(0, 8, false);
                    if (sendReadBinary != null) {
                        if (sendReadBinary.length == 8) {
                            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(sendReadBinary);
                            TLVInputStream tLVInputStream = new TLVInputStream(byteArrayInputStream);
                            if (tLVInputStream.write() == 66) {
                                i = 36;
                            } else {
                                i = (sendReadBinary.length - byteArrayInputStream.available()) + tLVInputStream.IconCompatParcelizer();
                            }
                            MRTDFileInfo mRTDFileInfo2 = new MRTDFileInfo(this.selectedFID, i);
                            mRTDFileInfo2.addFragment(0, sendReadBinary);
                            this.fileInfos.put(Short.valueOf(this.selectedFID), mRTDFileInfo2);
                            return mRTDFileInfo2;
                        }
                    }
                    Logger logger = LOGGER;
                    StringBuilder sb = new StringBuilder();
                    sb.append("Something is wrong with prefix, prefix = ");
                    sb.append(Arrays.toString(sendReadBinary));
                    logger.severe(sb.toString());
                    return null;
                } catch (IOException e) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(e.toString());
                    sb2.append(" getting file info for ");
                    sb2.append(Integer.toHexString(this.selectedFID));
                    throw new CardServiceException(sb2.toString());
                }
            } else {
                throw new CardServiceException("No file selected");
            }
        }
    }

    static class MRTDFileInfo extends FileInfo implements Serializable {
        private static final long serialVersionUID = 6727369753765119839L;
        private FragmentBuffer buffer;
        private short fid;

        public MRTDFileInfo(short s, int i) {
            this.fid = s;
            this.buffer = new FragmentBuffer(i);
        }

        public byte[] getBuffer() {
            return this.buffer.getBuffer();
        }

        public short getFID() {
            return this.fid;
        }

        public int getFileLength() {
            return this.buffer.getLength();
        }

        public String toString() {
            return Integer.toHexString(this.fid);
        }

        public FragmentBuffer.Fragment getSmallestUnbufferedFragment(int i, int i2) {
            return this.buffer.getSmallestUnbufferedFragment(i, i2);
        }

        public void addFragment(int i, byte[] bArr) {
            this.buffer.addFragment(i, bArr);
        }
    }
}
