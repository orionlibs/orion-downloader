package io.github.orionlibs.downloader;

class ResourceValidator
{
    static void validate(String urlResourceToDownload)
    {
        if(urlResourceToDownload == null || urlResourceToDownload.isEmpty())
        {
            throw new IllegalArgumentException("urlResourceToDownload is null/empty.");
        }
    }
}
