package com.hyland.webhook.helper;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public  class AuthenticationHelper {

    private AuthenticationHelper(){
    }

    protected static String getViewSignature(String licenseKey) {
        return fetch ("https://indiaservice.twistage.com/api/view_key?licenseKey=" +
                licenseKey).trim();
    }

    protected static String getIngestSignature(String licenseKey, String contributor, String library) {
        return fetch ("https://indiaservice.twistage.com/api/ingest_key?licenseKey=" +
                licenseKey + "&contributor=" + contributor + "&library_id=" + library).trim();
    }

    protected static String fetch(String url) {
        try {
            Object content = createUrl(url).getContent();
            if (content instanceof String) {
                return (String) content;
            } else if (content instanceof InputStream) {
                return getInputStreamContents((InputStream) content);
            } else {
                throw new RuntimeException ("Unexpected content returned from URL: " +
                        content.toString());
            }
        } catch (IOException e) {
            throw new RuntimeException (e);
        }
    }

    protected static URL createUrl(String url) {
        try {
            return new URL(url);
        } catch (MalformedURLException e) {
            throw new RuntimeException (e);
        }
    }

    protected static String getInputStreamContents(InputStream inputStream) throws IOException {
        StringBuilder contents = new StringBuilder();
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream))) {
            String line = null;
            while ((line = bufferedReader.readLine()) != null) {
                contents.append(line);
                contents.append(System.getProperty("line.separator"));
            }
        }
        return contents.toString();
    }

}
