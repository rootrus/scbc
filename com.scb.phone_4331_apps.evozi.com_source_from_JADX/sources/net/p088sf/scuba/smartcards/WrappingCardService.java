package net.p088sf.scuba.smartcards;

/* renamed from: net.sf.scuba.smartcards.WrappingCardService */
public class WrappingCardService extends CardService {
    private static final long serialVersionUID = -1872209495542386286L;
    private boolean enabled;
    private CardService service;
    private APDUWrapper wrapper;

    public WrappingCardService(CardService cardService, APDUWrapper aPDUWrapper) {
        this.service = cardService;
        this.wrapper = aPDUWrapper;
    }

    public void open() throws CardServiceException {
        this.service.open();
    }

    public boolean isOpen() {
        return this.service.isOpen();
    }

    public ResponseAPDU transmit(CommandAPDU commandAPDU) throws CardServiceException {
        if (!isEnabled()) {
            return this.service.transmit(commandAPDU);
        }
        return this.wrapper.unwrap(this.service.transmit(this.wrapper.wrap(commandAPDU)));
    }

    public byte[] getATR() throws CardServiceException {
        return this.service.getATR();
    }

    public void close() {
        this.service.close();
    }

    public void enable() {
        this.enabled = true;
    }

    public boolean isEnabled() {
        return this.enabled;
    }

    public void disable() {
        this.enabled = false;
    }
}
