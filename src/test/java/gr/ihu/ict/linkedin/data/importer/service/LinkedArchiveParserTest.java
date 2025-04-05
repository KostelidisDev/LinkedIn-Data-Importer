package gr.ihu.ict.linkedin.data.importer.service;

import gr.ihu.ict.linkedin.data.importer.AbstractTest;
import gr.ihu.ict.linkedin.data.importer.model.LinkedInData;
import gr.ihu.ict.linkedin.data.importer.service.csv.impl.*;
import io.vavr.control.Try;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class LinkedArchiveParserTest extends AbstractTest {

    private LinkedInDataImporter linkedArchiveParserAuto;
    private LinkedInDataImporter linkedArchiveParserCustom;

    @Before
    public void setUp() throws Exception {
        this.linkedArchiveParserAuto = new LinkedInDataImporterImpl();
        this.linkedArchiveParserCustom = new LinkedInDataImporterImpl(
                new CertificationParserImpl(),
                new EducationParserImpl(),
                new LanguageParserImpl(),
                new PositionParserImpl(),
                new ProfileParserImpl(),
                new ProjectParserImpl(),
                new PublicationParserImpl(),
                new SkillParserImpl()
        );
    }

    @Test
    public void testParseZip() {
        Try<LinkedInData> resultAuto = this.getFileFromResources("Basic_LinkedInDataExport_01-29-2022.zip")
                .flatMap(file -> Try.of(() -> linkedArchiveParserAuto.parseZip(file)));

        Assert.assertTrue(resultAuto.isSuccess());

        Try<LinkedInData> resultCustom = this.getFileFromResources("Basic_LinkedInDataExport_01-29-2022.zip")
                .flatMap(file -> Try.of(() -> linkedArchiveParserCustom.parseZip(file)));

        Assert.assertTrue(resultCustom.isSuccess());
    }
}