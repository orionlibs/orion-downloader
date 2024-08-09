package io.github.orionlibs.downloader;

import java.io.BufferedInputStream;
import java.io.IOException;
import org.jsoup.Connection.Response;
import org.jsoup.Jsoup;

class ResourceDownloader
{
    static BufferedInputStream downloadAsStream(String URLResourceToDownload) throws IOException
    {
        Response response = Jsoup.connect(URLResourceToDownload).followRedirects(true).ignoreHttpErrors(true).ignoreContentType(true).execute();
        return response.bodyStream();
    }
}
