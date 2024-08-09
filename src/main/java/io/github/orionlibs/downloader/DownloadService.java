package io.github.orionlibs.downloader;

import java.io.BufferedInputStream;
import java.io.IOException;

public class DownloadService
{
    public static void downloadToFile(String urlResourceToDownload, String fileToDownloadTo) throws IOException
    {
        ResourceValidator.validate(urlResourceToDownload);
        TargetFileValidator.validate(fileToDownloadTo);
        BufferedInputStream input = ResourceDownloader.downloadAsStream(urlResourceToDownload);
        StreamToFileSaver.saveStreamToFile(input, fileToDownloadTo);
    }


    public static BufferedInputStream downloadToStream(String urlResourceToDownload) throws IOException
    {
        ResourceValidator.validate(urlResourceToDownload);
        return ResourceDownloader.downloadAsStream(urlResourceToDownload);
    }
}
