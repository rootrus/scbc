package net.p088sf.scuba.smartcards;

/* renamed from: net.sf.scuba.smartcards.APDUWrapper */
public interface APDUWrapper {
    ResponseAPDU unwrap(ResponseAPDU responseAPDU);

    CommandAPDU wrap(CommandAPDU commandAPDU);
}
