package com.hyland.webhook.helper;

import java.io.*;
import java.net.HttpURLConnection;

import static com.hyland.webhook.helper.AuthenticationHelper.*;

public class ImportHelper {

    protected String upload (String licenseKey, String contributor, String library,
                             String pathOfXmlFile)
            throws  IOException {

        String xml = getInputStreamContents (new FileInputStream(new File (pathOfXmlFile)));

        String auth = getIngestSignature(licenseKey, contributor, library);

        String url = "https://indiaservice.twistage.com/videos/create_many?signature=" + auth;

        InputStream inputStream = new ByteArrayInputStream(xml.getBytes());

        HttpURLConnection conn = (HttpURLConnection) createUrl(url).openConnection();

        conn.setDoInput (true);
        conn.setDoOutput (true);
        conn.setUseCaches (false);

        conn.setRequestMethod("POST");
        conn.setRequestProperty("Content-Type", "text/xml");

        BufferedInputStream bufferedInput = new BufferedInputStream(inputStream);
        BufferedOutputStream bufferedOutput = new BufferedOutputStream(conn.getOutputStream());

        int nextByte;
        while ((nextByte = bufferedInput.read ()) != -1) {
            bufferedOutput.write (nextByte);
        }

        bufferedOutput.flush ();
        bufferedOutput.close ();

        // read the server's response
        return getInputStreamContents (conn.getInputStream());
    }

}
