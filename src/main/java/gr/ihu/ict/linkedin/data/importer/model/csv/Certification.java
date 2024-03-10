package gr.ihu.ict.linkedin.data.importer.model.csv;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Date;

@Getter
@AllArgsConstructor
public class Certification {
    private String Name;
    private String Url;
    private String Authority;
    private Date StartedOn;
    private Date FinishedOn;
    private String LicenseNumber;
}
