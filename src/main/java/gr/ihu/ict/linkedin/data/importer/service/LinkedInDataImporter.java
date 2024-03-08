package gr.ihu.ict.linkedin.data.importer.service;

import java.io.File;

import gr.ihu.ict.linkedin.data.importer.model.LinkedInData;

public interface LinkedInDataImporter {
    LinkedInData parseZip(File zipFile);
}
