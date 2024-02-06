package net.p088sf.scuba.smartcards;

import android.nfc.tech.IsoDep;
import android.os.Build;
import java.io.IOException;

/* renamed from: net.sf.scuba.smartcards.IsoDepCardService */
public class IsoDepCardService extends CardService {
    private static final long serialVersionUID = -8123218195642784731L;
    private int apduCount = 0;
    private IsoDep nfc;

    public byte[] getATR() {
        return null;
    }

    public IsoDepCardService(IsoDep isoDep) {
        this.nfc = isoDep;
    }

    public void open() throws CardServiceException {
        if (!isOpen()) {
            try {
                this.nfc.connect();
                if (this.nfc.isConnected()) {
                    this.state = 1;
                    return;
                }
                throw new CardServiceException("failed to connect");
            } catch (IOException e) {
                e.printStackTrace();
                throw new CardServiceException(e.toString());
            }
        }
    }

    public boolean isOpen() {
        if (this.nfc.isConnected()) {
            this.state = 1;
            return true;
        }
        this.state = 0;
        return false;
    }

    public ResponseAPDU transmit(CommandAPDU commandAPDU) throws CardServiceException {
        try {
            if (this.nfc.isConnected()) {
                byte[] transceive = this.nfc.transceive(commandAPDU.getBytes());
                if (transceive == null || transceive.length < 2) {
                    throw new CardServiceException("Failed response");
                }
                ResponseAPDU responseAPDU = new ResponseAPDU(transceive);
                int i = this.apduCount + 1;
                this.apduCount = i;
                notifyExchangedAPDU(i, commandAPDU, responseAPDU);
                return responseAPDU;
            }
            throw new CardServiceException("Not connected");
        } catch (IOException e) {
            throw new CardServiceException(e.getMessage());
        } catch (Exception e2) {
            throw new CardServiceException(e2.getMessage());
        }
    }

    public boolean isExtendedAPDULengthSupported() {
        if (Build.VERSION.SDK_INT >= 16) {
            return this.nfc.isExtendedLengthApduSupported();
        }
        return this.nfc.getMaxTransceiveLength() > 261;
    }

    public void close() {
        try {
            this.nfc.close();
            this.state = 0;
        } catch (IOException unused) {
        }
    }
}
