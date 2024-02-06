package net.p088sf.scuba.smartcards;

/* renamed from: net.sf.scuba.smartcards.AbstractFileSystemStructured */
public abstract class AbstractFileSystemStructured implements FileSystemStructured {
    public static short MF_ID = 16128;
    private ISOFileInfo fileInfo;
    private int length;

    /* renamed from: p2 */
    private int f5462p2;
    private int selectLe;
    private short selectedFID;
    private CardService service;

    public abstract byte[] readBinary(int i, int i2);

    public AbstractFileSystemStructured(CardService cardService) {
        this.service = null;
        this.selectedFID = 0;
        this.length = -1;
        this.f5462p2 = 0;
        this.selectLe = 256;
        this.fileInfo = null;
        this.service = cardService;
    }

    public AbstractFileSystemStructured(CardService cardService, boolean z) {
        this.service = null;
        int i = 0;
        this.selectedFID = 0;
        this.length = -1;
        this.f5462p2 = 0;
        this.selectLe = 256;
        this.fileInfo = null;
        this.service = cardService;
        this.f5462p2 = z ? 0 : 12;
        this.selectLe = z ? 256 : i;
    }

    public int getFileLength() throws CardServiceException {
        return this.length;
    }

    public short getSelectedFID() {
        return this.selectedFID;
    }

    private void selectFile(byte[] bArr, int i) throws CardServiceException {
        ResponseAPDU transmit = this.service.transmit(createSelectFileAPDU(i, this.f5462p2, bArr, this.selectLe));
        int sw = transmit.getSW();
        byte[] data = transmit.getData();
        if (sw == -28672) {
            ISOFileInfo iSOFileInfo = new ISOFileInfo(data);
            this.fileInfo = iSOFileInfo;
            if (iSOFileInfo.fid != -1) {
                this.selectedFID = this.fileInfo.fid;
            }
            if (this.fileInfo.fileLength != -1) {
                this.length = this.fileInfo.fileLength;
                return;
            }
            return;
        }
        throw new CardServiceException("File could not be selected.", sw);
    }

    private void selectFile(short s, int i) throws CardServiceException {
        byte[] bArr;
        if (s == 0) {
            bArr = new byte[0];
        } else {
            bArr = new byte[]{(byte) (s >> 8), (byte) s};
        }
        selectFile(bArr, i);
    }

    public void selectFile(short s) throws CardServiceException {
        selectFile(s, 0);
    }

    public void selectMF() throws CardServiceException {
        selectFile(0, 0);
    }

    public void selectParent() throws CardServiceException {
        selectFile(0, 3);
    }

    public void selectEFRelative(short s) throws CardServiceException {
        selectFile(s, 2);
    }

    public void selectDFRelative(short s) throws CardServiceException {
        selectFile(s, 1);
    }

    public void selectAID(byte[] bArr) throws CardServiceException {
        selectFile(bArr, 4);
    }

    public void selectPath(byte[] bArr) throws CardServiceException {
        selectFile(bArr, 8);
    }

    public void selectPathRelative(byte[] bArr) throws CardServiceException {
        selectFile(bArr, 9);
    }

    private CommandAPDU createSelectFileAPDU(int i, int i2, byte[] bArr, int i3) {
        if (i3 == 0) {
            return new CommandAPDU(0, -92, i, i2, bArr);
        }
        return new CommandAPDU(0, -92, i, i2, bArr, i3);
    }
}
