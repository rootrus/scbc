package org.jmrtd.lds;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.logging.Logger;

public abstract class AbstractLDSInfo implements LDSElement {
    private static final Logger LOGGER = Logger.getLogger("org.jmrtd");
    private static final long serialVersionUID = -2340098256249194537L;

    public abstract void writeObject(OutputStream outputStream) throws IOException;

    public byte[] getEncoded() {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            writeObject(byteArrayOutputStream);
            byteArrayOutputStream.flush();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            Logger logger = LOGGER;
            StringBuilder sb = new StringBuilder();
            sb.append("Exception: ");
            sb.append(e.getMessage());
            logger.severe(sb.toString());
            return null;
        }
    }
}
